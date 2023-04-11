package br.com.foodcommander.controller

import br.com.foodcommander.controller.dto.ProductRequest
import br.com.foodcommander.models.Product
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
    fun postProduct(@RequestBody productRequest: ProductRequest): ResponseEntity<Product> {
        val product = service.createProduct(
                Product(null, productRequest.name, productRequest.description))

        return ResponseEntity.status(HttpStatus.CREATED).body(product)
    }
}