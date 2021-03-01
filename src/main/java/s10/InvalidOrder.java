package s10;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InvalidOrder
 */
@WebServlet("/s10/cancel")
public class InvalidOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Map<String, Album> createEmptyOrder() {
		Map<String, Album> result = new HashMap<>();
		result.put("1", new Album(1, "Null", 0));
		result.put("2", new Album(2, "One second", 0));
		result.put("3", new Album(3, "Three trees", 0));
		result.put("4", new Album(4, "For four forks", 0));

		return result;
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
	
		
		@SuppressWarnings("unchecked")
		Map<String, Album> orders = (Map<String, Album>) session.getAttribute("orders");
		
		orders = createEmptyOrder();
		session.setAttribute("orders", orders);
		request.getRequestDispatcher("buyNull.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
