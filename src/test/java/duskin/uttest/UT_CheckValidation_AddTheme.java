package duskin.uttest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Check_Validation.Keyword_Validation;
import Check_Validation.ThemeList_Validation;
import Define_function_Test.UT_KeywordSearch;
import Define_function_Test.UT_ThemeList;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_AddTheme {
	String dataPath = "./src/main/java/DataTest/AddTheme.xls";
	private String ad = "[Add]";
	Base_Definition bs = new Base_Definition();
	UT_ThemeList kw = new UT_ThemeList();
	ThemeList_Validation kv = new ThemeList_Validation();

	@Test(priority = 0)
	public void TestThemeNullAllFields() throws InterruptedException,
			IOException {
		kw.AddThemeNullAllFields();
		bs.captureScreenShoot(ad, "Theme_null");
		bs.close();
	}

	@DataProvider(name = "ThemeName")
	public Object[][] testDataThemeName() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "themename");
		return arrayObject;
	}

	@Test(dataProvider = "ThemeName")
	public void TestThemeName(String themeName, String systemName,
			String themeFile, String abSVar, String themeNameEdit,
			String sysNameEdit, String themeFileEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			kw.AddThemeList(themeName, systemName, themeFile, abSVar,
					themeNameEdit, sysNameEdit, themeFileEdit);
			bs.captureScreenShoot(ad, abSVar);
			kv.CheckValidation_ThemeName();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "ThemeSystemName")
	public Object[][] testDataThemeSystemName() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "systemname");
		return arrayObject;
	}

	@Test(dataProvider = "ThemeSystemName")
	public void TestThemeSystemName(String themeName, String systemName,
			String themeFile, String abSVar, String themeNameEdit,
			String sysNameEdit, String themeFileEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			kw.AddThemeList(themeName, systemName, themeFile, abSVar,
					themeNameEdit, sysNameEdit, themeFileEdit);
			bs.captureScreenShoot(ad, abSVar);
			kv.CheckValidation_SystemName();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "ThemeFile")
	public Object[][] testDataThemeFile() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "themefile");
		return arrayObject;
	}

	@Test(dataProvider = "ThemeFile")
	public void TestThemeFile(String themeName, String systemName,
			String themeFile, String abSVar, String themeNameEdit,
			String sysNameEdit, String themeFileEdit)
			throws InterruptedException, IOException {
		try {
			// bs.load();
			kw.AddThemeList(themeName, systemName, themeFile, abSVar,
					themeNameEdit, sysNameEdit, themeFileEdit);
			bs.captureScreenShoot(ad, abSVar);
			kv.CheckValidation_ThemeFile();
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
