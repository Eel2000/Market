package com.example.market.views.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.market.R

@Composable
fun MainLogin(){
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ){
               Image(
                   painter = painterResource(id = R.drawable.squatting_exercise),
                   contentDescription = "background image",
                   modifier = Modifier.fillMaxSize(),
                   contentScale = ContentScale.FillBounds
               )
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                    contentAlignment = Alignment.Center
                ){
                    Card(modifier = Modifier
                        .alpha(0.5f)
                        .height(250.dp)
                        .width(350.dp)
                        .blur(5.dp),
                        shape = RoundedCornerShape(16.dp)
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .height(250.dp)
                            .width((350.dp)),
                        contentAlignment = Alignment.Center
                    ){
                        Card(modifier = Modifier.background(Color.Transparent)) {
                            Text(text = "Center div card", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, color = Color.Green)
                        }
                    }
                }
        }
    }
}