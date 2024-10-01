package com.bramwel.learnit.ui.theme.screens.course


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.R
import com.bramwel.learnit.navigtion.ROUTE_BOOTSTRAP
import com.bramwel.learnit.navigtion.ROUTE_CSS
import com.bramwel.learnit.navigtion.ROUTE_DJANGO
import com.bramwel.learnit.navigtion.ROUTE_HTML
import com.bramwel.learnit.navigtion.ROUTE_PYTHON
import com.bramwel.learnit.ui.theme.screens.profile.onBtnClick


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WebDesign(navController: NavHostController){
    Scaffold (
        content={
            Column {
                Row {
                    TopAppBar(
                        navigationIcon = {
                            IconButton(
                                onClick = { onBtnClick() }) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Back"
                                )
                            }
                        },
                        title = {
                            Text("")
                        }

                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row (modifier = Modifier.padding(10.dp)){
                    Text(text = "INTRODUCTION TO  WEB DESIGN", fontWeight = FontWeight.ExtraBold)
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.pic5),
                        contentDescription = "design",
                        contentScale = ContentScale.Fit,
                        alpha = DefaultAlpha,
                        modifier = Modifier
                            .size(300.dp)
                            .border(5.dp, Color.White)


                    )
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(text = "The only course you need to learn web development and Backend Development .\n" +
                            "\n" +
                            "Click on the buttons to start learning each programming language !!!"
                        , fontFamily = FontFamily.Serif
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Button(onClick = {
                        navController.navigate(ROUTE_HTML)
                    },
                        modifier = Modifier.fillMaxWidth()){
                        Text(text = "HTML",
                            color = Color.Magenta,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Monospace
                        )}

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Button(onClick = {
                        navController.navigate(ROUTE_CSS)
                    },
                        modifier = Modifier.fillMaxWidth()){
                        Text(text = "CSS",
                            color = Color.Magenta,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Monospace
                        )}

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Button(onClick = {
                        navController.navigate(ROUTE_BOOTSTRAP)
                    },
                        modifier = Modifier.fillMaxWidth()){
                        Text(text = "BOOTSTRAP",
                            color = Color.Magenta,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Monospace
                        )}

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {Button(onClick = {
                    navController.navigate(ROUTE_PYTHON)
                },
                    modifier = Modifier.fillMaxWidth()){
                    Text(text = "PYTHON",
                        color = Color.Magenta,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.Monospace
                    )}

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {Button(onClick = {
                    navController.navigate(ROUTE_DJANGO)
                },
                    modifier = Modifier.fillMaxWidth()){
                    Text(text = "DJANGO",
                        color = Color.Magenta,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.Monospace
                    )}

                }

            }
        }
    )
}
@Preview
@Composable
fun WebPreview() {
    WebDesign(rememberNavController())
}