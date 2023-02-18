package com.farzin.strawberrycake.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farzin.strawberrycake.ui.theme.pink
import com.farzin.strawberrycake.R


@Composable
fun BasicInfo() {

    Row(horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        ColumnInfo(icon = R.drawable.ic_clock, text ="35 min" )
        ColumnInfo(icon =R.drawable.ic_flame , text = "1200 kcal")
        ColumnInfo(icon = R.drawable.ic_star, text = "4.9")
    }
}


@Composable
fun ColumnInfo(@DrawableRes icon: Int, text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = pink,
            modifier = Modifier
                .height(24.dp)
        )

        Text(text = text,
            fontWeight = FontWeight.Bold
        )
    }
}