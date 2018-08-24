package com.liberty.product.Product;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/product")
@Component
public class ProductController {

    @GET
    @Produces(APPLICATION_JSON)
    public Response getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("name", 123));
        return Response
               .ok()
                .entity(products)
                .build();
    }
}
