package br.com.foodcommander.controller.dto.request

import jakarta.validation.constraints.NotBlank

data class ProductRequest(

    @field:NotBlank(message = "Nome é um campo obrigatório")
    val name: String,

    @field:NotBlank(message = "Descrição é um campo obrigatório")
    val description: String,

    val sizes: List<SizeRequest> = emptyList(),

    val urlPicture: String?
)
