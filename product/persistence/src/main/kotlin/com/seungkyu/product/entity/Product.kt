package com.seungkyu.product.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "products")
data class Product(
    @Id
    var id: ObjectId? = null,
    var price: Int,

    var productGroupId: ObjectId
)