package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		CustomerService service = (CustomerService) CustomerService.getInstance();
		Customer customer = service.login(id, password);// �Լ�ȣ�� //bean�� �������ϳ�..

		

		String page = null;

		if (customer == null) {
			page = "/view/loginFail.jsp";
			request.setAttribute("id", id);
		} else {
			page = "/view/loginSuccess.jsp";
			request.setAttribute("customer", customer); //��ü customer�� (�տ�)customers��� key�� �����ٰž�
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}