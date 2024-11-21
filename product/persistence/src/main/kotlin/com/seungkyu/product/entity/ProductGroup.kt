package com.seungkyu.product.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "product_groups")
data class ProductGroup(
    @Id
    var id: ObjectId? = null
)
