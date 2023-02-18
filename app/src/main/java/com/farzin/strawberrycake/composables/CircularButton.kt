package com.farzin.strawberrycake.composables

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.farzin.strawberrycake.ui.theme.Shapes
import com.farzin.strawberrycake.ui.theme.lightGray


@Composable
fun CircularButton(
    @DrawableRes iconRes: Int,
    color: Color = Color.Gray,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    onClick: () -> Unit = {},
) {
    Button(
        onClick = onClick,
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White, contentColor = color),
        shape = Shapes.small,
        elevation = elevation,
        modifier = Modifier
            .width(38.dp)
            .height(38.dp)
    ) {

        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            tint = color,
        )

    }
}

