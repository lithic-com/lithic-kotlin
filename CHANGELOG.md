# Changelog

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
