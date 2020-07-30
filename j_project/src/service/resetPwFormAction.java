package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class resetPwFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("resetPwFormAction start....");
		try {
			
			String m_id = request.getParameter("id");
			request.setAttribute("m_id", m_id);
		}catch(Exception e) {	System.out.println(e.getMessage());	}
		return "resetPwForm.jsp";
	}

}
