package com.kiki.weaponguide.Detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kiki.weaponguide.data.weapon

@Composable
fun DetailScreen(weapon: weapon){
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()){
        BoxWithConstraints {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                WeaponImage(weapon = weapon, containerHeight = this@BoxWithConstraints.maxHeight)
                Column{
                    WeaponInfo(weapon = weapon, containerHeight = this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
private fun WeaponImage(
    weapon: weapon,
    containerHeight: Dp
){
    Image(
        painter = painterResource(id = weapon.image),
        contentDescription = "weapon image",
        contentScale = ContentScale.Crop,

        modifier = Modifier
            .padding(8.dp)
            .size(150.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))

    )
}


@Composable
private fun WeaponInfo(
    weapon: weapon,
    containerHeight: Dp
){
    Column {
        Name(weapon = weapon)
        Description(weapon = weapon)
        Type(weapon = weapon)
        Ammo(weapon = weapon)
        Magazine(weapon = weapon)
        ReloadTime(weapon = weapon)
    }
}

@Composable
private fun Name(weapon: weapon){
    Column(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 5.dp)
    ){
        Text(
            text = weapon.name,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Composable
private fun Description(weapon: weapon){
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = weapon.desc,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Composable
private fun Type(weapon: weapon){
    Row(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 0.dp)
    ) {
        Text(text = "Type       : ")
        Text(text = weapon.type)
    }
}

@Composable
private fun Ammo(weapon: weapon){
    Row(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 0.dp)
    ) {
        Text(text = "ammo       : ")
        Text(text = weapon.ammo)
    }
}

@Composable
private fun Magazine(weapon: weapon){
    Row(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 0.dp)
    ) {
        Text(text = "magazine    : ")
        Text(text = weapon.magazine)
    }
}
@Composable
private fun ReloadTime(weapon: weapon){
    Row(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 0.dp)
    ) {
        Text(text = "Reload time : ")
        Text(text = weapon.reloadTime)
    }
}

