package Check_Validation;

import base.Base_Definition;
import base.Check_Some_Condition;
import base.Define_Message_Info;

public class ThemeList_Validation extends Define_Message_Info {
	/*
	 * Check validation for textbox of theme function
	 */
	
	/* Initialization Object */
	Check_Some_Condition check = new Check_Some_Condition();
	Base_Definition base = new Base_Definition();
	
	/* Check validation for ThemeName*/
	public void CheckValidation_ThemeName() {
		if (check.CheckTitle()) {
			if (getTHEME_NAME_ACTUAL().isDisplayed()) {
				String actualMessage = getTHEME_NAME_ACTUAL().getText().toString();
				if (actualMessage.equals(getTHEME_NAME_ERROR_EXPECTED())) {
					System.out.print("Theme name invalid! \t\n Actual Msg: " + " '"
							+ actualMessage + "' ==> true" + "\n");
				} else if (actualMessage.equals(getTHEME_NAME_MAXLENGHT_EXPECTED())) {
					System.out
							.print("Theme name input over max lenght! \t\n Actual Msg: "
									+ " '" + actualMessage + "' ==> true" + "\n");
				} else if (actualMessage.equals(getTHEME_NAME_NOTNULL_EXPECTED())) {
					System.out.print("Theme name is required! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}		}
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}			
		}
	}
	/*End check*/

	/* Check validation for SystemName*/
	public void CheckValidation_SystemName() {
		if (check.CheckTitle()) {
			if (getSYSTEM_NAME_ACTUAL().isDisplayed()) {
				String actualMessage = getSYSTEM_NAME_ACTUAL().getText().toString();
				if (actualMessage.equals(getSYSTEM_NAME_MAXLENGHT_EXPECTED())) {
					System.out
							.print("System Name input over max lenght \t\n Actual Msg: "
									+ " '" + actualMessage + "' ==> true" + "\n");
				} else if (actualMessage.equals(getSYSTEM_NAME_NOTNULL_EXPECTED())) {
					System.out.print("System Name is required! \t\n Actual Msg: "
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
	/* End Check*/
	
	/* Check validation for ThemeFile*/
	public void CheckValidation_ThemeFile() {
		if (check.CheckTitle()) {
			if (getTHEME_FILE_ACTUAL().isDisplayed()) {
				String acctualMessage = getTHEME_FILE_ACTUAL().getText().toString();
				if (acctualMessage.equals(getTHEME_FILE_NOTNULL_EXPECTED())) {
					System.out.print("Theme file is required! \t\n Actual Msg:"
							+ "'" + acctualMessage + "' => true\n");
				}
				else if (acctualMessage.equals(getTHEME_FILE_ERROR_EXPECTED())){
					System.out.print("Theme file is required! \t\n Actual Msg:"
							+ "'" + acctualMessage + "' => true\n");
				}
			}
		}
		else{
			if (check.CheckConfirmTitle()){
				base.getBtnLogout();
			}			
		}
	}
	/* End Check*/
}
