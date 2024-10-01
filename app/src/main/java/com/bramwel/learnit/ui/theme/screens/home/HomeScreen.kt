package com.bramwel.learnit.ui.theme.screens.home


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.R
import com.bramwel.learnit.ui.theme.scaffold.BottomBar
import com.bramwel.learnit.ui.theme.scaffold.CoursesOffered


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                },
            )
        },
        bottomBar = { BottomBar(navController = rememberNavController())        }
        ,
        modifier = Modifier.fillMaxSize()

    ){ innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {

            Spacer(modifier = Modifier.height(8.dp))

            Spacer(modifier = Modifier.height(8.dp))
            CoursesOffered(navController = navController)
            Spacer(modifier = Modifier.height(8.dp))

            Text(text ="WELCOME TO LEARN IT AS YOU START YOUR JOURNEY IN WEBDESIGNING. CLICK THE BOTTONS FOR  EFFICIENT USE." )

        }
    }
}




@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(rememberNavController())
}
