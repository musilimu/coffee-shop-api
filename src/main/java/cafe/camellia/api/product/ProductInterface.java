package cafe.camellia.api.product;

import java.util.List;

public interface ProductInterface {
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product getProduct();
    public List<Product> getProducts();
    public Product deleteProduct(String id);
}
