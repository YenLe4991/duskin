package duskin.uttest;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Define_function_Test.UT_Category;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_EditCategory {
	String dataPath = "./src/main/java/DataTest/EditCategory.xls";
	private String ad = "[Edit]";
	Base_Definition bs = new Base_Definition();
	UT_Category ca = new UT_Category();

	// Keyword_Validation cv = new Keyword_Validation();

	@Test(priority = 0)
	public void TestCategoryNullAllFields() throws InterruptedException,
			IOException {
		ca.AddCategoryNullAllFields();
		bs.captureScreenShoot(ad, "Category_null");
		bs.close();
	}

	@DataProvider(name = "CategoryName")
	public Object[][] testDataCategoryName() {
		Object[][] arrayObject = ReadData
				.getExcelData(dataPath, "categoryName");
		return arrayObject;
	}

	@Test(dataProvider = "CategoryName")
	public void TestCategoryName(String category, String themeDesign,
			String pathName, String listFileName, String post_flag,
			String abSVar, String categoryEdit, String pathNameEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			ca.EditCategory(category, themeDesign, pathName, listFileName,
					post_flag, abSVar, categoryEdit, pathNameEdit);
			bs.captureScreenShoot(ad, abSVar);
			// cv.CheckValidation_Keyword();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "PathName")
	public Object[][] testDataListFile() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "pathName");
		return arrayObject;
	}

	@Test(dataProvider = "PathName")
	public void TestListFile(String category, String themeDesign,
			String pathName, String listFileName, String post_flag,
			String abSVar, String categoryEdit, String pathNameEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			ca.EditCategory(category, themeDesign, pathName, listFileName,
					post_flag, abSVar, categoryEdit, pathNameEdit);
			bs.captureScreenShoot(ad, abSVar);
			// cv.CheckValidation_Keyword();
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
