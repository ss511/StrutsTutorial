package tutorial.strutsTutorial.action;

import tutorial.strutsTutorial.model.LoginModel;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginModel loginModel;
	public LoginModel getLoginModel() {
		return loginModel;
	}
	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	public String execute() throws Exception{
		//loginModel = new LoginModel();
		if("ss".equals(loginModel.getUserName()) && "123".equals(loginModel.getPassword())){
			return "Success";
		}
		else{
			loginModel.setLoginFailure("Incorrect User Name or Password. Please try again...");
			return "Failure";
		}
	}
	
}	
