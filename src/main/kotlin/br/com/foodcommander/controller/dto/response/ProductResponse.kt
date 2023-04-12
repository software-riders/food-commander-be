package br.com.foodcommander.controller.dto.response

data class ProductResponse(
        val id: String,
        val name: String,
        val description: String,
        val sizes: List<SizeResponse>,
        val urlPicture: String
)
