package repository;

import connection.JdbcConnection;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {

    public Connection connection= JdbcConnection.getConnection();

    public UserRepository() throws SQLException {
    }

    public int save(User user) throws SQLException {

        String query = "INSERT IN TO USERS(name, username, email, password) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getUserName());
        preparedStatement.setString(3,user.getEmail());
        preparedStatement.setString(4,user.getPassword());
        int result=preparedStatement.executeUpdate();
        return result;
    }

}
