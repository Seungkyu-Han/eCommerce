package com.seungkyu.product.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.headers.Header
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/v1")
class LowestPriceController(

) {

    data class TestDto(
        @Schema(description = "테스트", example = "1234")
        val id: String
    )

    @PostMapping("/price")
    @Operation(summary = "hello!!")
    fun test(
        @RequestHeader(HttpHeaders.AUTHORIZATION) authorization: String,
        @RequestBody testDto: TestDto): Mono<String> {
        println(authorization)
        return Mono.just("hello")
    }
}