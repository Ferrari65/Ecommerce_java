package com.Ecommerce.checkout.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI checkoutApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Ecommerce checkout API")
                        .description("API responsáver pelo fluxo de checkout do sistema de E-commerce ")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Yasmin Ferrari")
                                .email( "yasmin.ferrari365@gmail.com")
                                .url("https://github.com/Ferrari65"))
                );
    }

}
