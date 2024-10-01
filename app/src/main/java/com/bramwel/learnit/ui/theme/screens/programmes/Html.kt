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
fun Html() {
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
                        painter = painterResource(id = R.drawable.pic8),
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
                    Text(text = "INTRODUCTION TO  HTML", fontWeight = FontWeight.ExtraBold)

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(text = "HTML is the standard markup language for Web pages.With HTML you can create your own Website.With HTML you can create your own Website.:\n" +
                            "\n" +
                            "All HTML documents must start with a document type declaration: <!DOCTYPE html>.\n" +
                            "\n" +
                            "The HTML document itself begins with <html> and ends with </html>.The visible part of the HTML document is between <body> and </body>\n" +
                            "\n" +
                            "HTML headings are defined with the <h1> to <h6> tags.\n" +
                            "\n" +
                            "<h1> defines the most important heading. <h6> defines the least important heading:HTML paragraphs are defined with the <p> tag:\n" +
                            "\n" +
                            "HTML links are defined with the <a> tag:The link's destination is specified in the href attribute. \n" +
                            "\n" +
                            "The link's destination is specified in the href attribute. \n" +
                            "\n" +
                            "Attributes are used to provide additional information about HTML elements.\n" +
                            "\n" +
                            "HTML images are defined with the <img> tag.\n" +
                            "\n" +
                            "The source file (src), alternative text (alt), width, and height are provided as attributes:\n" +
                            "\n" +
                            "This initial topic serves as a starting point for learners to familiarize themselves with basic concepts of HTML, laying the groundwork for exploring more advanced concepts."
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
fun HtmlPreview() {
    Html()
}