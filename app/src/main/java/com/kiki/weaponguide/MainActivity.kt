package com.kiki.weaponguide

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import com.kiki.weaponguide.About.AboutPage
import com.kiki.weaponguide.Detail.DetailWeapon
import com.kiki.weaponguide.data.weapon
import com.kiki.weaponguide.ui.theme.WeaponGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeaponGuideTheme {
                MyApp{
                    startActivity(DetailWeapon.newIntent(this, it))
                }
            }

        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(navigateToDetail: (weapon) -> Unit){
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Weapon List")
                },
                actions = {
                    TopAppBarActionButton(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "about_page"
                    ) {
                        context.startActivity( Intent(context, AboutPage::class.java))
                    }
                }
            )
        },
        content = {
            WeaponHomeContent(navigateToDetail = navigateToDetail)
        }
    )
}



@Composable
fun TopAppBarActionButton(
    imageVector: ImageVector,
    contentDescription: String,
    onClick: () -> Unit
) {
    IconButton(onClick = {
        onClick()
    }) {
        Icon(imageVector = imageVector, contentDescription = contentDescription)
    }
}



