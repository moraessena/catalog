package br.com.daniel.catalog.product.adapter.in.web;

import br.com.daniel.catalog.product.application.port.in.CreateProductCommand;
import br.com.daniel.catalog.product.application.port.in.CreateProductUseCase;
import br.com.daniel.catalog.product.application.port.in.GetProductDetailQuery;
import br.com.daniel.catalog.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductRestController {

    private final CreateProductUseCase createProductUseCase;
    private final GetProductDetailQuery getProductDetailQuery;

    @GetMapping("/{id}")
    Product getProductDetail(@PathVariable("id") String id) {
        return getProductDetailQuery.getProductDetail(id);
    }

    @PostMapping
    Product createProduct(@RequestBody CreateProductCommand command) {
        return createProductUseCase.createProduct(command);
    }

}
