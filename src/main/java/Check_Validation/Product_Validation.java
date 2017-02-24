package Check_Validation;

import base.Base_Definition;
import base.Check_Some_Condition;
import base.Define_Message_Info;

public class Product_Validation extends Define_Message_Info{
	Check_Some_Condition check = new Check_Some_Condition();
	Base_Definition base = new Base_Definition();

	/*
	 * Check validation for Product code
	 *
	 */
	public void CheckValidation_ProductCode() {
		if (check.CheckTitle()) {
			if (getPRODUCT_CODE_ACTUAL().isDisplayed()) {
				String actualMessage = getPRODUCT_CODE_ACTUAL().getText().toString();
				if (actualMessage.equals(getPRODUCT_CODE_NOTNULL_EXPECTED())) {
					System.out.print("Reqiured field, Pls input value in this field"
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		} else {
			if (check.CheckConfirmTitle()) {
				base.getBtnLogout();
			}
		}
	}
	 /*End Check*/
	
	/*
	 * Check validation for service name
	 *
	 */
	public void CheckValidation_ServiceName() {
		if (check.CheckTitle()) {
			if (getSERVICE_NAME_ACTUAL().isDisplayed()) {
				String actualMessage = getSERVICE_NAME_ACTUAL().getText().toString();
				if (actualMessage.equals(getSERVICE_NAME_NOTNULL_EXPECTED())) {
					System.out.print("Reqiured field, Pls input value in this field"
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		} else {
			if (check.CheckConfirmTitle()) {
				base.getBtnLogout();
			}
		}
	}
	 /*End Check*/
	
	/*
	 * Check validation for displayOrder 
	 *
	 */
	public void CheckValidation_displayOrder() {
		if (check.CheckTitle()) {
			if (getDISPLAY_ORDER_ACTUAL().isDisplayed()) {
				String actualMessage = getDISPLAY_ORDER_ACTUAL().getText().toString();
				if (actualMessage.equals(getDISPLAY_ORDER_NOTNULL_EXPECTED())) {
					System.out.print("Reqiured field, Pls input value in this field"
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		} else {
			if (check.CheckConfirmTitle()) {
				base.getBtnLogout();
			}
		}
	}
	 /*End Check*/
	
	/*
	 * Check validation for displayOrder 
	 *
	 */
	public void CheckValidation_tagSeo() {
		if (check.CheckTitle()) {
			if (getTAGSEO_ACTUAL().isDisplayed()) {
				String actualMessage = getTAGSEO_ACTUAL().getText().toString();
				if (actualMessage.equals(getTAGSEO_NOTNULL_EXPECTED())) {
					System.out.print("Reqiured field, Pls input value in this field"
							+ " '" + actualMessage + "' ==> true" + "\n");
				}
			}
		} else {
			if (check.CheckConfirmTitle()) {
				base.getBtnLogout();
			}
		}
	}
	 /*End Check*/
}
