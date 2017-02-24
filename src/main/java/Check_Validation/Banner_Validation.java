package Check_Validation;

import base.Base_Definition;
import base.Check_Some_Condition;
import base.Define_Message_Info;

public class Banner_Validation extends Define_Message_Info{
	//Define_Message_Info msInfo = new Define_Message_Info();
	/*
	 * Check validation for textbox of banner function
	 */
	
	/*
	 * Initialization of Check_Some_Condition and Base_Definition to call method
	 * into classes
	 */
	Base_Definition base = new Base_Definition();
	Check_Some_Condition check = new Check_Some_Condition();
	
	/*Check validation for Banner Name*/
	public void CheckValidation_BannerName(){
		if (check.CheckTitle()) {
			if(getBANNER_NAME_ACTUAL().isDisplayed()){
				String actualMessage = getBANNER_NAME_ACTUAL().getText().toString();
				if (actualMessage.equals(getBANNER_NAME_MAXLENGHT_EXPECTED())){
					System.out.print("Banner name is over maxlenght! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
				else if(actualMessage.equals(getBANNER_NAME_NOTNULL_EXPECTED())){
					System.out.print("Banner is requied! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}			
		}
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}			
		}
	}
	/* End check for banner Name*/
	
	/*Check validation for BannerPC*/
	public void CheckValidation_BannerPC(){
		if (check.CheckTitle()) {
			if(getBANNER_FILE_PC_ACTUAL().isDisplayed()){
				String actualMessage = getBANNER_FILE_PC_ACTUAL().getText().toString();
				if (actualMessage.equals(getBANNER_PC_FILE_NOTNULL_EXPECTED())){
					System.out.print("Banner PC invalid! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		}
		
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}
		}
	}
	/* End check for bannerPC*/
	
	/*Check validation for BannerAltTextPC*/
	public void CheckValidation_BannerAltTextPC(){
		if (check.CheckTitle()) {
			if(getALT_TEXT_PC_ACTUAL().isDisplayed()){
				String actualMessage = getALT_TEXT_PC_ACTUAL().getText().toString();
				if (actualMessage.equals(getALTTEXT_PC_MAXLENGHT_EXPECTED())){
					System.out.print("URL invalid! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		}
		
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}
		}
	}
	/* End check for banner Name*/
	
	/*Check validation for BannerSP*/
	public void CheckValidation_BannerSP(){
		if (check.CheckTitle()) {
			if(getBANNER_FILE_SP_ACTUAL().isDisplayed()){
				String actualMessage = getBANNER_FILE_SP_ACTUAL().getText().toString();
				if (actualMessage.equals(getBANNER_SP_FILE_NOTNULL_EXPECTED())){
					System.out.print("Banner PC invalid! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		}
		
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}
		}
	}
	/* End check for bannerSP*/
	
	/*Check validation for BannerAltTextSP*/
	public void CheckValidation_BannerAltTextSP(){
		if (check.CheckTitle()) {
			if(getALT_TEXT_SP_ACTUAL().isDisplayed()){
				String actualMessage = getALT_TEXT_SP_ACTUAL().getText().toString();
				if (actualMessage.equals(getALTTEXT_SP_MAXLENGHT_EXPECTED())){
					System.out.print("URL invalid! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		}
		
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}
		}
	}
	/* End check for banner Name*/
	
	/*Check validation for BannerNoteText*/
	public void CheckValidation_BannerNoteText(){
		if (check.CheckTitle()) {
			if(getNOTE_TEXT_ACTUAL().isDisplayed()){
				String actualMessage = getNOTE_TEXT_ACTUAL().getText().toString();
				if (actualMessage.equals(getBANNER_NOTETEXT_MAXLENGHT_EXPECTED())){
					System.out.print("Note input over max length! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		}
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}
		}
	}
	
	/*Check validation for BannerUrl*/
	public void CheckValidation_BannerUrl(){
		if (check.CheckTitle()) {
			if(getBANNER_URL_ACTUAL().isDisplayed()){
				String actualMessage = getBANNER_URL_ACTUAL().getText().toString();
				if (actualMessage.equals(getBANNER_URL_ERROR_EXPECTED())){
					System.out.print("Url invalid! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
				else if (actualMessage.equals(getBANNER_URL_MAXLENGHT_EXPECTED())){
					System.out.print("Url input over max length! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		}
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}
		}
	}
	/* End check for banner Name*/
}
