# Changelog

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
