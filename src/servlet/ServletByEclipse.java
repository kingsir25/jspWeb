package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletByEclipse
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/study/servletDemo/ServletByEclipse" })
public class ServletByEclipse extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("ServletByEclipse���ڻ�������ִ��.......");
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletByEclipse() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("ServletByEclipse���췽����ִ��.......");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("ServletByEclipse����get()����");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("<strong>Hello Servlet!</strong><br>");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("ServletByEclipse���ٷ�����ִ��.......");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ServletByEclipse����post()����");
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html;charset=utf-8");
//		out.println("<strong>Hello Servlet!</strong><br>");
		response.sendRedirect(request.getContextPath()+ "/login/login.jsp");
	}

}
