import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet����������
 * 1�������--->ʵ����---->��ʼ��---->��������---->�˳�����
 * ֻ��һ�������ṩ����
 * @author xiaoming.peng
 *
 */
public class TestLiftCycleServlet extends HttpServlet {
	
	//ʵ����
	public TestLiftCycleServlet(){
		System.out.println("���췽��");
	}
	
	//��ʼ��
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	// �������� ��doget dopost��
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
	}

	//�˳�
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

}
