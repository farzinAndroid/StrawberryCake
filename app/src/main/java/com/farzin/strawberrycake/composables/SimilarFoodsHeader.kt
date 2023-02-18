package com.farzin.strawberrycake.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farzin.strawberrycake.R
import com.farzin.strawberrycake.ui.theme.darkGray
import com.farzin.strawberrycake.ui.theme.pink


@Composable
fun SimilarFoodsHeader() {

    Row(modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 8.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = stringResource(R.string.similar_foods), fontWeight = FontWeight.Bold)
            Text(text = stringResource(R.string.you_might_like),
                fontWeight = FontWeight.Bold,
                color = darkGray,
                modifier = Modifier
                    .padding(vertical = 8.dp)
            )
        }

        Button(
            elevation = null,
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = pink
            ),
        ) {
            Text(text = stringResource(R.string.show_more))
            Icon(painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null)
        }
    }
}