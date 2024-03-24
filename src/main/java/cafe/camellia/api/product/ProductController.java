package cafe.camellia.api.product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController implements ProductInterface{
    @PostMapping("/")
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product getProduct() {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product deleteProduct(String id) {
        return null;
    }
}
