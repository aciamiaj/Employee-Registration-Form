import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowRecords
 */
@WebServlet("/ShowRecords")
public class ShowRecords extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");

	      String dburl = "jdbc:mysql://localhost:3306/As2Jaimaica";
	      String uname = "root";
	      String pass = "navarr0Jds1..";

	      Connection con = DriverManager.getConnection(dburl, uname, pass);
	      
	      Statement stmt = con.createStatement();
	      String query = "SELECT * FROM EMP";
	      ResultSet rs = stmt.executeQuery(query);
	      
	      out.println("Emp No" + "\t" + "Name"  + "\t\t" + "Department"  + "\t" + "Job");
	      while (rs.next()) {
	        out.println(rs.getString("empno") + "\t" + rs.getString("empname") + "\t\t" + rs.getString("department") + "\t\t" + rs.getString("empjob"));
	      }
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
  }
}





















