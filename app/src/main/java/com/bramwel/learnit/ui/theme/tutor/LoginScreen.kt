package com.example.authdemo.ui.theme.Screens.tutor

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.R
import com.bramwel.learnit.data.AuthViewModel


@Composable
fun LoginScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    val context= LocalContext.current
    Column (
        modifier = modifier
            .fillMaxSize()
        .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.login),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxWidth(0.25f)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "login",
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp

            )
        }
        MyTextField(
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = Icons.Outlined.Email,
            trailingIcon =Icons.Outlined.Check,
            textFieldStates = TextFieldState(),
            hint = "Email",
            keyboardType = KeyboardType.Email,
            value = email,
            onValueChange = { email=email},

        )

        MyTextField(
            modifier = Modifier.fillMaxWidth(), leadingIcon = Icons.Outlined.Lock,
            trailingText = "Forgot?",
            textFieldStates = TextFieldState(),
            hint = "Password",
            isPassword = true,
            value = pass,
            keyboardType = KeyboardType.Password,
            onValueChange = { pass = pass }
        )

        OutlinedButton(
            onClick = {
                val mylogin= AuthViewModel(navController, context )
                mylogin.login(email.text.trim(),pass.text.trim())
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "login",
                fontSize = 17.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
        Text(
            text = "Or sign with....",
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .alpha(0.5f)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
            ){

            AuthOption(image = R.drawable.google)
            AuthOption(image = R.drawable.facebook)
            AuthOption(
                image = R.drawable.apple,
                tint = MaterialTheme.colorScheme.onBackground
                )
        }
        Row (
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Don't have an account.",
                fontSize = 14.sp,
                )

            Text(
                text = "Register",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable {  }
            )
        }
        Spacer(modifier = Modifier.height(1.dp))
        Spacer(modifier = Modifier.height(1.dp))
    }
}


@Preview
@Composable
fun PrevLoginScreen(){
    LoginScreen(rememberNavController())
}





