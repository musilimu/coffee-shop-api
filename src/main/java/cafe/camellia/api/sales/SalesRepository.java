package cafe.camellia.api.sales;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesRepository extends MongoRepository<Sales, String> {
}
