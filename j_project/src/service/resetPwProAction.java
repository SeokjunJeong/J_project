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
			int result = 0;
			request.setCharacterEncoding("utf-8");
			String m_id = request.getParameter("m_id");
			String m_passwd = request.getParameter("newpass");
			String chkpass = request.getParameter("chkpass");
			System.out.println("chkpass->" + chkpass);
			System.out.println("m_passwd->" + m_passwd);

			if (m_passwd.equals(chkpass)) {
				MemberDao md = MemberDao.getInstance();
				result = md.resetpw(m_id, m_passwd);
			} else {
				result = -1;
			}
			request.setAttribute("result", result);
			System.out.println("result->" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "resetPwPro.jsp";
	}

}
