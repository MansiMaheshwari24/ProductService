package com.ecommerce.productservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class ApplicationConfig {
    public RestTemplate getRestTemplate()
    {
        @Bean
        // spring will create special object
        return new RestTemplate();
    }
}
