package duskin.uttest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Check_Validation.Ranking_Validation;
import Define_function_Test.UT_Ranking;
import base.Base_Definition;
import base.ReadData;

public class UT_CheckValidation_EditRanking {
	String dataPath = "./src/main/java/DataTest/EditRanking.xls";
	private String ad = "[Edit]";
	Base_Definition bs = new Base_Definition();
	UT_Ranking rn = new UT_Ranking();
	Ranking_Validation bv = new Ranking_Validation();

	@DataProvider(name = "RankingName")
	public Object[][] testDataRankingName() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "rankingname");
		return arrayObject;
	}

	@Test(dataProvider = "RankingName")
	public void TestBannerName(String name, String type, String postFlag,
			String productCode1, String abSVar, String nameEdit,
			String productEdit) throws InterruptedException, IOException {
		try {
			// bs.load();
			rn.EditRanking(name, type, postFlag, productCode1,
					abSVar, nameEdit, productEdit);
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
	
	@DataProvider(name = "RankingProduct")
	public Object[][] testDataProduct() {
		Object[][] arrayObject = ReadData.getExcelData(dataPath, "product");
		return arrayObject;
	}

	@Test(dataProvider = "RankingProduct")
	public void TestAddProduct(String name, String type, String postFlag,
			String productCode1, String abSVar, String nameEdit,
			String productEdit) throws InterruptedException,
			IOException {
		try {
			// bs.load();
			rn.EditRanking(name, type, postFlag, productCode1,
					abSVar, nameEdit, productEdit);
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

}
