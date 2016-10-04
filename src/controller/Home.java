package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		/// hwHelloMVC/home?action=login URL이 이거니까 /home으로 매핑된 이곳으로
		/// action이란 아이가 넘어오는겨
		String action = request.getParameter("action");

		String page = null;

		if (action.equals("login"))
			page = "/view/loginForm.jsp";
		else if (action.equals("register"))
			page = "/view/registerForm.jsp";
		else
			page = "/view/error.jsp";

		// page (문자열)을 운행관리자에게 실어서 보낸다(request,response에 뭐있는지 알자..)
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}

}
