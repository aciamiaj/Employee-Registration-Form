

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
 * Servlet implementation class InsertFormRecords
 */
@WebServlet("/InsertFormRecords")
public class InsertFormRecords extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");

	      String dburl = "jdbc:mysql://localhost:3306/As2Jaimaica";
	      String uname = "root";
	      String pass = "navarr0Jds1..";
	      
	      String empno = request.getParameter("empno");
	      String empname = request.getParameter("empname");
	      String department = request.getParameter("department");
	      String empjob = request.getParameter("empjob");
	          
	      Connection con = DriverManager.getConnection(dburl, uname, pass);
	      
	      PreparedStatement stmt=con.prepareStatement("INSERT INTO EMP (empno, empname, department, empjob) VALUES(?,?,?,?)");
	      stmt.setString(1,empno); 
	      stmt.setString(2,empname);
	      stmt.setString(3,department);
	      stmt.setString(4,empjob);
	      stmt.executeUpdate();
	   
	      String query = "SELECT * FROM EMP";
	      ResultSet rs = stmt.executeQuery(query);
	      
	      out.println("Record added successfully.");
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

}
