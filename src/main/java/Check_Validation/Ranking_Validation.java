package Check_Validation;

import base.Base_Definition;
import base.Check_Some_Condition;
import base.Define_Message_Info;

public class Ranking_Validation extends Define_Message_Info{
	//Define_Message_Info msInfo = new Define_Message_Info();
	/*
	 * Check validation for textbox of banner function
	 */
	/* Initialization Object */
	Check_Some_Condition check = new Check_Some_Condition();
	Base_Definition base = new Base_Definition();
	
	/* Check validation for RankingName*/
	public void CheckValidation_RankingName(){
		if (check.CheckTitle()) {
			if(getRANKING_NAME_ACTUAL().isDisplayed()){
				String actualMessage = getRANKING_NAME_ACTUAL().getText().toString();
				if (actualMessage.equals(getRANKING_NAME_MAXLENGHT_EXPECTED())){
					System.out.print("Ranking name is over maxlenght! \t\n Actual Msg: "
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
				else if(actualMessage.equals(getRANKING_NAME_NOTNULL_EXPECTED())){
					System.out.print("Ranking is requied! \t\n Actual Msg: "
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
	
	/* Check validation for RankingName*/
	public void CheckValidation_Product(){
		if (check.CheckTitle()) {
			if(getPRODUCT1_ACTUAL().isDisplayed()){
				String actualMessage = getPRODUCT1_ACTUAL().getText().toString();
				if (actualMessage.equals(getPRODUCT1_EXPECTED())){
					System.out.print("Product invalid! \t\n Actual Msg: "
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
	
}
