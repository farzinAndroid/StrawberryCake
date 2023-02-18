package com.farzin.strawberrycake.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import com.farzin.strawberrycake.expandedAppBarHeight


@Composable
fun Content(scrollState: LazyListState){


    LazyColumn(
        contentPadding = PaddingValues(top = expandedAppBarHeight),
        state = scrollState
    ){
        item {
            BasicInfo()
            Description()
            ServingCalc()
            AddToCartButton()


            SimilarFoodsHeader()
            SimilarFoods()

            SimilarRecipeHeader()
            SimilarRecipes()
        }
    }
}