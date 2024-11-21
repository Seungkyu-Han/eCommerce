package com.seungkyu.product.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "keywords")
data class Keyword(

    var keyword: String,

    var productGroups: MutableList<ObjectId>
)
