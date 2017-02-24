package Define_function_Test;

import org.openqa.selenium.By;

import base.Base_Definition;

public class UT_Banner extends Base_Definition {
	private String editWord = "_Edit";
	Base_Definition baseObj = new Base_Definition();

	public void AddNewBanner(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit,
			String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException {
		/*
		 * Login lg = new Login(); lg.Login_Duskin("jhash", "ajksf");
		 */
		baseObj.Login_Duskin();
		baseObj.getBannerFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getBannerName().clear();
		baseObj.getBannerName().sendKeys(name);
		baseObj.getPostingType().sendKeys(type);
		baseObj.getBannerFilePC().clear();
		baseObj.getBannerFilePC().sendKeys(
				System.getProperty("user.dir") + "\\" + bannerFilePC);
		baseObj.getAltTextPC().clear();
		baseObj.getAltTextPC().sendKeys(AltText);
		baseObj.getBannerFileSP().clear();
		baseObj.getBannerFileSP().sendKeys(
				System.getProperty("user.dir") + "\\" + bannerFileSP);
		baseObj.getAltTextSP().clear();
		baseObj.getAltTextSP().sendKeys(AltTextSP);
		baseObj.getBannerNoteText().clear();
		baseObj.getBannerNoteText().sendKeys(note);
		baseObj.getBannerUrl().clear();
		baseObj.getBannerUrl().sendKeys(Url);
		baseObj.getOpenNewWindow().click();
		baseObj.getBtnBannerSubmit().click();
		String var = abSVar;
		String var1 = nameEdit;
		String var2 = altTextSPEdit;
		String var3 = altTextPCEdit;
		String var4 = noteEdit;
		String var5 = urlEdit;
		String var6 = bannerFilePC;
		String var7 = bannerFileSP;
	}

	public void AddBannerNullAllFields() throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getBannerFunction().click();
		baseObj.getBtnAddNew().click();
		baseObj.getBtnBannerSubmit().click();
	}

	public void EditBanner(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit, String bannerPCFileEdit,
			String altTextPCEdit, String bannerSPFileEdit,
			String altTextSPEdit, String noteEdit, String urlEdit)
			throws InterruptedException {
		AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
				AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
				altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
				urlEdit);
		baseObj.getBtnBannerConfirm().click();
		baseObj.getBtnBackToLits().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + name + "'"
						+ ")]/following-sibling::td/a[contains(.,'ï“èW')]"))
				.click();
		baseObj.getBannerName().sendKeys(nameEdit);
		baseObj.getPostingType().clear();
		baseObj.getPostingType().sendKeys(type);
		baseObj.getBannerFilePC().clear();
		baseObj.getBannerFilePC().sendKeys(
				System.getProperty("user.dir") + "\\" + bannerPCFileEdit);
		baseObj.getAltTextPC().clear();
		baseObj.getAltTextPC().sendKeys(altTextPCEdit);
		baseObj.getBannerFileSP().clear();
		baseObj.getBannerFileSP().sendKeys(
				System.getProperty("user.dir") + "\\" + bannerSPFileEdit);
		baseObj.getAltTextSP().clear();
		baseObj.getAltTextSP().sendKeys(altTextSPEdit);
		baseObj.getBannerNoteText().clear();
		baseObj.getBannerNoteText().sendKeys(noteEdit);
		baseObj.getBannerUrl().clear();
		baseObj.getBannerUrl().sendKeys(urlEdit);
		baseObj.getOpenNewWindow().click();
		baseObj.getBtnBannerSubmit().click();
		baseObj.getBtnBannerConfirm().click();
		baseObj.getBtnBackToLits().click();
		String var = abSVar;
	}

	public void DeleteBanner(String name) throws InterruptedException {
		Base_Definition baseObj = new Base_Definition();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + name + "'"
						+ ")]/following-sibling::td/a[contains(.,'çÌèú')]"))
				.click();
		baseObj.getBtnBannerConfirmDelete().click();
	}
}
