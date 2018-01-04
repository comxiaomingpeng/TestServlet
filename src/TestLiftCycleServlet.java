import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet的生命周期
 * 1、类加载--->实例化---->初始化---->处理请求---->退出服务
 * 只有一个对象提供服务
 * @author xiaoming.peng
 *
 */
public class TestLiftCycleServlet extends HttpServlet {
	
	//实例化
	public TestLiftCycleServlet(){
		System.out.println("构造方法");
	}
	
	//初始化
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	// 处理请求 （doget dopost）
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
	}

	//退出
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

}
