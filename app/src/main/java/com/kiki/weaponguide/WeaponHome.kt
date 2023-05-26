package com.kiki.weaponguide

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kiki.weaponguide.data.DataProvider
import com.kiki.weaponguide.data.weapon

@Composable
fun WeaponHomeContent(navigateToDetail : (weapon) -> Unit){
    val weapons = remember {DataProvider.WeaponList}
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(vertical = 60.dp)
    ){
        items(
            items = weapons,
            itemContent = {
                WeaponListItems(weapon = it, navigateToDetail)
            }
        )
    }
}
