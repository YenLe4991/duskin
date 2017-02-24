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

public class UT_CheckValidation_AddKeyword {
	String dataPath = "./src/main/java/DataTest/AddKeyword.xls";
	private String ad = "[Add]";
	Base_Definition bs = new Base_Definition();
	UT_KeywordSearch kw = new UT_KeywordSearch();
	Keyword_Validation kv = new Keyword_Validation();

	@Test (priority = 0)
	public void TestKeywordNullAllFields () throws InterruptedException, IOException{
		kw.AddKeywordNullAllFields();
		bs.captureScreenShoot(ad, "Keyword_null");
		bs.close();
	}
	
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
			kw.AddConditionKeyword(keyword, category, url, post_flag, abSVar,
					keywordEdit, urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			kv.CheckValidation_Keyword();
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
			kw.AddConditionKeyword(keyword, category, url, post_flag, abSVar,
					keywordEdit, urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			// kv.CheckValidation_Url();
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
