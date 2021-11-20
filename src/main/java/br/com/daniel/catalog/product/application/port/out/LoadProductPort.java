package br.com.daniel.catalog.product.application.port.out;


import br.com.daniel.catalog.product.domain.Product;

public interface LoadProductPort {

    Product loadProduct(String id);

}
