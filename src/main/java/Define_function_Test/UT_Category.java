package Define_function_Test;

import java.io.IOException;

import org.openqa.selenium.By;

import base.Base_Definition;

public class UT_Category extends Base_Definition{
	private Base_Definition baseObj = new Base_Definition();

	public void AddCategory(String category, String themeDesign,
			String pathName, String listFileName, String post_flag,
			String abSVar, String categoryEdit, String pathNameEdit)
			throws InterruptedException, IOException {

		baseObj.Login_Duskin();
		baseObj.getCategoryFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getCategoryName().clear();
		baseObj.getCategoryName().sendKeys(category);
		baseObj.getThemeDesign().sendKeys(themeDesign);
		baseObj.getPathName().clear();
		baseObj.getPathName().sendKeys(pathName);
		baseObj.getListFileName().clear();
		baseObj.getListFileName().sendKeys(listFileName);
		// baseObj.getPublished().click();
		if (post_flag.equals("1")) {
			baseObj.getPublicCaFlag().click();
		} else if (post_flag.equals("0")) {
			baseObj.getNoPublicCaFlag().click();
		}
		baseObj.getBtnCategorySubmit().click();
		String var = abSVar;
		String var1 = categoryEdit;
		String var2 = pathNameEdit;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}

	public void AddCategoryNullAllFields() throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getCategoryFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getBtnCategorySubmit().click();
	}

	public void EditCategory(String category, String themeDesign,
			String pathName, String listFileName, String post_flag,
			String abSVar, String categoryEdit, String pathNameEdit)
			throws InterruptedException, IOException {

		AddCategory(category, themeDesign, pathName, listFileName, post_flag,
				abSVar, categoryEdit, pathNameEdit);
		baseObj.getBtnCategorySubmit().click();
		baseObj.getBtnBackToLits().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + category + "'"
						+ ")]/following-sibling::td/a[contains(.,'ï“èW')]"))
				.click(); 
		baseObj.getCategoryName().clear();
		baseObj.getCategoryName().sendKeys(categoryEdit);
		baseObj.getThemeDesign().sendKeys(themeDesign);
		baseObj.getPathName().clear();
		baseObj.getPathName().sendKeys(pathNameEdit);
		baseObj.getListFileName().clear();
		baseObj.getListFileName().sendKeys(listFileName);
		// baseObj.getPublished().click();
		if (post_flag.equals("1")) {
			baseObj.getPublicCaFlag().click();
		} else if (post_flag.equals("0")) {
			baseObj.getNoPublicCaFlag().click();
		}
		baseObj.getBtnCategorySubmit().click();
		String var = abSVar;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}
}
