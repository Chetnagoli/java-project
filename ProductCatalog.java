import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCatalog implements Iterable<Product> {
    private List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public List<Product> getProducts() {
        return products;
    }
}
