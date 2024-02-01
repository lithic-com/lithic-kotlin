# Changelog

## 0.28.1 (2024-02-01)

Full Changelog: [v0.28.0...v0.28.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.28.0...v0.28.1)

### Bug Fixes

* **pagination:** correct hasNextPage check ([#143](https://github.com/lithic-com/lithic-kotlin/issues/143)) ([b3aa008](https://github.com/lithic-com/lithic-kotlin/commit/b3aa00805c09d728bb01129005fdd70b2eefa3c6))

## 0.28.0 (2024-01-31)

Full Changelog: [v0.27.0...v0.28.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.27.0...v0.28.0)

### Features

* **api:** add `account_token` and `card_program_token` to `Card` ([#141](https://github.com/lithic-com/lithic-kotlin/issues/141)) ([e2a0765](https://github.com/lithic-com/lithic-kotlin/commit/e2a076549d5946f453c1f4fd7b8f86e8e3c55e68))

## 0.27.0 (2024-01-31)

Full Changelog: [v0.26.0...v0.27.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.26.0...v0.27.0)

### Features

* **api:** add search_by_pan endpoint ([#137](https://github.com/lithic-com/lithic-kotlin/issues/137)) ([368501d](https://github.com/lithic-com/lithic-kotlin/commit/368501da87d699a1e46a58db099b0bbae0f2c074))
* remove idempotency headers ([#140](https://github.com/lithic-com/lithic-kotlin/issues/140)) ([7a2c139](https://github.com/lithic-com/lithic-kotlin/commit/7a2c13943526c2a078007d7a016bffc421157134))


### Chores

* **internal:** support pre-release versioning ([#139](https://github.com/lithic-com/lithic-kotlin/issues/139)) ([893cdb1](https://github.com/lithic-com/lithic-kotlin/commit/893cdb1b61b09edd7ab64672e74b9c4ebb8e8c4c))

## 0.26.0 (2024-01-23)

Full Changelog: [v0.25.0...v0.26.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.25.0...v0.26.0)

### ⚠ BREAKING CHANGES

* **api:** change account holder creation response, new settlement detail type ([#136](https://github.com/lithic-com/lithic-kotlin/issues/136))

### Features

* **api:** change account holder creation response, new settlement detail type ([#136](https://github.com/lithic-com/lithic-kotlin/issues/136)) ([54c62de](https://github.com/lithic-com/lithic-kotlin/commit/54c62de0417fc8ca36d4effd011eb9a8cdc64ae1))


### Chores

* **ci:** rely on Stainless GitHub App for releases ([#135](https://github.com/lithic-com/lithic-kotlin/issues/135)) ([45580b6](https://github.com/lithic-com/lithic-kotlin/commit/45580b65f473d691fc4b3f5ce0defa2a4c43a71a))
* **internal:** speculative retry-after-ms support ([#133](https://github.com/lithic-com/lithic-kotlin/issues/133)) ([fe60a46](https://github.com/lithic-com/lithic-kotlin/commit/fe60a46814724427d75867bdcf0b43d548785852))

## 0.25.0 (2024-01-17)

Full Changelog: [v0.24.0...v0.25.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.24.0...v0.25.0)

### Features

* **api:** updates ([#132](https://github.com/lithic-com/lithic-kotlin/issues/132)) ([15c7f5c](https://github.com/lithic-com/lithic-kotlin/commit/15c7f5ca6ab00326cc67de2a63a90b1898ce1cb7))


### Documentation

* **readme:** improve api reference ([#130](https://github.com/lithic-com/lithic-kotlin/issues/130)) ([23ba154](https://github.com/lithic-com/lithic-kotlin/commit/23ba154b9ee55aeea1663247138b161215af48eb))

## 0.24.0 (2024-01-09)

Full Changelog: [v0.23.0...v0.24.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.23.0...v0.24.0)

### Features

* **api:** add card renew endpoint ([#129](https://github.com/lithic-com/lithic-kotlin/issues/129)) ([9efed55](https://github.com/lithic-com/lithic-kotlin/commit/9efed5539578c3363ba4a4c7f4c42363f63d5c2e))


### Chores

* add .keep files for examples and custom code directories ([#128](https://github.com/lithic-com/lithic-kotlin/issues/128)) ([6dee7d0](https://github.com/lithic-com/lithic-kotlin/commit/6dee7d03b3d26386f0a66c6065a58d9ad68e2d1d))
* **internal:** bump license ([#126](https://github.com/lithic-com/lithic-kotlin/issues/126)) ([42d198b](https://github.com/lithic-com/lithic-kotlin/commit/42d198bda0edfde96991003ab109cc3055351511))

## 0.23.0 (2023-12-18)

Full Changelog: [v0.22.0...v0.23.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.22.0...v0.23.0)

### Features

* **api:** remove /auth_stream enrollment endpoints ([#125](https://github.com/lithic-com/lithic-kotlin/issues/125)) ([cd14d3d](https://github.com/lithic-com/lithic-kotlin/commit/cd14d3d842047b95f5f20f3db89a0d4e4871719c))


### Chores

* **ci:** run release workflow once per day ([#123](https://github.com/lithic-com/lithic-kotlin/issues/123)) ([dd4da4f](https://github.com/lithic-com/lithic-kotlin/commit/dd4da4f81adeafcd49eb115bdd58b7b8d2b6dc75))

## 0.22.0 (2023-12-15)

Full Changelog: [v0.21.0...v0.22.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.21.0...v0.22.0)

### Features

* **api:** rename `token` and `type` to `financial_account_token` and `financial_account_type` ([#122](https://github.com/lithic-com/lithic-kotlin/issues/122)) ([c1ec448](https://github.com/lithic-com/lithic-kotlin/commit/c1ec448d09fb76cdd3bff9f9253ec762f638da2f))

## 0.21.0 (2023-12-05)

Full Changelog: [v0.20.0...v0.21.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.20.0...v0.21.0)

### Features

* **api:** remove `CLOSED` account enum and update docstrings ([#119](https://github.com/lithic-com/lithic-kotlin/issues/119)) ([24dc0e1](https://github.com/lithic-com/lithic-kotlin/commit/24dc0e11c4eb64970cea33c0a1bc5b6ff6a2fe14))

## 0.20.0 (2023-11-28)

Full Changelog: [v0.19.0...v0.20.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.19.0...v0.20.0)

### Features

* **api:** add `get spend_limits` endpoints to `cards` and `accounts` ([#116](https://github.com/lithic-com/lithic-kotlin/issues/116)) ([e15ec9e](https://github.com/lithic-com/lithic-kotlin/commit/e15ec9e2a03ab40917e9e697573373f5e8cf1e82))


### Chores

* **internal:** update stats file ([#114](https://github.com/lithic-com/lithic-kotlin/issues/114)) ([6edf142](https://github.com/lithic-com/lithic-kotlin/commit/6edf14226a56d0af0320636a9de08ed6828066be))

## 0.19.0 (2023-11-16)

Full Changelog: [v0.18.0...v0.19.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.18.0...v0.19.0)

### Features

* **api:** updates ([#112](https://github.com/lithic-com/lithic-kotlin/issues/112)) ([a766fb9](https://github.com/lithic-com/lithic-kotlin/commit/a766fb94107401a0b1126e5ed10f2d55a46b8618))

## 0.18.0 (2023-11-09)

Full Changelog: [v0.17.0...v0.18.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.17.0...v0.18.0)

### Features

* **api:** updates ([#110](https://github.com/lithic-com/lithic-kotlin/issues/110)) ([4227d51](https://github.com/lithic-com/lithic-kotlin/commit/4227d510cb56ca5ffe4dc6401357f420ea27b3f1))

## 0.17.0 (2023-11-08)

Full Changelog: [v0.16.0...v0.17.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.16.0...v0.17.0)

### Features

* **client:** allow binary returns ([#105](https://github.com/lithic-com/lithic-kotlin/issues/105)) ([1c77051](https://github.com/lithic-com/lithic-kotlin/commit/1c77051c686e33c5922da54fd7ae1675fb2549ed))


### Bug Fixes

* **api:** correct type for other fees details ([#109](https://github.com/lithic-com/lithic-kotlin/issues/109)) ([69c93f8](https://github.com/lithic-com/lithic-kotlin/commit/69c93f8376c7489ea85646cd17fdc894d9b76759))


### Chores

* remove bad tests ([#108](https://github.com/lithic-com/lithic-kotlin/issues/108)) ([eb6d1f0](https://github.com/lithic-com/lithic-kotlin/commit/eb6d1f071876931581eaedfb7efcbe5df8b66566))


### Documentation

* improve account holder control person documentation ([#107](https://github.com/lithic-com/lithic-kotlin/issues/107)) ([bb80486](https://github.com/lithic-com/lithic-kotlin/commit/bb8048627aca35ba793cd3ee3c9071b3adb90eb4))

## 0.16.0 (2023-11-01)

Full Changelog: [v0.15.0...v0.16.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.15.0...v0.16.0)

### Features

* **api:** add verification_attempts response property ([#104](https://github.com/lithic-com/lithic-kotlin/issues/104)) ([ec23d4a](https://github.com/lithic-com/lithic-kotlin/commit/ec23d4aa820d6eaaf7e7694b59b6cdb593d34041))
* **github:** include a devcontainer setup ([#102](https://github.com/lithic-com/lithic-kotlin/issues/102)) ([786d170](https://github.com/lithic-com/lithic-kotlin/commit/786d1705b9d3114822a27ba06badbeb08c86dbaf))

## 0.15.0 (2023-10-26)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.14.0...v0.15.0)

### Features

* **api:** add CardProgram and DigitalCardArt resources ([#100](https://github.com/lithic-com/lithic-kotlin/issues/100)) ([217b950](https://github.com/lithic-com/lithic-kotlin/commit/217b9501550fc31ffa57a4d39b91c43ac75b5a13))

## 0.14.0 (2023-10-24)

Full Changelog: [v0.13.1...v0.14.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.13.1...v0.14.0)

### Features

* **api:** add AUTH_STREAM_ACCESS to responder endpoints ([#96](https://github.com/lithic-com/lithic-kotlin/issues/96)) ([6f4de68](https://github.com/lithic-com/lithic-kotlin/commit/6f4de680a2073b569ea3acabe8970f50f90c193b))
* **api:** add verification_failed_reason ([#94](https://github.com/lithic-com/lithic-kotlin/issues/94)) ([3caf5b1](https://github.com/lithic-com/lithic-kotlin/commit/3caf5b1f65aef08e645019e6fecf9aedb906c20b))
* **api:** updates ([#93](https://github.com/lithic-com/lithic-kotlin/issues/93)) ([3815a94](https://github.com/lithic-com/lithic-kotlin/commit/3815a94e416498765dbc94c8fef2f2d471be9763))
* **client:** adjust retry behavior ([#97](https://github.com/lithic-com/lithic-kotlin/issues/97)) ([3bb4c8b](https://github.com/lithic-com/lithic-kotlin/commit/3bb4c8bf5695623a950e82bb1ca87fb851e1cc58))
* make webhook headers case insensitive ([#91](https://github.com/lithic-com/lithic-kotlin/issues/91)) ([08458d7](https://github.com/lithic-com/lithic-kotlin/commit/08458d7ef14b019bb7c33dc4748271f6fa5e5649))


### Chores

* **internal:** minor reformatting ([#89](https://github.com/lithic-com/lithic-kotlin/issues/89)) ([288b577](https://github.com/lithic-com/lithic-kotlin/commit/288b5778f08ad64db7bb4e8dfd33120e0614d14b))
* **internal:** rearrange client arguments ([#88](https://github.com/lithic-com/lithic-kotlin/issues/88)) ([7326d1f](https://github.com/lithic-com/lithic-kotlin/commit/7326d1f4cdba544c5e7c560915356a3c5cd5c1a3))
* update README ([#86](https://github.com/lithic-com/lithic-kotlin/issues/86)) ([2b1a91e](https://github.com/lithic-com/lithic-kotlin/commit/2b1a91e0b44954a80a14810bc8da92f59dc75113))


### Documentation

* organisation -&gt; organization (UK to US English) ([#92](https://github.com/lithic-com/lithic-kotlin/issues/92)) ([93dcbb3](https://github.com/lithic-com/lithic-kotlin/commit/93dcbb39ed3c4ec0ee07b86f1451168eb5767ede))

## 0.13.1 (2023-10-05)

Full Changelog: [v0.13.0...v0.13.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.13.0...v0.13.1)

### Features

* **api:** updates ([#84](https://github.com/lithic-com/lithic-kotlin/issues/84)) ([d04bfe3](https://github.com/lithic-com/lithic-kotlin/commit/d04bfe39003d93185994437d2e7fb955fcf0261a))

## 0.13.0 (2023-10-04)

Full Changelog: [v0.12.5...v0.13.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.12.5...v0.13.0)

### ⚠ BREAKING CHANGES

* **api:** remove `post /webhooks/account_holders` endpoint ([#77](https://github.com/lithic-com/lithic-kotlin/issues/77))

### Chores

* **ci:** remove reviewer ([#80](https://github.com/lithic-com/lithic-kotlin/issues/80)) ([45f3c35](https://github.com/lithic-com/lithic-kotlin/commit/45f3c35e3b9add10e180f1d37183c665242b2103))
* **internal:** add a top-level generated comment to each file ([#83](https://github.com/lithic-com/lithic-kotlin/issues/83)) ([569a940](https://github.com/lithic-com/lithic-kotlin/commit/569a9403538e7dc578e59dafb008d2205877fa82))
* **internal:** remove redundant namespacing in references ([#82](https://github.com/lithic-com/lithic-kotlin/issues/82)) ([50c2aaf](https://github.com/lithic-com/lithic-kotlin/commit/50c2aafa8599afee9b12064cbea861a26cc447ca))


### Refactors

* **api:** remove `post /webhooks/account_holders` endpoint ([#77](https://github.com/lithic-com/lithic-kotlin/issues/77)) ([801f26d](https://github.com/lithic-com/lithic-kotlin/commit/801f26d3db9fa05490924ac62d9bbcd33e6d5ddc))

## 0.12.5 (2023-09-20)

Full Changelog: [v0.12.4...v0.12.5](https://github.com/lithic-com/lithic-kotlin/compare/v0.12.4...v0.12.5)

### Features

* **api:** add simulation endpoints, event types, fix transfer request AuthRule ([#75](https://github.com/lithic-com/lithic-kotlin/issues/75)) ([c91d883](https://github.com/lithic-com/lithic-kotlin/commit/c91d883f77c555a05ac69471202957111cebdf92))

## 0.12.4 (2023-09-15)

Full Changelog: [v0.12.3...v0.12.4](https://github.com/lithic-com/lithic-kotlin/compare/v0.12.3...v0.12.4)

### Features

* **client:** retry on 408 Request Timeout ([#72](https://github.com/lithic-com/lithic-kotlin/issues/72)) ([ebe9961](https://github.com/lithic-com/lithic-kotlin/commit/ebe99613f91e9eed944c89f3b024144561a6b1a7))

## 0.12.3 (2023-09-11)

Full Changelog: [v0.12.2...v0.12.3](https://github.com/lithic-com/lithic-kotlin/compare/v0.12.2...v0.12.3)

### Features

* **api:** add Simulate Return Payment endpoint ([#69](https://github.com/lithic-com/lithic-kotlin/issues/69)) ([49ad19e](https://github.com/lithic-com/lithic-kotlin/commit/49ad19e8048f7341e20cf30231ea3a9aeaa810e5))
* **api:** add tokenizations.simulate and correct typo'd enum  ([#68](https://github.com/lithic-com/lithic-kotlin/issues/68)) ([33439c3](https://github.com/lithic-com/lithic-kotlin/commit/33439c3fa0e09186b70d7a5848740dd7f9c29a7b))
* **api:** add user defined id ([#67](https://github.com/lithic-com/lithic-kotlin/issues/67)) ([72909a4](https://github.com/lithic-com/lithic-kotlin/commit/72909a4e4845dce1a015a011ac3f83fee23353d3))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#63](https://github.com/lithic-com/lithic-kotlin/issues/63)) ([66910aa](https://github.com/lithic-com/lithic-kotlin/commit/66910aafe3030073209aa852a3798a8eca857b63))

## [0.12.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.12.1...v0.12.2) (2023-08-26)


### Chores

* **internal:** minor code re-ordering ([#61](https://github.com/lithic-com/lithic-kotlin/issues/61)) ([1541397](https://github.com/lithic-com/lithic-kotlin/commit/15413978da632c9cc7828f99ec79c3726f607663))

## [0.12.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.12.0...v0.12.1) (2023-08-16)


### Bug Fixes

* set correct timeouts on okhttp client ([#56](https://github.com/lithic-com/lithic-kotlin/issues/56)) ([5ee1f95](https://github.com/lithic-com/lithic-kotlin/commit/5ee1f959b8a6bee2a5f47b545f7613621992d343))

## [0.12.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.8...v0.12.0) (2023-08-15)


### ⚠ BREAKING CHANGES

* **api:** change `key` to `secret` ([#49](https://github.com/lithic-com/lithic-kotlin/issues/49))

### Features

* **api:** change `key` to `secret` ([#49](https://github.com/lithic-com/lithic-kotlin/issues/49)) ([d86c8ba](https://github.com/lithic-com/lithic-kotlin/commit/d86c8ba101c628ee1f44ab06e265407729662475))
* default timeout is set for java clients ([#51](https://github.com/lithic-com/lithic-kotlin/issues/51)) ([a30f0d4](https://github.com/lithic-com/lithic-kotlin/commit/a30f0d4b8ae6622486b085c638c8ce61c9311213))
* generate addXxx methods for array types ([#53](https://github.com/lithic-com/lithic-kotlin/issues/53)) ([940a832](https://github.com/lithic-com/lithic-kotlin/commit/940a8329331f012c45eeaaf13e5f1ac97a9b7f2f))


### Chores

* assign default reviewers to release PRs ([#52](https://github.com/lithic-com/lithic-kotlin/issues/52)) ([d981858](https://github.com/lithic-com/lithic-kotlin/commit/d9818587720006650d0faf1f08b084ad5c4254f3))
* **client:** send Idempotency-Key header ([#54](https://github.com/lithic-com/lithic-kotlin/issues/54)) ([b01f6ef](https://github.com/lithic-com/lithic-kotlin/commit/b01f6ef295591e2f9ca3711be5a18759a364a838))

## [0.11.8](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.7...v0.11.8) (2023-08-11)


### Features

* allOf models now have toXxx methods to access the separate allOf models ([#47](https://github.com/lithic-com/lithic-kotlin/issues/47)) ([4a6fa98](https://github.com/lithic-com/lithic-kotlin/commit/4a6fa985582292dee2e8e6b0dd1af84aec1a122e))
* **api:** add card reissue shipping options ([#45](https://github.com/lithic-com/lithic-kotlin/issues/45)) ([a303848](https://github.com/lithic-com/lithic-kotlin/commit/a30384827b265705b94bd019864919f496ee6f7f))

## [0.11.7](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.6...v0.11.7) (2023-08-08)


### Features

* **api:** add carrier property to card create and reissue params ([#43](https://github.com/lithic-com/lithic-kotlin/issues/43)) ([a0fc2bf](https://github.com/lithic-com/lithic-kotlin/commit/a0fc2bf189c86f2989f881fe5c2e3b86e40252a1))
* **api:** enable more of the payments and external bank api ([#40](https://github.com/lithic-com/lithic-kotlin/issues/40)) ([765db4e](https://github.com/lithic-com/lithic-kotlin/commit/765db4e21f7e9535045494bce095376aebe89df7))


### Chores

* **ci:** allow release to proceed without signing key id secret ([#39](https://github.com/lithic-com/lithic-kotlin/issues/39)) ([48960f8](https://github.com/lithic-com/lithic-kotlin/commit/48960f8ccd9943599832c925734ef2e7e784b167))
* **internal:** publish with --stacktrace for more helpful error information ([#36](https://github.com/lithic-com/lithic-kotlin/issues/36)) ([c3f1ab5](https://github.com/lithic-com/lithic-kotlin/commit/c3f1ab5e8f935e361cb96ac1c3bc361db3131870))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#38](https://github.com/lithic-com/lithic-kotlin/issues/38)) ([e5c8f4c](https://github.com/lithic-com/lithic-kotlin/commit/e5c8f4c464277b40a93b9a01b90b5d79d71bc17f))


### Documentation

* **readme:** remove beta status + document versioning policy ([#41](https://github.com/lithic-com/lithic-kotlin/issues/41)) ([8fa166f](https://github.com/lithic-com/lithic-kotlin/commit/8fa166f0992ab5938b6f33ca62f23cab2be8a835))

## [0.11.6](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.5...v0.11.6) (2023-08-01)


### Features

* **api:** updates ([#31](https://github.com/lithic-com/lithic-kotlin/issues/31)) ([6f74a6a](https://github.com/lithic-com/lithic-kotlin/commit/6f74a6a2ca3adf6372c3ff4bd70f66832eb41256))


### Bug Fixes

* adjust typo of 'descisioning' to 'decisioning' ([#33](https://github.com/lithic-com/lithic-kotlin/issues/33)) ([b8948db](https://github.com/lithic-com/lithic-kotlin/commit/b8948dbb159b4ef93dfd73965da765b1cce48975))
* change names of `ThreeDDecision...` to `ThreeDSDecision...` ([#34](https://github.com/lithic-com/lithic-kotlin/issues/34)) ([eacc782](https://github.com/lithic-com/lithic-kotlin/commit/eacc78297ea7f6674caf45ec5c8b9bc52eb0d530))

## [0.11.5](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.4...v0.11.5) (2023-07-27)


### Features

* add with_content param, event message attempts, and auto-close responses ([7297e9c](https://github.com/lithic-com/lithic-kotlin/commit/7297e9ca4107810247c4eb82744b80a9cddc4de3))
* **api:** add `with_content` param ([#23](https://github.com/lithic-com/lithic-kotlin/issues/23)) ([035ed26](https://github.com/lithic-com/lithic-kotlin/commit/035ed26936fd9dd395e4ca2d8236a6a66afc3b4f))
* **api:** add payment and external bank accounts resource ([#29](https://github.com/lithic-com/lithic-kotlin/issues/29)) ([b09b7fd](https://github.com/lithic-com/lithic-kotlin/commit/b09b7fdf9edd282522c046ac4a0d3610fa0c04d9))
* **ci:** add a publish-sonatype workflow for manual running ([#30](https://github.com/lithic-com/lithic-kotlin/issues/30)) ([69ae5d4](https://github.com/lithic-com/lithic-kotlin/commit/69ae5d44da69c868ebf64b03eda8e64954726762))


### Bug Fixes

* auto-close responses even if an exception is thrown during deserialization ([#25](https://github.com/lithic-com/lithic-kotlin/issues/25)) ([812042c](https://github.com/lithic-com/lithic-kotlin/commit/812042c8939ffd6554a72f9d84720a6cd289677f))


### Chores

* **internal:** add `codegen.log` to `.gitignore` ([#27](https://github.com/lithic-com/lithic-kotlin/issues/27)) ([f2100d8](https://github.com/lithic-com/lithic-kotlin/commit/f2100d808a84acd4fe992b49bc4bcd8d20670a22))
* unreleased changes ([7297e9c](https://github.com/lithic-com/lithic-kotlin/commit/7297e9ca4107810247c4eb82744b80a9cddc4de3))

## [0.11.4](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.3...v0.11.4) (2023-07-18)


### Features

* **api:** add event message attempts ([#20](https://github.com/lithic-com/lithic-kotlin/issues/20)) ([303c384](https://github.com/lithic-com/lithic-kotlin/commit/303c384d7d5bb57ae006d00535e8110161188008))

## [0.11.3](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.2...v0.11.3) (2023-07-17)


### Features

* **api:** add more enum members to event types ([#14](https://github.com/lithic-com/lithic-kotlin/issues/14)) ([d47c22d](https://github.com/lithic-com/lithic-kotlin/commit/d47c22d0a3b1503da18228ebf35fdd9e4d4b29d5))
* **api:** no longer require `website_url` property on KYB object ([#18](https://github.com/lithic-com/lithic-kotlin/issues/18)) ([0bde74f](https://github.com/lithic-com/lithic-kotlin/commit/0bde74fcd9dd7d8df6275b8dc289766cffc53e52))


### Chores

* **internal:** minor reformatting ([#17](https://github.com/lithic-com/lithic-kotlin/issues/17)) ([8e8f958](https://github.com/lithic-com/lithic-kotlin/commit/8e8f958f186b3bcc23495673233a4bbe6720b593))
* **internal:** minor reformatting + remove internal examples classes ([#16](https://github.com/lithic-com/lithic-kotlin/issues/16)) ([d903d23](https://github.com/lithic-com/lithic-kotlin/commit/d903d2350988b46418539f88448de41c469e7a5f))

## [0.11.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.1...v0.11.2) (2023-07-12)


### Features

* **api:** add digital wallet tokenization result event type ([#11](https://github.com/lithic-com/lithic-kotlin/issues/11)) ([306a0db](https://github.com/lithic-com/lithic-kotlin/commit/306a0dbe87fe18dc3655dbe7724378e4ee06b48a))

## [0.11.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.11.0...v0.11.1) (2023-07-07)


### Features

* **api:** add `state` query param for cards ([#9](https://github.com/lithic-com/lithic-kotlin/issues/9)) ([2bfb26f](https://github.com/lithic-com/lithic-kotlin/commit/2bfb26f8c8c64598b9f7df53be5367e3c761b74d))


### Documentation

* **webhooks:** clarify webhook signature validation ([#7](https://github.com/lithic-com/lithic-kotlin/issues/7)) ([e44f18f](https://github.com/lithic-com/lithic-kotlin/commit/e44f18f98c397d78e6a1c046f4425d4a12ea570b))

## [0.11.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.10.2...v0.11.0) (2023-07-05)


### ⚠ BREAKING CHANGES

* **api:** remove previous_auth_rule_tokens from auth rules ([#4](https://github.com/lithic-com/lithic-kotlin/issues/4))

### Refactors

* **api:** remove previous_auth_rule_tokens from auth rules ([#4](https://github.com/lithic-com/lithic-kotlin/issues/4)) ([6762e21](https://github.com/lithic-com/lithic-kotlin/commit/6762e21de4bc4d55f880e6d61d428ea147afc104))

## [0.10.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.10.1...v0.10.2) (2023-06-28)

Initial Release
