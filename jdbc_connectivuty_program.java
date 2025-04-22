import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentJDBC {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/school"; // Change as per your database
        String username = "root";  // Your database username
        String password = "";      // Your database password

        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Establish Connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            // 2. Create a Statement
            Statement stmt = conn.createStatement();

            // 3. Create Table if not exists
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                    "name VARCHAR(50), " +
                                    "age INT)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table created or already exists.");

            // 4. Get User Input
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter Student Age: ");
            int studentAge = scanner.nextInt();

            // 5. Insert Student Data using PreparedStatement
            String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, studentName);
            pstmt.setInt(2, studentAge);
            pstmt.executeUpdate();
            System.out.println("Student record inserted successfully!");

            // 6. Retrieve and Display Student Data
            String selectSQL = "SELECT id, name, age FROM students";
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\nStudent Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // 7. Close Resources
            rs.close();
            pstmt.close();
            stmt.close();
            conn.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
