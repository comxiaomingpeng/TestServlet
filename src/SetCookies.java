import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		for (int i = 0; i < 3; i++) {
			Cookie cookie = new Cookie("CookieName" + i, "CookieValue" + i);
			response.addCookie(cookie);

			cookie.setMaxAge(3600);

		}
		pw.println("<html><head><title>cookie</title><body>"
				+ "fjhjfhdjhfjdhdh<a href=\"ShowCookies\">servlet</a>" + "</head></body></html>");
	}

}
