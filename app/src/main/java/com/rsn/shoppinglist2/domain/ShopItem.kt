package com.rsn.shoppinglist2.domain

import android.hardware.biometrics.BiometricManager.Strings

data class ShopItem(
     val id: Int,
     val name : Strings,
    val count : Int,
    val enabled : Boolean

 )