package duskin.uttest;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Define_function_Test.UT_SubCategory;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_AddSubCategory {
	String dataPath = "./src/main/java/DataTest/AddSubCategory.xls";
	private String ad = "[Add]";
	Base_Definition bs = new Base_Definition();
	UT_SubCategory sca = new UT_SubCategory();

	// Keyword_Validation cv = new Keyword_Validation();

	@Test(priority = 0)
	public void TestCategoryNullAllFields() throws InterruptedException,
			IOException {
		sca.AddSubCategoryNullAllFields();
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
	public void TestCategoryName(String categoryParent, String subName,
			String directoryName, String listFileSub, String detailDirectory,
			String post_flag, String tagSEO, String abSvar, String subNameEdit,
			String directoryNameEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			sca.AddSubCategory(categoryParent, subName, directoryName,
					listFileSub, detailDirectory, post_flag, tagSEO, abSvar,
					subNameEdit, directoryNameEdit);
			bs.captureScreenShoot(ad, abSvar);
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
