package Define_function_Test;

import java.io.IOException;

import org.openqa.selenium.By;

import base.Base_Definition;

public class UT_KeywordSearch extends Base_Definition {

	private Base_Definition baseObj = new Base_Definition();

	public void AddConditionKeyword(String keyword, String category,
			String url, String post_flag, String abSVar, String keywordEdit,
			String urlEdit) throws InterruptedException, IOException {

		baseObj.Login_Duskin();
		baseObj.getKeyWordFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getKeyWord().clear();
		baseObj.getKeyWord().sendKeys(keyword);
		baseObj.getCategory().sendKeys(category);
		baseObj.getUrl().clear();
		baseObj.getUrl().sendKeys(url);
		baseObj.getOpenNewWindow().click();
		// baseObj.getPublished().click();
		if (post_flag.equals("1")) {
			baseObj.getPublished().click();
		} else if (post_flag.equals("0")) {
			baseObj.getNotPosted().click();
		}
		baseObj.getBtnKeyWordSubmit().click();
		String var = abSVar;
		String var1 = keywordEdit;
		String var2 = urlEdit;
		/*
		 * baseObj.getBtnConfirm().click(); baseObj.getBtnBackToLits().click();
		 */
	}

	public void AddKeywordNullAllFields () throws InterruptedException{
		baseObj.Login_Duskin();
		baseObj.getKeyWordFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getBtnKeyWordSubmit().click();
	}
	
	public void EditConditionKeyword(String keyword, String category,
			String url, String post_flag, String abSVar, String keywordEdit,
			String urlEdit) throws InterruptedException, IOException {
		AddConditionKeyword(keyword, category, url, post_flag, abSVar,
				keywordEdit, urlEdit);
		baseObj.getBtnKeyWordConfirm().click();
		baseObj.getBtnBackToLits().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + keyword + "'"
						+ ")]/following-sibling::td/a[contains(.,'ï“èW')]"))
				.click();
		baseObj.getKeyWord().clear();
		baseObj.getKeyWord().sendKeys(keywordEdit);
		baseObj.getCategory().sendKeys(category);
		baseObj.getUrl().clear();
		baseObj.getUrl().sendKeys(urlEdit);
		baseObj.getOpenNewWindow().click();
		if (post_flag == "1 ") {
			baseObj.getPublished().click();
		} else if (post_flag == "0") {
			baseObj.getNotPosted().click();
		}
		baseObj.getBtnKeyWordSubmit().click();
		String var = abSVar;
	}

	public void DeleteKeyword(String name) throws InterruptedException {
		Base_Definition baseObj = new Base_Definition();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + name + "'"
						+ ")]/following-sibling::td/a[contains(.,'çÌèú')]"))
				.click();
		baseObj.getBtnConfirmKeywordDelete().click();
	}

}
