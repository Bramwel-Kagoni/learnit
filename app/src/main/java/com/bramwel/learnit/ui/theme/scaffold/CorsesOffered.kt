package com.bramwel.learnit.ui.theme.scaffold



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bramwel.learnit.R
import com.bramwel.learnit.navigation.ROUTE_HOME
import com.bramwel.learnit.navigation.ROUTE_LOGIN


@Composable
fun CoursesOffered(navController: NavHostController) {



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Offered Course",
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(16.dp)
                .background(Color(0x30808080), RoundedCornerShape(16.dp))
                .clip(RoundedCornerShape(26.dp))
        ){
            Column{

                Row {

                    Image(
                        painter = painterResource(R.drawable.pic1),
                        contentDescription = "Round corner image", modifier = Modifier.fillMaxWidth()



                    )
                }


            }




        }

        Row {
            Text(text = "Introduction to Web Designing", fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .clickable {  navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    } }
            )

        }

        Row {
            Text(text = "By.   Tim Berner-Lee", fontWeight = FontWeight.Light, color = Color.Magenta)

        }




    }

}


@Preview
@Composable
fun Login() {
    CoursesOffered(rememberNavController())
}
