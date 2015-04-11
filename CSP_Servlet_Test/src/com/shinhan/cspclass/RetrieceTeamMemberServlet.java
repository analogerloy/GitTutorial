package com.shinhan.cspclass;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.jdo.*;




	
	public class RetrieceTeamMemberServlet extends HttpServlet{ 
			public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{ 

	
		
		
		List<TeamMember> MemberList = MyPersistenceManager.getAllMembers();
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table>");
		
		for(TeamMember tm : MemberList)
		{
			resp.getWriter().println("<tr>");
			resp.getWriter().println
			("<td>"+"<a href='/ReadTeamMember?key="+tm.getKey() + "'>"+ tm.getName() + "</a>" + "</td><td>" + tm.getSocialNum() + 
					"</td><td>" + tm.getHakname() + "</td><td>" + 
					tm.getTell() + "</td><td>" + tm.getAdd() + 
					 "</td><td>"+ tm.getId() +  "</td><td>" + tm.getValue()+ "</td><td>" + tm.getGitid() + "</td>");
			resp.getWriter().println("</tr>");
		}
				
		
		resp.getWriter().println("</table>");
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
