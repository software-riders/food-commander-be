package br.com.foodcommander.models

import java.math.BigDecimal

data class Size(
    val name: String,
    val price: BigDecimal,
    val description: String?
)