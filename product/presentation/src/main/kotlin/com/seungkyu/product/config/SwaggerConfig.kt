package com.seungkyu.product.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.security.SecurityRequirement
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
class SwaggerConfig {

    @Bean
    fun openApi(): OpenAPI {

        val securityScheme: SecurityScheme = SecurityScheme()
            .type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
            .`in`(SecurityScheme.In.HEADER).name("Authorization")

        val securityRequirement: SecurityRequirement = SecurityRequirement().addList("Bearer")

        return OpenAPI()
            .components(Components())
            .info(
                Info().apply {
                    title = "Product API"
                    description = "Product Swagger"
                    version = "1.0.0"
                }
            )
            .components(
                Components().addSecuritySchemes("Bearer", securityScheme)
            )
            .security(
                Collections.singletonList(securityRequirement)
            )
    }
}