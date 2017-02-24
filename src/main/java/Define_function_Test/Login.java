package Define_function_Test;

import base.Base_Definition;

public class Login {
	public void Login_Duskin(String userName, String passWord) throws InterruptedException{
		Base_Definition baseObj = new Base_Definition();
		baseObj.load();
		baseObj.getUserName().clear();
		baseObj.getUserName().sendKeys(userName);
		baseObj.getPassWord().clear();		
		baseObj.getPassWord().sendKeys(passWord);
		baseObj.getBtnLogin().click();
	}
}
