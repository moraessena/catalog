package br.com.daniel.catalog.product.application.service;

import br.com.daniel.catalog.product.application.port.in.GetProductDetailQuery;
import br.com.daniel.catalog.product.application.port.out.LoadProductPort;
import br.com.daniel.catalog.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductDetailService implements GetProductDetailQuery {

    private final LoadProductPort loadProductPort;

    @Override
    public Product getProductDetail(String id) {
        return loadProductPort.loadProduct(id);
    }
}
