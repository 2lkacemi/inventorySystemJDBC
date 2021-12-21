import model.Supplier;
import service.ProductService;
import service.SupplierService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        ProductService productService = new ProductService();
        SupplierService supplierService = new SupplierService();

        Supplier supplier1 = new Supplier("nawar_shop", "casablanca");
        Supplier supplier2 = new Supplier("ahlam_shop", "rabat");

//        supplierService.addSupplier(supplier1);
//        System.out.println(supplierService.getSupplier(5));
//        supplierService.updateSupplier(3,supplier2);
//        supplierService.deleteSupplier(4);

//        Product product = new Product("gucci254", 5.00, 5);
//        Product product1 = new Product("adidas554", 2.00, 3);
//
//        productService.addProduct(product1);
        productService.getAllProducts();


    }
}
