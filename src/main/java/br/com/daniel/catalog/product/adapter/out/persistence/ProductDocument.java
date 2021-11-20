package br.com.daniel.catalog.product.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("product")
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "description"})
public class ProductDocument {

    private String id;
    private String description;
    private Double price;
    private Long stockQuantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
