package cafe.camellia.api.product;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Product {
    @Id
    private String id;
    @Indexed(unique = true)
    private String productName;
    private float price;
    private float discount;
    private List<String> ingredients;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
