package Lesson_18_JDBC.SimpleJDBC18_01.src.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SimpleJDBCExample {

    public static void main(String[] args) {
        // Create the "url"
        // assume database server is running on the localhost
        String url = "jdbc:derby://localhost:1527/Employee";
        String username = "tiger";
        String password = "scott";

        // Create a simple query
        String query = "select * from EMPLOYEE";
        String addEmployee = "INSERT INTO Employee VALUES (001, 'Chrissie', 'Desemberg', '1985-09-21', 100000)";

        // A try-with-resources example
        // Connection and Statement implement java.lan.AutoCloseable
        try (Connection con = DriverManager.getConnection(url, username, password)) {

            Statement stmt = con.createStatement();
            if (stmt.executeUpdate(addEmployee) > 0) {
                System.out.println("A new employee record has been added");
            };

            stmt.executeUpdate(addEmployee);

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                Date birth_date = rs.getDate("BIRTHDATE");
                float salary = rs.getFloat("SALARY");
                System.out.println("Employee ID:   " + empID + "\n"
                        + "Employee Name: " + first.trim() + " " + last.trim() + "\n"
                        + "Birth Date:    " + birth_date + "\n"
                        + "Salary:        " + salary + "\n");

            }

        } catch (SQLException e) {
            System.out.println("Exception creating connection: " + e);
            System.exit(0);
        }
        // No need to close the Connection and Statement objects, the compiler
        // will generate these for us and call the close() statement on this
        // objects in the order we obtained them in the try
    }
}
