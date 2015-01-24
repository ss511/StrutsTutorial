package tutorial.strutsTutorial.action;

import tutorial.strutsTutorial.model.LoginModel;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginModel loginModel;
	
	public String execute() throws Exception{
		System.out.println("Inside Execute");
		//loginModel = new LoginModel();
		if("ss".equals(loginModel.getUserName()) && "123".equals(loginModel.getPassword())){
			return "Success";
		}
		else{
			loginModel.setLoginFailure("Incorrect User Name or Password. Please try again...");
			return "Failure";
		}
	}
	public LoginModel getLoginModel() {
		return loginModel;
	}
	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	public void validate(){
		if(loginModel.getUserName() == null || loginModel.getUserName().equals("")){
			addFieldError("loginModel.userName", "Please Enter User Name");
		}
		if(loginModel.getPassword() == null || loginModel.getPassword().equals("")){
			addFieldError("loginModel.password", "Please Enter Password");
		}
		else if(loginModel.getPassword().length() < 3){
			addFieldError("loginModel.password", "Password must be atleast 3 characters");
		}
	}
	
}	
