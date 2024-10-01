package com.bramwel.learnit.ui.theme.scaffold



import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.navigtion.ROUTE_HELP
import com.bramwel.learnit.navigtion.ROUTE_PROFILE
import com.bramwel.learnit.navigtion.ROUTE_WEBDESIGNING


@SuppressLint("AutoboxingStateCreation")
@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        modifier= Modifier.windowInsetsPadding(WindowInsets.systemBars)
    )
    {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Create,"")
        },
            label = { Text(text = "Learn") },
            selected = (selectedIndex.value == 1),
            onClick = {
                navController.navigate(ROUTE_WEBDESIGNING)

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,"")
        },
            label = { Text(text = "Profile") },
            selected = (selectedIndex.value == 2),
            onClick = {
                navController.navigate(ROUTE_PROFILE)

            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Call,"")
        },
            label = { Text(text = "Help") },
            selected = (selectedIndex.value == 2),
            onClick = {
                navController.navigate(ROUTE_HELP)

            })
    }
}

@Preview
@Composable
 fun Prev(){
    BottomBar(navController = rememberNavController())
}