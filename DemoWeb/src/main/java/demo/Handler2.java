package demo;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/handler2", loadOnStartup = 1)
public class Handler2 extends HttpServlet{
	@Override
	public void init() {
		System.out.println("Request2 servlet Instantiated...");
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Reached Service Method in Handler2");
		
		try {
			response.getWriter().println("<p style = \"font-size:200px;\"> Kavin Adithya Dharani </p>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
