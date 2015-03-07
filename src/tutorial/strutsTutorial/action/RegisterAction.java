package tutorial.strutsTutorial.action;

import tutorial.strutsTutorial.dao.DAOFactory;
import tutorial.strutsTutorial.dao.RegisterDAO;
import tutorial.strutsTutorial.model.RegisterModel;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterModel registerModel;

	public RegisterModel getRegisterModel() {
		return registerModel;
	}

	public void setRegisterModel(RegisterModel registerModel) {
		this.registerModel = registerModel;
	}
	public String execute() throws Exception{
		RegisterDAO registerDAO = DAOFactory.returnRegisterDAO();
		registerDAO.registerUser(registerModel);
		if(registerModel.isRegisterSuccess())
			return "Success";
		else
			return "Failure";
	}
	public void validate(){
		if(registerModel.getUserName() == null || registerModel.getUserName().equals("")){
			addFieldError("registerModel.userName", "Please Enter User Name");
		}
		if(registerModel.getPassword() == null || registerModel.getPassword().equals("")){
			addFieldError("registerModel.password", "Please Enter Password");
		}
		else if(registerModel.getPassword().length() < 3){
			addFieldError("registerModel.password", "Password must be atleast 3 characters");
		}
		if(registerModel.getFullName() == null|| registerModel.getFullName().equals("")){
			addFieldError("registerModel.fullName", "Please Enter Full Name");
		}
		if(registerModel.getEmailId() == null|| registerModel.getEmailId().equals("")){
			addFieldError("registerModel.emailId", "Please Enter Email ID");
		}
	}
}
