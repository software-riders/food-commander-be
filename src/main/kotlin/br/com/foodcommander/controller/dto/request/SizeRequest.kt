package br.com.foodcommander.controller.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

data class SizeRequest(

    @field:NotBlank(message = "Descrição é um campo obrigatório")
    val name: String,

    @field:NotNull(message = "Preço é um campo obrigatório")
    val price: BigDecimal,

    val description: String?
)
