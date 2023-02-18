package com.farzin.strawberrycake.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import com.farzin.strawberrycake.ParalaxToolbar

@Composable
fun CookingScreen(){
    val scrollState = rememberLazyListState()

    Box {
        Content(scrollState = scrollState)
        ParalaxToolbar(scrollState = scrollState)

    }

}