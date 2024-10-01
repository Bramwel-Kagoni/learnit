package com.bramwel.learnit.ui.theme.scaffold

import android.annotation.SuppressLint
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
fun TopBarScreen(navcontroller:NavHostController){
    Scaffold(
        topBar={
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector= Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription ="back"
                        )
                        
                    }
                },

                title = { })
        },
        content={}

                )

}


@Preview
@Composable
fun TopBarPrev(){
    TopBarScreen(rememberNavController())
}