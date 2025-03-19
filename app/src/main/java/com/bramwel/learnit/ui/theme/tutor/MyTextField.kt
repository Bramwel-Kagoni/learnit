package com.example.authdemo.ui.theme.Screens.tutor

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
fun MyTextField(
    modifier: Modifier = Modifier,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    trailingText: String? = null,
    textFieldStates: TextFieldState,
    hint: String,
    isPassword: Boolean = false,
    onleadingClick: () -> Unit = {},
    onTrailingClick: () -> Unit = {},
    value: TextFieldValue,
    onValueChange: () -> Unit,
    keyboardType: KeyboardType,
) = if (isPassword){
    PasswordTextField(
        modifier = modifier,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        trailingText = trailingText,
        textFieldStates = textFieldStates,
        hint = hint,
        onleadingClick = onleadingClick,
        onTrailingClick = onTrailingClick
    )

} else {
    TextTextField(
        modifier = Modifier,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        trailingText = trailingText,
        textFieldStates = textFieldStates,
        hint = hint,
        KeyboardType = KeyboardType.Text,
        isPassword = isPassword,
        onleadingClick = onleadingClick,
        onTrailingClick = onTrailingClick,
    )
}

@Composable
fun TextTextField(
    modifier: Modifier = Modifier,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    trailingText: String? = null,
    textFieldStates: TextFieldState,
    hint: String,
    isPassword: Boolean = false,
    onleadingClick: () -> Unit = {},
    onTrailingClick: () -> Unit = {},
    KeyboardType: KeyboardType,
){
    BasicTextField(
        state = textFieldStates,
        textStyle = LocalTextStyle.current.copy(
            color = MaterialTheme.colorScheme.onBackground
        ),
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
        lineLimits = TextFieldLineLimits.SingleLine,
        cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
        modifier = modifier,
        decorator = { innerTextfield ->
            Column {
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                    )
                {
                    if (leadingIcon !=null){
                        Icon(
                            imageVector=leadingIcon,
                            modifier = Modifier.clickable { onleadingClick() },
                            contentDescription=null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.5f)
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                    }
                    Box (
                        modifier =Modifier.weight(1f))
                    {
                        if (textFieldStates.text.isEmpty()){
                            Text(
                                text = hint,
                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.7f),
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                    if(trailingIcon != null){
                        Icon(
                            imageVector=trailingIcon,
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .clickable { onTrailingClick() },
                            contentDescription=null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.5f)
                        )
                    } else  if(trailingText!=null){
                        Text(
                            text = trailingText,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(end = 4.dp)
                                .clickable { onTrailingClick() }

                        )

                    }


                }
                Spacer(modifier = Modifier.height(10.dp))

                HorizontalDivider(modifier = Modifier.alpha(0.7f))

        }
        }

    )
}






@Composable
fun PasswordTextField(
    modifier: Modifier = Modifier,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    trailingText: String? = null,
    textFieldStates: TextFieldState,
    hint:String,
    isPassword: Boolean = false,
    onleadingClick: () -> Unit = {},
    onTrailingClick: () -> Unit = {},
){
    BasicSecureTextField(
        state = textFieldStates,
        textObfuscationMode = TextObfuscationMode.Hidden,
        textStyle = LocalTextStyle.current.copy(
            color = MaterialTheme.colorScheme.onBackground
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
        modifier = modifier,
        decorator = { innerTextfield ->
            Column {
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    if (leadingIcon !=null){
                        Icon(
                            imageVector=leadingIcon,
                            modifier = Modifier.clickable { onleadingClick() },
                            contentDescription=null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.5f)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                    }
                    Box (
                        modifier =Modifier.weight(1f))
                    {
                        if (textFieldStates.text.isEmpty()){
                            Text(
                                text = hint,
                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.7f),
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                    if(trailingIcon != null){
                        Icon(
                            imageVector=trailingIcon,
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .clickable { onTrailingClick() },
                            contentDescription=null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.5f)
                        )
                    } else  if(trailingText!=null){
                        Text(
                            text = trailingText,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(end = 4.dp)
                                .clickable { onTrailingClick() }

                        )

                    }


                }
                Spacer(modifier = Modifier.height(10.dp))

                HorizontalDivider(modifier = Modifier.alpha(0.7f))

            }
        }

    )
}



