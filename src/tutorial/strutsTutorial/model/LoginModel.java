package tutorial.strutsTutorial.model;

public class LoginModel {

	/**
	 * @param args
	 */
	private String userName;
	private String password;
	private String loginFailure;
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
