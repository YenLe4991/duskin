package Check_Validation;

import base.Base_Definition;
import base.Check_Some_Condition;
import base.Define_Message_Info;

public class Keyword_Validation extends Define_Message_Info {
	// Define_Message_Info msInfo = new Define_Message_Info();
	/*
	 * Check validation for textbox of keyword search function
	 */

	/* Initialization Object */
	Check_Some_Condition check = new Check_Some_Condition();
	Base_Definition base = new Base_Definition();

	/* Check validation for Keyword*/
	public void CheckValidation_Keyword() {
		if (check.CheckTitle()) {
			if (getKEYWORD_ACTUAL().isDisplayed()) {
				String actualMessage = getKEYWORD_ACTUAL().getText().toString();
				if (actualMessage.equals(getKEYWORD_ERROR_EXPECTED())) {
					System.out.print("Key word invalid! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				} else if (actualMessage
						.equals(getKEYWORD_MAXLENGHT_EXPECTED())) {
					System.out
							.print("Key word input over max lenght! \t\n Actual Msg: "
									+ " '"
									+ actualMessage
									+ "' ==> true"
									+ "\n");
				}
			}
		} else {
			if (check.CheckConfirmTitle()) {
				base.getBtnLogout();
			}
		}
	}
	/* End Check*/

	/* Check validation for Keyword_ URL*/
	public void CheckValidation_Url() {
		if (check.CheckTitle()) {
			if (getURL_ACTUAL().isDisplayed()) {
				String actualMessage = getURL_ACTUAL().getText().toString();
				if (actualMessage.equals(getURL_ERROR_EXPECTED())) {
					System.out.print("URL invalid! \t\n Actual Msg: " + " '"
							+ actualMessage + "' ==> true" + "\n");
				} else if (actualMessage.equals(getURL_MAXLENGHT_EXPECTED())) {
					System.out
							.print("URL input over max lenght! \t\n Actual Msg: "
									+ " '"
									+ actualMessage
									+ "' ==> true"
									+ "\n");
				}
			}
		} else {
			if (check.CheckConfirmTitle()) {
				base.getBtnLogout();
			}
		}
	}
	/* End Check*/
}
