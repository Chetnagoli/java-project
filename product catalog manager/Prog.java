import java.util.Collections;
import java.util.List;

public class Prog { // Your preferred class name
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product p1 = new Product("Laptop", "Electronics", 1200.00);
        Product p2 = new Product("Headphones", "Accessories", 100.00);
        Product p3 = new Product("Smartphone", "Electronics", 800.00);

        catalog.addProduct(p1);
        catalog.addProduct(p2);
        catalog.addProduct(p3);

        // Default sorting by price
        List<Product> products = catalog.getProducts();
        Collections.sort(products);
        System.out.println("Products sorted by price: " + products);

        // Sorting by name
        Collections.sort(products, new ProductNameComparator());
        System.out.println("Products sorted by name: " + products);

        // Sorting by category
        Collections.sort(products, new ProductCategoryComparator());
        System.out.println("Products sorted by category: " + products);

        // Cloning a product
        Product clonedProduct = p1.clone();
        System.out.println("Cloned Product: " + clonedProduct);

        // Iterating through the catalog
        System.out.println("Iterating through product catalog:");
        for (Product product : catalog) {
            System.out.println(product);
        }
    }
}
