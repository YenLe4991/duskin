package Define_function_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base_Definition;

public class UT_ThemeList extends Base_Definition {

	Base_Definition baseObj = new Base_Definition();

	public void AddThemeList(String themeName, String systemName,
			String themeFile, String abSVar, String themeNameEdit,
			String sysNameEdit, String themeFileEdit)
			throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getThemeFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getThemeName().clear();
		baseObj.getThemeName().sendKeys(themeName);
		baseObj.getSystemIdentificationName().clear();
		baseObj.getSystemIdentificationName().sendKeys(systemName);
		baseObj.getThemeFile().clear();
		baseObj.getThemeFile().sendKeys(
				System.getProperty("user.dir") + "\\" + themeFile);
		baseObj.getBtnKeyWordSubmit().click();
		String var = abSVar;
		String var1 = themeNameEdit;
		String var2 = sysNameEdit;
		String var3 = themeFileEdit;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}

	public void AddThemeNullAllFields() throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getThemeFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getBtnThemeSubmit().click();
	}

	public void EditTheme(String themeName, String systemName,
			String themeFile, String abSVar, String themeNameEdit,
			String sysNameEdit, String themeFileEdit)
			throws InterruptedException {
		AddThemeList(themeName, systemName, themeFile, abSVar, themeNameEdit,
				sysNameEdit, themeFileEdit);
		baseObj.getBtnThemeConfirm().click();
		baseObj.getBtnBackToLits().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + themeName + "'"
						+ ")]/following-sibling::td/a[contains(.,'ï“èW')]"))
				.click();
		baseObj.getThemeName().clear();
		baseObj.getThemeName().sendKeys(themeNameEdit);
		baseObj.getSystemIdentificationName().clear();
		baseObj.getSystemIdentificationName().sendKeys(sysNameEdit);
		baseObj.getThemeFile().clear();
		baseObj.getThemeFile().sendKeys(
				System.getProperty("user.dir") + "\\" + themeFile);
		baseObj.getBtnThemeSubmit().click();
		String var = abSVar;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}
}
