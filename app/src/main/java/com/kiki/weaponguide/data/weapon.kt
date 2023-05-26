package com.kiki.weaponguide.data

import java.io.Serializable

data class weapon(
    var id : Int,
    var name : String,
    var type : String,
    var ammo : String,
    var desc : String,
    var magazine : String,
    var reloadTime : String,
    var image : Int
) : Serializable
