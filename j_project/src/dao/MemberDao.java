package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	private static MemberDao instance;
	private MemberDao() {}
	
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public int check(String m_id , String m_passwd) throws SQLException {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select id, passwd from member where id=?";
		System.out.println("m_id->" + m_id);
		System.out.println("m_passwd ->" + m_passwd);
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  m_id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String dbpasswd = rs.getString(1);
				String grade = rs.getString(1);
				System.out.println("check dbpasswd ->" + dbpasswd);
				System.out.println("check grade ->" + grade);
				if(dbpasswd.equals(m_passwd)) {
					result = 0; // 정상로그인
				} else if(grade.equals(3)) {
					result = 1; // 관리자 로그인
				} else if (dbpasswd.equals("")) {
					result = 2; // 비밀번호 입력 확인
				} else if(m_id.equals("")) {
					result = 3; // 없는 회원ID
				} else {
					result = 4; // 이용정지회원
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(rs != null) rs.close();
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		}
		return result;
	}
	
	public int pwcheck(String m_id , String m_email) throws SQLException {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select m_passwd from member where m_id=? and m_email=?";
		System.out.println("m_id->" + m_id);
		System.out.println("m_email ->" + m_email);
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  m_id);
			pstmt.setString(2,  m_email);
			rs = pstmt.executeQuery();
				if(rs.next()) {
					String dbid = rs.getString(1);
					String dbemail = rs.getString(2);
					System.out.println("check m_id ->" + dbid);
					System.out.println("check m_email ->" + dbemail);
					if(dbid.equals(m_id) && dbemail.equals(m_email)) {
						result = 0; // 이메일로 인증번호
					} else if(dbid.equals(m_id)) {
						result = 1; // 아이디 정보 틀림
					} else if (dbemail.equals(m_email)) {
						result = 2; // email 정보 틀림
					} 
					
				}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(rs != null) rs.close();
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		}
		return result;
}
}