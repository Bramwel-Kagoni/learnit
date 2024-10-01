package com.bramwel.learnit.ui.theme.screens.programmes




import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.R
import com.bramwel.learnit.ui.theme.screens.profile.onBtnClick


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Bootstrap(navController: NavHostController){
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
                        painter = painterResource(id = R.drawable.pic4),
                        contentDescription = "design",
                        contentScale = ContentScale.Fit,
                        alpha = DefaultAlpha,
                        modifier = Modifier
                            .size(300.dp)
                            .border(5.dp, Color.White,)


                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row  (modifier = Modifier.padding(10.dp)){
                    Text(text = "INTRODUCTION TO  BOOTSTRAP", fontWeight = FontWeight.ExtraBold)

                }
                Spacer(modifier = Modifier.height(5.dp))

                Row (modifier = Modifier.padding(20.dp)){
                    Text(text = "We are currently using bootstrap 5 which is the latest version.which is the most popular HTML, CSS, and JavaScript framework for creating responsive, mobile-first websites.\n" +
                            "\n" +
                            "What is BootsTrap ???.\n" +
                            "\n" +
                            "Bootstrap is a free front-end framework for faster and easier web development\n" +
                            "Bootstrap includes HTML and CSS based design templates for typography, forms, buttons, tables, navigation, modals, image carousels and many other, as well as optional JavaScript plugins\n" +
                            "Bootstrap also gives you the ability to easily create responsive designs.\n" +
                            "\n" +
                            "How to use Bootstrap ???\n" +
                            "\n" +
                            "There are two ways to start using Bootstrap 5 on your own web site.\n" +
                            "\n" +
                            "You can:\n" +
                            "\n" +
                            "Include Bootstrap 5 from a CDN\n" +
                            "Download Bootstrap 5 from getbootstrap.com."
                        ,

                        fontFamily = FontFamily.Serif
                    )

                }

            }
        }

        )

}


@Preview
@Composable
fun BootstrapPreview() {
    Bootstrap(rememberNavController())
}