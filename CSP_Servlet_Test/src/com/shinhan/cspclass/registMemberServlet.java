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
	
		
		resp.getWriter().println("이름 : " +name + "</br>");
		resp.getWriter().println("주민번호 : " +socialNum + "</br>");
		resp.getWriter().println("학번 : " +hakname + "</br>");
		resp.getWriter().println("전화번호 : " +tell + "</br>");
		resp.getWriter().println("메일주소 : " +add + "</br>");
		resp.getWriter().println("아이디쳌 : " +id+"</br>" );
		
		if (req.getParameter("value")!=null)
			resp.getWriter().println("팀장여부 : 팀장 있음"+"</br>");
		else
			resp.getWriter().println("팀장여부 : 팀장 없음"+"</br>");
		
		resp.getWriter().println("Git Id : " +req.getParameter("gitid") + "</br>");
		resp.getWriter().println("</body></html>");
	
	
	
	}
}
