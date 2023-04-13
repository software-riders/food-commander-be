package br.com.foodcommander.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Product(
        @Id
        val id: String? = null,
        val name: String,
        val description: String,
        val sizes: List<Size>,
        val urlPicture: String
)
