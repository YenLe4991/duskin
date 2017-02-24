package Define_function_Test;

import org.openqa.selenium.By;

import base.Base_Definition;

public class UT_Product extends Base_Definition {

	Base_Definition baseObj = new Base_Definition();

	public void AddNewProduct(String prCode, String serviceName,
			String postFlag, String prDisplay, String prAttribute,
			String displayOrder, String newDisplay, String tagSEO,
			String delivInfo, String displayNote, String abSvar,
			String productEdit, String serviceNameEdit,
			String displayOrderEdit, String tagSEOEdit)
			throws InterruptedException {
		baseObj.Login_Duskin();
		baseObj.getProductFunction().click();
		baseObj.getBtnAddProduct().click();
		baseObj.getProductCode().clear();
		baseObj.getProductCode().sendKeys(prCode);
		baseObj.getServiceName().clear();
		baseObj.getServiceName().sendKeys(serviceName);
		if (postFlag.equals("1")) {
			baseObj.getPublicPrFlag().click();
		} else if (postFlag.equals("0")) {
			baseObj.getNonPublicPrFlag().click();
		}

		if (prDisplay.equals("0")) {
			baseObj.getDisplayDetail().click();
		} else if (prDisplay.equals("1")) {
			baseObj.getDisplayReview().click();
		} else if (prDisplay.equals("2")) {
			baseObj.getDisplayAll().click();
		}

		if (prAttribute.equals("0")) {
			baseObj.getRentalProducts().click();
		} else if (prAttribute.equals("1")) {
			baseObj.getServiceRelated().click();
		} else
			baseObj.getSalesProduct().click();

		baseObj.getDisplayOrder().clear();
		baseObj.getDisplayOrder().sendKeys(displayOrder);
		if (newDisplay.equals("1")) {
			baseObj.getNewDisplay().click();
		} else {
			baseObj.getNonNewDisplay().click();
		}

		baseObj.getTagSEO().clear();
		baseObj.getTagSEO().sendKeys(tagSEO);

		baseObj.getSwitchToCartTag().click();

		if (delivInfo.equals("1")) {
			baseObj.getDisplayDelivInfo().click();
		} else {
			baseObj.getNonDisplayDelivInfo().click();
		}

		if (displayNote.equals("1")) {
			baseObj.getDisplayNote().click();
		} else {
			baseObj.getNonDisplayNote().click();
		}

		baseObj.getBtnProductSubmit().click();
		String var = abSvar;
		String var1 = productEdit;
		String var2 = serviceNameEdit;
		String var3 = displayOrderEdit;
		String var4 = tagSEOEdit;
	}
	
	public void AddProductNullAllFields () throws InterruptedException{
		baseObj.Login_Duskin();
		baseObj.getProductFunction().click();
		baseObj.getBtnAddProduct().click();
		baseObj.getBtnProductSubmit().click();
	}

	public void EditProduct(String prCode, String serviceName, String postFlag,
			String prDisplay, String prAttribute, String displayOrder,
			String newDisplay, String tagSEO, String delivInfo,
			String displayNote, String abSvar, String productEdit,
			String serviceNameEdit, String displayOrderEdit, String tagSEOEdit)
			throws InterruptedException {
		AddNewProduct(prCode, serviceName, postFlag, prDisplay, prAttribute,
				displayOrder, newDisplay, tagSEO, delivInfo, displayNote,
				abSvar, productEdit, serviceNameEdit, displayOrderEdit,
				tagSEOEdit);
		baseObj.getBtnProductConfirm().click();
		baseObj.getBtnBackToLits().click();
		driver.findElement(
				By.xpath("//td[contains(.," + "'" + prCode + "'"
						+ ")]/following-sibling::td/a[contains(.,'ï“èW')]"))
				.click();
		baseObj.getProductCode().clear();
		baseObj.getProductCode().sendKeys(productEdit);
		baseObj.getServiceName().clear();
		baseObj.getServiceName().sendKeys(serviceNameEdit);
		if (postFlag.equals("1")) {
			baseObj.getPublicPrFlag().click();
		} else if (postFlag.equals("0")) {
			baseObj.getNonPublicPrFlag().click();
		}

		if (prDisplay.equals("0")) {
			baseObj.getDisplayDetail().click();
		} else if (prDisplay.equals("1")) {
			baseObj.getDisplayReview().click();
		} else if (prDisplay.equals("2")) {
			baseObj.getDisplayAll().click();
		}

		if (prAttribute.equals("0")) {
			baseObj.getRentalProducts().click();
		} else if (prAttribute.equals("1")) {
			baseObj.getServiceRelated().click();
		} else
			baseObj.getSalesProduct().click();

		baseObj.getDisplayOrder().clear();
		baseObj.getDisplayOrder().sendKeys(displayOrderEdit);
		if (newDisplay.equals("1")) {
			baseObj.getNewDisplay().click();
		} else {
			baseObj.getNonNewDisplay().click();
		}

		baseObj.getTagSEO().clear();
		baseObj.getTagSEO().sendKeys(tagSEOEdit);

		baseObj.getSwitchToCartTag().click();

		if (delivInfo.equals("1")) {
			baseObj.getDisplayDelivInfo().click();
		} else {
			baseObj.getNonDisplayDelivInfo().click();
		}

		if (displayNote.equals("1")) {
			baseObj.getDisplayNote().click();
		} else {
			baseObj.getNonDisplayNote().click();
		}

		baseObj.getBtnProductSubmit().click();
		String var = abSvar;
	}
}
