package Define_function_Test;

import org.openqa.selenium.By;

import base.Base_Definition;

public class UT_Ranking extends Base_Definition {

	Base_Definition baseObj = new Base_Definition();
	public void AddNewRanking(String name, String type, String postFlag,
			String productCode1, String abSVar, String nameEdit,
			String productEdit) throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getRankingFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getRankingName().clear();
		baseObj.getRankingName().sendKeys(name);
		baseObj.getRankingType().sendKeys(type);
		if (postFlag.equals("1")) {
			baseObj.getRankingPublicFlag().click();
		} else if (postFlag.equals("0")) {
			baseObj.getRankingNotPublicFlag().click();
		}
		baseObj.getProductCode1().clear();
		baseObj.getProductCode1().sendKeys(productCode1);
		baseObj.getBtnSearchProductCode1().click();
		
		baseObj.getBtnBannerSubmit().click();
		String var = abSVar;
		String var1 = nameEdit;
		String var2 = productEdit;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}
	
	public void AddRankingNullAllFields () throws InterruptedException{
		baseObj.Login_Duskin();
		baseObj.getRankingFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getBtnRankingSubmit().click();
	}

	public void EditRanking(String name, String type, String postFlag,
			String productCode1, String abSVar, String nameEdit,
			String productEdit) throws InterruptedException {
		AddNewRanking(name, type, postFlag, productCode1,
				abSVar, nameEdit, productEdit);
		baseObj.getBtnRankingConfirm().click();
		baseObj.getBtnBackToLits().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + name + "'"
						+ ")]/following-sibling::td/a[contains(.,'ï“èW')]"))
				.click();
		baseObj.getRankingName().clear();
		baseObj.getRankingName().sendKeys(nameEdit);
		baseObj.getRankingType().sendKeys(type);
		if (postFlag.equals("1")) {
			baseObj.getRankingPublicFlag().click();;
		} else if (postFlag.equals("0")) {
			baseObj.getRankingNotPublicFlag().click();
		}
		baseObj.getProductCode1().clear();
		baseObj.getProductCode1().sendKeys(productEdit);
		baseObj.getBtnSearchProductCode1().click();
		baseObj.getBtnRankingSubmit().click();
		baseObj.getBtnRankingConfirm().click();
		baseObj.getBtnBackToLits().click();
		String var = abSVar;
	}

	public void DeleteBanner(String name) throws InterruptedException {
		Base_Definition baseObj = new Base_Definition();

		driver.findElement(
				By.xpath("//td[contains(.," + "'" + name + "'"
						+ ")]/following-sibling::td/a[contains(.,'çÌèú')]"))
				.click();
		baseObj.getBtnRankingConfirmDelete().click();
	}
}
