package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
/**
 * Servlet implementation class TourokuServlet
 */
@WebServlet("/TourokuServlet")
public class TourokuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TourokuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		int key1 = Integer.parseInt("yaerkey");
		int key2 = Integer.parseInt("monthkey");
		int key3 = Integer.parseInt("daykey");
		String key4 = request.getParameter("buykey");
		int key5 = Integer.parseInt("incomekey");
		int key6 = Integer.parseInt("spendingkey");

		int result = Dao.insertNames(key1,key2,key3,key4,key5,key6);
		request.setAttribute("param", result);

		String view = "/WEB-INF/view/TourokuGamen.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
