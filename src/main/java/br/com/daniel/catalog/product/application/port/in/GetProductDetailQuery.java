package br.com.daniel.catalog.product.application.port.in;

import br.com.daniel.catalog.product.domain.Product;

@FunctionalInterface
public interface GetProductDetailQuery {

    Product getProductDetail(String id);

}
