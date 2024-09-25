# Changelog

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
