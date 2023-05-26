package com.kiki.weaponguide.Detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kiki.weaponguide.data.weapon
import com.kiki.weaponguide.ui.theme.WeaponGuideTheme

class DetailWeapon : ComponentActivity() {

    private val weapon : weapon by lazy {
        intent?.getSerializableExtra(WEAPON_ID) as weapon
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeaponGuideTheme {
                DetailScreen(weapon = weapon)
            }
        }
    }

    companion object{
        private const val WEAPON_ID = "wespon_id"
        fun newIntent(context: Context, weapon: weapon) =
            Intent(context, DetailWeapon::class.java).apply {
                putExtra(WEAPON_ID, weapon)
            }
    }
}


