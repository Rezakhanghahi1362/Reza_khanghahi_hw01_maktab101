package repository;

import connection.JdbcConnection;
import entity.Category;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryRepository {

    public Connection connection= JdbcConnection.getConnection();

    public CategoryRepository() throws SQLException {
    }

    public int seve(Category category) throws SQLException {
      String query ="INSERT IN TO Category(, name, description) valus(?,?,)";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,category.getName());
        preparedStatement.setString(1,category.getDescription());
        int result=preparedStatement.executeUpdate();
        return result;



    }


}
