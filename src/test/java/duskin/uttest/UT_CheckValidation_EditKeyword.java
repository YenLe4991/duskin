package duskin.uttest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Check_Validation.Keyword_Validation;
import Define_function_Test.UT_KeywordSearch;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_EditKeyword {
	String dataPath = "./src/main/java/DataTest/EditKeyword.xls";
	private String ad = "[Edit]";

	Base_Definition bs = new Base_Definition();
	UT_KeywordSearch kw = new UT_KeywordSearch();
	Keyword_Validation kv = new Keyword_Validation();

	@DataProvider(name = "KeywordName")
	public Object[][] testDataKeywordName() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "keyname");
		return arrayObject;
	}

	@Test(dataProvider = "KeywordName")
	public void TestKeywordName(String keyword, String category, String url,
			String post_flag, String abSVar, String keywordEdit, String urlEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			kw.EditConditionKeyword(keyword, category, url, post_flag, abSVar,
					keywordEdit, urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			// kv.CheckValidation_Keyword();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "Category")
	public Object[][] testDataCategory() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "category");
		return arrayObject;
	}

	@Test(dataProvider = "Category")
	public void TestKeywordCategory(String keyword, String category,
			String url, String post_flag, String abSVar, String keywordEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			kw.EditConditionKeyword(keyword, category, url, post_flag, abSVar,
					keywordEdit, urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			kv.CheckValidation_Url();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "KeywordUrl")
	public Object[][] testDataKeywordUrl() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "keyurl");
		return arrayObject;
	}

	@Test(dataProvider = "KeywordUrl")
	public void TestKeywordUrl(String keyword, String category, String url,
			String post_flag, String abSVar, String keywordEdit, String urlEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			kw.EditConditionKeyword(keyword, category, url, post_flag, abSVar,
					keywordEdit, urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			kv.CheckValidation_Url();
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
