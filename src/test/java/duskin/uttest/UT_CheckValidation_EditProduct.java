package duskin.uttest;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Define_function_Test.UT_Product;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_EditProduct {
	String dataPath = "./src/main/java/DataTest/EditProduct.xls";
	private String ad = "[Edit]";
	Base_Definition bs = new Base_Definition();
	UT_Product pr = new UT_Product();

	// Keyword_Validation kv = new Keyword_Validation();

	@DataProvider(name = "ProductCode")
	public Object[][] testDataProductCode() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "product");
		return arrayObject;
	}

	@Test(dataProvider = "ProductCode")
	public void TestProductCode(String prCode, String serviceName,
			String postFlag, String prDisplay, String prAttribute,
			String displayOrder, String newDisplay, String tagSEO,
			String delivInfo, String displayNote, String abSvar,
			String productEdit, String serviceNameEdit,
			String displayOrderEdit, String tagSEOEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			pr.EditProduct(prCode, serviceName, postFlag, prDisplay,
					prAttribute, displayOrder, newDisplay, tagSEO, delivInfo,
					displayNote, abSvar, productEdit, serviceNameEdit,
					displayOrderEdit, tagSEOEdit);
			bs.captureScreenShoot(ad, abSvar);
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "ServiceName")
	public Object[][] testDataServiceName() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "serviceName");
		return arrayObject;
	}

	@Test(dataProvider = "ServiceName")
	public void TestServiceName(String prCode, String serviceName,
			String postFlag, String prDisplay, String prAttribute,
			String displayOrder, String newDisplay, String tagSEO,
			String delivInfo, String displayNote, String abSvar,
			String productEdit, String serviceNameEdit,
			String displayOrderEdit, String tagSEOEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			pr.EditProduct(prCode, serviceName, postFlag, prDisplay,
					prAttribute, displayOrder, newDisplay, tagSEO, delivInfo,
					displayNote, abSvar, productEdit, serviceNameEdit,
					displayOrderEdit, tagSEOEdit);
			bs.captureScreenShoot(ad, abSvar);
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "DisplayOrder")
	public Object[][] testDataDisplayOder() {
		Object[][] arrayObject = ReadData
				.getExcelData(dataPath, "displayOrder");
		return arrayObject;
	}

	@Test(dataProvider = "DisplayOrder")
	public void TestDisplayOrder(String prCode, String serviceName,
			String postFlag, String prDisplay, String prAttribute,
			String displayOrder, String newDisplay, String tagSEO,
			String delivInfo, String displayNote, String abSvar,
			String productEdit, String serviceNameEdit,
			String displayOrderEdit, String tagSEOEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			pr.EditProduct(prCode, serviceName, postFlag, prDisplay,
					prAttribute, displayOrder, newDisplay, tagSEO, delivInfo,
					displayNote, abSvar, productEdit, serviceNameEdit,
					displayOrderEdit, tagSEOEdit);
			bs.captureScreenShoot(ad, abSvar);
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "TagSEO")
	public Object[][] testDataTagSeo() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "tagSeo");
		return arrayObject;
	}

	@Test(dataProvider = "TagSEO")
	public void TestTagSeo(String prCode, String serviceName, String postFlag,
			String prDisplay, String prAttribute, String displayOrder,
			String newDisplay, String tagSEO, String delivInfo,
			String displayNote, String abSvar, String productEdit,
			String serviceNameEdit, String displayOrderEdit, String tagSEOEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			pr.EditProduct(prCode, serviceName, postFlag, prDisplay,
					prAttribute, displayOrder, newDisplay, tagSEO, delivInfo,
					displayNote, abSvar, productEdit, serviceNameEdit,
					displayOrderEdit, tagSEOEdit);
			bs.captureScreenShoot(ad, abSvar);
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}
}
