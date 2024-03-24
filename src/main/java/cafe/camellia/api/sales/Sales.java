package cafe.camellia.api.sales;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Sales {
    @Id
    private String id;
    private String productId;
    private float price;
    private LocalDateTime createdAt;
}
