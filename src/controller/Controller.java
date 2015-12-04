package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Interest;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Interest interest;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession(true);
		
		try {			
			interest = new Interest();
			interest.setPrincipalAmount(Integer.parseInt(request.getParameter("principalAmount")));
			interest.setRate(Double.parseDouble(request.getParameter("rate")));
			interest.setYears(Integer.parseInt(request.getParameter("years")));
			interest.setCompounded(Integer.parseInt(request.getParameter("compounded")));
			
			sess.setAttribute("interest", interest);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/MainPage.jsp");
			dispatcher.forward(request, response);
		}catch(Exception e){
			sess.removeAttribute("interest");
			response.sendRedirect("/DeterminingCompoundInterest/MainPage.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
