package tutorial.strutsTutorial.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import tutorial.strutsTutorial.model.RegisterModel;

public class RegisterDAO {
	Statement st;
	String userName;
	String password;
	String emailId;
	String gender;
	String fullName;
	Connection conn = null;
	BaseDAO baseDAO = null;
	public void registerUser(RegisterModel registerModel){
		userName = registerModel.getUserName();
		password = registerModel.getPassword();
		fullName = registerModel.getFullName();
		emailId = registerModel.getEmailId();
		gender = registerModel.getGender();
		baseDAO = DAOFactory.returnConnetion();
		conn = baseDAO.getConnection();
		String sql = "insert into account values('"+userName+"','"+password+"','"+fullName+"','"+emailId+"','"+gender+"')";
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			registerModel.setRegisterSuccess(true);
		} catch (SQLException e) {
			registerModel.setRegisterSuccess(false);
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
