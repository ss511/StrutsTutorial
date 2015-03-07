package tutorial.strutsTutorial.dao;


public class DAOFactory {
	public static BaseDAO returnConnetion(){
		return new BaseDAO();
	}
	public static LoginDAO returnLoginDAO(){
		return new LoginDAO();
	}
	public static RegisterDAO returnRegisterDAO(){
		return new RegisterDAO();
	}
}
