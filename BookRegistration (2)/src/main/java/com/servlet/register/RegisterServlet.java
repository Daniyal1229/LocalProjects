package com.servlet.register;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bookregister")
public class RegisterServlet extends HttpServlet{
	
	//create the query
	private static final String INSERT_QUERY ="INSERT INTO BOOK(ISBN,TITLE,AUTHOR,EDITION,PUBLICATION) VALUES(?,?,?,?,?)";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		//set Content type
		res.setContentType("text/html");
		//read the form values
		String isbn = req.getParameter("isbn");
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String edition = req.getParameter("edition");
		String publication	 = req.getParameter("publication");
		
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//create the connection
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","rootpassword");
				PreparedStatement ps = con.prepareStatement(INSERT_QUERY);){
			//set the values
			ps.setString(1, isbn);
			ps.setString(2, title);
			ps.setString(3, author);
			ps.setString(4, edition);
			ps.setString(5, publication);
			
			//execute the query
			int count = ps.executeUpdate();
			
			if(count==0) {
				pw.println("Registration Unsuccessful");
			}else {
				pw.println("Successfully Registered");
			}
		}catch(SQLException se) {
			pw.println(se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}
		
		//close the stream
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
