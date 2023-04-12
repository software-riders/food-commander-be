package br.com.foodcommander.controller.dto.response

import java.math.BigDecimal

data class SizeResponse(
    val name: String,
    val price: BigDecimal,
    val description: String?
)
