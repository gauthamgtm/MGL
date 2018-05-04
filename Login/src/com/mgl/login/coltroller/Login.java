package com.mgl.login.coltroller;

import java.io.IOException; 
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mgl.login.dao.UserDAO;



/**
 * Servlet implementation class Login
 */
//@WebServlet("/logserv")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement pstmt;
    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un=req.getParameter("un");
		String pwd=req.getParameter("pwd");
		
		UserDAO dao=new UserDAO();
		String name= dao.getUser(un, pwd);
		if(name!=null){
			HttpSession userSession=req.getSession();
			userSession.setAttribute("name", name);
			userSession.setMaxInactiveInterval(10);
			resp.sendRedirect("success.jsp");
		}else{
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			req.setAttribute("msg", "Invalid username or password");
			rd.forward(req, resp);
			
		}
	}

}
