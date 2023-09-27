package repository;

import connection.JdbcConnection;
import entity.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BrandRepository {

    public Connection connection= JdbcConnection.getConnection();

    public BrandRepository() throws SQLException {
    }

    public int BrandRepository(Brand brand) throws SQLException {
        String query =" INSERT IN TO Brand(name,website,description) valus(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, brand.getName());
        preparedStatement.setString(2,brand.getWebSite());
        preparedStatement.setString(3,brand.getDescription());
        int result=preparedStatement.executeUpdate();
        return result;





    }
}
