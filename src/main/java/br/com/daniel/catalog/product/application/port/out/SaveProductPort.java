package br.com.daniel.catalog.product.application.port.out;


import br.com.daniel.catalog.product.domain.Product;

@FunctionalInterface
public interface SaveProductPort {
    Product saveProduct(Product product);
}
