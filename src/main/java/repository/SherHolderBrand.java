package repository;

import connection.JdbcConnection;

import java.sql.*;

public class SherHolderBrand {

    private static Connection connection;

    static {
        try {
            connection = JdbcConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public SherHolderBrand() throws SQLException{
        
    }
    public static int save(SherHolderBrand sherHolderBrand) throws SQLException{

        String query = "INSERT IN TO sherholderbrand(sherholderid,brandid) valus(?,?,)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        Object shareholderbrand = null;
        preparedStatement.setString(1, String.valueOf(shareholderbrand.getClass()));
        preparedStatement.setString(2, String.valueOf(shareholderbrand.getClass()));
        
        int result = preparedStatement.executeUpdate();
        return result ;
        
    }

}
    
    
        