package br.com.foodcommander.service

import br.com.foodcommander.models.Product
import br.com.foodcommander.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(val repository: ProductRepository) {
    fun createProduct(product: Product): Product = repository.insert(product)

}
