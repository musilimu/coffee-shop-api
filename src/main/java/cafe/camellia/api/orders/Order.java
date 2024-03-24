package cafe.camellia.api.orders;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Order {
    @Id
    private String id;
    private String productId;
    private String userId;
    private boolean isPaid;
    private LocalDateTime createdAt;
}
