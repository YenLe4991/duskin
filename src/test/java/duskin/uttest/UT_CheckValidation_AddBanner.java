package duskin.uttest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Check_Validation.Banner_Validation;
import Check_Validation.ThemeList_Validation;
import Define_function_Test.UT_Banner;
import Define_function_Test.UT_ThemeList;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_AddBanner {
	String dataPath = "./src/main/java/DataTest/AddBanner.xls";
	private String ad = "[Add]";
	Base_Definition bs = new Base_Definition();
	UT_Banner bn = new UT_Banner();
	Banner_Validation bv = new Banner_Validation();

	@Test(priority = 0)
	public void TestBannerNullAllFields() throws InterruptedException,
			IOException {
		bn.AddBannerNullAllFields();
		bs.captureScreenShoot(ad, "Banner_null");
		bs.close();
	}

	@DataProvider(name = "BannerName")
	public Object[][] testDataBannerName() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "bannername");
		return arrayObject;
	}

	@Test(dataProvider = "BannerName")
	public void TestBannerName(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit,
			String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			// bv.CheckValidation_BannerName();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "BannerFilePC")
	public Object[][] testDataFilePC() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "pc_file");
		return arrayObject;
	}

	@Test(dataProvider = "BannerFilePC")
	public void TestFilePC(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit,
			String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			bv.CheckValidation_BannerPC();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "BannerAltTextPC")
	public Object[][] testDataBannerAltText() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "alttextpc");
		return arrayObject;
	}

	@Test(dataProvider = "BannerAltTextPC")
	public void TestBannerAltText(String name, String type,
			String bannerFilePC, String AltText, String bannerFileSP,
			String AltTextSP, String note, String Url, String abSVar,
			String nameEdit, String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			bv.CheckValidation_BannerAltTextPC();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}
	
	@DataProvider(name = "BannerFileSP")
	public Object[][] testDataFileSP() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "sp_file");
		return arrayObject;
	}

	@Test(dataProvider = "BannerFileSP")
	public void TestFileSP(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit,
			String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			bv.CheckValidation_BannerSP();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}
	
	@DataProvider(name = "BannerAltTextSP")
	public Object[][] testDataBannerAltTextSP() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "alt_sp");
		return arrayObject;
	}

	@Test(dataProvider = "BannerAltTextSP")
	public void TestBannerAltTextSP(String name, String type,
			String bannerFilePC, String AltText, String bannerFileSP,
			String AltTextSP, String note, String Url, String abSVar,
			String nameEdit, String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			bv.CheckValidation_BannerAltTextSP();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "BannerNote")
	public Object[][] testDataBannerNote() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "notetext");
		return arrayObject;
	}

	@Test(dataProvider = "BannerNote")
	public void TestBannerNote(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit,
			String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			bv.CheckValidation_BannerNoteText();
			bs.close();
		} catch (Error e) {
			PrintStream verificationErrors = null;
			// Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
			System.err.println("Assertion Fail "
					+ verificationErrors.toString());
		}
	}

	@DataProvider(name = "BannerUrl")
	public Object[][] testDataBannerUrl() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "url");
		return arrayObject;
	}

	@Test(dataProvider = "BannerUrl")
	public void TestBannerUrl(String name, String type, String bannerFilePC,
			String AltText, String bannerFileSP, String AltTextSP, String note,
			String Url, String abSVar, String nameEdit,
			String bannerPCFileEdit, String altTextPCEdit,
			String bannerSPFileEdit, String altTextSPEdit, String noteEdit,
			String urlEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			bn.AddNewBanner(name, type, bannerFilePC, AltText, bannerFileSP,
					AltTextSP, note, Url, abSVar, nameEdit, bannerPCFileEdit,
					altTextPCEdit, bannerSPFileEdit, altTextSPEdit, noteEdit,
					urlEdit);
			bs.captureScreenShoot(ad, abSVar);
			bv.CheckValidation_BannerUrl();
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
