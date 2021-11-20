package br.com.daniel.catalog.product.adapter.out.persistence;

import br.com.daniel.catalog.product.application.port.out.LoadProductPort;
import br.com.daniel.catalog.product.application.port.out.SaveProductPort;
import br.com.daniel.catalog.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements LoadProductPort, SaveProductPort {

    private final ProductRepository productRepository;
    private final ProductMapper orderMapper;

    @Override
    public Product loadProduct(String id) {
        ProductDocument productDocument = productRepository.findById(id).get();
        return orderMapper.productDocumentToProduct(productDocument);
    }

    @Override
    public Product saveProduct(Product product) {
        ProductDocument document = orderMapper.productToProductDocument(product);
        ProductDocument savedDocument = productRepository.save(document);
        product.setId(savedDocument.getId());
        return product;
    }
}
