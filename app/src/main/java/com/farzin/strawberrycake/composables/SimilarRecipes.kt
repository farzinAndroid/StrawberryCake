package com.farzin.strawberrycake.composables


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farzin.strawberrycake.ui.theme.Shapes
import com.farzin.strawberrycake.R


@Composable
fun SimilarRecipes() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)

    ) {
        SimilarRecipesItems(
            img = painterResource(id = R.drawable.cheesecake),
            name = stringResource(R.string.cheese_cake),
            category = stringResource(id = R.string.desserts),
            exp = stringResource(R.string.beginner),
            baseColor = Color(0xFFcbe8e0),
            expColor = Color(0xff8cd694))

        SimilarRecipesItems(
            img = painterResource(id = R.drawable.cupcake),
            name = stringResource(R.string.cup_cake),
            category = stringResource(id = R.string.desserts),
            exp = stringResource(R.string.ex_2_y),
            baseColor = Color(0xFFe8d0ff),
            expColor = Color(0xff7c89ff))

        SimilarRecipesItems(
            img = painterResource(id = R.drawable.berrycake),
            name = stringResource(R.string.berry_cake),
            category = stringResource(id = R.string.desserts),
            exp = stringResource(id = R.string.beginner),
            baseColor = Color(0xFFfae9d4),
            expColor = Color(0xff8cd694))
    }
}


@Composable
fun SimilarRecipesItems(
    img: Painter,
    name: String,
    category: String,
    exp: String,
    baseColor: Color,
    expColor: Color,
) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(120.dp)
        .padding(bottom = 16.dp)
    ) {

        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxSize()

        ) {
            Column(modifier = Modifier
                .width(120.dp)
                .height(120.dp)
                .clip(CircleShape)
                .background(baseColor),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painter = img,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .weight(0.6f)
                .fillMaxHeight()
                .padding(16.dp)

        ) {
            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(0.33f)
            )

            Text(
                text = category,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(0.33f)
            )

            Row(modifier = Modifier
                .weight(0.33f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(expColor)
                ) {}

                Text(
                    text = exp,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .weight(0.1f)
                .fillMaxSize()
                .padding(top = 16.dp)

        ) {
            Icon(imageVector =  Icons.Filled.KeyboardArrowRight, contentDescription ="" )
        }
    }
}