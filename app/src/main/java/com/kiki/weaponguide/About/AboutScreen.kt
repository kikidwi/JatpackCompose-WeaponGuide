package com.kiki.weaponguide.About

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kiki.weaponguide.R

@Composable
fun AboutScreen(){
    Column(modifier = Modifier.fillMaxWidth()){
        BoxWithConstraints {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                ProfileImage()
                DataProfile()
            }
        }
    }
}

@Composable
private fun ProfileImage(){
    Image(
        painter = painterResource(id = R.drawable.profile_image),
        contentDescription = "weapon image",
        contentScale = ContentScale.Crop,

        modifier = Modifier
            .padding(8.dp)
            .size(250.dp)
            .clip(RoundedCornerShape(corner = CornerSize(150.dp)))
    )
}

@Composable
private fun DataProfile(){
    Column(
        modifier = Modifier.padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Kiki Dwi Prasetyo")
        Text(text = "kikidprasetyo29@gmail.com", color = Color.Blue)
    }
}