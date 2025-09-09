# Changelog

## 0.102.0 (2025-09-09)

Full Changelog: [v0.101.0...v0.102.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.101.0...v0.102.0)

### Features

* **api:** adds support for unpauseing external bank accounts ([cd12987](https://github.com/lithic-com/lithic-kotlin/commit/cd12987df3d3e8b17a0e2249cb3d6912b72a4e36))

## 0.101.0 (2025-09-03)

Full Changelog: [v0.100.2...v0.101.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.100.2...v0.101.0)

### Features

* **api:** adds support for delegated KYB onboarding and more device details in 3DS Authentications ([656d2ee](https://github.com/lithic-com/lithic-kotlin/commit/656d2eeda185265b9f225db385463424502d2eea))

## 0.100.2 (2025-09-03)

Full Changelog: [v0.100.1...v0.100.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.100.1...v0.100.2)

### Bug Fixes

* **ci:** use java-version 21 for publish step ([f1eff63](https://github.com/lithic-com/lithic-kotlin/commit/f1eff634ffa53b3ac21940c8d7effcd7fb98cda8))

## 0.100.1 (2025-08-23)

Full Changelog: [v0.100.0...v0.100.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.100.0...v0.100.1)

### Bug Fixes

* fix casing issue ([9acb065](https://github.com/lithic-com/lithic-kotlin/commit/9acb0658adf765cea9035003a10538ed2c99218a))
* update singularization rules ([5d32171](https://github.com/lithic-com/lithic-kotlin/commit/5d32171b357c281378b654d33fab8a6317847514))


### Chores

* **ci:** reduce log noise ([9fd01a3](https://github.com/lithic-com/lithic-kotlin/commit/9fd01a390d3634f94dd924ee7a3e471433594fd3))
* **client:** refactor closing / shutdown ([6edadb9](https://github.com/lithic-com/lithic-kotlin/commit/6edadb9d89cc5a94fe31ba3da215492a180b037e))
* **internal:** support running ktfmt directly ([0ae965a](https://github.com/lithic-com/lithic-kotlin/commit/0ae965a48512ba7bf3eb72c363c0d42b3dfcb2d6))
* remove memory upper bound from publishing step ([3fad20a](https://github.com/lithic-com/lithic-kotlin/commit/3fad20a8d470b894b0187dd65771f9638675d3f7))

## 0.100.0 (2025-08-18)

Full Changelog: [v0.99.0...v0.100.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.99.0...v0.100.0)

### Features

* **api:** adds Event types for additional API resources ([7fae21f](https://github.com/lithic-com/lithic-kotlin/commit/7fae21f666cfedd5593aacee4e2a9f7fd5396ebd))


### Performance Improvements

* **internal:** make formatting faster ([4754cf9](https://github.com/lithic-com/lithic-kotlin/commit/4754cf91f1ec40f386a1e0fef6caa6b2d11d8d97))


### Chores

* **ci:** add build job ([06d2c8e](https://github.com/lithic-com/lithic-kotlin/commit/06d2c8e9daff272927bfc89b86c65fd7f9bb21d9))

## 0.99.0 (2025-08-13)

Full Changelog: [v0.98.0...v0.99.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.98.0...v0.99.0)

### Features

* **api:** adds detailed 3DS challenge statuses ([c140d64](https://github.com/lithic-com/lithic-kotlin/commit/c140d6411f24b06de46a268bb437a65681ac0f6a))


### Chores

* **example:** fix run example comment ([cadd2de](https://github.com/lithic-com/lithic-kotlin/commit/cadd2debc71036377def214bd6ca0e1ff10f8d83))
* increase max gradle JVM heap to 8GB ([1a23d94](https://github.com/lithic-com/lithic-kotlin/commit/1a23d9490ac84c45633a3bb28c18bb29e114054c))
* **internal:** add lock helper ([c9b4de0](https://github.com/lithic-com/lithic-kotlin/commit/c9b4de02884c0a95199f611d744c4bfba82de141))
* **internal:** dynamically determine included projects ([326e268](https://github.com/lithic-com/lithic-kotlin/commit/326e2689564640f21f665eac577a6bd0777c4bd0))
* **internal:** format identity methods ([2f494ac](https://github.com/lithic-com/lithic-kotlin/commit/2f494acb1d9bb701668536f9a559cb069f4bb28f))
* **internal:** support passing arguments to test script ([30fdc8f](https://github.com/lithic-com/lithic-kotlin/commit/30fdc8f0803733808ae5160d32f39f30f062fb48))
* **internal:** update comment in script ([e92f2ad](https://github.com/lithic-com/lithic-kotlin/commit/e92f2ad9f3686152034c166e03c260ef8027e9a3))
* update @stainless-api/prism-cli to v5.15.0 ([57e6a27](https://github.com/lithic-com/lithic-kotlin/commit/57e6a271470ae1aa9a9817ace47a8ca6a41a9d71))

## 0.98.0 (2025-08-04)

Full Changelog: [v0.97.0...v0.98.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.97.0...v0.98.0)

### Features

* **api:** adds new Account Activity API ([e503443](https://github.com/lithic-com/lithic-kotlin/commit/e503443fe70d30d348fe684fc7780f10a6117a61))

## 0.97.0 (2025-07-31)

Full Changelog: [v0.96.0...v0.97.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.96.0...v0.97.0)

### Features

* add retryable exception ([123e3b0](https://github.com/lithic-com/lithic-kotlin/commit/123e3b0411b4ca6def2ae2302bb158101199b1f3))
* **client:** ensure compat with proguard ([97cc47f](https://github.com/lithic-com/lithic-kotlin/commit/97cc47fbd9f82ed1231a9d0f91b7ad78c0b2d492))


### Bug Fixes

* **client:** r8 support ([73e06a9](https://github.com/lithic-com/lithic-kotlin/commit/73e06a9e1ba41c757b7ad3e1aee77e3fa4c3e7c6))


### Chores

* **internal:** bump ci test timeout ([320309d](https://github.com/lithic-com/lithic-kotlin/commit/320309d362f58856163b50671660450cc527ff6a))
* **internal:** reduce proguard ci logging ([b9f8cb8](https://github.com/lithic-com/lithic-kotlin/commit/b9f8cb8518e45dafceaaa48ef7763f8c3832097e))

## 0.96.0 (2025-07-28)

Full Changelog: [v0.95.1...v0.96.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.95.1...v0.96.0)

### Features

* **api:** updates Transaction retrieve response to match API ([a84dee5](https://github.com/lithic-com/lithic-kotlin/commit/a84dee568fe41ad2e7af1bec25d6ba490a082040))


### Chores

* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([de61d07](https://github.com/lithic-com/lithic-kotlin/commit/de61d070ef3c69787b82c1ad495a3529836d1ded))


### Documentation

* more code comments ([3811d4c](https://github.com/lithic-com/lithic-kotlin/commit/3811d4c3c193a7feb08db9f326a8680e63a49c35))

## 0.95.1 (2025-07-24)

Full Changelog: [v0.95.0...v0.95.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.95.0...v0.95.1)

### Bug Fixes

* **client:** accidental mutability of some classes ([1fc47af](https://github.com/lithic-com/lithic-kotlin/commit/1fc47af3e736f727a79ff78346d37fed110c1f90))

## 0.95.0 (2025-07-23)

Full Changelog: [v0.94.1...v0.95.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.94.1...v0.95.0)

### Features

* **api:** adds new Auth Rules Scope and Settlement Details type ([014bf95](https://github.com/lithic-com/lithic-kotlin/commit/014bf955f04981deb015e5b63a82aeb7e2e5f964))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([1141a37](https://github.com/lithic-com/lithic-kotlin/commit/1141a375b12a5912c3cb4a996f8e66be5227b029))
* **client:** add https config options ([bc31221](https://github.com/lithic-com/lithic-kotlin/commit/bc3122191b4680d164579c4dc75619c7ca06813e))
* **client:** allow configuring env via system properties ([bcb3642](https://github.com/lithic-com/lithic-kotlin/commit/bcb36423c995db1c8dbf6f0a9104da691f66ad9c))


### Chores

* **docs:** update Account Holder deprecation formatting ([5e8f806](https://github.com/lithic-com/lithic-kotlin/commit/5e8f8069be7645d3225e3bb01085de2db4dc7938))
* **internal:** refactor delegating from client to options ([4442607](https://github.com/lithic-com/lithic-kotlin/commit/4442607efa9ee84e4fb73ecc98efbebc7adf2911))


### Documentation

* fix missing readme comment ([2a57f11](https://github.com/lithic-com/lithic-kotlin/commit/2a57f112e0af92cbad2b186beffa6d19c394074e))

## 0.94.1 (2025-07-18)

Full Changelog: [v0.94.0...v0.94.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.94.0...v0.94.1)

### Bug Fixes

* **client:** ensure error handling always occurs ([6c81bce](https://github.com/lithic-com/lithic-kotlin/commit/6c81bcedee15331c071b14ab611cf6bfa802513e))
* Remove extra blank lines in import statements ([b46ae58](https://github.com/lithic-com/lithic-kotlin/commit/b46ae58ebd91090077a2fb52ad029bdcca7bc9d7))


### Chores

* fix conflict ([8b7c10d](https://github.com/lithic-com/lithic-kotlin/commit/8b7c10d4cf0ea1277d8d716954950e8bd85e42c6))
* **internal:** allow running specific example from cli ([f8f878f](https://github.com/lithic-com/lithic-kotlin/commit/f8f878fb212fea5586117f43244b29377238f539))

## 0.94.0 (2025-07-15)

Full Changelog: [v0.93.1...v0.94.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.93.1...v0.94.0)

### Features

* **api:** adds Network Programs and Account/Card Sub-statuses ([3cf127d](https://github.com/lithic-com/lithic-kotlin/commit/3cf127db8ebf941add9f256449e470fcccce650e))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([a553a2b](https://github.com/lithic-com/lithic-kotlin/commit/a553a2b198db9964de700e14ab1649443406ffcc))

## 0.93.1 (2025-07-08)

Full Changelog: [v0.93.0...v0.93.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.93.0...v0.93.1)

### Chores

* disable docs generation to fix publishing ([b584b54](https://github.com/lithic-com/lithic-kotlin/commit/b584b5460c2a96c7df0283a1b1886b8baa2adf58))
* enable zip64 for publishing ([31e1e30](https://github.com/lithic-com/lithic-kotlin/commit/31e1e3014af1d16e4219e71fcf08003f30e34d9b))
* reenable docs generation ([bbb2365](https://github.com/lithic-com/lithic-kotlin/commit/bbb2365da8259ddd8d29ac78fd0f2f170cddc6e3))

## 0.93.0 (2025-07-08)

Full Changelog: [v0.92.1...v0.93.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.92.1...v0.93.0)

### Features

* **api:** add models for merchant_lock_parameters and conditional_3ds_action_parameters ([4019723](https://github.com/lithic-com/lithic-kotlin/commit/40197233b7e837fa9ce60f289731f3971da3b1a9))
* **api:** api update ([03bc4db](https://github.com/lithic-com/lithic-kotlin/commit/03bc4db1a5eda572f46c38706164fc6c76bcfd52))
* **api:** api update ([4e5d89d](https://github.com/lithic-com/lithic-kotlin/commit/4e5d89deedc14647230c8d7342cc902b32bc6bb3))
* **api:** api update ([e393449](https://github.com/lithic-com/lithic-kotlin/commit/e393449cc84ef4c674580bb8226bbed0783fbc4f))


### Bug Fixes

* **api:** name conflict between type and account type ([8edfa02](https://github.com/lithic-com/lithic-kotlin/commit/8edfa0257474f5b5d747ee8712f8ee050ee8eafa))


### Chores

* bump heap size for publishing ([25d8880](https://github.com/lithic-com/lithic-kotlin/commit/25d8880413c8334bfea50cfdc0cafdcecf935f80))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([dc3db14](https://github.com/lithic-com/lithic-kotlin/commit/dc3db14568624df0cca3f7a098c6b0890729ab06))

## 0.92.1 (2025-06-29)

Full Changelog: [v0.92.0...v0.92.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.92.0...v0.92.1)

### Bug Fixes

* **client:** don't close client on `withOptions` usage when original is gc'd ([ca29f94](https://github.com/lithic-com/lithic-kotlin/commit/ca29f941d560ad990218c4f09eefeb2f7e20b103))


### Chores

* **ci:** only run for pushes and fork pull requests ([dfd6d4a](https://github.com/lithic-com/lithic-kotlin/commit/dfd6d4a3c2720489cda46ef7c32f46ffe6166350))

## 0.92.0 (2025-06-27)

Full Changelog: [v0.91.0...v0.92.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.91.0...v0.92.0)

### Features

* **api:** introduce dedicated model for SpendLimitDuration ([6bd620f](https://github.com/lithic-com/lithic-kotlin/commit/6bd620fa42aad8c6eab27e861441079fbabac381))
* **client:** adds support for on-demand Auth Rule Performance Reports ([a9c2060](https://github.com/lithic-com/lithic-kotlin/commit/a9c20602854e6ca68a45a8a7e694cacdb22ef497))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([e8f4483](https://github.com/lithic-com/lithic-kotlin/commit/e8f4483c5035473bcc74821bc7bb86b3dff4f8bf))


### Chores

* **internal:** manual updates ([901c8d8](https://github.com/lithic-com/lithic-kotlin/commit/901c8d82b40572966327e0ddfefdb3544d0cbab9))

## 0.91.0 (2025-06-23)

Full Changelog: [v0.90.1...v0.91.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.90.1...v0.91.0)

### Features

* **api:** add CLOSED account state option and UNVERIFIED verification method ([ee3cb9d](https://github.com/lithic-com/lithic-kotlin/commit/ee3cb9d2be30e94c922572538c9349eb689de8ae))
* **client:** add a `withOptions` method ([c78209a](https://github.com/lithic-com/lithic-kotlin/commit/c78209aa4bf1ac8267cb77f171f573e52d905216))
* **client:** adds endpoint to register an account number on a Financial Account ([b12b3d6](https://github.com/lithic-com/lithic-kotlin/commit/b12b3d65d9fff5cac77188fa7a60be37ce4fa272))
* **client:** adds support for 3DS to Auth Rules ([a346bc8](https://github.com/lithic-com/lithic-kotlin/commit/a346bc8ed2f7bff325d9e02fc01a8920122fc0ae))
* **client:** implement per-endpoint base URL support ([b90f765](https://github.com/lithic-com/lithic-kotlin/commit/b90f765bbc8acfdb8da94d2617a7ace31a169410))


### Bug Fixes

* **client:** bump max requests per host to max requests (5 -&gt; 64) ([2635299](https://github.com/lithic-com/lithic-kotlin/commit/26352991a74c16c67198d8b6e1e8dfefdd703868))


### Chores

* **ci:** enable for pull requests ([a7fe29a](https://github.com/lithic-com/lithic-kotlin/commit/a7fe29a27a88ed983f8b4d5778a0f84e041ae71a))
* run formatter ([e505891](https://github.com/lithic-com/lithic-kotlin/commit/e505891c14bc827ae3aa07672ebbe7931e9552a9))

## 0.90.1 (2025-06-02)

Full Changelog: [v0.90.0...v0.90.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.90.0...v0.90.1)

### Bug Fixes

* **client:** `hasNextPage` impl for some classes ([f515fb2](https://github.com/lithic-com/lithic-kotlin/commit/f515fb2af56cd201e1a28dd385402b6ef57e60b2))


### Chores

* **api:** mark some methods as deprecated ([b928e1b](https://github.com/lithic-com/lithic-kotlin/commit/b928e1b0e508f57d5755076b6e34e006dea63f22))
* **docs:** grammar improvements ([5c449a2](https://github.com/lithic-com/lithic-kotlin/commit/5c449a2076e67fa8178d4c241b719eeec0b55f51))

## 0.90.0 (2025-05-15)

Full Changelog: [v0.89.0...v0.90.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.89.0...v0.90.0)

### Features

* **api:** new Funding Events and Card Web Provision API's ([ff72f2c](https://github.com/lithic-com/lithic-kotlin/commit/ff72f2cbf9f8dc141a1827dd251e3100233bafdf))


### Chores

* **internal:** fix custom code ([25daf77](https://github.com/lithic-com/lithic-kotlin/commit/25daf774306fe60138abd8983afed10a61a68f44))

## 0.89.0 (2025-05-12)

Full Changelog: [v0.88.1...v0.89.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.88.1...v0.89.0)

### ⚠ BREAKING CHANGES

* **client:** improve some class names
* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-nullable types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** manual updates ([27222d0](https://github.com/lithic-com/lithic-kotlin/commit/27222d0f77adefa05b5f82787826166b7f0a267e))
* **client:** allow providing some params positionally ([b8fa09d](https://github.com/lithic-com/lithic-kotlin/commit/b8fa09dcf254970133839a7a06b06f22e41deed5))
* **client:** extract auto pagination to shared classes ([bd073ab](https://github.com/lithic-com/lithic-kotlin/commit/bd073abe572c5e9be070f469820f8d4e64a4afff))


### Chores

* **internal:** fix custom code ([630ced9](https://github.com/lithic-com/lithic-kotlin/commit/630ced9c73239cd9e8d2c2d7abbdad8e988a633f))
* **internal:** fix custom code ([0f9f6f5](https://github.com/lithic-com/lithic-kotlin/commit/0f9f6f51baf78385f2e1dbd22556a8d71a9abc28))
* **internal:** remove flaky `-Xbackend-threads=0` option ([e0195ad](https://github.com/lithic-com/lithic-kotlin/commit/e0195ad92642b1baca203f71c4c59b2aebd3549b))


### Refactors

* **client:** improve some class names ([d4c10a2](https://github.com/lithic-com/lithic-kotlin/commit/d4c10a28a868be304baf4255835ee24ebb250bc5))

## 0.88.1 (2025-05-05)

Full Changelog: [v0.88.0...v0.88.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.88.0...v0.88.1)

### Bug Fixes

* **internals:** fix servers entry for /v2/auth_rules.get ([b4b4dcf](https://github.com/lithic-com/lithic-kotlin/commit/b4b4dcf287d75928cfaba6ddac9ebc22d01c9cec))


### Chores

* **internal:** update java toolchain ([3d8146a](https://github.com/lithic-com/lithic-kotlin/commit/3d8146a1caa48abceae3ef39284b6c96776baa75))

## 0.88.0 (2025-04-29)

Full Changelog: [v0.87.2...v0.88.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.87.2...v0.88.0)

### Features

* **api:** adds new merchant lock Auth Rule ([095801f](https://github.com/lithic-com/lithic-kotlin/commit/095801f592991db0846dd280e15580cd38f6aa5a))


### Chores

* **ci:** add timeout thresholds for CI jobs ([8f8edaf](https://github.com/lithic-com/lithic-kotlin/commit/8f8edaf77625922d83d9d7a169a7ce67b717fe46))
* **ci:** only use depot for staging repos ([bfbf076](https://github.com/lithic-com/lithic-kotlin/commit/bfbf07647cd165333dddcbc24589a5890287b504))
* **ci:** run on more branches and use depot runners ([27310cd](https://github.com/lithic-com/lithic-kotlin/commit/27310cd9a2b18ac0f06fc6f09738c6f110834505))
* **internal:** java 17 -&gt; 21 on ci ([29c45cb](https://github.com/lithic-com/lithic-kotlin/commit/29c45cb81994fc3c893d71a02ce4c2fa92067a30))

## 0.87.2 (2025-04-21)

Full Changelog: [v0.87.1...v0.87.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.87.1...v0.87.2)

### Bug Fixes

* **internals:** fix Card schema definition ([5114701](https://github.com/lithic-com/lithic-kotlin/commit/511470133fb8ad40a310366f252e909e402980ba))

## 0.87.1 (2025-04-21)

Full Changelog: [v0.87.0...v0.87.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.87.0...v0.87.1)

### Bug Fixes

* **internal:** refresh schemas ([d6df86b](https://github.com/lithic-com/lithic-kotlin/commit/d6df86bd1f0186a119f314a470ee89be34b8ca6b))

## 0.87.0 (2025-04-18)

Full Changelog: [v0.86.0...v0.87.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.86.0...v0.87.0)

### Features

* **api:** updates to Card definition for PCI clarity ([e3d87fd](https://github.com/lithic-com/lithic-kotlin/commit/e3d87fd319d5a75836fd5f9fb9ecd1fbbe92b710))


### Performance Improvements

* **internal:** improve compilation+test speed ([ffdf2a3](https://github.com/lithic-com/lithic-kotlin/commit/ffdf2a3010c740d99fe5d8513c78053a7a4f1b22))


### Chores

* **internal:** codegen related update ([91931dc](https://github.com/lithic-com/lithic-kotlin/commit/91931dc05a0142a1bad2637656e06ace05addf30))
* **internal:** reduce CI branch coverage ([5b1e470](https://github.com/lithic-com/lithic-kotlin/commit/5b1e470bd3735ba3746be880b2a964e95e7b0ab7))


### Documentation

* **client:** update jackson compat error message ([fce618f](https://github.com/lithic-com/lithic-kotlin/commit/fce618f5311b8a7091bd20df4a017300865158ee))
* explain http client customization ([d9f05ba](https://github.com/lithic-com/lithic-kotlin/commit/d9f05ba3bddb85bb8d941a93cea4b101fd647129))
* explain jackson compat in readme ([ef51da1](https://github.com/lithic-com/lithic-kotlin/commit/ef51da13f19d4ae6c566f9bff45e05640c94c325))
* update documentation links to be more uniform ([a7f9e6a](https://github.com/lithic-com/lithic-kotlin/commit/a7f9e6ab345541d26481267dc574c20591919ca7))


### Refactors

* **client:** migrate pages to builder pattern ([#577](https://github.com/lithic-com/lithic-kotlin/issues/577)) ([2df7de6](https://github.com/lithic-com/lithic-kotlin/commit/2df7de634d10d5256d827e32aa156edd56356a32))

## 0.86.0 (2025-04-09)

Full Changelog: [v0.85.0...v0.86.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.85.0...v0.86.0)

### Features

* **api:** manual updates ([484c863](https://github.com/lithic-com/lithic-kotlin/commit/484c863c3ff0e339d51a5d208b4da9db9729e4d1))

## 0.85.0 (2025-04-09)

Full Changelog: [v0.84.0...v0.85.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.84.0...v0.85.0)

### Features

* **client:** make pagination robust to missing data ([b1f9682](https://github.com/lithic-com/lithic-kotlin/commit/b1f968257e51336eec21251405c58dedbfd13996))
* **client:** support setting base URL via env var ([#572](https://github.com/lithic-com/lithic-kotlin/issues/572)) ([19dbec7](https://github.com/lithic-com/lithic-kotlin/commit/19dbec7f004442fb60b7cc46973f354a10d47850))


### Bug Fixes

* **client:** bump to better jackson version ([#574](https://github.com/lithic-com/lithic-kotlin/issues/574)) ([1306afc](https://github.com/lithic-com/lithic-kotlin/commit/1306afc02b8522a37c29a4e69ed7f955a71ba83b))


### Chores

* configure new SDK language ([401393a](https://github.com/lithic-com/lithic-kotlin/commit/401393acae309c8f5e4488a36a30a1b2e6dfb807))
* **internal:** expand CI branch coverage ([#573](https://github.com/lithic-com/lithic-kotlin/issues/573)) ([ed67869](https://github.com/lithic-com/lithic-kotlin/commit/ed67869cc661b309952b5ee68aecf9762e0c34bc))
* **tests:** improve enum examples ([#570](https://github.com/lithic-com/lithic-kotlin/issues/570)) ([3999089](https://github.com/lithic-com/lithic-kotlin/commit/399908991b96a6240b1b79abe82ca38965278c35))


### Documentation

* add comments for page methods ([b1f9682](https://github.com/lithic-com/lithic-kotlin/commit/b1f968257e51336eec21251405c58dedbfd13996))


### Refactors

* **client:** deduplicate page response classes ([#575](https://github.com/lithic-com/lithic-kotlin/issues/575)) ([b1f9682](https://github.com/lithic-com/lithic-kotlin/commit/b1f968257e51336eec21251405c58dedbfd13996))

## 0.84.0 (2025-04-08)

Full Changelog: [v0.83.0...v0.84.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.83.0...v0.84.0)

### Features

* **api:** introduce TransactionSeries and update ShippingMethod fields ([#568](https://github.com/lithic-com/lithic-kotlin/issues/568)) ([ba71c34](https://github.com/lithic-com/lithic-kotlin/commit/ba71c34008f89f2987b0df56133fa750bfc5efc3))

## 0.83.0 (2025-04-07)

Full Changelog: [v0.82.2...v0.83.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.82.2...v0.83.0)

### Features

* **api:** new resend endpoint for Event Subscriptions ([#566](https://github.com/lithic-com/lithic-kotlin/issues/566)) ([0325683](https://github.com/lithic-com/lithic-kotlin/commit/03256833ceaca9fb78d14f7047d4e613169da235))
* **client:** expose request body setter and getter ([#562](https://github.com/lithic-com/lithic-kotlin/issues/562)) ([c450cfe](https://github.com/lithic-com/lithic-kotlin/commit/c450cfe9575e0e3a0c9f359890316be697b77659))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#563](https://github.com/lithic-com/lithic-kotlin/issues/563)) ([6185edc](https://github.com/lithic-com/lithic-kotlin/commit/6185edcbe4c3244d02f990ad110a290906c9a0df))


### Chores

* **internal:** codegen related update ([#557](https://github.com/lithic-com/lithic-kotlin/issues/557)) ([0715792](https://github.com/lithic-com/lithic-kotlin/commit/0715792fb76244a7fbe663f825b36d524c797416))
* **internal:** codegen related update ([#559](https://github.com/lithic-com/lithic-kotlin/issues/559)) ([1fc4e5a](https://github.com/lithic-com/lithic-kotlin/commit/1fc4e5a8077abd1943347bcbf8309d5bee63ad01))
* **internal:** codegen related update ([#560](https://github.com/lithic-com/lithic-kotlin/issues/560)) ([8e1fff7](https://github.com/lithic-com/lithic-kotlin/commit/8e1fff78f5c25f2786f2a51c7f7d3967050a48aa))
* **internal:** codegen related update ([#561](https://github.com/lithic-com/lithic-kotlin/issues/561)) ([b200ca8](https://github.com/lithic-com/lithic-kotlin/commit/b200ca82721dc1439e33facf41ea065395d40b9d))


### Documentation

* add comments to `JsonField` classes ([#564](https://github.com/lithic-com/lithic-kotlin/issues/564)) ([e9af651](https://github.com/lithic-com/lithic-kotlin/commit/e9af6519553ee8ba541e4463ea992c51962238a5))
* document how to forcibly omit required field ([e7a4782](https://github.com/lithic-com/lithic-kotlin/commit/e7a4782a89a9c5d67dc2dfc79d889494563fb97f))
* swap examples used in readme ([#565](https://github.com/lithic-com/lithic-kotlin/issues/565)) ([e7a4782](https://github.com/lithic-com/lithic-kotlin/commit/e7a4782a89a9c5d67dc2dfc79d889494563fb97f))

## 0.82.2 (2025-03-31)

Full Changelog: [v0.82.1...v0.82.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.82.1...v0.82.2)

### Bug Fixes

* **client:** limit json deserialization coercion ([#555](https://github.com/lithic-com/lithic-kotlin/issues/555)) ([eceef0e](https://github.com/lithic-com/lithic-kotlin/commit/eceef0e9cb27c3e2bcb38351a69b97aff42863c5))


### Chores

* internal codegen changes ([b05d6c6](https://github.com/lithic-com/lithic-kotlin/commit/b05d6c6b080b765f74a13c38a7c0df4c0f1690a9))
* internal codegen changes ([95aab2f](https://github.com/lithic-com/lithic-kotlin/commit/95aab2f7686a42640648f64972a7010c459d9f20))

## 0.82.1 (2025-03-28)

Full Changelog: [v0.82.0...v0.82.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.82.0...v0.82.1)

### Bug Fixes

* **client:** don't call `validate()` during deserialization if we don't have to ([#551](https://github.com/lithic-com/lithic-kotlin/issues/551)) ([59eba29](https://github.com/lithic-com/lithic-kotlin/commit/59eba29adc291e8b9d7bddaf14fc75089ccef02c))

## 0.82.0 (2025-03-27)

Full Changelog: [v0.81.0...v0.82.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.81.0...v0.82.0)

### ⚠ BREAKING CHANGES

* **client:** rename `_3dsVersion` to `threeDSVersion` ([#543](https://github.com/lithic-com/lithic-kotlin/issues/543))
* **client:** refactor exception structure and methods ([#531](https://github.com/lithic-com/lithic-kotlin/issues/531))

### Features

* **client:** support a lower jackson version ([#539](https://github.com/lithic-com/lithic-kotlin/issues/539)) ([eac8971](https://github.com/lithic-com/lithic-kotlin/commit/eac89719b995af144d3ba113ce05c654501f7f3f))
* **client:** throw on incompatible jackson version ([eac8971](https://github.com/lithic-com/lithic-kotlin/commit/eac89719b995af144d3ba113ce05c654501f7f3f))


### Bug Fixes

* **client:** map deserialization bug ([ac4fa1b](https://github.com/lithic-com/lithic-kotlin/commit/ac4fa1bb430931818a7fa78fc8b90fbbdb2483a5))


### Chores

* **api:** new attribute targets for Auth Rules and new Financial Account State schema ([#541](https://github.com/lithic-com/lithic-kotlin/issues/541)) ([b3cda01](https://github.com/lithic-com/lithic-kotlin/commit/b3cda01f5fcc57a8b73bc41f74f2d9515df38a5a))
* **client:** refactor exception structure and methods ([#531](https://github.com/lithic-com/lithic-kotlin/issues/531)) ([c5b4020](https://github.com/lithic-com/lithic-kotlin/commit/c5b402091c7e4393e7eb6631844dbc3114f1baf1))
* **client:** rename `_3dsVersion` to `threeDSVersion` ([#543](https://github.com/lithic-com/lithic-kotlin/issues/543)) ([4d0d2e1](https://github.com/lithic-com/lithic-kotlin/commit/4d0d2e125d713b4b7d6a6d9f67cf02f68d64871d))
* fix typos ([#542](https://github.com/lithic-com/lithic-kotlin/issues/542)) ([1977559](https://github.com/lithic-com/lithic-kotlin/commit/1977559d3db99f772046b837c46626e64ea06804))
* **internal:** add missing release please block ([#528](https://github.com/lithic-com/lithic-kotlin/issues/528)) ([ec84e11](https://github.com/lithic-com/lithic-kotlin/commit/ec84e11fce0df443b4b8cfb000fb609be839c262))
* **internal:** delete unused methods and annotations ([#544](https://github.com/lithic-com/lithic-kotlin/issues/544)) ([ac4fa1b](https://github.com/lithic-com/lithic-kotlin/commit/ac4fa1bb430931818a7fa78fc8b90fbbdb2483a5))
* **internal:** make multipart assertions more robust ([a9a25db](https://github.com/lithic-com/lithic-kotlin/commit/a9a25db641bdc949c5433a0b8d08b5bd9d3a00ae))
* **internal:** remove unnecessary `assertNotNull` calls ([a9a25db](https://github.com/lithic-com/lithic-kotlin/commit/a9a25db641bdc949c5433a0b8d08b5bd9d3a00ae))
* **internal:** remove unnecessary import ([#535](https://github.com/lithic-com/lithic-kotlin/issues/535)) ([90e66c6](https://github.com/lithic-com/lithic-kotlin/commit/90e66c6b87ce66c3a513331f34ec2f01a976cd5a))
* **internal:** remove workflow condition ([#549](https://github.com/lithic-com/lithic-kotlin/issues/549)) ([5f08476](https://github.com/lithic-com/lithic-kotlin/commit/5f08476aff6806d9f5572948aa22746fbd7c0f41))
* **internal:** swap from `Builder().from(...)` to `toBuilder()` ([#545](https://github.com/lithic-com/lithic-kotlin/issues/545)) ([ef6d1c1](https://github.com/lithic-com/lithic-kotlin/commit/ef6d1c15d250a90ecf794206cd9e5dbde8a6b475))
* **internal:** update .stats.yml ([#530](https://github.com/lithic-com/lithic-kotlin/issues/530)) ([9b01915](https://github.com/lithic-com/lithic-kotlin/commit/9b01915b5b4f89870256c753fb88e34f3e58c5e2))


### Documentation

* minor readme tweak ([#537](https://github.com/lithic-com/lithic-kotlin/issues/537)) ([6369ff9](https://github.com/lithic-com/lithic-kotlin/commit/6369ff99c35a22ca40fd536536051dd0f534d015))
* refine comments on multipart params ([#534](https://github.com/lithic-com/lithic-kotlin/issues/534)) ([a9a25db](https://github.com/lithic-com/lithic-kotlin/commit/a9a25db641bdc949c5433a0b8d08b5bd9d3a00ae))
* update readme exception docs ([#536](https://github.com/lithic-com/lithic-kotlin/issues/536)) ([515dc42](https://github.com/lithic-com/lithic-kotlin/commit/515dc42f15be5fc4f2d93345743e7af5edb71c54))

## 0.81.0 (2025-03-18)

Full Changelog: [v0.80.0...v0.81.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.80.0...v0.81.0)

### Features

* **api:** updates to 2 `FinancialAccounts` endpoints and new `ExpireAuthorization` endpoint ([#525](https://github.com/lithic-com/lithic-kotlin/issues/525)) ([bfe542d](https://github.com/lithic-com/lithic-kotlin/commit/bfe542d7fcbff206f68d05df21c604625d6f4923))
* **client:** don't require params for some service methods ([#523](https://github.com/lithic-com/lithic-kotlin/issues/523)) ([c4a5726](https://github.com/lithic-com/lithic-kotlin/commit/c4a5726988ce08f6ff582a07c2daa191f9ce4466))


### Bug Fixes

* **client:** support kotlin 1.8 runtime ([#526](https://github.com/lithic-com/lithic-kotlin/issues/526)) ([54ad09e](https://github.com/lithic-com/lithic-kotlin/commit/54ad09ec75041e778f59db54c5c8965baa2617a7))


### Chores

* **internal:** add generated comment ([#517](https://github.com/lithic-com/lithic-kotlin/issues/517)) ([175ad44](https://github.com/lithic-com/lithic-kotlin/commit/175ad44432ef1e1ba4007c76a112ef72322f321f))
* **internal:** add some tests for union classes ([#524](https://github.com/lithic-com/lithic-kotlin/issues/524)) ([74d8b0c](https://github.com/lithic-com/lithic-kotlin/commit/74d8b0c6d5eaabc5b53a57506ca338fad2d3c259))
* **internal:** add tests for `_headers()` ([#521](https://github.com/lithic-com/lithic-kotlin/issues/521)) ([dfab73f](https://github.com/lithic-com/lithic-kotlin/commit/dfab73f1a4a3d9f9c480a31bc1dc5d47f5dfbe76))
* **internal:** delete duplicate tests ([a55d4bb](https://github.com/lithic-com/lithic-kotlin/commit/a55d4bb4b64a2503015cdfb819153f78b456f048))
* **internal:** generate more tests ([5bbfd5e](https://github.com/lithic-com/lithic-kotlin/commit/5bbfd5ee501b76a463a7f22013a660674d36c3ef))
* **internal:** make test classes internal ([#516](https://github.com/lithic-com/lithic-kotlin/issues/516)) ([96e7f68](https://github.com/lithic-com/lithic-kotlin/commit/96e7f680c75e4cb5b7cfa79b61d9eecc9c6c14ed))
* **internal:** refactor query param serialization impl and tests ([#519](https://github.com/lithic-com/lithic-kotlin/issues/519)) ([4139506](https://github.com/lithic-com/lithic-kotlin/commit/41395060bcb628b6786e3844042d55d7a6903f33))
* **internal:** refactor some test assertions ([a55d4bb](https://github.com/lithic-com/lithic-kotlin/commit/a55d4bb4b64a2503015cdfb819153f78b456f048))
* **internal:** reformat some tests ([#522](https://github.com/lithic-com/lithic-kotlin/issues/522)) ([5bbfd5e](https://github.com/lithic-com/lithic-kotlin/commit/5bbfd5ee501b76a463a7f22013a660674d36c3ef))
* **internal:** remove extra empty newlines ([#513](https://github.com/lithic-com/lithic-kotlin/issues/513)) ([f0dca85](https://github.com/lithic-com/lithic-kotlin/commit/f0dca8595e54025d0d1c228e985f130e2b407af5))
* **internal:** rename `getPathParam` ([#520](https://github.com/lithic-com/lithic-kotlin/issues/520)) ([a55d4bb](https://github.com/lithic-com/lithic-kotlin/commit/a55d4bb4b64a2503015cdfb819153f78b456f048))
* **internal:** reorder some params methodsc ([a55d4bb](https://github.com/lithic-com/lithic-kotlin/commit/a55d4bb4b64a2503015cdfb819153f78b456f048))


### Documentation

* add `build` method comments ([#518](https://github.com/lithic-com/lithic-kotlin/issues/518)) ([b3906cb](https://github.com/lithic-com/lithic-kotlin/commit/b3906cb7f3dc30984c0187fc4dcfa76b66c337c6))
* deduplicate and refine comments ([#515](https://github.com/lithic-com/lithic-kotlin/issues/515)) ([587131c](https://github.com/lithic-com/lithic-kotlin/commit/587131c7236be3f8a524e3787d689dae5cdd4161))

## 0.80.0 (2025-03-11)

Full Changelog: [v0.79.0...v0.80.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.79.0...v0.80.0)

### Features

* **client:** accept `InputStream` and `Path` for file params ([#502](https://github.com/lithic-com/lithic-kotlin/issues/502)) ([e2c5acc](https://github.com/lithic-com/lithic-kotlin/commit/e2c5acc9688cb7064e7810bd693fb105c2ec2cf9))
* **client:** detect binary incompatible jackson versions ([#504](https://github.com/lithic-com/lithic-kotlin/issues/504)) ([88052f9](https://github.com/lithic-com/lithic-kotlin/commit/88052f90f671b111d04fe4b719aaa181fc587872))
* **client:** update currency data type ([#512](https://github.com/lithic-com/lithic-kotlin/issues/512)) ([03f99e4](https://github.com/lithic-com/lithic-kotlin/commit/03f99e4d6d6aeb7a61e5d481bd63325abcb5f226))
* generate and publish docs ([#505](https://github.com/lithic-com/lithic-kotlin/issues/505)) ([b997570](https://github.com/lithic-com/lithic-kotlin/commit/b9975703068cac6b974f9e495ece6af253994d10))


### Chores

* **api:** release of Network Totals reporting and new filters for Velocity Limit Rules ([#511](https://github.com/lithic-com/lithic-kotlin/issues/511)) ([dfd9746](https://github.com/lithic-com/lithic-kotlin/commit/dfd9746f98a982769ec423b35c6ea229a6b5d83b))
* **client:** deprecate some fields ([03f99e4](https://github.com/lithic-com/lithic-kotlin/commit/03f99e4d6d6aeb7a61e5d481bd63325abcb5f226))
* **internal:** add `.kotlin` to `.gitignore` ([#507](https://github.com/lithic-com/lithic-kotlin/issues/507)) ([172ec4e](https://github.com/lithic-com/lithic-kotlin/commit/172ec4e0571c7bedc152011bdc8b0a4633918215))
* **internal:** reenable warnings as errors ([918fd64](https://github.com/lithic-com/lithic-kotlin/commit/918fd642111c5980de515234a551a4630f45457b))


### Documentation

* document `JsonValue` construction in readme ([#510](https://github.com/lithic-com/lithic-kotlin/issues/510)) ([f7cc4ac](https://github.com/lithic-com/lithic-kotlin/commit/f7cc4acff3af47d03d213d326d1bd7f2d6444446))
* revise readme docs about nested params ([#509](https://github.com/lithic-com/lithic-kotlin/issues/509)) ([3946612](https://github.com/lithic-com/lithic-kotlin/commit/3946612e55863d920508173a6531b4530624ca53))
* update some descriptions ([03f99e4](https://github.com/lithic-com/lithic-kotlin/commit/03f99e4d6d6aeb7a61e5d481bd63325abcb5f226))

## 0.79.0 (2025-03-05)

Full Changelog: [v0.78.0...v0.79.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.78.0...v0.79.0)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#497](https://github.com/lithic-com/lithic-kotlin/issues/497))

### Features

* **api:** new Settlement API endpoints and changes to update Account Holder endpoint ([#498](https://github.com/lithic-com/lithic-kotlin/issues/498)) ([369ca61](https://github.com/lithic-com/lithic-kotlin/commit/369ca61e30d8d0dfd17c8e676795ee218f31dc3e))
* **client:** allow configuring timeouts granularly ([#494](https://github.com/lithic-com/lithic-kotlin/issues/494)) ([101d312](https://github.com/lithic-com/lithic-kotlin/commit/101d312fa3ab3342d2d7082d4b96725dda177958))
* **client:** allow omitting params object when none required ([#486](https://github.com/lithic-com/lithic-kotlin/issues/486)) ([7321c2a](https://github.com/lithic-com/lithic-kotlin/commit/7321c2ade8a95d3c40142de223a1e8fea85dc3d3))
* **client:** support raw response access ([#495](https://github.com/lithic-com/lithic-kotlin/issues/495)) ([fd18c21](https://github.com/lithic-com/lithic-kotlin/commit/fd18c2110484a7d3cae61d351859a01111c67950))


### Chores

* **api:** adds new `Internal` Category for FinancialTransactions ([#485](https://github.com/lithic-com/lithic-kotlin/issues/485)) ([ea6571f](https://github.com/lithic-com/lithic-kotlin/commit/ea6571f2069163e6c49241552743ce88c7858b5e))
* **client:** refactor multipart formdata impl ([#497](https://github.com/lithic-com/lithic-kotlin/issues/497)) ([799abb6](https://github.com/lithic-com/lithic-kotlin/commit/799abb65aa3a8df90958004a2f880fa8e172c50a))
* **client:** use deep identity methods for primitive array types ([#489](https://github.com/lithic-com/lithic-kotlin/issues/489)) ([6eda308](https://github.com/lithic-com/lithic-kotlin/commit/6eda3085e09e56e8df47c399e8c00d60d4034b91))
* **internal:** add async service tests ([#488](https://github.com/lithic-com/lithic-kotlin/issues/488)) ([72c70f2](https://github.com/lithic-com/lithic-kotlin/commit/72c70f222d109ac80256fd43d3a919430486ac25))
* **internal:** improve sync service tests ([72c70f2](https://github.com/lithic-com/lithic-kotlin/commit/72c70f222d109ac80256fd43d3a919430486ac25))
* **internal:** refactor `ErrorHandlingTest` ([#493](https://github.com/lithic-com/lithic-kotlin/issues/493)) ([0d594a7](https://github.com/lithic-com/lithic-kotlin/commit/0d594a73220c075329e2400ab9f142641c9e4c75))
* **internal:** refactor `ServiceParamsTest` ([#490](https://github.com/lithic-com/lithic-kotlin/issues/490)) ([d277dd8](https://github.com/lithic-com/lithic-kotlin/commit/d277dd8546471df6a714c8b0019b59da9d8550d0))


### Documentation

* add immutability explanation to readme ([#482](https://github.com/lithic-com/lithic-kotlin/issues/482)) ([cdf036c](https://github.com/lithic-com/lithic-kotlin/commit/cdf036c31755db3e247308d0263c1c80cbe5bbee))
* add raw response readme documentation ([#499](https://github.com/lithic-com/lithic-kotlin/issues/499)) ([9498b78](https://github.com/lithic-com/lithic-kotlin/commit/9498b784115cfb3465dcb53bb956d1493c605926))
* add source file links to readme ([#484](https://github.com/lithic-com/lithic-kotlin/issues/484)) ([a2cf7db](https://github.com/lithic-com/lithic-kotlin/commit/a2cf7dbdb11f0a7aff43178d48f593d579d768ab))
* note required fields in `builder` javadoc ([#500](https://github.com/lithic-com/lithic-kotlin/issues/500)) ([dab26f1](https://github.com/lithic-com/lithic-kotlin/commit/dab26f137ac80c08503de20d907cd87dd20be945))
* readme parameter tweaks ([72c70f2](https://github.com/lithic-com/lithic-kotlin/commit/72c70f222d109ac80256fd43d3a919430486ac25))
* update URLs from stainlessapi.com to stainless.com ([58a2cb1](https://github.com/lithic-com/lithic-kotlin/commit/58a2cb1690328b0d70e0d67f6bc2889e1744f10e))
* update URLs from stainlessapi.com to stainless.com ([#492](https://github.com/lithic-com/lithic-kotlin/issues/492)) ([1f1da06](https://github.com/lithic-com/lithic-kotlin/commit/1f1da069377c221baf337df95a8b0384ebf850c4))

## 0.78.0 (2025-02-20)

Full Changelog: [v0.77.0...v0.78.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.77.0...v0.78.0)

### ⚠ BREAKING CHANGES

* **client:** rename some params builder methods ([#472](https://github.com/lithic-com/lithic-kotlin/issues/472))

### Features

* **client:** support `JsonField#asX()` for known values ([#474](https://github.com/lithic-com/lithic-kotlin/issues/474)) ([6d2bf99](https://github.com/lithic-com/lithic-kotlin/commit/6d2bf99b5f228711a73cc9356c573e319291db51))
* **client:** update enum `asX` methods ([#473](https://github.com/lithic-com/lithic-kotlin/issues/473)) ([8dc1cf2](https://github.com/lithic-com/lithic-kotlin/commit/8dc1cf22942009d83a494ecb812e695bc8e45e10))


### Bug Fixes

* **client:** mark some request bodies as optional ([#481](https://github.com/lithic-com/lithic-kotlin/issues/481)) ([b51a28b](https://github.com/lithic-com/lithic-kotlin/commit/b51a28b6d8563df83d916ecdf783df59cbeea5b5))


### Chores

* **api:** new 3DS Event and new `challenge_metadata` property on Authentications ([#468](https://github.com/lithic-com/lithic-kotlin/issues/468)) ([17b80e6](https://github.com/lithic-com/lithic-kotlin/commit/17b80e605598c1bb5cbad8c2963f5108baaf9a9a))
* **ci:** update gradle actions to v4 ([#478](https://github.com/lithic-com/lithic-kotlin/issues/478)) ([2dc33fb](https://github.com/lithic-com/lithic-kotlin/commit/2dc33fb27f76ce56c8af45fa27cf87236d72029e))
* **client:** remove checked exception related code ([#479](https://github.com/lithic-com/lithic-kotlin/issues/479)) ([8fa143f](https://github.com/lithic-com/lithic-kotlin/commit/8fa143f9147b3260424c84b01a20ffebd1b21bfa))
* **client:** rename some params builder methods ([#472](https://github.com/lithic-com/lithic-kotlin/issues/472)) ([01d3464](https://github.com/lithic-com/lithic-kotlin/commit/01d3464af31bbcfb77ade2964e2ce7bc3206328a))
* **docs:** add faq to readme ([#480](https://github.com/lithic-com/lithic-kotlin/issues/480)) ([af02bea](https://github.com/lithic-com/lithic-kotlin/commit/af02bea51adc663ef1997f88783c95082aefc75a))
* **docs:** reorganize readme ([#475](https://github.com/lithic-com/lithic-kotlin/issues/475)) ([9a3291e](https://github.com/lithic-com/lithic-kotlin/commit/9a3291e744dbaf58dd781315444e7c3a446fdfd9))
* **internal:** get rid of configuration cache ([#477](https://github.com/lithic-com/lithic-kotlin/issues/477)) ([f127cf4](https://github.com/lithic-com/lithic-kotlin/commit/f127cf475dbbb4ab9abdc759d93011d65826511a))
* **internal:** optimize build and test perf ([8ae4ab6](https://github.com/lithic-com/lithic-kotlin/commit/8ae4ab64861cc81f46c1855bbde67fb816b82578))
* **internal:** optimize build and test perf ([46091e9](https://github.com/lithic-com/lithic-kotlin/commit/46091e95ac53954e39bba1a20d38abd8be18fdd9))
* **internal:** remove unnecessary non-null asserts in tests ([b51a28b](https://github.com/lithic-com/lithic-kotlin/commit/b51a28b6d8563df83d916ecdf783df59cbeea5b5))
* **internal:** update formatter ([8ae4ab6](https://github.com/lithic-com/lithic-kotlin/commit/8ae4ab64861cc81f46c1855bbde67fb816b82578))
* **internal:** update formatter ([#471](https://github.com/lithic-com/lithic-kotlin/issues/471)) ([46091e9](https://github.com/lithic-com/lithic-kotlin/commit/46091e95ac53954e39bba1a20d38abd8be18fdd9))
* **internal:** update some formatting in `Values.kt` ([6d2bf99](https://github.com/lithic-com/lithic-kotlin/commit/6d2bf99b5f228711a73cc9356c573e319291db51))
* **internal:** use `assertNotNull` in tests for type narrowing ([b51a28b](https://github.com/lithic-com/lithic-kotlin/commit/b51a28b6d8563df83d916ecdf783df59cbeea5b5))


### Documentation

* add more phantom reachability docs ([#470](https://github.com/lithic-com/lithic-kotlin/issues/470)) ([c91fab0](https://github.com/lithic-com/lithic-kotlin/commit/c91fab02ae67fc8c954d3dd5c3367592953f1026))

## 0.77.0 (2025-02-05)

Full Changelog: [v0.76.0...v0.77.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.76.0...v0.77.0)

### Features

* **client:** send client-side timeout headers ([#464](https://github.com/lithic-com/lithic-kotlin/issues/464)) ([78f8b1c](https://github.com/lithic-com/lithic-kotlin/commit/78f8b1ca2daf68a6e12c73adc6f88c9b2341333c))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#467](https://github.com/lithic-com/lithic-kotlin/issues/467)) ([bb693f6](https://github.com/lithic-com/lithic-kotlin/commit/bb693f69b1133ee0b6ae5bb41517e8bceb7ca87f))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([bb693f6](https://github.com/lithic-com/lithic-kotlin/commit/bb693f69b1133ee0b6ae5bb41517e8bceb7ca87f))
* **client:** add missing validation calls on response ([bb693f6](https://github.com/lithic-com/lithic-kotlin/commit/bb693f69b1133ee0b6ae5bb41517e8bceb7ca87f))
* **client:** always provide a body for `PATCH` methods ([bb693f6](https://github.com/lithic-com/lithic-kotlin/commit/bb693f69b1133ee0b6ae5bb41517e8bceb7ca87f))


### Chores

* **api:** new PaymentEventType for ACH Returns and small updates to 3DS AuthenticationResult ([#466](https://github.com/lithic-com/lithic-kotlin/issues/466)) ([facbcae](https://github.com/lithic-com/lithic-kotlin/commit/facbcae8f0baad31f28e368a510956e2d7744e69))
* **internal:** minor formatting/style changes ([bb693f6](https://github.com/lithic-com/lithic-kotlin/commit/bb693f69b1133ee0b6ae5bb41517e8bceb7ca87f))
* **internal:** rename some tests ([bb693f6](https://github.com/lithic-com/lithic-kotlin/commit/bb693f69b1133ee0b6ae5bb41517e8bceb7ca87f))

## 0.76.0 (2025-01-30)

Full Changelog: [v0.75.0...v0.76.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.75.0...v0.76.0)

### Features

* **client:** add `_queryParams` and `_headers` methods ([#457](https://github.com/lithic-com/lithic-kotlin/issues/457)) ([3cdce16](https://github.com/lithic-com/lithic-kotlin/commit/3cdce169f4ffee9ac11f14eb5cace659822add2e))


### Bug Fixes

* **client:** don't leak responses when retrying ([#462](https://github.com/lithic-com/lithic-kotlin/issues/462)) ([8056c53](https://github.com/lithic-com/lithic-kotlin/commit/8056c53ccaa83b44ebca4c34c9fdce4b52ea8f12))


### Chores

* **internal:** improve `RetryingHttpClientTest` ([#461](https://github.com/lithic-com/lithic-kotlin/issues/461)) ([671fa6d](https://github.com/lithic-com/lithic-kotlin/commit/671fa6d44929666caa69ca5d404ec2eb925516db))


### Documentation

* fix incorrect additional properties info ([#463](https://github.com/lithic-com/lithic-kotlin/issues/463)) ([7bfe638](https://github.com/lithic-com/lithic-kotlin/commit/7bfe6384608ce9e49218b9cc87269cdf57e09c14))


### Refactors

* **internal:** extract request preparation logic ([3cdce16](https://github.com/lithic-com/lithic-kotlin/commit/3cdce169f4ffee9ac11f14eb5cace659822add2e))

## 0.75.0 (2025-01-28)

Full Changelog: [v0.74.0...v0.75.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.74.0...v0.75.0)

### ⚠ BREAKING CHANGES

* **client:** better union variant method and variable names ([#448](https://github.com/lithic-com/lithic-kotlin/issues/448))

### Features

* **api:** adds additional fields to TransactionEvents ([#449](https://github.com/lithic-com/lithic-kotlin/issues/449)) ([31bd8f0](https://github.com/lithic-com/lithic-kotlin/commit/31bd8f08296431bc3bd054dcc43b6de0401ca608))
* **api:** adds additional request types for updating an Auth Rule ([#456](https://github.com/lithic-com/lithic-kotlin/issues/456)) ([842776d](https://github.com/lithic-com/lithic-kotlin/commit/842776d5515da49763b2a5ffadb75bfa09799e0f))
* **client:** add `close` method ([#451](https://github.com/lithic-com/lithic-kotlin/issues/451)) ([572867b](https://github.com/lithic-com/lithic-kotlin/commit/572867b07e0bec5dd04ee086df3c802aecf618bb))
* **client:** better union variant method and variable names ([#448](https://github.com/lithic-com/lithic-kotlin/issues/448)) ([4dea8e0](https://github.com/lithic-com/lithic-kotlin/commit/4dea8e07fc471074f2201f5640a6c418d1bc9590))


### Bug Fixes

* **client:** make some classes and constructors non-public ([#454](https://github.com/lithic-com/lithic-kotlin/issues/454)) ([448f974](https://github.com/lithic-com/lithic-kotlin/commit/448f97447465a5b7a4c0e71442eefc334904ed62))


### Chores

* add max retries to test ([#450](https://github.com/lithic-com/lithic-kotlin/issues/450)) ([918b729](https://github.com/lithic-com/lithic-kotlin/commit/918b729161c7addc0ab425c1759977cf147d2d08))
* **api:** additional field added to 3DS Responses and Tokenization ([#442](https://github.com/lithic-com/lithic-kotlin/issues/442)) ([c0e3245](https://github.com/lithic-com/lithic-kotlin/commit/c0e324575400def645b04e9d2b2e16b234d0d897))
* **internal:** remove some unnecessary `constructor` keywords ([448f974](https://github.com/lithic-com/lithic-kotlin/commit/448f97447465a5b7a4c0e71442eefc334904ed62))
* **internal:** swap `checkNotNull` to `checkRequired` ([#447](https://github.com/lithic-com/lithic-kotlin/issues/447)) ([e3dcb54](https://github.com/lithic-com/lithic-kotlin/commit/e3dcb54509e7951e596cedc37ac8a8e1a937c022))
* update tests ([#445](https://github.com/lithic-com/lithic-kotlin/issues/445)) ([996829e](https://github.com/lithic-com/lithic-kotlin/commit/996829e99270e2267c33904af7acf17a1adb32a2))


### Documentation

* `async` and `sync` method comments ([#453](https://github.com/lithic-com/lithic-kotlin/issues/453)) ([01654ce](https://github.com/lithic-com/lithic-kotlin/commit/01654ce4660efb143bb0d81bf984c5827f2b90f7))
* add client documentation ([#452](https://github.com/lithic-com/lithic-kotlin/issues/452)) ([280f5cd](https://github.com/lithic-com/lithic-kotlin/commit/280f5cd9001d76885a845a63735c033c28705782))
* builder, enum, and union comments ([#455](https://github.com/lithic-com/lithic-kotlin/issues/455)) ([c784711](https://github.com/lithic-com/lithic-kotlin/commit/c7847117bc3e15ee24772d15e8105ed05fdaf761))
* move up requirements section ([#446](https://github.com/lithic-com/lithic-kotlin/issues/446)) ([374d78c](https://github.com/lithic-com/lithic-kotlin/commit/374d78c17989ce9b30e7511a591c1ff04cf2d53e))
* update readme ([#444](https://github.com/lithic-com/lithic-kotlin/issues/444)) ([f8a669e](https://github.com/lithic-com/lithic-kotlin/commit/f8a669e31e3601956cbb907af57f048e98b371e0))

## 0.74.0 (2025-01-21)

Full Changelog: [v0.73.0...v0.74.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.73.0...v0.74.0)

### ⚠ BREAKING CHANGES

* **types:** improve auth rules types ([#431](https://github.com/lithic-com/lithic-kotlin/issues/431))
* **client:** switch query params objects to use `QueryParams` ([#410](https://github.com/lithic-com/lithic-kotlin/issues/410))
* **api:** removes AccountHolder `resubmit` endpoint and `KYC_ADVANCED` workflow ([#405](https://github.com/lithic-com/lithic-kotlin/issues/405))

### Features

* **api:** adds EventRuleResult to Transaction Events ([#393](https://github.com/lithic-com/lithic-kotlin/issues/393)) ([ba514e8](https://github.com/lithic-com/lithic-kotlin/commit/ba514e86059eb8ded49746a701e80082245b1807))
* **api:** removes AccountHolder `resubmit` endpoint and `KYC_ADVANCED` workflow ([#405](https://github.com/lithic-com/lithic-kotlin/issues/405)) ([e8203a1](https://github.com/lithic-com/lithic-kotlin/commit/e8203a156077e99f725e3a1f4dbbb316447436db))
* **client:** add various convenience setters to models ([#420](https://github.com/lithic-com/lithic-kotlin/issues/420)) ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **client:** allow setting arbitrary JSON for top-level body params ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **client:** expose getters for `JsonField` of body params ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **client:** put body field in params, add more convenience methods, and add missing docs ([#414](https://github.com/lithic-com/lithic-kotlin/issues/414)) ([57ff634](https://github.com/lithic-com/lithic-kotlin/commit/57ff634bb99742a50c4c58ebbcf06ce54e0753de))
* **types:** improve auth rules types ([#431](https://github.com/lithic-com/lithic-kotlin/issues/431)) ([53fef3a](https://github.com/lithic-com/lithic-kotlin/commit/53fef3a4be24c27249f3e25b249c485c35f1afc1))


### Bug Fixes

* **client:** add some missing `validate()` calls ([#424](https://github.com/lithic-com/lithic-kotlin/issues/424)) ([3855a16](https://github.com/lithic-com/lithic-kotlin/commit/3855a166783e10b2f78b87c5e48d81350f427a90))
* **client:** allow passing null for nullable fields where missing ([#417](https://github.com/lithic-com/lithic-kotlin/issues/417)) ([e23add6](https://github.com/lithic-com/lithic-kotlin/commit/e23add6e159cde446edac537834a9509798d2bf8))
* **client:** consistently throw on omitting required fields ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **client:** convert `JsonField` containing list type to mutable in builder ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **client:** make service impl constructors internal ([#440](https://github.com/lithic-com/lithic-kotlin/issues/440)) ([07e534a](https://github.com/lithic-com/lithic-kotlin/commit/07e534a28faa9061f40c0f4640575ff2de3e2330))
* reuse model in pagination items type ([#441](https://github.com/lithic-com/lithic-kotlin/issues/441)) ([2df674e](https://github.com/lithic-com/lithic-kotlin/commit/2df674e8e35889a49e8069fc13f9f885df99268c))


### Chores

* **api:** adds `dpan` property to Tokenization ([#435](https://github.com/lithic-com/lithic-kotlin/issues/435)) ([728b987](https://github.com/lithic-com/lithic-kotlin/commit/728b98735c6398708ed96aff2576ef568e8afba3))
* **api:** new ConvertPhysical endpoint to convert a virtual card to a physical card ([#404](https://github.com/lithic-com/lithic-kotlin/issues/404)) ([e48a2a7](https://github.com/lithic-com/lithic-kotlin/commit/e48a2a747480f0e66cfbef55e8da857ae046a2bf))
* **api:** updates to documentation and additional filter for status on Transactions ([#427](https://github.com/lithic-com/lithic-kotlin/issues/427)) ([9a2d0a0](https://github.com/lithic-com/lithic-kotlin/commit/9a2d0a0f6997ec79cd30229fdf20fd43da5dbb68))
* bump license year ([#413](https://github.com/lithic-com/lithic-kotlin/issues/413)) ([d6527e5](https://github.com/lithic-com/lithic-kotlin/commit/d6527e52667f26132e5c9c6824037bdf689f4c76))
* **docs:** add example project ([#408](https://github.com/lithic-com/lithic-kotlin/issues/408)) ([52f1b55](https://github.com/lithic-com/lithic-kotlin/commit/52f1b55eecb6829c1592c9b16d54c2856321a16c))
* **docs:** fix unused import ([#409](https://github.com/lithic-com/lithic-kotlin/issues/409)) ([f72f483](https://github.com/lithic-com/lithic-kotlin/commit/f72f483d7a3221dcf39c51d5d079fc764cfd3a6a))
* **docs:** update readme ([#407](https://github.com/lithic-com/lithic-kotlin/issues/407)) ([e3d68a6](https://github.com/lithic-com/lithic-kotlin/commit/e3d68a62b1878d95070fbf3c6a91079476e9a2d0))
* **docs:** updates documentation for DPANs ([#439](https://github.com/lithic-com/lithic-kotlin/issues/439)) ([de00c86](https://github.com/lithic-com/lithic-kotlin/commit/de00c862562b31effc4f20cb16be1dee8126b24c))
* **internal:** add and tweak check functions ([#432](https://github.com/lithic-com/lithic-kotlin/issues/432)) ([7c06a1c](https://github.com/lithic-com/lithic-kotlin/commit/7c06a1cd34891a7d7349a4a83ed462872b464aca))
* **internal:** add some missing newlines between methods ([#423](https://github.com/lithic-com/lithic-kotlin/issues/423)) ([aab8f6b](https://github.com/lithic-com/lithic-kotlin/commit/aab8f6bcb2535c19cab3f5d4bb5202dcb02de59b))
* **internal:** extract a `checkRequired` function ([#430](https://github.com/lithic-com/lithic-kotlin/issues/430)) ([830e4a7](https://github.com/lithic-com/lithic-kotlin/commit/830e4a7fb6ae6fa460dffc961938822dcb99c169))
* **internal:** fix up root `build.gradle.kts` formatting ([#425](https://github.com/lithic-com/lithic-kotlin/issues/425)) ([5204a00](https://github.com/lithic-com/lithic-kotlin/commit/5204a00412bf0f213116a5b508af22d79e883205))
* **internal:** refactor `validate` methods ([3855a16](https://github.com/lithic-com/lithic-kotlin/commit/3855a166783e10b2f78b87c5e48d81350f427a90))
* **internal:** remove unused and expand used wildcard imports ([#401](https://github.com/lithic-com/lithic-kotlin/issues/401)) ([6a3a4b4](https://github.com/lithic-com/lithic-kotlin/commit/6a3a4b4d99da8f89bd9d36f742c6acdb4328bd18))
* **internal:** remove unused and expand used wildcard imports ([#403](https://github.com/lithic-com/lithic-kotlin/issues/403)) ([646cd0a](https://github.com/lithic-com/lithic-kotlin/commit/646cd0a437ae051dc613aa1d1155f03e6308c0e3))
* **internal:** remove unused Gradle imports ([#426](https://github.com/lithic-com/lithic-kotlin/issues/426)) ([50e8ca1](https://github.com/lithic-com/lithic-kotlin/commit/50e8ca12d0131c3bf0ee5bb499f4376c353148bc))
* **internal:** remove unused imports ([#398](https://github.com/lithic-com/lithic-kotlin/issues/398)) ([743d7ca](https://github.com/lithic-com/lithic-kotlin/commit/743d7cab12b35957d0e4801f0c1512d355942e26))
* **internal:** remove unused or unnecessary Gradle imports ([#428](https://github.com/lithic-com/lithic-kotlin/issues/428)) ([cc25bca](https://github.com/lithic-com/lithic-kotlin/commit/cc25bca75e74a33f878be624d8e2723ff5300d31))
* **internal:** tweak client options nullability handling ([7c06a1c](https://github.com/lithic-com/lithic-kotlin/commit/7c06a1cd34891a7d7349a4a83ed462872b464aca))
* **internal:** update examples ([#418](https://github.com/lithic-com/lithic-kotlin/issues/418)) ([2f36a97](https://github.com/lithic-com/lithic-kotlin/commit/2f36a975cd3f6bf29c459263783d5c68f8cbc2cb))
* **internal:** update some gradle formatting ([#429](https://github.com/lithic-com/lithic-kotlin/issues/429)) ([251742d](https://github.com/lithic-com/lithic-kotlin/commit/251742d3e56a2824d7947672fd1158b1e48e55db))
* **internal:** upgrade kotlin compiler and gradle ([#437](https://github.com/lithic-com/lithic-kotlin/issues/437)) ([84043c2](https://github.com/lithic-com/lithic-kotlin/commit/84043c285b52f7d15d743aee7cb71ebacf2c8edf))
* simplify examples involving lists ([#433](https://github.com/lithic-com/lithic-kotlin/issues/433)) ([855d967](https://github.com/lithic-com/lithic-kotlin/commit/855d967fe4c2d609b749df8f24ddd36e99354c22))
* simplify examples involving unions ([#434](https://github.com/lithic-com/lithic-kotlin/issues/434)) ([0c2af28](https://github.com/lithic-com/lithic-kotlin/commit/0c2af28c3c17bd76cd5ad4f0c264ddfcb296f876))
* **test:** remove unused imports ([#399](https://github.com/lithic-com/lithic-kotlin/issues/399)) ([8cd6e20](https://github.com/lithic-com/lithic-kotlin/commit/8cd6e2077a70ee006842c3b896e43e308f4adae2))
* **test:** use `JsonValue` instead of `JsonString` ([#400](https://github.com/lithic-com/lithic-kotlin/issues/400)) ([e57643e](https://github.com/lithic-com/lithic-kotlin/commit/e57643e1c20260239a58ab8a6ceea11bfd53222a))
* update example values in tests and docs ([#395](https://github.com/lithic-com/lithic-kotlin/issues/395)) ([3324a94](https://github.com/lithic-com/lithic-kotlin/commit/3324a940b95c795a4cca9dcb5410838abf41eacd))
* update parameter examples in tests and docs ([#406](https://github.com/lithic-com/lithic-kotlin/issues/406)) ([12b741c](https://github.com/lithic-com/lithic-kotlin/commit/12b741c5aa7d0ba0945c6824ca718e19de78eb57))


### Documentation

* add more documentation ([#438](https://github.com/lithic-com/lithic-kotlin/issues/438)) ([9e3c843](https://github.com/lithic-com/lithic-kotlin/commit/9e3c8430faa92a925cd0200e66e8fd1dfc37fdc9))
* add params class javadocs ([#419](https://github.com/lithic-com/lithic-kotlin/issues/419)) ([090e5bd](https://github.com/lithic-com/lithic-kotlin/commit/090e5bd1aec0f46bb2dee0c346b64abf3186574a))
* add some missing javadocs ([#415](https://github.com/lithic-com/lithic-kotlin/issues/415)) ([b00a43b](https://github.com/lithic-com/lithic-kotlin/commit/b00a43b60029d234604160c76ae2186771276a16))
* add sonatype readme badge ([#436](https://github.com/lithic-com/lithic-kotlin/issues/436)) ([5ac5998](https://github.com/lithic-com/lithic-kotlin/commit/5ac59980f78abfbf57e872034eec435a53bde6a7))
* **readme:** fix misplaced period ([#421](https://github.com/lithic-com/lithic-kotlin/issues/421)) ([fe0bb69](https://github.com/lithic-com/lithic-kotlin/commit/fe0bb69d99f1674871a964d151459d06c9204a9e))
* update some builder method javadocs ([#422](https://github.com/lithic-com/lithic-kotlin/issues/422)) ([da5b86b](https://github.com/lithic-com/lithic-kotlin/commit/da5b86ba89a7c9d15ebaecc4a714f87fceed84c2))


### Styles

* **internal:** explicitly add some method return types ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **internal:** make enum value definitions less verbose ([#396](https://github.com/lithic-com/lithic-kotlin/issues/396)) ([bfbee37](https://github.com/lithic-com/lithic-kotlin/commit/bfbee3793f8da4bade2ce84c78e3ac2373b84d91))
* **internal:** move enum identity methods to bottom of class ([#397](https://github.com/lithic-com/lithic-kotlin/issues/397)) ([c5cabdd](https://github.com/lithic-com/lithic-kotlin/commit/c5cabdde4180aaa357cb7a55aa8a9b9dbf75ba16))
* **internal:** move headers and query params setters below others ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **internal:** simplify existing convenience setters on params ([47d9bf9](https://github.com/lithic-com/lithic-kotlin/commit/47d9bf9fbfa426f80e47156f49de1b99a2483050))
* **internal:** sort fields ([#416](https://github.com/lithic-com/lithic-kotlin/issues/416)) ([dbfefd4](https://github.com/lithic-com/lithic-kotlin/commit/dbfefd4f55b63ed204d4aca31b37af0fbc94529f))


### Refactors

* **client:** switch query params objects to use `QueryParams` ([#410](https://github.com/lithic-com/lithic-kotlin/issues/410)) ([2696a81](https://github.com/lithic-com/lithic-kotlin/commit/2696a812ffea31886c6f8a830d16b8ec812e8c41))
* **internal:** use constructor to deserialize json ([#411](https://github.com/lithic-com/lithic-kotlin/issues/411)) ([34c9c20](https://github.com/lithic-com/lithic-kotlin/commit/34c9c20b8ce12ff7f948880552ec19c64c823dd5))

## 0.73.0 (2024-11-26)

Full Changelog: [v0.72.0...v0.73.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.72.0...v0.73.0)

### Features

* **api:** updates to Auth Rules numeric types, new Card Types and Authorization Rule Backtests ([#389](https://github.com/lithic-com/lithic-kotlin/issues/389)) ([ad9720c](https://github.com/lithic-com/lithic-kotlin/commit/ad9720cbef59f046845b46f6147449eff6995d54))
* **client:** add logging when debug env is set ([#386](https://github.com/lithic-com/lithic-kotlin/issues/386)) ([848cc8c](https://github.com/lithic-com/lithic-kotlin/commit/848cc8c5ea5c2a67b6af37b45684caae10eb3fd9))
* **client:** add methods for header params ([#382](https://github.com/lithic-com/lithic-kotlin/issues/382)) ([cb88b74](https://github.com/lithic-com/lithic-kotlin/commit/cb88b74d33461eb1eb169191e47c4b82f75d7838))
* derive gpg release key's id via gpg itself ([#391](https://github.com/lithic-com/lithic-kotlin/issues/391)) ([735be99](https://github.com/lithic-com/lithic-kotlin/commit/735be991275da0eaeddc218d42d2cd70a6f39ea4))


### Bug Fixes

* **internal:** use correct example string for test ([#387](https://github.com/lithic-com/lithic-kotlin/issues/387)) ([24de3fd](https://github.com/lithic-com/lithic-kotlin/commit/24de3fd0ccfb94c3dda661e0c2e020f293c6bb44))


### Chores

* **api:** add backtest methods to AuthRules ([#390](https://github.com/lithic-com/lithic-kotlin/issues/390)) ([81b5bdf](https://github.com/lithic-com/lithic-kotlin/commit/81b5bdf0b7dcbf95505233d15d374166f6a1e5b1))
* **deps:** bump jackson to 2.18.1 ([#381](https://github.com/lithic-com/lithic-kotlin/issues/381)) ([a6e3a9c](https://github.com/lithic-com/lithic-kotlin/commit/a6e3a9c60f33d49abc06d47b79deec8631dfa7b5))
* **internal:** update example values ([#388](https://github.com/lithic-com/lithic-kotlin/issues/388)) ([8ef3c9f](https://github.com/lithic-com/lithic-kotlin/commit/8ef3c9f003fba27f9fccafd93559df4c0022791c))
* publish to maven central portal ([#392](https://github.com/lithic-com/lithic-kotlin/issues/392)) ([42f8cf1](https://github.com/lithic-com/lithic-kotlin/commit/42f8cf1fac199b33aa31f6b3690dfe4c219071f1))


### Styles

* **internal:** move identity methods to bottom of error class ([#384](https://github.com/lithic-com/lithic-kotlin/issues/384)) ([4cc4ba8](https://github.com/lithic-com/lithic-kotlin/commit/4cc4ba86f322365d1a413f51fab918b5994d1b64))
* **internal:** reduce verbosity of identity methods ([#383](https://github.com/lithic-com/lithic-kotlin/issues/383)) ([d859cb8](https://github.com/lithic-com/lithic-kotlin/commit/d859cb8b3808a1ef9fb8c2c206d1716db4699a67))
* **internal:** reorder some params methods and improve consistency of implementations ([#385](https://github.com/lithic-com/lithic-kotlin/issues/385)) ([f5a82c3](https://github.com/lithic-com/lithic-kotlin/commit/f5a82c34060009292839e00385599a780e96e989))


### Refactors

* **internal:** split `closeWhenPhantomReachable` function ([#379](https://github.com/lithic-com/lithic-kotlin/issues/379)) ([d21293e](https://github.com/lithic-com/lithic-kotlin/commit/d21293e40fb33d605936cce269eb9e2cf5a042cb))

## 0.72.0 (2024-11-14)

Full Changelog: [v0.71.0...v0.72.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.71.0...v0.72.0)

### Features

* **api:** adds PrimeRates API ([#378](https://github.com/lithic-com/lithic-kotlin/issues/378)) ([cdf9429](https://github.com/lithic-com/lithic-kotlin/commit/cdf9429b0424cad2604beb7ef289537dd22ed62a))


### Performance Improvements

* **tests:** remove unused dependencies ([#377](https://github.com/lithic-com/lithic-kotlin/issues/377)) ([bb3154d](https://github.com/lithic-com/lithic-kotlin/commit/bb3154dac57c5ed4e1a7915402b02a6e36e86543))


### Chores

* **api:** add business_account_token param for listing Balances ([#375](https://github.com/lithic-com/lithic-kotlin/issues/375)) ([f0bd4b4](https://github.com/lithic-com/lithic-kotlin/commit/f0bd4b4fbae4c0b4bc619bc8b15a94301634035e))

## 0.71.0 (2024-11-07)

Full Changelog: [v0.70.0...v0.71.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.70.0...v0.71.0)

### ⚠ BREAKING CHANGES

* **client:** replace multimaps with custom types ([#370](https://github.com/lithic-com/lithic-kotlin/issues/370))

### Features

* **client:** additional builder setters for error class ([2920bb6](https://github.com/lithic-com/lithic-kotlin/commit/2920bb6cfc135107d90b78c2b949549abef1f915))
* **client:** more additional body param setters ([#372](https://github.com/lithic-com/lithic-kotlin/issues/372)) ([31ba9fb](https://github.com/lithic-com/lithic-kotlin/commit/31ba9fb8827af9142512a1a4c748a8bafee4a527))
* **client:** replace multimaps with custom types ([#370](https://github.com/lithic-com/lithic-kotlin/issues/370)) ([32d088e](https://github.com/lithic-com/lithic-kotlin/commit/32d088e500679cd4250fdd02524b9ff47da4c345))


### Bug Fixes

* **client:** error class `toBuilder` not copying fields ([#373](https://github.com/lithic-com/lithic-kotlin/issues/373)) ([2920bb6](https://github.com/lithic-com/lithic-kotlin/commit/2920bb6cfc135107d90b78c2b949549abef1f915))
* guava missing errors ([#374](https://github.com/lithic-com/lithic-kotlin/issues/374)) ([c1979a7](https://github.com/lithic-com/lithic-kotlin/commit/c1979a720513549a6208a6c3cabf3a16408e4230))


### Chores

* **api:** adds replacement_account_token to Card create parameters ([#368](https://github.com/lithic-com/lithic-kotlin/issues/368)) ([2afcb7a](https://github.com/lithic-com/lithic-kotlin/commit/2afcb7a134cb70a267a87832a53c39952c205580))

## 0.70.0 (2024-11-05)

Full Changelog: [v0.69.0...v0.70.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.69.0...v0.70.0)

### ⚠ BREAKING CHANGES

* **api:** removes AuthRules V1 ([#367](https://github.com/lithic-com/lithic-kotlin/issues/367))
* **client:** add/rename methods for headers/query params ([#365](https://github.com/lithic-com/lithic-kotlin/issues/365))
* **client:** rename header and query params builder methods ([#364](https://github.com/lithic-com/lithic-kotlin/issues/364))

### Features

* **api:** removes AuthRules V1 ([#367](https://github.com/lithic-com/lithic-kotlin/issues/367)) ([e975983](https://github.com/lithic-com/lithic-kotlin/commit/e9759839564d4a4111d42623d74a86d1283c4fef))
* **client:** add `QueryParams` class ([#361](https://github.com/lithic-com/lithic-kotlin/issues/361)) ([bf72ea4](https://github.com/lithic-com/lithic-kotlin/commit/bf72ea41daeed68ce26792c3c47374225a72d956))
* **client:** add/rename methods for headers/query params ([#365](https://github.com/lithic-com/lithic-kotlin/issues/365)) ([d2ab9bc](https://github.com/lithic-com/lithic-kotlin/commit/d2ab9bc9b6776ccba628d3f1062efd9a5903fb8b))
* **client:** propagate headers/query params methods to client builders ([#363](https://github.com/lithic-com/lithic-kotlin/issues/363)) ([9d140e6](https://github.com/lithic-com/lithic-kotlin/commit/9d140e6a8ab6ce05f7742fda1c54fd27c53781be))


### Refactors

* **client:** http request methods ([d165239](https://github.com/lithic-com/lithic-kotlin/commit/d165239ce1ab3fe494059805372275e7bf3484d2))
* **client:** rename header and query params builder methods ([#364](https://github.com/lithic-com/lithic-kotlin/issues/364)) ([3e9ec4f](https://github.com/lithic-com/lithic-kotlin/commit/3e9ec4fb636d94fc65eb1739f4b83f4f8e4279fb))

## 0.69.0 (2024-11-01)

Full Changelog: [v0.68.0...v0.69.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.68.0...v0.69.0)

### ⚠ BREAKING CHANGES

* **client:** rename some union classes ([#350](https://github.com/lithic-com/lithic-kotlin/issues/350))

### Features

* **api:** add `interest_details` properties to LoanTapes ([#340](https://github.com/lithic-com/lithic-kotlin/issues/340)) ([8cd61db](https://github.com/lithic-com/lithic-kotlin/commit/8cd61db48bfb30be01dd45a9b6eced94a5876ed8))
* **api:** removes `transfer_transaction.created` webhook and updates to VerificationApplication ([#332](https://github.com/lithic-com/lithic-kotlin/issues/332)) ([7646708](https://github.com/lithic-com/lithic-kotlin/commit/7646708cdf295bcd06fdd5c6291a724de915518f))
* **api:** updates ([#347](https://github.com/lithic-com/lithic-kotlin/issues/347)) ([75b8c37](https://github.com/lithic-com/lithic-kotlin/commit/75b8c3791da0494ef9c13c087c4f83fa71dd1ec6))
* **client:** add `Headers` class ([#358](https://github.com/lithic-com/lithic-kotlin/issues/358)) ([e2755bc](https://github.com/lithic-com/lithic-kotlin/commit/e2755bc95f68121cab9ec0ecff50a9bdf242c85e))
* **client:** add `User-Agent` header ([#345](https://github.com/lithic-com/lithic-kotlin/issues/345)) ([9f537ed](https://github.com/lithic-com/lithic-kotlin/commit/9f537ed560f4b2361e370c8d8473b1ad397516b6))
* **client:** clean up resource leaks when the resource becomes phantom reachable ([#348](https://github.com/lithic-com/lithic-kotlin/issues/348)) ([2fd7669](https://github.com/lithic-com/lithic-kotlin/commit/2fd76692053c8e6eb6b88c037eb17a366b577487))
* **client:** set `X-Stainless-Runtime` header ([#344](https://github.com/lithic-com/lithic-kotlin/issues/344)) ([3865552](https://github.com/lithic-com/lithic-kotlin/commit/3865552aa48f3206c3d2ad9ef80d5270582d286b))
* **client:** support union discriminators in deserialization ([#328](https://github.com/lithic-com/lithic-kotlin/issues/328)) ([0534fed](https://github.com/lithic-com/lithic-kotlin/commit/0534fed2b24678ea99671e5041f5379ccf096221))


### Bug Fixes

* **client:** accidental double-wrapping with `RetryingHttpClient` ([#346](https://github.com/lithic-com/lithic-kotlin/issues/346)) ([2825bb9](https://github.com/lithic-com/lithic-kotlin/commit/2825bb9c6f393758a3b51586ec69bf9ea0a22363))
* **client:** ensure constructed objects are immutable ([#356](https://github.com/lithic-com/lithic-kotlin/issues/356)) ([8f95fce](https://github.com/lithic-com/lithic-kotlin/commit/8f95fce015416d106ef90d8234129885abc71401))
* **client:** implement `hashCode` for `IsMissing` ([#341](https://github.com/lithic-com/lithic-kotlin/issues/341)) ([a871c61](https://github.com/lithic-com/lithic-kotlin/commit/a871c61d5932254a415970d3ab6e595059447159))
* **client:** remove `@JvmStatic` from error ([#354](https://github.com/lithic-com/lithic-kotlin/issues/354)) ([a753c44](https://github.com/lithic-com/lithic-kotlin/commit/a753c4496350d48b211edb872e4db453c5771a70))
* **internal:** remove unnecessary error handlers ([#327](https://github.com/lithic-com/lithic-kotlin/issues/327)) ([26e72f3](https://github.com/lithic-com/lithic-kotlin/commit/26e72f33e7ccf0b5c8e910a41ebc75729fe6b701))
* merge conflicts ([#360](https://github.com/lithic-com/lithic-kotlin/issues/360)) ([b9e444a](https://github.com/lithic-com/lithic-kotlin/commit/b9e444a6e687414d7b61713cb0d2eb57284a7de3))


### Chores

* **api:** add `PIN_BLOCKED` to `detailed_results` property on Event ([#342](https://github.com/lithic-com/lithic-kotlin/issues/342)) ([5667848](https://github.com/lithic-com/lithic-kotlin/commit/56678481b9b03ceb2f84d0c604c546f45304e1dd))
* **api:** adds `charge_off` functionality to FinancialAccounts ([#351](https://github.com/lithic-com/lithic-kotlin/issues/351)) ([1bf0ec1](https://github.com/lithic-com/lithic-kotlin/commit/1bf0ec1d1fabb366ed595e8f65eed7798dfafd7f))
* **api:** adds new result types to Transactions and Events ([#343](https://github.com/lithic-com/lithic-kotlin/issues/343)) ([c3fddaf](https://github.com/lithic-com/lithic-kotlin/commit/c3fddaf87ffd1995f6b616d84454102759834176))
* **docs:** updates to documentation for V2 AuthRules ([#349](https://github.com/lithic-com/lithic-kotlin/issues/349)) ([0f6a69b](https://github.com/lithic-com/lithic-kotlin/commit/0f6a69b7ea3303a4165fda64cabc625cc97b7143))
* **internal:** delete unused function ([#353](https://github.com/lithic-com/lithic-kotlin/issues/353)) ([7aaa905](https://github.com/lithic-com/lithic-kotlin/commit/7aaa905895c3cd860b6512e4437b88fa69dc94d3))
* **internal:** omit unnecessary code ([#326](https://github.com/lithic-com/lithic-kotlin/issues/326)) ([89bb442](https://github.com/lithic-com/lithic-kotlin/commit/89bb44292729794d196571bdf231bee71e9a1308))
* **internal:** remove empty test files ([#331](https://github.com/lithic-com/lithic-kotlin/issues/331)) ([2d660ab](https://github.com/lithic-com/lithic-kotlin/commit/2d660abbaad2ab01f0eaf2d12b2fd2da8d772497))
* **internal:** remove unnecessary `[@file](https://github.com/file):Suppress("OVERLOADS_INTERFACE")` ([#334](https://github.com/lithic-com/lithic-kotlin/issues/334)) ([f75a999](https://github.com/lithic-com/lithic-kotlin/commit/f75a999dd8fb409e3ee0ece6669de462146c42aa))
* **internal:** remove unnecessary `[@file](https://github.com/file):Suppress("OVERLOADS_INTERFACE")` ([#338](https://github.com/lithic-com/lithic-kotlin/issues/338)) ([cb2ccf3](https://github.com/lithic-com/lithic-kotlin/commit/cb2ccf3a0ef83094a987600d79f6095f0dc04577))
* **internal:** remove useless `[@file](https://github.com/file):JvmSynthetic` ([#337](https://github.com/lithic-com/lithic-kotlin/issues/337)) ([954c80c](https://github.com/lithic-com/lithic-kotlin/commit/954c80c5c29a4be4175c4a58b2b0b469c902272e))


### Documentation

* add docstrings ([#355](https://github.com/lithic-com/lithic-kotlin/issues/355)) ([9eeab77](https://github.com/lithic-com/lithic-kotlin/commit/9eeab77d798b6f75b19997a8d8a486afc90c74f0))


### Styles

* **client:** make toString methods consistent ([#330](https://github.com/lithic-com/lithic-kotlin/issues/330)) ([d1caec0](https://github.com/lithic-com/lithic-kotlin/commit/d1caec0522b94c273beb53642016d10de3286c02))
* **client:** rename some union classes ([#350](https://github.com/lithic-com/lithic-kotlin/issues/350)) ([ee5d02e](https://github.com/lithic-com/lithic-kotlin/commit/ee5d02ecc3f29ab6923eb36671314c7184f3f494))
* **internal:** improve `OkHttpClient` formatting ([#335](https://github.com/lithic-com/lithic-kotlin/issues/335)) ([e77faca](https://github.com/lithic-com/lithic-kotlin/commit/e77faca514850a4a5a780d19554aefec626d1533))
* **internal:** improve `RetryingHttpClient` formatting ([#339](https://github.com/lithic-com/lithic-kotlin/issues/339)) ([600591d](https://github.com/lithic-com/lithic-kotlin/commit/600591d6eef4c89f01caa7ab4f3e9aaf219aa02a))
* **internal:** improve terseness of handlers ([#321](https://github.com/lithic-com/lithic-kotlin/issues/321)) ([e69f47b](https://github.com/lithic-com/lithic-kotlin/commit/e69f47b54c20edd80b663b990f8b172c3c6b9384))
* **internal:** improve terseness of Properties.kt ([#323](https://github.com/lithic-com/lithic-kotlin/issues/323)) ([3cf3952](https://github.com/lithic-com/lithic-kotlin/commit/3cf39525d1d7b34209db1edf4551a05305589e26))
* **internal:** make `getOrThrow` terse and consistent ([#352](https://github.com/lithic-com/lithic-kotlin/issues/352)) ([e642d4e](https://github.com/lithic-com/lithic-kotlin/commit/e642d4ee487054b09a7b0861fba111ffd0efb6f5))
* **internal:** move Handlers.kt and HttpRequestBodies.kt to core ([#324](https://github.com/lithic-com/lithic-kotlin/issues/324)) ([e02eea0](https://github.com/lithic-com/lithic-kotlin/commit/e02eea0269df2f72c5af45dc1f9541c149d1f997))
* **internal:** simplify client build method ([#336](https://github.com/lithic-com/lithic-kotlin/issues/336)) ([92ddfe9](https://github.com/lithic-com/lithic-kotlin/commit/92ddfe90bd7b9506f1fbdad47d1636fa8a5e13c0))
* **internal:** update comment formatting ([#333](https://github.com/lithic-com/lithic-kotlin/issues/333)) ([2b0e988](https://github.com/lithic-com/lithic-kotlin/commit/2b0e9882faaa0b232446816a02044e657ec4f3d7))
* **internal:** use `if` and `if-else` instead of `when` idiomatically ([#329](https://github.com/lithic-com/lithic-kotlin/issues/329)) ([44e2586](https://github.com/lithic-com/lithic-kotlin/commit/44e2586f02d4e4716269984afe837909a5e5acb0))


### Refactors

* **internal:** polish `ClientOptions` ([#357](https://github.com/lithic-com/lithic-kotlin/issues/357)) ([7cdb62b](https://github.com/lithic-com/lithic-kotlin/commit/7cdb62bf9f5b8530f77f2cba026550d318b8b160))

## 0.68.0 (2024-10-11)

Full Changelog: [v0.67.0...v0.68.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.67.0...v0.68.0)

### Features

* **api:** updates to documentation and addition of new 3DS simulation methods ([#319](https://github.com/lithic-com/lithic-kotlin/issues/319)) ([5115da8](https://github.com/lithic-com/lithic-kotlin/commit/5115da821e3bba96135ebee611f16f2bedc317e1))

## 0.67.0 (2024-10-09)

Full Changelog: [v0.66.0...v0.67.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.66.0...v0.67.0)

### Features

* **api:** small updates to Documents, AccountHolders and LoanTapes ([#318](https://github.com/lithic-com/lithic-kotlin/issues/318)) ([65a825d](https://github.com/lithic-com/lithic-kotlin/commit/65a825d1d48cbd04fd12c189267d385c47c05fcd))


### Chores

* **api:** small updates to verification addresses and Statement and LoanTape fields ([#316](https://github.com/lithic-com/lithic-kotlin/issues/316)) ([5015f21](https://github.com/lithic-com/lithic-kotlin/commit/5015f21fa85491f4d1263c868e92e2413c805180))


### Styles

* **client:** disable formatting for java boilerplate ([#317](https://github.com/lithic-com/lithic-kotlin/issues/317)) ([360ca62](https://github.com/lithic-com/lithic-kotlin/commit/360ca62d01c498cd8f2601bbe44eb782293d4961))
* **client:** move equals, hashCode, and toString to the bottom of entity files ([#314](https://github.com/lithic-com/lithic-kotlin/issues/314)) ([809bab0](https://github.com/lithic-com/lithic-kotlin/commit/809bab08c3c24f9bfda53c2afeb04fb2cdd28f6e))

## 0.66.0 (2024-10-01)

Full Changelog: [v0.65.0...v0.66.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.65.0...v0.66.0)

### Features

* **api:** rename `loan_tape_response.statement_balance` to `previous_statement_balance` ([#312](https://github.com/lithic-com/lithic-kotlin/issues/312)) ([95f9791](https://github.com/lithic-com/lithic-kotlin/commit/95f9791d29cfa5868bc52f4fcc33b6d328fa3057))

## 0.65.0 (2024-10-01)

Full Changelog: [v0.64.0...v0.65.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.64.0...v0.65.0)

### Features

* **api:** add Management Operations and Loan Tapes API ([#310](https://github.com/lithic-com/lithic-kotlin/issues/310)) ([ebb7321](https://github.com/lithic-com/lithic-kotlin/commit/ebb7321fe49a861b044e94c3e4d8de89ab494b9f))

## 0.64.0 (2024-09-25)

Full Changelog: [v0.63.0...v0.64.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.63.0...v0.64.0)

### Features

* **api:** adds endpoint for migrating auth rules from v1 to V2. marks v1 auth rules as deprecated ([#309](https://github.com/lithic-com/lithic-kotlin/issues/309)) ([d1f02bf](https://github.com/lithic-com/lithic-kotlin/commit/d1f02bfc24ecd5de0e936e5b8787a107810c28c5))
* **client:** send retry count header ([#307](https://github.com/lithic-com/lithic-kotlin/issues/307)) ([949046b](https://github.com/lithic-com/lithic-kotlin/commit/949046b2da5109c2d0a1f3577926aaa77063bfcd))

## 0.63.0 (2024-09-24)

Full Changelog: [v0.62.0...v0.63.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.62.0...v0.63.0)

### Features

* **api:** add `ACCOUNT_DELINQUENT` to `detailed_results` enum ([#305](https://github.com/lithic-com/lithic-kotlin/issues/305)) ([ea65cfb](https://github.com/lithic-com/lithic-kotlin/commit/ea65cfb79bcead1231121941543d87b1da714397))

## 0.62.0 (2024-09-23)

Full Changelog: [v0.61.0...v0.62.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.61.0...v0.62.0)

### Features

* **api:** add `canceled` to `transaction_status` enum values ([#303](https://github.com/lithic-com/lithic-kotlin/issues/303)) ([c1656e9](https://github.com/lithic-com/lithic-kotlin/commit/c1656e9407a599106773fd992e75840ff3da3d21))

## 0.61.0 (2024-09-19)

Full Changelog: [v0.60.1...v0.61.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.60.1...v0.61.0)

### ⚠ BREAKING CHANGES

* **api:** update model `FinancialAccount` ([#301](https://github.com/lithic-com/lithic-kotlin/issues/301))

### Features

* **api:** update model `FinancialAccount` ([#301](https://github.com/lithic-com/lithic-kotlin/issues/301)) ([8148eed](https://github.com/lithic-com/lithic-kotlin/commit/8148eed71a61c86fc4ea701df4345afbee5ed182))

## 0.60.1 (2024-09-18)

Full Changelog: [v0.60.0...v0.60.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.60.0...v0.60.1)

### Chores

* **internal:** specify API version for each endpoints instead of hardcoded in base URLs ([#299](https://github.com/lithic-com/lithic-kotlin/issues/299)) ([17b5ebe](https://github.com/lithic-com/lithic-kotlin/commit/17b5ebe26b1461d611fbb47cbf737cd2ea01b8bb))
* **tests:** fix getEmbedURL to specify /v1/ prefix ([7de4d7f](https://github.com/lithic-com/lithic-kotlin/commit/7de4d7f900d586a6c2c722eefb3a7519e951ff44))

## 0.60.0 (2024-09-17)

Full Changelog: [v0.59.0...v0.60.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.59.0...v0.60.0)

### ⚠ BREAKING CHANGES

* **api:** updates book transfer status, updates to transactions, add currency model ([#298](https://github.com/lithic-com/lithic-kotlin/issues/298))

### Features

* **api:** updates book transfer status, updates to transactions, add currency model ([#298](https://github.com/lithic-com/lithic-kotlin/issues/298)) ([76d103e](https://github.com/lithic-com/lithic-kotlin/commit/76d103ee27d331636e3c6938b5302f823811c270))
* **client:** added structured fields to errors ([#297](https://github.com/lithic-com/lithic-kotlin/issues/297)) ([eaeb332](https://github.com/lithic-com/lithic-kotlin/commit/eaeb332cd3645875e26d41f6f17301a3d75c5a2f))


### Documentation

* adjust additional properties example ([#295](https://github.com/lithic-com/lithic-kotlin/issues/295)) ([b563a70](https://github.com/lithic-com/lithic-kotlin/commit/b563a708d6582254ed533184f44b177f34d7414f))

## 0.59.0 (2024-09-06)

Full Changelog: [v0.58.0...v0.59.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.58.0...v0.59.0)

### Features

* **api:** add tier and state to financial_accounts ([#294](https://github.com/lithic-com/lithic-kotlin/issues/294)) ([23f5629](https://github.com/lithic-com/lithic-kotlin/commit/23f562997d6db2b12170badfdfb3d78a3661e320))


### Chores

* **docs:** update description for postal codes ([#292](https://github.com/lithic-com/lithic-kotlin/issues/292)) ([e654d06](https://github.com/lithic-com/lithic-kotlin/commit/e654d06bed9c6e42cbc0c3b1da4726ddb476aa61))

## 0.58.0 (2024-09-03)

Full Changelog: [v0.57.0...v0.58.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.57.0...v0.58.0)

### Features

* **api:** declare AccountHolderBusinessResponse and remove entity_token from BusinessEntity ([#290](https://github.com/lithic-com/lithic-kotlin/issues/290)) ([e6d74b9](https://github.com/lithic-com/lithic-kotlin/commit/e6d74b937e2f594e4df4b3ff45d3b3e56e6bdb20))

## 0.57.0 (2024-08-29)

Full Changelog: [v0.56.0...v0.57.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.56.0...v0.57.0)

### ⚠ BREAKING CHANGES

* **api:** add shared model Document ([#289](https://github.com/lithic-com/lithic-kotlin/issues/289))

### Features

* **api:** add shared model Document ([#289](https://github.com/lithic-com/lithic-kotlin/issues/289)) ([a1b2d77](https://github.com/lithic-com/lithic-kotlin/commit/a1b2d77966c203149989c1a32e20a19b1f8782a2))


### Chores

* use headless jdk for containers ([#287](https://github.com/lithic-com/lithic-kotlin/issues/287)) ([25b89bb](https://github.com/lithic-com/lithic-kotlin/commit/25b89bb6ef67f9b31b948e4da97135ae6dd2137f))

## 0.56.0 (2024-08-28)

Full Changelog: [v0.55.1...v0.56.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.55.1...v0.56.0)

### Features

* **api:** add 'pin status' and 'pending_commands' to Card model ([#285](https://github.com/lithic-com/lithic-kotlin/issues/285)) ([187b1ae](https://github.com/lithic-com/lithic-kotlin/commit/187b1aebd1a25eb550cc1bd0a795e130a18372d8))

## 0.55.1 (2024-08-26)

Full Changelog: [v0.55.0...v0.55.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.55.0...v0.55.1)

### Bug Fixes

* do not pass through `\` when escaping string literals ([#284](https://github.com/lithic-com/lithic-kotlin/issues/284)) ([3dc6ef5](https://github.com/lithic-com/lithic-kotlin/commit/3dc6ef5ce50d0420acd5347171ce6c27e17956fb))


### Chores

* **docs:** minor edits ([#282](https://github.com/lithic-com/lithic-kotlin/issues/282)) ([c518504](https://github.com/lithic-com/lithic-kotlin/commit/c5185047d146b489833b1153f99ad43bbac794da))

## 0.55.0 (2024-08-23)

Full Changelog: [v0.54.0...v0.55.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.54.0...v0.55.0)

### Features

* **api:** add endpoints and webhooks for 3DS challenge decisions and challenges ([#280](https://github.com/lithic-com/lithic-kotlin/issues/280)) ([bdc1f7c](https://github.com/lithic-com/lithic-kotlin/commit/bdc1f7c1145556505558f49b09230f5bf17ddfaa))

## 0.54.0 (2024-08-23)

Full Changelog: [v0.53.2...v0.54.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.53.2...v0.54.0)

### Features

* **api:** new book_transfer_transaction events and Settlement Report field deprecations ([#278](https://github.com/lithic-com/lithic-kotlin/issues/278)) ([605d4de](https://github.com/lithic-com/lithic-kotlin/commit/605d4deb839306957ca32750c53c4ff5eb3a10dc))

## 0.53.2 (2024-08-22)

Full Changelog: [v0.53.1...v0.53.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.53.1...v0.53.2)

### Bug Fixes

* remove additionalBodyProperties from methods that don't support request bodies ([#276](https://github.com/lithic-com/lithic-kotlin/issues/276)) ([f77ede1](https://github.com/lithic-com/lithic-kotlin/commit/f77ede11a203078eb315e5019ade685dd171b980))

## 0.53.1 (2024-08-21)

Full Changelog: [v0.53.0...v0.53.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.53.0...v0.53.1)

### Bug Fixes

* **docs:** use correct putAdditionalProperty value ([#274](https://github.com/lithic-com/lithic-kotlin/issues/274)) ([5740039](https://github.com/lithic-com/lithic-kotlin/commit/57400396adb0318132d5cb337020e83130df5ffb))

## 0.53.0 (2024-08-20)

Full Changelog: [v0.52.0...v0.53.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.52.0...v0.53.0)

### Features

* **api:** add property `next_payment_end_date` and `next_payment_due_date` to Statement model ([#273](https://github.com/lithic-com/lithic-kotlin/issues/273)) ([734ed51](https://github.com/lithic-com/lithic-kotlin/commit/734ed51cf0a3d55a0f158a593f9910ca4d6532ab))


### Chores

* **docs:** update state description on Card ([#271](https://github.com/lithic-com/lithic-kotlin/issues/271)) ([b205cd1](https://github.com/lithic-com/lithic-kotlin/commit/b205cd1a96ae4c9b57bdc1702a7c375522cfb846))

## 0.52.0 (2024-08-16)

Full Changelog: [v0.51.0...v0.52.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.51.0...v0.52.0)

### Features

* **api:** add StatementListParams property include_initial_statements ([#269](https://github.com/lithic-com/lithic-kotlin/issues/269)) ([fabe1c0](https://github.com/lithic-com/lithic-kotlin/commit/fabe1c021fbb48611f6b3d730e7c0b2b312c42ab))

## 0.51.0 (2024-08-14)

Full Changelog: [v0.50.0...v0.51.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.50.0...v0.51.0)

### Features

* **api:** add SettlementReport property `is_complete` ([#267](https://github.com/lithic-com/lithic-kotlin/issues/267)) ([5a8d111](https://github.com/lithic-com/lithic-kotlin/commit/5a8d111f6a1b58f190ea89f6fb0489735216fdd0))

## 0.50.0 (2024-08-12)

Full Changelog: [v0.49.0...v0.50.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.49.0...v0.50.0)

### Features

* **api:** add property `Account.cardholderCurrency` ([#266](https://github.com/lithic-com/lithic-kotlin/issues/266)) ([cd90d10](https://github.com/lithic-com/lithic-kotlin/commit/cd90d10acf8652b27b4c43574e105febb4c32278))
* **api:** add property `Card.cardholderCurrency` ([cd90d10](https://github.com/lithic-com/lithic-kotlin/commit/cd90d10acf8652b27b4c43574e105febb4c32278))
* **api:** add property `CardProgram.cardholderCurrencies` ([cd90d10](https://github.com/lithic-com/lithic-kotlin/commit/cd90d10acf8652b27b4c43574e105febb4c32278))
* **api:** add property `CardProgram.cardholderCurrency` ([cd90d10](https://github.com/lithic-com/lithic-kotlin/commit/cd90d10acf8652b27b4c43574e105febb4c32278))


### Chores

* **ci:** bump prism mock server version ([#264](https://github.com/lithic-com/lithic-kotlin/issues/264)) ([9f1fd05](https://github.com/lithic-com/lithic-kotlin/commit/9f1fd051a8cfee430ca12ca442648dfa3f1af7dc))

## 0.49.0 (2024-08-09)

Full Changelog: [v0.48.0...v0.49.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.48.0...v0.49.0)

### ⚠ BREAKING CHANGES

* **api:** rename model property 'Statement.AccountStanding.state' to 'period_state' ([#263](https://github.com/lithic-com/lithic-kotlin/issues/263))

### Features

* **api:** add event type 'card.reissued' ([#260](https://github.com/lithic-com/lithic-kotlin/issues/260)) ([262e63f](https://github.com/lithic-com/lithic-kotlin/commit/262e63f0f3fa6dcde3ae7fe813cf7262ef35ad35))
* **api:** add methods to simulate enrollment review and enrollment document review ([#262](https://github.com/lithic-com/lithic-kotlin/issues/262)) ([e99ada3](https://github.com/lithic-com/lithic-kotlin/commit/e99ada345183207ef695aa07fdc58f4dddcd3878))
* **api:** rename model property 'Statement.AccountStanding.state' to 'period_state' ([#263](https://github.com/lithic-com/lithic-kotlin/issues/263)) ([15a1fa4](https://github.com/lithic-com/lithic-kotlin/commit/15a1fa4b05fe0a251f3599d80b159b88a41ecac9))

## 0.48.0 (2024-08-05)

Full Changelog: [v0.47.0...v0.48.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.47.0...v0.48.0)

### Features

* **api:** add event type 'statements.created' ([#258](https://github.com/lithic-com/lithic-kotlin/issues/258)) ([b3710bf](https://github.com/lithic-com/lithic-kotlin/commit/b3710bfda552698357b90cec73a684aec44d5367))

## 0.47.0 (2024-07-30)

Full Changelog: [v0.46.0...v0.47.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.46.0...v0.47.0)

### Features

* **client:** improve binary return values ([#256](https://github.com/lithic-com/lithic-kotlin/issues/256)) ([c25532d](https://github.com/lithic-com/lithic-kotlin/commit/c25532da4398d7afe616ca1e220b8cde1a47902c))


### Chores

* **ci:** run tests in CI ([#257](https://github.com/lithic-com/lithic-kotlin/issues/257)) ([c7ab14b](https://github.com/lithic-com/lithic-kotlin/commit/c7ab14b8c124b57cedefbb9be2da739e654471e9))
* **internal:** remove unused test file ([#254](https://github.com/lithic-com/lithic-kotlin/issues/254)) ([a5ec664](https://github.com/lithic-com/lithic-kotlin/commit/a5ec6647ef2044b1dfad4ae825382fea6289b956))

## 0.46.0 (2024-07-26)

Full Changelog: [v0.45.0...v0.46.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.45.0...v0.46.0)

### Features

* **api:** add method to fetch the extended credit for a given credit product ([#253](https://github.com/lithic-com/lithic-kotlin/issues/253)) ([e8e2af8](https://github.com/lithic-com/lithic-kotlin/commit/e8e2af8b690697068534af510e09067ce6b51ac7))


### Chores

* **docs:** set of improvements ([#251](https://github.com/lithic-com/lithic-kotlin/issues/251)) ([4d7e3d1](https://github.com/lithic-com/lithic-kotlin/commit/4d7e3d1b355750b5faba517b3d5ad3b916f51cf2))

## 0.45.0 (2024-07-23)

Full Changelog: [v0.44.0...v0.45.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.44.0...v0.45.0)

### ⚠ BREAKING CHANGES

* **api:** deprecate 'auth rule token' in 'card' and 'account holder' models ([#250](https://github.com/lithic-com/lithic-kotlin/issues/250))

### Features

* **api:** deprecate 'auth rule token' in 'card' and 'account holder' models ([#250](https://github.com/lithic-com/lithic-kotlin/issues/250)) ([f8807ee](https://github.com/lithic-com/lithic-kotlin/commit/f8807ee7447bb765c9d0c9e5a2622395972030d8))


### Chores

* **tests:** update prism version ([#248](https://github.com/lithic-com/lithic-kotlin/issues/248)) ([296a74b](https://github.com/lithic-com/lithic-kotlin/commit/296a74b4f5560f48a533fac3f50e6d68882385c9))

## 0.44.0 (2024-07-19)

Full Changelog: [v0.43.0...v0.44.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.43.0...v0.44.0)

### Features

* **api:** add method to retrieve a transaction's enhanced commercial data ([#247](https://github.com/lithic-com/lithic-kotlin/issues/247)) ([73ff1c7](https://github.com/lithic-com/lithic-kotlin/commit/73ff1c73c55ca2a4c60765db0b73c7d39942e1e2))


### Chores

* **ci:** limit release doctor target branches ([#245](https://github.com/lithic-com/lithic-kotlin/issues/245)) ([8ba0aab](https://github.com/lithic-com/lithic-kotlin/commit/8ba0aab354593dffabaa424afd1e9df4255cc388))

## 0.43.0 (2024-07-17)

Full Changelog: [v0.42.0...v0.43.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.42.0...v0.43.0)

### Features

* **api:** updates ([#244](https://github.com/lithic-com/lithic-kotlin/issues/244)) ([a708fdd](https://github.com/lithic-com/lithic-kotlin/commit/a708fdd9a60468c711bb661b6be644fb6e7a4536))


### Chores

* **docs:** minor update to formatting of API link in README ([#242](https://github.com/lithic-com/lithic-kotlin/issues/242)) ([04d2c82](https://github.com/lithic-com/lithic-kotlin/commit/04d2c824c2d4e9dfd16e6aaf452787ab3c791509))

## 0.42.0 (2024-07-11)

Full Changelog: [v0.41.1...v0.42.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.41.1...v0.42.0)

### ⚠ BREAKING CHANGES

* **api:** param 'financial account token` when creating an external bank account is now required ([#240](https://github.com/lithic-com/lithic-kotlin/issues/240))

### Features

* **api:** param 'financial account token` when creating an external bank account is now required ([#240](https://github.com/lithic-com/lithic-kotlin/issues/240)) ([17c5d5d](https://github.com/lithic-com/lithic-kotlin/commit/17c5d5dd1a6abd0242715962b174b2e968ce58cc))

## 0.41.1 (2024-07-11)

Full Changelog: [v0.41.0...v0.41.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.41.0...v0.41.1)

### Chores

* **ci:** also run workflows for PRs targeting `next` ([#238](https://github.com/lithic-com/lithic-kotlin/issues/238)) ([1e9eaad](https://github.com/lithic-com/lithic-kotlin/commit/1e9eaadaf4a88d969a2d53b9e394f6597766bafe))
* **docs:** document minimum Java version (Java 8) in README ([#237](https://github.com/lithic-com/lithic-kotlin/issues/237)) ([68dfb1f](https://github.com/lithic-com/lithic-kotlin/commit/68dfb1f2a64e13de303ab1d55a16ddba86ec4909))
* gitignore test server logs ([#235](https://github.com/lithic-com/lithic-kotlin/issues/235)) ([4570334](https://github.com/lithic-com/lithic-kotlin/commit/4570334b560913a1a49b92222217831566e7506e))


### Documentation

* **examples:** update example values ([#239](https://github.com/lithic-com/lithic-kotlin/issues/239)) ([84883bb](https://github.com/lithic-com/lithic-kotlin/commit/84883bb215aa9599637ccb935b5797569047a509))

## 0.41.0 (2024-06-21)

Full Changelog: [v0.40.0...v0.41.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.40.0...v0.41.0)

### ⚠ BREAKING CHANGES

* **api:** remove unused event type 'statement.created'
* **api:** remove unused business account type
* **api:** remove unused embed request params type
* **api:** updates ([#234](https://github.com/lithic-com/lithic-kotlin/issues/234))

### Features

* **api:** add 'reverse' method for book transfers ([2f07357](https://github.com/lithic-com/lithic-kotlin/commit/2f073575d7c676b94aab662cecf3c6334018b09a))
* **api:** add field 'trace numbers' to payment method attribute model ([2f07357](https://github.com/lithic-com/lithic-kotlin/commit/2f073575d7c676b94aab662cecf3c6334018b09a))
* **api:** remove unused business account type ([2f07357](https://github.com/lithic-com/lithic-kotlin/commit/2f073575d7c676b94aab662cecf3c6334018b09a))
* **api:** remove unused embed request params type ([2f07357](https://github.com/lithic-com/lithic-kotlin/commit/2f073575d7c676b94aab662cecf3c6334018b09a))
* **api:** remove unused event type 'statement.created' ([2f07357](https://github.com/lithic-com/lithic-kotlin/commit/2f073575d7c676b94aab662cecf3c6334018b09a))
* **api:** updates ([#234](https://github.com/lithic-com/lithic-kotlin/issues/234)) ([2f07357](https://github.com/lithic-com/lithic-kotlin/commit/2f073575d7c676b94aab662cecf3c6334018b09a))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#232](https://github.com/lithic-com/lithic-kotlin/issues/232)) ([d2b2c82](https://github.com/lithic-com/lithic-kotlin/commit/d2b2c82123e72349e10c8c367f44074a68b850ff))

## 0.40.0 (2024-06-12)

Full Changelog: [v0.39.0...v0.40.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.39.0...v0.40.0)

### Features

* **api:** updates ([#230](https://github.com/lithic-com/lithic-kotlin/issues/230)) ([761d9f3](https://github.com/lithic-com/lithic-kotlin/commit/761d9f391f2dedcb5b6049829aa80d50c6d220ad))

## 0.39.0 (2024-06-05)

Full Changelog: [v0.38.2...v0.39.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.38.2...v0.39.0)

### ⚠ BREAKING CHANGES

* **api:** remove some endpoints and other API updates ([#228](https://github.com/lithic-com/lithic-kotlin/issues/228))

### Features

* **api:** remove some endpoints and other API updates ([#228](https://github.com/lithic-com/lithic-kotlin/issues/228)) ([e7d6e4e](https://github.com/lithic-com/lithic-kotlin/commit/e7d6e4e7eff12b7f6b77281985fdc609a00299cf))

## 0.38.2 (2024-06-03)

Full Changelog: [v0.38.1...v0.38.2](https://github.com/lithic-com/lithic-kotlin/compare/v0.38.1...v0.38.2)

### Bug Fixes

* **examples:** numerical examples now respect [min, max] range ([#226](https://github.com/lithic-com/lithic-kotlin/issues/226)) ([56ec032](https://github.com/lithic-com/lithic-kotlin/commit/56ec032b53091677c51374efbeefd25e39e4d988))

## 0.38.1 (2024-05-30)

Full Changelog: [v0.38.0...v0.38.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.38.0...v0.38.1)

### Bug Fixes

* **examples:** generate correctly typed example snippets for enums ([#218](https://github.com/lithic-com/lithic-kotlin/issues/218)) ([2047283](https://github.com/lithic-com/lithic-kotlin/commit/20472832b716b0a682eccbba009ebef4ddecb4a2))

## 0.38.0 (2024-05-30)

Full Changelog: [v0.37.0...v0.38.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.37.0...v0.38.0)

### Features

* **api:** add simulate_receipt and simulate_action endpoints ([#220](https://github.com/lithic-com/lithic-kotlin/issues/220)) ([b4e310d](https://github.com/lithic-com/lithic-kotlin/commit/b4e310de34f752a5100496e0c568e98b231fbaa2))
* **api:** update detailed_results enum values ([#222](https://github.com/lithic-com/lithic-kotlin/issues/222)) ([3df79bd](https://github.com/lithic-com/lithic-kotlin/commit/3df79bdc0b622de57e14275eab759775f0aee73e))

## 0.37.0 (2024-05-29)

Full Changelog: [v0.36.0...v0.37.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.36.0...v0.37.0)

### Features

* **api:** add simulate_receipt and simulate_action endpoints ([4a1fef9](https://github.com/lithic-com/lithic-kotlin/commit/4a1fef914562a6ee991df02eb19ade2b0a4966dd))

## 0.36.0 (2024-05-29)

Full Changelog: [v0.35.0...v0.35.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.35.0...v0.35.1)

### Bug Fixes

* **examples:** generate correctly typed example snippets for enums ([7532341](https://github.com/lithic-com/lithic-kotlin/commit/75323416f82d33b553a275c5233b47231cdac6e2))

## 0.35.0 (2024-05-01)

Full Changelog: [v0.34.0...v0.35.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.34.0...v0.35.0)

### Features

* **api:** changes to balance-related return types and other API changes ([#202](https://github.com/lithic-com/lithic-kotlin/issues/202)) ([777e8dc](https://github.com/lithic-com/lithic-kotlin/commit/777e8dc55de04ab0cff731d67cea17e32679ba6e))
* **api:** updates ([#194](https://github.com/lithic-com/lithic-kotlin/issues/194)) ([e4487eb](https://github.com/lithic-com/lithic-kotlin/commit/e4487eb9105220ec9ad9aff6eace588ca33e5ddb))
* **api:** updates ([#198](https://github.com/lithic-com/lithic-kotlin/issues/198)) ([00557c7](https://github.com/lithic-com/lithic-kotlin/commit/00557c7d9a3ac8cdf7b061c09fe2a64dc52919cf))
* **api:** updates ([#207](https://github.com/lithic-com/lithic-kotlin/issues/207)) ([7536d66](https://github.com/lithic-com/lithic-kotlin/commit/7536d66948e6fe133a76b17e50717654c74d5367))
* **client:** implement support for multipart/form-data body requests ([#195](https://github.com/lithic-com/lithic-kotlin/issues/195)) ([8a4085c](https://github.com/lithic-com/lithic-kotlin/commit/8a4085ce387d65778b9ab81b81b82cbd7cb2b791))


### Bug Fixes

* **client:** do not strip date-time 00 seconds when getQueryParams() is called ([#203](https://github.com/lithic-com/lithic-kotlin/issues/203)) ([9b86dbc](https://github.com/lithic-com/lithic-kotlin/commit/9b86dbcafca9e6667c687f79550c46990ccb9258))
* **internal:** escape characters for POM description in gradle publish ([#204](https://github.com/lithic-com/lithic-kotlin/issues/204)) ([07642c1](https://github.com/lithic-com/lithic-kotlin/commit/07642c1cb84c0f5185081551425b1012c2f8f14a))


### Chores

* add back uploadEvidence override ([bc68d66](https://github.com/lithic-com/lithic-kotlin/commit/bc68d6669c71bd804e52f1b886b99e20bb8e4001))
* **ci:** validate Gradle wrapper ([#199](https://github.com/lithic-com/lithic-kotlin/issues/199)) ([1d3aa88](https://github.com/lithic-com/lithic-kotlin/commit/1d3aa88134590e368cfa7201f043eb86d1bdd890))
* **internal:** add scripts/mock ([#205](https://github.com/lithic-com/lithic-kotlin/issues/205)) ([5097efb](https://github.com/lithic-com/lithic-kotlin/commit/5097efb6d0c67e7b091aa2f0305875562fc962c0))
* **internal:** bump mock server version to ~5.8.0 ([#206](https://github.com/lithic-com/lithic-kotlin/issues/206)) ([6b5e8f6](https://github.com/lithic-com/lithic-kotlin/commit/6b5e8f605431fbbb45e19e75086f8c91e8a19f94))
* **internal:** formatting ([#196](https://github.com/lithic-com/lithic-kotlin/issues/196)) ([282a12b](https://github.com/lithic-com/lithic-kotlin/commit/282a12b4fd33d2781989a51e68692d99fd1af89e))
* **internal:** gradlew v8.7, use gradle task config avoidance APIs ([#200](https://github.com/lithic-com/lithic-kotlin/issues/200)) ([d1ad9e1](https://github.com/lithic-com/lithic-kotlin/commit/d1ad9e1080c6208ef89d065f729b259c74765f75))
* **internal:** use actions/checkout@v4 for codeflow ([#201](https://github.com/lithic-com/lithic-kotlin/issues/201)) ([488c41c](https://github.com/lithic-com/lithic-kotlin/commit/488c41cada7ad4ae7fffe5602ca09eee25987727))
* temporarily remove custom code ([0de2e21](https://github.com/lithic-com/lithic-kotlin/commit/0de2e2168ba3ffb506e3c065d28aec7ca78533f9))
* **tests:** import wiremock.client.WireMock.put ([#192](https://github.com/lithic-com/lithic-kotlin/issues/192)) ([cf7752c](https://github.com/lithic-com/lithic-kotlin/commit/cf7752cd5559b01400f0a9a9b2697871d3849c1b))


### Build System

* configure UTF-8 locale in devcontainer ([#197](https://github.com/lithic-com/lithic-kotlin/issues/197)) ([8e7d089](https://github.com/lithic-com/lithic-kotlin/commit/8e7d0897d470c52d1d25f787032f2820e28f058b))

## 0.34.0 (2024-04-05)

Full Changelog: [v0.33.0...v0.34.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.33.0...v0.34.0)

### Features

* **api:** add detailed result CARD_NOT_ACTIVATED ([#190](https://github.com/lithic-com/lithic-kotlin/issues/190)) ([4edf742](https://github.com/lithic-com/lithic-kotlin/commit/4edf7420ddc32ae389b6a37bf002f3960c7bde32))
* **api:** add event type digital_wallet.tokenization_two_factor_authentication_code_sent ([#184](https://github.com/lithic-com/lithic-kotlin/issues/184)) ([a7935a9](https://github.com/lithic-com/lithic-kotlin/commit/a7935a974891436f593c7d4814394f211be6c402))
* **api:** add params spend_limit and spend_velocity ([#189](https://github.com/lithic-com/lithic-kotlin/issues/189)) ([d33dd08](https://github.com/lithic-com/lithic-kotlin/commit/d33dd08878d15faeaa554fff9e77b91062cb55f9))
* **api:** add settlement_report.updated enum ([#180](https://github.com/lithic-com/lithic-kotlin/issues/180)) ([ce2607d](https://github.com/lithic-com/lithic-kotlin/commit/ce2607d4ce630ef027c10647964a29ce2a094c22))
* **api:** update financial transaction status enum ([#183](https://github.com/lithic-com/lithic-kotlin/issues/183)) ([2439098](https://github.com/lithic-com/lithic-kotlin/commit/24390983242a0208eaec42c8ea56e53894be77b7))
* **api:** update link to encrypted PIN block docs ([#191](https://github.com/lithic-com/lithic-kotlin/issues/191)) ([c420f88](https://github.com/lithic-com/lithic-kotlin/commit/c420f88a4cb92e1dc2d3d0dd47f47602e67a5047))
* **api:** updates ([#182](https://github.com/lithic-com/lithic-kotlin/issues/182)) ([396c2a1](https://github.com/lithic-com/lithic-kotlin/commit/396c2a166f346ecdd0c9c385ccae61ef46ff5383))


### Chores

* **deps:** update jackson to v2.14.3 ([#185](https://github.com/lithic-com/lithic-kotlin/issues/185)) ([5fb4035](https://github.com/lithic-com/lithic-kotlin/commit/5fb4035b3bab6866f994b843c2728ac2bde35bc7))
* **deps:** update junit5 to v5.9.3 ([#187](https://github.com/lithic-com/lithic-kotlin/issues/187)) ([506c037](https://github.com/lithic-com/lithic-kotlin/commit/506c037651d8d98928577e01484810ab69fe37a1))
* **deps:** update kotlin-gradle-plugin to v1.9.23 ([#186](https://github.com/lithic-com/lithic-kotlin/issues/186)) ([fc02542](https://github.com/lithic-com/lithic-kotlin/commit/fc025428acda54f2faa49ff03f70713c2e73e2d9))
* **deps:** update kotlinx-coroutines-core to v1.8.0 ([#188](https://github.com/lithic-com/lithic-kotlin/issues/188)) ([41e4d21](https://github.com/lithic-com/lithic-kotlin/commit/41e4d214f4fee943a60e341f59dafc6d66234818))

## 0.33.0 (2024-03-21)

Full Changelog: [v0.32.0...v0.33.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.32.0...v0.33.0)

### Features

* add HttpRequestBody.contentLength() ([#173](https://github.com/lithic-com/lithic-kotlin/issues/173)) ([21d5a9e](https://github.com/lithic-com/lithic-kotlin/commit/21d5a9e0d46dc9c30670e6bd0f787a483d9abc8c))
* **api:** adds closed state ([#179](https://github.com/lithic-com/lithic-kotlin/issues/179)) ([5a935c7](https://github.com/lithic-com/lithic-kotlin/commit/5a935c79ddd6f92b5ff643d8182d0bbe56d55ab0))
* **api:** updates ([#178](https://github.com/lithic-com/lithic-kotlin/issues/178)) ([0be26d4](https://github.com/lithic-com/lithic-kotlin/commit/0be26d4af74bfcb142b89b615939465e64be04a5))


### Chores

* add api.md ([#171](https://github.com/lithic-com/lithic-kotlin/issues/171)) ([2158ad3](https://github.com/lithic-com/lithic-kotlin/commit/2158ad35178ec1764491a1cb57f030c031b40ff1))
* add back removed code ([62e2839](https://github.com/lithic-com/lithic-kotlin/commit/62e28395b41af99f7c223bbb9830e957be85560b))
* **docs:** add back custom readme code ([0ff33b5](https://github.com/lithic-com/lithic-kotlin/commit/0ff33b586ae0e297bda5b53c05ee3a0985b315e5))
* **docs:** temporarily remove custom readme code ([#175](https://github.com/lithic-com/lithic-kotlin/issues/175)) ([bb93822](https://github.com/lithic-com/lithic-kotlin/commit/bb9382206c6b24ce16b757484ca213433e08bcfd))
* temporarily remove various code as part of refactor ([#176](https://github.com/lithic-com/lithic-kotlin/issues/176)) ([7796e44](https://github.com/lithic-com/lithic-kotlin/commit/7796e44d8c6d8cc635710c1998c522c7975ed5eb))


### Documentation

* **readme:** consistent use of sentence case in headings ([#177](https://github.com/lithic-com/lithic-kotlin/issues/177)) ([df7ad43](https://github.com/lithic-com/lithic-kotlin/commit/df7ad43a977dde44bf67523fc19146900482963d))

## 0.32.0 (2024-02-27)

Full Changelog: [v0.31.0...v0.32.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.31.0...v0.32.0)

### Features

* **api:** updates ([#169](https://github.com/lithic-com/lithic-kotlin/issues/169)) ([33d9ebe](https://github.com/lithic-com/lithic-kotlin/commit/33d9ebe9df44773ce9ad5d52ba5164aef4f70317))

## 0.31.0 (2024-02-23)

Full Changelog: [v0.30.0...v0.31.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.30.0...v0.31.0)

### Features

* **api:** tokenizations ([#168](https://github.com/lithic-com/lithic-kotlin/issues/168)) ([b205322](https://github.com/lithic-com/lithic-kotlin/commit/b2053228093cc98859dfaea169bff40cb806532b))


### Chores

* **ci:** update actions/setup-java action to v4 ([#162](https://github.com/lithic-com/lithic-kotlin/issues/162)) ([2f334c1](https://github.com/lithic-com/lithic-kotlin/commit/2f334c11596668edfee42048bea234e29f2998c2))
* **internal:** update deps ([#160](https://github.com/lithic-com/lithic-kotlin/issues/160)) ([ef2d327](https://github.com/lithic-com/lithic-kotlin/commit/ef2d32707dfb5ee45c1b3a376d9b7a39890698c2))
* update dependency com.diffplug.spotless:spotless-plugin-gradle to v6.25.0 ([#164](https://github.com/lithic-com/lithic-kotlin/issues/164)) ([8831a75](https://github.com/lithic-com/lithic-kotlin/commit/8831a75c3bca9500e01ff01e16bbe4c3bf9c14d8))
* update dependency com.github.tomakehurst:wiremock-jre8 to v2.35.2 ([#167](https://github.com/lithic-com/lithic-kotlin/issues/167)) ([f643fad](https://github.com/lithic-com/lithic-kotlin/commit/f643fad34ac654097792807942e94cd2ed4932c0))
* update dependency com.google.guava:guava to v33 ([#165](https://github.com/lithic-com/lithic-kotlin/issues/165)) ([d3ef0e0](https://github.com/lithic-com/lithic-kotlin/commit/d3ef0e00739ada2c1a76a9e02d3b408e3fb7c885))
* update dependency com.squareup.okhttp3:okhttp to v4.12.0 ([#163](https://github.com/lithic-com/lithic-kotlin/issues/163)) ([e649925](https://github.com/lithic-com/lithic-kotlin/commit/e649925def14b87bac2fe3485277776e634c7c60))
* update dependency org.apache.httpcomponents.client5:httpclient5 to v5.3.1 ([#161](https://github.com/lithic-com/lithic-kotlin/issues/161)) ([12d6a10](https://github.com/lithic-com/lithic-kotlin/commit/12d6a1083534d25862c6dbddef7ef7d36fbace38))
* update dependency org.apache.httpcomponents.core5:httpcore5 to v5.2.4 ([#155](https://github.com/lithic-com/lithic-kotlin/issues/155)) ([6ace276](https://github.com/lithic-com/lithic-kotlin/commit/6ace276f60d830985b0f188ead8bf67dc278fb1b))
* update dependency org.assertj:assertj-core to v3.25.3 ([#158](https://github.com/lithic-com/lithic-kotlin/issues/158)) ([221e017](https://github.com/lithic-com/lithic-kotlin/commit/221e01718e6059d891c9d910e7e288cb6acc306f))
* update dependency org.assertj:assertj-guava to v3.25.3 ([#159](https://github.com/lithic-com/lithic-kotlin/issues/159)) ([af41587](https://github.com/lithic-com/lithic-kotlin/commit/af41587f80f04e5b9daf85d1f9bd736398d12c4e))
* update dependency org.slf4j:slf4j-simple to v1.7.36 ([#157](https://github.com/lithic-com/lithic-kotlin/issues/157)) ([f940803](https://github.com/lithic-com/lithic-kotlin/commit/f94080315421d8d83cf980129bad310edf0e421a))
* update dependency org.slf4j:slf4j-simple to v2 ([#166](https://github.com/lithic-com/lithic-kotlin/issues/166)) ([139216f](https://github.com/lithic-com/lithic-kotlin/commit/139216fb264dcdd34619032bd79821336566dbc0))

## 0.30.0 (2024-02-21)

Full Changelog: [v0.29.1...v0.30.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.29.1...v0.30.0)

### Features

* **api:** create financial account and retry microdeposits endpoints ([#154](https://github.com/lithic-com/lithic-kotlin/issues/154)) ([93777b8](https://github.com/lithic-com/lithic-kotlin/commit/93777b850b0b01a735ea8dd22de3d60ede024b85))
* **api:** update financial_account_type and documentation ([#152](https://github.com/lithic-com/lithic-kotlin/issues/152)) ([f3293c2](https://github.com/lithic-com/lithic-kotlin/commit/f3293c24cf51ceb1a2ee0adccd552ce46341a7b7))


### Chores

* **internal:** refactor release environment script ([#150](https://github.com/lithic-com/lithic-kotlin/issues/150)) ([c13ea05](https://github.com/lithic-com/lithic-kotlin/commit/c13ea05409dc8dc8c1210757a07b748de6bf5445))

## 0.29.1 (2024-02-12)

Full Changelog: [v0.29.0...v0.29.1](https://github.com/lithic-com/lithic-kotlin/compare/v0.29.0...v0.29.1)

### Bug Fixes

* **docs:** wrong client import in readme usage example ([#148](https://github.com/lithic-com/lithic-kotlin/issues/148)) ([bd94f9b](https://github.com/lithic-com/lithic-kotlin/commit/bd94f9b9c21ddc8a7de7d35a192388ba7d6d6a36))

## 0.29.0 (2024-02-07)

Full Changelog: [v0.28.1...v0.29.0](https://github.com/lithic-com/lithic-kotlin/compare/v0.28.1...v0.29.0)

### Features

* **api:** updates ([#147](https://github.com/lithic-com/lithic-kotlin/issues/147)) ([7731eb5](https://github.com/lithic-com/lithic-kotlin/commit/7731eb58d38b3ad93065886c3f01195f474a2b99))


### Chores

* **interal:** make link to api.md relative ([#145](https://github.com/lithic-com/lithic-kotlin/issues/145)) ([f852960](https://github.com/lithic-com/lithic-kotlin/commit/f852960950780bd4c269457ecb65b1c1e7d7dae0))

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
