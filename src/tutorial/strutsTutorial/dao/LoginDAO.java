package tutorial.strutsTutorial.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tutorial.strutsTutorial.model.LoginModel;

public class LoginDAO {
	Statement st;
	String userName;
	String password;
	String emailId;
	String gender;
	String fullName;
	Connection conn = null;
	BaseDAO baseDAO = null;
	ResultSet rs = null;
	public void loginUser(LoginModel loginModel){
		userName = loginModel.getUserName();
		password = loginModel.getPassword();
		baseDAO = DAOFactory.returnConnetion();
		conn = baseDAO.getConnection();
		String sql = "select * from ACCOUNT where USERNAME = '"+userName+"' and PASSWORD='"+password+"'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				fullName = rs.getString(3);
				emailId = rs.getString(4);
				gender = rs.getString(5);
				loginModel.setEmailId(emailId);
				loginModel.setFullName(fullName);
				loginModel.setGender(gender);
				loginModel.setIsLoginFailure(false);
			}
			else{
				loginModel.setIsLoginFailure(true);
			}
		} catch (SQLException e) {
			loginModel.setIsLoginFailure(true);
			e.printStackTrace();
		}
		finally{
			try {
				if(st!=null)
					st.close();
				if(conn!=null)
					conn.close();
				baseDAO.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
