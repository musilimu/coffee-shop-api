package cafe.camellia.api.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String phone;
    private String password;
    private String createdAt;
    private String updatedAt;
}
