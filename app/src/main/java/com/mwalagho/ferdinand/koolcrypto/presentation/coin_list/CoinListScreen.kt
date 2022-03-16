package com.mwalagho.ferdinand.koolcrypto.presentation.coin_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mwalagho.ferdinand.koolcrypto.presentation.Screen
import com.mwalagho.ferdinand.koolcrypto.presentation.coin_list.components.CoinListItem


@Composable
fun CoinListScreen(
    navController: NavController, viewModel: CoinListViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.coins) { coin ->
                CoinListItem(coin = coin, onItemClicked = {
                    navController.navigate(Screen.CoinDetailScreen.route + "/${it.id}")
                }
                )
            }
        }

        if(state.error.isNotBlank()) {
            Text(text = state.error, color = MaterialTheme.colors.error, textAlign = TextAlign.Center)
        }
    }


}