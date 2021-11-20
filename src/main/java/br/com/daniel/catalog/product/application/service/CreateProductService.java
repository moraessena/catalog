package br.com.daniel.catalog.product.application.service;

import br.com.daniel.catalog.product.application.port.in.CreateProductCommand;
import br.com.daniel.catalog.product.application.port.in.CreateProductUseCase;
import br.com.daniel.catalog.product.application.port.out.SaveProductPort;
import br.com.daniel.catalog.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProductService implements CreateProductUseCase {

    private final SaveProductPort saveProductPort;

    @Override
    public Product createProduct(CreateProductCommand command) {
        Product product = Product.builder()
                .description(command.getProductDescription())
                .price(command.getPrice())
                .build();
        return saveProductPort.saveProduct(product);
    }
}
