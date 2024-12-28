package demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
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
		
		request.setAttribute("name", "KaVinDharani");
		
		
		try {
			response.getWriter().println("<p style = \"font-size:200px;\"> Kavin Adithya Dharani </p>" + request.getAttribute("username"));
//			request.getRequestDispatcher("/jsp/home.jsp").forward(request, response);
//		} catch (IOException | ServletException e) {
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
