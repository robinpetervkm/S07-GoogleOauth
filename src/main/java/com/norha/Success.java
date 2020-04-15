package com.norha;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.norha.model.RequestTokenParams;

/**
 * Servlet implementation class Success
 */

public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Client client = ClientBuilder.newClient();
	WebTarget googleTokenServer = client.target("https://www.googleapis.com/oauth2/v4/token"); 

    public Success() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		String client_id = "516880447905-lqhjlpig4oea5b5rt1rcomf5k2lr5ao9.apps.googleusercontent.com";
		String client_secret = "AyYlIbAp5aDfMz4b-jjwt23f";
		String redirect_uri = "http://localhost:8080/S07-GoogleOauth/success";	
		String grant_type = "authorization_code";
		
		RequestTokenParams requestTokenParams = new RequestTokenParams(code, client_id, client_secret, redirect_uri, grant_type);
		Response token = googleTokenServer.request().post(Entity.json(requestTokenParams));
		System.out.println("Token = "+token.readEntity(String.class));
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/*Got from the google Login
	 * http://localhost:8080/S07-GoogleOauth/success?code=4%
	 * 2FygEVDjWG2XJ5oemsKbXSXnkoI79GymVP2aMJLXsqMj6citEzlduuIi40fjfkS5iogBZIWXMRPYSUKkJqht2QRqE
	 * &scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&
	 * authuser=2&prompt=consent#
	 */

}
