@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.threeDS.AuthenticationService
import com.lithic.api.services.blocking.threeDS.DescisioningService

interface ThreeDSService {

    fun authentication(): AuthenticationService

    fun descisioning(): DescisioningService
}
