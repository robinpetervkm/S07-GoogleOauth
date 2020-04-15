package com.norha;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success
 */

public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Success() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		System.out.println(code);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/*Got from the google Login
	 * http://localhost:8080/S07-GoogleOauth/success?code=4%
	 * 2FygEVDjWG2XJ5oemsKbXSXnkoI79GymVP2aMJLXsqMj6citEzlduuIi40fjfkS5iogBZIWXMRPYSUKkJqht2QRqE
	 * &scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&
	 * authuser=2&prompt=consent#
	 */

}
