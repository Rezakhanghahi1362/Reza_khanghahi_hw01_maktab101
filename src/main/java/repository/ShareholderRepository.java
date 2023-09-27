package repository;

import connection.JdbcConnection;
import entity.Shareholder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShareholderRepository {

    public Connection connection = JdbcConnection.getConnection();


    public ShareholderRepository() throws SQLException {
    }
    public int save(Shareholder shareholder) throws SQLException {

        String query = "INSERT IN TO shareholder(name , phoneNumber, nationalCode) valus(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,shareholder.getName());
        preparedStatement.setString(2,shareholder.getPhoneNumber());
        preparedStatement.setString(3,shareholder.getNationalCode());
        int result = preparedStatement.executeUpdate();
             return result ;
    }
}
