package com.bramwel.learnit.ui.theme.screens.profile



import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.R
import com.bramwel.learnit.R.drawable
import com.bramwel.learnit.navigtion.ROUTE_LOGIN
import com.bramwel.learnit.navigtion.ROUTE_WEBDESIGNING

fun onBtnClick() {
    TODO("Not yet implemented")
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold(
        content= {
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
                            Text(
                                text = " Edit Profile",
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Clip,
                                modifier = Modifier.padding(10.dp)
                            )
                        }

                    )
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(start = 50.dp, top = 5.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pic2),
                        contentDescription = "profile",
                        contentScale = ContentScale.Fit,
                        alpha = DefaultAlpha,
                        modifier = Modifier
                            .size(240.dp)
                            .border(5.dp, Color.White,)


                    )
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    OutlinedTextField(
                        value = text,
                        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "Email address") },
                        placeholder = { Text(text = "Enter your e-mail") },
                        modifier = Modifier.padding(start = 40.dp, top = 10.dp)
                    )


                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    OutlinedTextField(
                        value = text,
                        leadingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Password") },
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "Old Password") },
                        placeholder = { Text(text = "Password") },
                        modifier = Modifier.padding(start = 40.dp, top = 20.dp)
                    )

                }
                Spacer(modifier =Modifier.height(5.dp) )
                Row {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    OutlinedTextField(
                        value = text,
                        leadingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Password") },
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "New Password") },
                        placeholder = { Text(text = "Password") },
                        modifier = Modifier.padding(start = 40.dp, top = 20.dp)
                    )
                }
                Spacer(modifier = Modifier.height(40.dp))
                Row {
                    Text(text = "Log Out",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(start = 150.dp)

                            .clickable {
                                navController.navigate(ROUTE_LOGIN)
                            }
                    )

                }




            }
        }
    )

        }




@Preview
@Composable
fun Profileprev(){
    ProfileScreen(rememberNavController())
}


