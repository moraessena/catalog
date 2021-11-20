package br.com.daniel.catalog.product.adapter.in.web;

import br.com.daniel.catalog.product.application.port.in.CreateProductCommand;
import br.com.daniel.catalog.product.application.port.in.CreateProductUseCase;
import br.com.daniel.catalog.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductRestController {

    private final CreateProductUseCase createProductUseCase;

    @PostMapping
    Product createProduct(@RequestBody CreateProductCommand command) {
        return createProductUseCase.createProduct(command);
    }

}