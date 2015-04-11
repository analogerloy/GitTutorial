package com.shinhan.cspclass;

import java.io.IOException;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class registMemberServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/pain");
		String name = req.getParameter("name");
		String socialNum = req.getParameter("socialNum");
		String hakname = req.getParameter("hakname");
		String tell = req.getParameter("tell");
		String add = req.getParameter("add");
		String id = req.getParameter("id");

		String value = req.getParameter("value");
		String gitid = req.getParameter("gitid");
		
		
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		//PersistenceManager pm = MyPersistenceManager.getManager();
		TeamMember tm = new TeamMember(name, socialNum, hakname, tell, add, id, value, gitid);
		pm.makePersistent(tm);
		
		resp.getWriter().println("<html><body>");
	
		
		resp.getWriter().println("�̸� : " +name + "</br>");
		resp.getWriter().println("�ֹι�ȣ : " +socialNum + "</br>");
		resp.getWriter().println("�й� : " +hakname + "</br>");
		resp.getWriter().println("��ȭ��ȣ : " +tell + "</br>");
		resp.getWriter().println("�����ּ� : " +add + "</br>");
		resp.getWriter().println("���̵�n : " +id+"</br>" );
		
		if (req.getParameter("value")!=null)
			resp.getWriter().println("���忩�� : ���� ����"+"</br>");
		else
			resp.getWriter().println("���忩�� : ���� ����"+"</br>");
		
		resp.getWriter().println("Git Id : " +req.getParameter("gitid") + "</br>");
		resp.getWriter().println("</body></html>");
	
	
	
	}
}
