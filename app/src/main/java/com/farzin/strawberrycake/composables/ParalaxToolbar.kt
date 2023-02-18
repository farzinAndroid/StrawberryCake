package com.farzin.strawberrycake

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import com.farzin.strawberrycake.composables.CircularButton
import com.farzin.strawberrycake.ui.theme.darkGray
import com.farzin.strawberrycake.ui.theme.lightGray
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.statusBarsPadding
import kotlin.math.max
import kotlin.math.min

val collapsedAppBarHeight = 56.dp
val expandedAppBarHeight = 400.dp




@Composable
fun ParalaxToolbar(scrollState: LazyListState) {
    var likeState by remember {
        mutableStateOf(false)
    }

    val imageHeight = expandedAppBarHeight - collapsedAppBarHeight

    val maxOffset =
        with(LocalDensity.current) { imageHeight.roundToPx() } - LocalWindowInsets.current.systemBars.layoutInsets.top

    val offset = min(scrollState.firstVisibleItemScrollOffset, maxOffset)

    val offsetProgress = max(0f, offset * 3f - 2f * maxOffset) / maxOffset

    TopAppBar(
        contentPadding = PaddingValues(),
        backgroundColor = Color.White,
        modifier = Modifier
            .height(
                expandedAppBarHeight
            )
            .offset { IntOffset(x = 0, y = -offset) },
        elevation = if (offset == maxOffset) 4.dp else 0.dp
    ) {

        Column {

            Box(
                modifier = Modifier
                    .height(imageHeight)
                    .graphicsLayer {
                        alpha = 1f - offsetProgress
                    }

            ) {

                Image(
                    painter = painterResource(id = R.drawable.strawberry_pie_1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colorStops = arrayOf(
                                    Pair(0.4f, Color.Transparent),
                                    Pair(1f, Color.White)
                                )
                            )
                        )
                )

                Row(modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.Bottom
                ) {

                    Text(
                        text = "Desert",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(lightGray)
                            .clip(RoundedCornerShape(4.dp))
                            .padding(vertical = 6.dp, horizontal = 16.dp)

                    )
                }

            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(collapsedAppBarHeight),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Strawberry Cake",
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    modifier = Modifier
                        .padding(horizontal = (16 + 28 * offsetProgress).dp)
                        .scale(1f - 0.25f * offsetProgress)
                )
            }
        }


    }


    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .height(collapsedAppBarHeight)
            .padding(horizontal = 16.dp)
            .statusBarsPadding()
    ) {

        CircularButton(
            iconRes = R.drawable.ic_arrow_back,
        )

        CircularButton(
            iconRes = R.drawable.fav,
        ){

        }

    }
}