import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String title = "Active Cookies";
		System.out.println("");
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		if (cookies != null) {

			pw.println("<html><head><title>ShowCookie</title></head><body><p>hjdhjhjh</p>" + cookie.getName()
					+ cookie.getValue() + "</body></html>");
		}
	}

}
