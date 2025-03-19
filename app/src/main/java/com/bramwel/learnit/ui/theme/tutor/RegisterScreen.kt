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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
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
import com.example.authdemo.R
import com.example.authdemo.data.AuthViewModel
import com.example.authdemo.navigation.ROUTE_SCAFFOLD


@Composable
fun RegisterScreen(navController: NavHostController){
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.register),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxWidth(0.25f)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Register with ...",
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp

            )
        }

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
        Row(modifier = Modifier
            .align(Alignment.CenterHorizontally)) {

        Text(
            text = "Or ",
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .alpha(0.5f)
        )
            Spacer(modifier = Modifier.width(1.dp))

        Text(
            text = "Create an account.",
            fontSize = 14.sp,
        )
        }
        MyTextField(
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = Icons.Outlined.AccountCircle,
            textFieldStates = TextFieldState(),
            hint = "Name",
            keyboardType = KeyboardType.Text,
            value = name,
            onValueChange = {name = name}

        )

        MyTextField(
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = Icons.Outlined.Email,
            trailingIcon =Icons.Outlined.Check,
            textFieldStates = TextFieldState(),
            hint = "Email",
            keyboardType = KeyboardType.Email,
            value = email,
            onValueChange = {email = email}

        )

        MyTextField(
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = Icons.Outlined.Lock,
            textFieldStates = TextFieldState(),
            hint = "Password",
            isPassword = true,
            value = pass,
            onValueChange = {pass=pass},
            keyboardType = KeyboardType.Password

        )
        MyTextField(
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = Icons.Outlined.Lock,
            textFieldStates = TextFieldState(),
            hint = "Confirm Password",
            isPassword = true,
            value = confirmpass,
            onValueChange = {confirmpass=confirmpass},
            keyboardType = KeyboardType.Password

        )
        Row (
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            OutlinedButton(
                onClick = {
                val myregister= AuthViewModel(navController,context)
                myregister
                    .signup(email.text.trim(),
                        pass.text.trim(),
                        confirmpass.text.trim())
                          },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Register",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.clickable { navController.navigate(ROUTE_SCAFFOLD) }
                )

            }
        }

        Spacer(modifier = Modifier.height(1.dp))



















    }
}

@Preview
@Composable
fun PrevRegisterScreen(){
    RegisterScreen(rememberNavController())
}


