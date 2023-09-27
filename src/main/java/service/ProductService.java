package service;

import entity.Product;
import repository.ProductRepository;

import java.sql.SQLException;

public class ProductService {


    private ProductRepository productRepository =new ProductRepository();

    public ProductService() throws SQLException {
    }
    public int save(Product product) throws SQLException {
        return productRepository.save(product);
    }


}
