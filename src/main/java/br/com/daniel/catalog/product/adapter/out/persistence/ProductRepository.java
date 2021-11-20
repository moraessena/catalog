package br.com.daniel.catalog.product.adapter.out.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends MongoRepository<ProductDocument, String> {
}
