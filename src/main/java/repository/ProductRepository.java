package repository;

import connection.JdbcConnection;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {

   public Connection connection= JdbcConnection.getConnection();


    public ProductRepository() throws SQLException {
    }
    public int save(Product product) throws SQLException {
        String query = "INSERT IN TO Product(name , createDate,categoryId,brandId) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,product.getName());
        preparedStatement.setString(2,product.getCreatDate());
        preparedStatement.setInt(3,product.getCategoryId());
        preparedStatement.setInt(4,product.getBrandId());
        int result = preparedStatement.executeUpdate();
        return result;



    }
}
