package com.farzin.strawberrycake.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farzin.strawberrycake.R


@Composable
fun Description() {

    Text(text = stringResource(R.string.desc),
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .padding(16.dp)
    )
}