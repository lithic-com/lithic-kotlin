# Lithic Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.lithic.api/lithic-kotlin)](https://central.sonatype.com/artifact/com.lithic.api/lithic-kotlin/0.77.0)

<!-- x-release-please-end -->

The Lithic Kotlin SDK provides convenient access to the Lithic REST API from applications written in Kotlin.

The Lithic Kotlin SDK is similar to the Lithic Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

The REST API documentation can be found on [docs.lithic.com](https://docs.lithic.com).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.lithic.api:lithic-kotlin:0.77.0")
```

### Maven

```xml
<dependency>
    <groupId>com.lithic.api</groupId>
    <artifactId>lithic-kotlin</artifactId>
    <version>0.77.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

### Configure the client

Use `LithicOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```kotlin
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient

val client: LithicClient = LithicOkHttpClient.builder()
    .apiKey("My Lithic API Key")
    .build()
```

Alternately, set the environment with `LITHIC_API_KEY` or `LITHIC_WEBHOOK_SECRET`, and use `LithicOkHttpClient.fromEnv()` to read from the environment.

```kotlin
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient

val client: LithicClient = LithicOkHttpClient.fromEnv()

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
val client: LithicClient = LithicOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build()
```

| Property      | Environment variable    | Required | Default value |
| ------------- | ----------------------- | -------- | ------------- |
| apiKey        | `LITHIC_API_KEY`        | true     | —             |
| webhookSecret | `LITHIC_WEBHOOK_SECRET` | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new card, first use the `CardCreateParams` builder to specify attributes, then pass that to the `create` method of the `cards` service.

```kotlin
import com.lithic.api.models.Card
import com.lithic.api.models.CardCreateParams

val params: CardCreateParams = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build()
val card: Card = client.cards().create(params)
```

### Example: listing resources

The Lithic API provides a `list` method to get a paginated list of cards. You can retrieve the first page by:

```kotlin
import com.lithic.api.models.Card
import com.lithic.api.models.CardListPage

val page: CardListPage = client.cards().list()
for (card: Card in page.data()) {
    print(card)
}
```

Use the `CardListParams` builder to set parameters:

```kotlin
import com.lithic.api.models.CardListPage
import com.lithic.api.models.CardListParams
import java.time.OffsetDateTime

val params: CardListParams = CardListParams.builder()
    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    .endingBefore("ending_before")
    .pageSize(1L)
    .startingAfter("starting_after")
    .state(CardListParams.State.CLOSED)
    .build()
val page1: CardListPage = client.cards().list(params)

// Using the `from` method of the builder you can reuse previous params values:
val page2: CardListPage = client.cards().list(CardListParams.builder()
    .from(params)
    .build())

// Or easily get params for the next page by using the helper `getNextPageParams`:
val page3: CardListPage = client.cards().list(params.getNextPageParams(page2))
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Enums

The Lithic SDK generates wrapper classes for all enum properties in the API. You can read and write these
values directly using the static instances of the class:

```kotlin
// Read an enum property
if (card.state == Card.State.CLOSED) {
  // ...
}

// Write an enum property
card.builder().state(Card.State.CLOSED).build()
```

Over time, the Lithic API may add new values to the property that are not yet represented by the enum type in
this SDK. If an unrecognized value is found, the enum is set to a special sentinel value `_UNKNOWN` and you can use `asString` to read the string that was received:

```kotlin
when (card.state.value()) {
    Card.State.Value.CLOSED -> {
        // ... handle recognized enum value
    }
    ...
    case Card.State.Value._UNKNOWN -> {
        String cardState = card.state.asString()
        // ... handle unrecognized enum value as string
    }
}
```

To write an unrecognized enum value, pass a string to the wrapper class's `of` constructor method:

```kotlin
Card.builder().state(State.of("NEW_STATE")).build()
```

## Requests

### Parameters and bodies

To make a request to the Lithic API, you generally build an instance of the appropriate `Params` class.

See [Undocumented request params](#undocumented-request-params) for how to send arbitrary parameters.

## Responses

### Response validation

When receiving a response, the Lithic Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `LithicInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
import com.lithic.api.models.Card

val card: Card = client.cards().create().validate()
```

### Nullable Properties

Model properties that are optional or allow a null value are represented as `Optional`. The empty case can represent either that the field was provided as null, or that it was simply not present.

```kotlin
// Card.cvv returns String?
card.cvv != null // false
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
import com.lithic.api.core.JsonField
import java.util.Optional

val field: JsonField = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj: MyClass = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
import com.lithic.api.core.JsonValue

val secret: JsonValue = address._additionalProperties().get("secret_field")
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```kotlin
import com.lithic.api.models.Card
import com.lithic.api.models.CardListPage

// As a Sequence:
client.cards().list(params).autoPager()
    .take(50)
    .forEach { card -> print(card) }
```

### Asynchronous

```kotlin
// As a Flow:
asyncClient.cards().list(params).autoPager()
    .take(50)
    .collect { card -> print(card) }
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```kotlin
import com.lithic.api.models.Card
import com.lithic.api.models.CardListPage

val page = client.cards().list(params)
while (page != null) {
    for (card in page.data) {
        print(card)
    }

    page = page.getNextPage()
}
```

---

---

## Webhook Verification

We provide helper methods for verifying that a webhook request came from Lithic, and not a malicious third party.

You can use `lithic.webhooks().verifySignature(body, headers, secret?)` or `lithic.webhooks().unwrap(body, headers, secret?)`,
both of which will raise an error if the signature is invalid.

Note that the "body" parameter must be the raw JSON string sent from the server (do not parse it first).
The `.unwrap()` method can parse this JSON for you.

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`LithicException`** - Base exception for all exceptions

- **`LithicServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`LithicIoException`** - I/O networking errors
- **`LithicInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```kotlin
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient

val client: LithicClient = LithicOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import java.time.Duration

val client: LithicClient = LithicOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: LithicClient = LithicOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(Proxy.Type.HTTP, InetSocketAddress("example.com", 8080)))
    .build()
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```kotlin
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient

val client: LithicClient = LithicOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build()
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

In [Example: creating a resource](#example-creating-a-resource) above, we used the `CardCreateParams.builder()` to pass to the `create` method of the `cards` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case, you can attach them using raw setters:

```kotlin
import com.lithic.api.core.JsonValue
import com.lithic.api.models.CardCreateParams

val params: CardCreateParams = CardCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

You can also use the `putAdditionalProperty` method on nested headers, query params, or body objects.

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `res._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `LITHIC_LOG` to `info`.

```sh
$ export LITHIC_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export LITHIC_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/lithic-com/lithic-kotlin/issues) with questions, bugs, or suggestions.
