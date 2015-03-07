package tutorial.strutsTutorial.model;

public class LoginModel {

	/**
	 * @param args
	 */
	private String userName;
	private String password;
	private String loginFailure;
	private String emailId;
	private String gender;
	private String fullName;
	private boolean isLoginFailure;
	public boolean getIsLoginFailure() {
		return isLoginFailure;
	}
	public void setIsLoginFailure(boolean isLoginFailure) {
		this.isLoginFailure = isLoginFailure;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLoginFailure() {
		return loginFailure;
	}
	public void setLoginFailure(String loginFailure) {
		this.loginFailure = loginFailure;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
