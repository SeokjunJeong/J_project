package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Member;
import dao.MemberDao;

public class resetPwFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String m_id = request.getParameter("m_id");
			MemberDao md = MemberDao.getInstance();
			Member member = md.select(m_id);
			request.setAttribute("m_id", m_id);
		}catch(Exception e) {	System.out.println(e.getMessage());	}
		return "resetPwForm.jsp";
	}

}
