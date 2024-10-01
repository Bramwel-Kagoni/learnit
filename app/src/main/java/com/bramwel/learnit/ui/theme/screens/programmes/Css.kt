package com.bramwel.learnit.ui.theme.screens.programmes



import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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
import com.bramwel.learnit.R
import com.bramwel.learnit.ui.theme.screens.profile.onBtnClick


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Css() {
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
                        painter = painterResource(id = R.drawable.pic9),
                        contentDescription = "design",
                        contentScale = ContentScale.Fit,
                        alpha = DefaultAlpha,
                        modifier = Modifier
                            .size(300.dp)
                            .border(5.dp, Color.White)


                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row (modifier = Modifier.padding(10.dp)){
                    Text(text = "INTRODUCTION TO  CSS", fontWeight = FontWeight.ExtraBold)

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row (modifier = Modifier.padding(20.dp)) {
                    Text(text = "CSS is the language we use to style an HTML document.\n" +
                            "\n" +
                            "CSS describes how HTML elements should be displayed:\n" +
                            "\n" +
                            "CSS stands for Cascading Style Sheets\n" +
                            "CSS describes how HTML elements are to be displayed on screen, paper, or in other media\n" +
                            "CSS saves a lot of work. It can control the layout of multiple web pages all at once\n" +
                            "External stylesheets are stored in CSS file.\n" +
                            "\n" +
                            "Why Use CSS?\n" +
                            "\n" +
                            "CSS is used to define styles for your web pages, including the design, layout and variations in display for different devices and screen sizes.\n" +
                            "\n" +
                            "CSS Saves a Lot of Work!\n" +
                            "\n" +
                            "The style definitions are normally saved in external .css files.\n" +
                            "\n" +
                            "With an external stylesheet file, you can change the look of an entire website by changing just one file!\n" +
                            "\n" +
                            "This initial topic serves as a starting point for learners to familiarize themselves with the syntax and basic concepts of Css, laying the groundwork for exploring more advanced concepts."
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
fun CssPreview() {
    Css()
}