import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImportRecords")
public class ImportRecords extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      String dburl = "jdbc:mysql://localhost:3306/As2Jaimaica";
      String uname = "root";
      String pass = "navarr0Jds1..";

      Connection con = DriverManager.getConnection(dburl, uname, pass);
      
      Statement stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO EMP (empno, empname, department, empjob)" +
                        "VALUES ('101', 'Jam','IT', 'Software Engineer')," +
                        "('102', 'Sarath','Sales', 'Manager')," +
                        "('103', 'Jaydenn','IT', 'Data Engineer')," +
                        "('104', 'Mira','IT', 'Full-Stack Developer')," +
                        "('105', 'Viraj','Sales', 'Manager')," +
                        "('106', 'Mudit','IT', 'Software Developer')," +
                        "('107', 'Mohit','Finance', 'Executive')," +
                        "('108', 'Efe','IT', 'Project Manager')," +
                        "('109', 'Simul','IT', 'Programmer')," +
                        "('110', 'Nahom','Finance', 'Manager')");

      String query = "SELECT * FROM EMP";
      ResultSet rs = stmt.executeQuery(query);
      
      out.println("Records added successfully.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}