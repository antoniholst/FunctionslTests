package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;

public class DataVerificationTest {
    private static Connection connection;
    private static ResultSet result;
    private static Statement statement;

    @BeforeTest
    public void initiateConnection() throws SQLException{
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost/my_database",
                "antoninakholostova",
                "111"
        );
    }

    public void executeQuery(String query) throws SQLException{
        statement = connection.createStatement();
        result= statement.executeQuery(query);
    }

    @Test
    public void verifyOrderDetails() throws SQLException{
        executeQuery("select * from orders where order_id='PR123'");
        while (result.next()){
            assertEquals("1", result.getString("Quantity"));
            assertEquals("PR123", result.getString("order_id"));
        }
    }

    @AfterTest
    public void closeConnection() throws SQLException{
        result.close();
        statement.close();
    }
}
