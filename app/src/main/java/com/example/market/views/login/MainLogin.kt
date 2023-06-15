package com.example.market.views.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.market.R

@Composable
fun MainLogin() {
    val textState = remember {
        mutableStateOf("")
    }
    val pawd = remember {
        mutableStateOf("")
    }
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.squatting_exercise),
                contentDescription = "background image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .alpha(0.8f)
                        .height(400.dp)
                        .width(350.dp),
                    shape = RoundedCornerShape(16.dp)
                ) {

                }

                Box(
                    modifier = Modifier
                        .height(400.dp)
                        .width((350.dp))
                        .alpha(0.5f)
                        .background(
                            color = Color(0xF0234E5B),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {

                }

                    Column(modifier = Modifier
                        .height(250.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally){

                        OutlinedTextField(
                            value = textState.value,
                            onValueChange = { textState.value = it },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                backgroundColor = Color.White
                            ),
                            placeholder = { Text(text = "Username") }
                        )

                        OutlinedTextField(
                            value = pawd.value,
                            onValueChange = { textState.value = it },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                backgroundColor = Color.White
                            ),
                            placeholder = { Text(text = "Password") }
                        )

                        Button(onClick = {
                            //your onclick code here
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                        modifier = Modifier.height(50.dp).width(280.dp),
                        shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Login", color = Color.White)
                        }

                    }

            }
        }
    }
}