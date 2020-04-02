import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ResultSetLast {
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/mydatabase";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      System.out.println("Connection established......");
      //Creating the Statement
      Statement stmt = con.createStatement();
      //Query to retrieve records
      String query = "Select * from MyPlayers";
      //Executing the query
      ResultSet rs = stmt.executeQuery(query);
      //Moving cursor to the Last position in the ResultSet.
      rs.last();
      System.out.println("Printing the contents of the current row: ");
      System.out.print("ID: "+rs.getInt("ID")+", ");
      System.out.print("Name: "+rs.getString("First_Name")+", ");
      System.out.print("Age: "+rs.getString("Last_Name")+", ");
      System.out.print("Salary: "+rs.getDate("Date_Of_Birth")+", ");
      System.out.print("Country: "+rs.getString("Place_Of_Birth")+", ");
      System.out.print("Address: "+rs.getString("Country"));
      System.out.println();
   }
}
