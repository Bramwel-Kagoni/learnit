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
fun Django() {
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
                        painter = painterResource(id = R.drawable.pic6),
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
                    Text(text = "INTRODUCTION TO  DJANGO", fontWeight = FontWeight.ExtraBold)

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(text = "Django is a back-end server side web framework.\n" +
                            "\n" +
                            "Django is free, open source and written in Python.\n" +
                            "\n" +
                            "Django makes it easier to build web pages using Python.\n" +
                            "\n" +
                            "What is Django?\n" +
                            "\n" +
                            "Django is a Python framework that makes it easier to create web sites using Python.\n" +
                            "\n" +
                            "Django takes care of the difficult stuff so that you can concentrate on building your web applications.\n" +
                            "\n" +
                            "Django emphasizes reusability of components, also referred to as DRY (Don't Repeat Yourself), and comes with ready-to-use features like login system, database connection and CRUD operations (Create Read Update Delete).\n" +
                            "\n" +
                            "How does Django Work?\n" +
                            "\n" +
                            "Django follows the MVT design pattern (Model View Template).\n" +
                            "\n" +
                            "Model - The data you want to present, usually data from a database.\n" +
                            "View - A request handler that returns the relevant template and content - based on the request from the user.\n" +
                            "Template - A text file (like an HTML file) containing the layout of the web page, with logic on how to display the data.\n" +
                            "\n" +
                            "This initial topic serves as a starting point for learners to familiarize themselves with  basic concepts of Django as we advance."
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
fun DjangoPreview() {
    Django()
}