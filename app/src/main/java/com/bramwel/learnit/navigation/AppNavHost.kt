package com.bramwel.learnit.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.ui.theme.screens.course.WebDesign
import com.bramwel.learnit.ui.theme.screens.help.HelplineScreen
import com.bramwel.learnit.ui.theme.screens.home.HomeScreen
import com.bramwel.learnit.ui.theme.screens.login.LoginScreen
import com.bramwel.learnit.ui.theme.screens.profile.ProfileScreen
import com.bramwel.learnit.ui.theme.screens.programmes.Bootstrap
import com.bramwel.learnit.ui.theme.screens.programmes.Css
import com.bramwel.learnit.ui.theme.screens.programmes.Django
import com.bramwel.learnit.ui.theme.screens.programmes.Html
import com.bramwel.learnit.ui.theme.screens.programmes.Python
import com.bramwel.learnit.ui.theme.screens.register.RegisterScreen
import com.bramwel.learnit.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {

    NavHost(navController = navController,
        modifier=modifier,
        startDestination = startDestination
    ){
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }

        composable(ROUTE_PROFILE){
            ProfileScreen(navController)
        }
        composable(ROUTE_HELP){
            HelplineScreen(navController)
        }
        composable(ROUTE_WEBDESIGNING){
            WebDesign(navController)
        }
        composable(ROUTE_BOOTSTRAP){
            Bootstrap(navController)
        }
        composable(ROUTE_CSS){
            Css()
        }
        composable(ROUTE_DJANGO){
            Django()
        }
        composable(ROUTE_HTML){
            Html()
        }
        composable(ROUTE_PYTHON){
            Python(navController)
        }
        composable(ROUTE_BOTTOMBAR){
            Python(navController)
        }
        composable(ROUTE_COURSESOFFERED){
            Python(navController)
        }
        composable(ROUTE_TOPBAR){
            Python(navController)
        }

    }

}





