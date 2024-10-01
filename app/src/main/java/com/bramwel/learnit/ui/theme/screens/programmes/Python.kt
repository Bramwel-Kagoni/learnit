package com.bramwel.learnit.ui.theme.screens.programmes

import android.annotation.SuppressLint
import com.bramwel.learnit.R
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.ui.theme.screens.profile.onBtnClick


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Python(navController: NavHostController){
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
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.pic7),
                        contentDescription = "design",
                        contentScale = ContentScale.Fit,
                        alpha = DefaultAlpha,
                        modifier = Modifier
                            .size(300.dp)
                            .border(5.dp, Color.White,)


                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row (modifier = Modifier.padding(10.dp)){
                    Text(text = "INTRODUCTION TO  PYTHON", fontWeight = FontWeight.ExtraBold)

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row (modifier = Modifier.padding(20.dp)){
                    Text(text = "Python is a popular programming language. It was created by Guido van Rossum, and released in 1991.\n" +
                            "\n" +
                            "It is used for:\n" +
                            "\n" +
                            "web development (server-side),\n" +
                            "software development,\n" +

                            "\n" +
                            "What can Python do?\n" +
                            "Python can be used on a server to create web applications.\n" +
                            "Python can be used alongside software to create workflows.\n" +
                            "Python can connect to database systems. It can also read and modify files.\n"+
                            "\n" +
                            "Data Types: Overview of primitive data types such as Int, Double, Boolean, and Char, as well as more complex types like String and Arrays.\n" +
                            "\n" +
                            "Basic Control Flow: Introduction to control flow structures such as if-else expressions, when expressions (Kotlin's alternative to switch statements), and loops (for and while loops).\n" +
                            "\n" +
                            "Functions: Basic understanding of declaring and calling functions, including function parameters and return types.\n" +
                            "\n" +
                            "This initial topic serves as a starting point for learners to familiarize themselves with the  basic concepts of Python, laying the groundwork for exploring more advanced concepts."
                        ,

                        fontFamily = FontFamily.Serif
                    )

                }

            }
        }
    )
}

@Preview()
@Composable
fun PythonPreview() {
    Python(rememberNavController())
}