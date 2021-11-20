package br.com.daniel.catalog.product.adapter.out.persistence;

import br.com.daniel.catalog.product.domain.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProductMapper {

    public Product productDocumentToProduct(ProductDocument document) {
        return Product.builder()
                .id(document.getId())
                .description(document.getDescription())
                .price(document.getPrice())
                .build();
    }

    public ProductDocument productToProductDocument(Product product) {
        return new ProductDocument(
                product.getId(),
                product.getDescription(),
                product.getPrice(),
                product.getStockQuantity(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }

}
