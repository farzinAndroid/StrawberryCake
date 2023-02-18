package com.farzin.strawberrycake.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farzin.strawberrycake.ui.theme.Shapes
import com.farzin.strawberrycake.ui.theme.lightGray
import com.farzin.strawberrycake.R
import com.farzin.strawberrycake.ui.theme.pink


@Composable
fun ServingCalc() {

    var value by remember {
        mutableStateOf(0)
    }

    Row(modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 8.dp)
        .background(lightGray)
        .padding(horizontal = 16.dp)
        .clip(Shapes.small),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Text(text = "Serving",
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .weight(1f)
        )


        CircularButton(iconRes = R.drawable.ic_minus, elevation = null, color = pink){
            if (value > 0){
                value--
            }

        }
        Text(text = "$value",
            modifier = Modifier
                .padding(16.dp),
            fontWeight = FontWeight.Medium
        )

        CircularButton(iconRes = R.drawable.ic_plus, elevation = null, color = pink){
            value ++
        }

    }
}