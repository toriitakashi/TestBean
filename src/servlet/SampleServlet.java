package servlet;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")

public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String view = "/WEB-INF/jsp/test.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);

	    TestBean bean = new TestBean();
	    bean.setFirstName("1234567890");
	    bean.setEmail("test@test");

	    Cleaning c = new Cleaning(bean);
	    try {
			c.clean();
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | IntrospectionException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	    System.out.println(bean.getFirstName());
	    System.out.println(bean.getLastName());
	    System.out.println(bean.getHoge());
	    System.out.println(bean.getFuga());
	    System.out.println(bean.getEmail());


	    dispatcher.forward(request, response);
	}



}
