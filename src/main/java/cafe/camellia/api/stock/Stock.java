package cafe.camellia.api.stock;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Stock {
    @Id
    private String id;
    private String productId;
    private float costPrice;
    private String itemName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
