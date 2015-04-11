package com.shinhan.cspclass;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ReadTeamMemberServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		String key = req.getParameter("key");
		
		Long longKey = Long.parseLong(key); // String 를 long로 변환
		
		PersistenceManager pm = MyPersistenceManager.getManager();
		TeamMember tm = pm.getObjectById(TeamMember.class,longKey);
		
		String name = tm.getName();
		String SocialNum = tm.getSocialNum();
		String hakname = tm.getHakname();
		String tell = tm.getTell();
		String add = tm.getAdd();
 		String id = tm.getId();
		String value = tm.getValue();
		String gitid = tm.getGitid();
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<form method = 'post' action = /updatedata'>");
		
		resp.getWriter().println("<input type = 'text' value='" + name + " 'name = name'");
		resp.getWriter().println("<input type = 'text' value='" + SocialNum + " 'name = socialNum'");
		resp.getWriter().println("<input type = 'text' value='" + hakname + " ' = hakname'");
		resp.getWriter().println("<input type = 'text' value='" + tell + " 'name = tell'");
		resp.getWriter().println("<input type = 'text' value='" + add + " 'name = add'");
		resp.getWriter().println("<input type = 'text' value='" + id + " 'name = id'");
		resp.getWriter().println("<input type = 'text' value='" + value + " 'checkbox = checkbox'");
		resp.getWriter().println("<input type = 'text' value='" + gitid + " 'name = gitid'");
		
		
		
		resp.getWriter().println("<input type = 'submit' value = 'update' ");		
		
		resp.getWriter().println("</form>");
		resp.getWriter().println("</html>");
		
	}
}

