package com.mwalagho.ferdinand.koolcrypto.domain.model

import com.mwalagho.ferdinand.koolcrypto.data.remote.dto.Tag
import com.mwalagho.ferdinand.koolcrypto.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId:String,
    val name:String,
    val description:String,
    val symbol: String,
    val rank: Int,
    val is_active: Boolean,
    val tags: List<String>,
    val teamMember: List<TeamMember>,
)
