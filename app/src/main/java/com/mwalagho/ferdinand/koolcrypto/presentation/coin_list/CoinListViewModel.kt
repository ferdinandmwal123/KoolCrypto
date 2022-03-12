package com.mwalagho.ferdinand.koolcrypto.presentation.coin_list

import androidx.lifecycle.ViewModel
import com.mwalagho.ferdinand.koolcrypto.domain.use_case.get_coin.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase
) : ViewModel(){

}