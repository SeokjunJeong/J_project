package service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Member;
import dao.MemberDao;

public class searchPwProAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			request.setCharacterEncoding("utf-8");
			System.out.println("searchPwProAction Start...");
			String m_id = request.getParameter("id");
			String m_email = request.getParameter("email");
			System.out.println("searchPwProAction m_id->"+m_id);
			System.out.println("searchPwProAction m_email->"+m_email);
		    MemberDao md = MemberDao.getInstance();
			int result = md.pwcheck(m_id, m_email); 
			System.out.println("searchPwProAction result->"+result);

			request.setAttribute("m_id", m_id);
			request.setAttribute("m_email", m_email);
			request.setAttribute("result", result);

		} catch (Exception e) {
			System.out.println("searchPwProAction Exception->"+e.getMessage());
		}
		return "searchPwPro.jsp";
	}

}
