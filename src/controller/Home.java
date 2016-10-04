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
		/// hwHelloMVC/home?action=login URL�� �̰Ŵϱ� /home���� ���ε� �̰�����
		/// action�̶� ���̰� �Ѿ���°�
		String action = request.getParameter("action");

		String page = null;

		if (action.equals("login"))
			page = "/view/loginForm.jsp";
		else if (action.equals("register"))
			page = "/view/registerForm.jsp";
		else
			page = "/view/error.jsp";

		// page (���ڿ�)�� ��������ڿ��� �Ǿ ������(request,response�� ���ִ��� ����..)
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}

}
