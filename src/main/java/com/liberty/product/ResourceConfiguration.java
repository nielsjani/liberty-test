package com.liberty.product;

import com.liberty.product.Product.ProductController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfiguration extends ResourceConfig {
    public ResourceConfiguration() {
        register(ProductController.class);
    }

    @Bean
    public ResourceConfiguration config() {
        return new ResourceConfiguration();
    }
}
