package chapter03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ch03_Ex04", urlPatterns = { "/ch03_Ex04" })
public class Ex04 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String scheme = request.getScheme();
		String remoteAddr = request.getRemoteAddr();
		int remotePort = request.getRemotePort();
		
		PrintWriter out = response.getWriter();
		
		out.append("<html>");
		out.append("<head>");
		out.append("</head>");
		out.append("<body>");
		out.append("	<h3>클라이언트의 네트워크 관련된 요청 정보</h3>");
		out.append("	<p>사용한 프로토콜 : " + scheme + "</p>");
		out.append("	<p>클라이언트의 IP 주소 : " + remoteAddr + "</p>");
		out.append("	<p>클라이언트의 포트 : " + remotePort + "</p>");
		out.append("</body>");
		out.append("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
