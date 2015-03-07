package tutorial.strutsTutorial.model;

public class RegisterModel {
	private String emailId;
	private String password;
	private String userName;
	private String fullName;
	private String gender;
	private boolean registerSuccess;
	public boolean isRegisterSuccess() {
		return registerSuccess;
	}
	public void setRegisterSuccess(boolean registerSuccess) {
		this.registerSuccess = registerSuccess;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
