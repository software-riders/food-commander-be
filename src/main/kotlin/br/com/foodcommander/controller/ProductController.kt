package br.com.foodcommander.controller

import br.com.foodcommander.controller.dto.request.ProductRequest
import br.com.foodcommander.controller.dto.response.ProductResponse
import br.com.foodcommander.controller.dto.response.SizeResponse
import br.com.foodcommander.models.Product
import br.com.foodcommander.models.Size
import br.com.foodcommander.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/products")
class ProductController(val service: ProductService) {

    @PostMapping
    fun postProduct(@RequestBody productRequest: ProductRequest): ResponseEntity<ProductResponse> {
        val product = service.createProduct(
                Product(
                    name = productRequest.name,
                    description = productRequest.description,
                    urlPicture = productRequest.urlPicture ?: "",
                    sizes = productRequest.sizes.map { Size(it.name, it.price, it.description) }
                )
        )

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(
                ProductResponse(
                    id = product.id!!,
                    name = product.name,
                    description = product.description,
                    urlPicture = product.urlPicture,
                    sizes = product.sizes.map { SizeResponse(it.name, it.price, it.description) }
                )
            )
    }
}