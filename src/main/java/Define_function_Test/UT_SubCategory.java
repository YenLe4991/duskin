package Define_function_Test;

import java.io.IOException;

import org.openqa.selenium.By;

import base.Base_Definition;

public class UT_SubCategory extends Base_Definition {
	private Base_Definition baseObj = new Base_Definition();

	public void AddSubCategory(String categoryParent, String subName,
			String directoryName, String listFileSub, String detailDirectory,
			String post_flag, String tagSEO, String abSvar, String subNameEdit,
			String directoryNameEdit)
			throws InterruptedException, IOException {

		baseObj.Login_Duskin();
		baseObj.getCategoryFunction().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + "カテゴリ XXXX" + "'"
						+ ")]/following-sibling::td/a[contains(.,'追加')]"))
				.click();
		baseObj.getCategoryParent().sendKeys(categoryParent);
		baseObj.getSubCategoryName().clear();
		baseObj.getSubCategoryName().sendKeys(subName);
		baseObj.getDirectoryName().clear();
		baseObj.getDirectoryName().sendKeys(directoryName);
		baseObj.getListFileSub().clear();
		baseObj.getListFileSub().sendKeys(listFileSub);
		baseObj.getDetailDirectory().clear();
		baseObj.getDetailDirectory().sendKeys(detailDirectory);
		// baseObj.getPublished().click();
		if (post_flag.equals("1")) {
			baseObj.getPublicCaFlag().click();
		} else if (post_flag.equals("0")) {
			baseObj.getNoPublicCaFlag().click();
		}
		baseObj.getBtnCategorySubmit().click();
		String var = abSvar;
		String var1 = subNameEdit;
		String var2 = directoryNameEdit;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}

	public void AddSubCategoryNullAllFields() throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getCategoryFunction().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + "カテゴリ XXXX" + "'"
						+ ")]/following-sibling::td/a[contains(.,'追加')]"))
				.click();
		baseObj.getBtnCategorySubmit().click();
	}

	public void EditSubCategory(String categoryParent, String subName,
			String directoryName, String listFileSub, String detailDirectory,
			String post_flag, String tagSEO, String abSvar, String subNameEdit,
			String directoryNameEdit) throws InterruptedException, IOException {

		baseObj.Login_Duskin();
		baseObj.getCategoryFunction().click();

		driver.findElement(
				By.xpath("//td[contains(.," + "'" + "サブカテゴリ XXXXX" + "'"
						+ ")]/following-sibling::td/a[contains(.,'編集')]"))
				.click();
		baseObj.getCategoryParent().sendKeys(categoryParent);
		baseObj.getSubCategoryName().clear();
		baseObj.getSubCategoryName().sendKeys(subNameEdit);
		baseObj.getDirectoryName().clear();
		baseObj.getDirectoryName().sendKeys(directoryNameEdit);
		baseObj.getListFileSub().clear();
		baseObj.getListFileSub().sendKeys(listFileSub);
		baseObj.getDetailDirectory().clear();
		baseObj.getDetailDirectory().sendKeys(detailDirectory);
		// baseObj.getPublished().click();
		if (post_flag.equals("1")) {
			baseObj.getPublicCaFlag().click();
		} else if (post_flag.equals("0")) {
			baseObj.getNoPublicCaFlag().click();
		}
		baseObj.getBtnCategorySubmit().click();
		String var = abSvar;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}
}
