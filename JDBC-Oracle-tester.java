import java.sql.*;
public class DBConnTest {

    public static void main(String[] args) {

        Connection conn=null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            System.out.println("JDBC Driver Loading Success");

            long start = System.currentTimeMillis();

            conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1:1521:ORA", "db_user_id", "db_user_password");

            System.out.println("Connected..");

            long stop = System.currentTimeMillis();

            System.out.println("connected Time" + (stop - start) + " ms.");

            conn.close();

        } catch (ClassNotFoundException cnfe) {

            System.out.println("Not Found Class.."+cnfe.getMessage());

        } catch(SQLException se){

            System.out.println(se.getMessage());

        } finally {

            if(conn != null)   try {conn.close();} catch (SQLException e) { e.printStackTrace();}

        }

    }

}