package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Member;
import dao.MemberDao;

public class resetPwProAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("resetPwProAction start");
		try {
			
			request.setCharacterEncoding("utf-8");
			Member member = new Member();
			member.setM_passwd(request.getParameter("newpass"));
			MemberDao md = MemberDao.getInstance();
			int result = md.resetpw(member); 
			System.out.println(result);
			request.setAttribute("m_passwd", member.getM_passwd());
			request.setAttribute("result", result);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "resetPwPro.jsp";
	}

}
