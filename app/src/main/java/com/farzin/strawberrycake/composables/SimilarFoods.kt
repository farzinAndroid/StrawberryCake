package com.farzin.strawberrycake.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farzin.strawberrycake.ui.theme.lightGray
import com.farzin.strawberrycake.R
import com.farzin.strawberrycake.ui.theme.pink


@Composable
fun SimilarFoods() {

    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        SimilarFoodsItem(
            img = painterResource(id = R.drawable.hot_dog),
            name = stringResource(R.string.hotDog),
            desc = stringResource(R.string.fast_food),
            price = stringResource(id = R.string.t_12))

        SimilarFoodsItem(
            img = painterResource(id = R.drawable.doughnut),
            name = stringResource(R.string.donat),
            desc = stringResource(R.string.desserts),
            price = stringResource(id = R.string.t_5))

        SimilarFoodsItem(
            img = painterResource(id = R.drawable.hamburger),
            name = stringResource(R.string.hamburger),
            desc = stringResource(id = R.string.fast_food),
            price =stringResource(id = R.string.t_20))

        SimilarFoodsItem(
            img = painterResource(id = R.drawable.apple_pie),
            name = stringResource(R.string.apple_pie),
            desc = stringResource(R.string.desserts),
            price = stringResource(id = R.string.t_30))
    }


}


@Composable
fun SimilarFoodsItem(
    img: Painter,
    name: String,
    desc: String,
    price: String,
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .width(170.dp)
            .height(250.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .background(lightGray)
                .clip(RoundedCornerShape(16.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 75.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text(
                    text = desc,
                    color = Color.Gray,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(top = 8.dp)
                )

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = price,
                        color = pink,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 16.sp
                    )

                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                        contentPadding = PaddingValues(),
                        colors = ButtonDefaults.buttonColors(contentColor = Color.White, backgroundColor = pink),
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .fillMaxHeight()
                            .width(38.dp)
                    ) {
                        Icon(Icons.Default.Add, contentDescription = "")
                    }
                }
            }
        }

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = img,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
            )
        }
    }
}