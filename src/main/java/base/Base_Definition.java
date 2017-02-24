/*
 * Base_Definition 
 * - define load(), close() brower method
 * - define WebElement of functions
 * - Define login method to login to site
 */
package base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Definition {
	// Define Variable
	public static WebDriver driver;
	static String captureFilepath = "Duskin_Evidence/";
	// URL of page need to test
	private String URL = "http://172.18.17.29/admin/login.html";
	private DesiredCapabilities cap;
	private String node_ip = "172.18.17.23";
	private String port = "5566";
	private String edl = "[ED_Low]", edt = "[ED_Top]";

	public String returnURL() {
		return this.URL;
	}

	// Sleep method
	public void sleep2000() throws InterruptedException {
		Thread.sleep(2000);
	}

	public void sleep1000() throws InterruptedException {
		Thread.sleep(1000);
	}

	public void sleep3000() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void sleep5000() throws InterruptedException {
		Thread.sleep(5000);
	}

	// Similar to setUp() function
	public Base_Definition() {
		cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setBrowserName("internet explorer");
	}

	// Load page after getting url
	public void load() throws InterruptedException {
		try {
			driver = new RemoteWebDriver(new URL("http://" + node_ip + ":"
					+ port + "/wd/hub"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		this.driver.get(URL);
		sleep5000();
		// driver.get("javascript:document.getElementById('overridelink').click();");
	}

	// Quit page after running test script
	public void close() {
		this.driver.quit();
	}

	// Get date time
	public static String getDateTime() {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
		String dateN = formatter.format(currentDate.getTime()).replace("/", "");
		String dateNow = dateN.replace(":", "");
		return dateNow;
	}

	public static String date = getDateTime().toString();

	// Capture screenshoot
	public void captureScreenShoot(String content, String name)
			throws IOException {
		File scrFile = null;
		scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(captureFilepath + content + name
				+ "_" + date + ".png"));
	}
	
	/*
	 * Define web element of login function
	 */
	
	@FindBy(name = "login_id")
	private WebElement userName;
	@FindBy(name = "password")
	private WebElement passWord;
	@FindBy(xpath = "//*[@id='loginForm']/input")
	private WebElement btnLogin;
	@FindBy(linkText = "ログアウト")
	private WebElement btnLogout;
	
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(WebElement btnLogout) {
		this.btnLogout = btnLogout;
	}

	public void Login_Duskin() throws InterruptedException{
		load();
		getUserName().clear();
		getUserName().sendKeys("jashfasf");
		getPassWord().clear();		
		getPassWord().sendKeys("jasfasf");
		getBtnLogin().click();
	}
	/* 
	 * Define web element of add or edit Keyword New addition input
	 */
	@FindBy(linkText = "キーワード管理")
	private WebElement keyWordFunction;
	@FindBy(xpath = "/html/body/div/div[2]/article[1]/header/a") 
	private WebElement btnAddNew;
	@FindBy(xpath = "//*[@id='form_k02']/td/input")
	private WebElement keyWord;
	@FindBy(xpath = "//*[@id='form_k04']/td/input[1]")
	private WebElement url;
	@FindBy(xpath = "//*[@id='link_brank']")
	private WebElement openNewWindow;
	@FindBy(xpath = "//*[@id='form_k03']/td/select")
	private WebElement category;
	@FindBy(xpath = "//*[@id='disp_flag_1']")
	private WebElement published;
	@FindBy(xpath = "//*[@id='disp_flag_2']") 
	private WebElement notPosted;
	@FindBy(xpath = "/html/body/div[1]/div[2]/article[2]/form/div[2]/input")
	private WebElement btnKeyWordSubmit;
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input") 
	private WebElement btnKeyWordConfirm;
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/p")
	private WebElement completeAddMessage;
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/div/a")
	private WebElement btnBackToLits;
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnConfirmKeywordDelete;
	
	
	public WebElement getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(WebElement keyWord) {
		this.keyWord = keyWord;
	}

	public WebElement getUrl() {
		return url;
	}

	public void setUrl(WebElement url) {
		this.url = url;
	}

	public WebElement getPublished() {
		return published;
	}

	public void setPublished(WebElement published) {
		this.published = published;
	}

	public WebElement getNotPosted() {
		return notPosted;
	}

	public void setNotPosted(WebElement notPosted) {
		this.notPosted = notPosted;
	}

	public WebElement getBtnKeyWordSubmit() {
		return btnKeyWordSubmit;
	}

	public void setBtnKeyWordSubmit(WebElement btnSubmit) {
		this.btnKeyWordSubmit = btnSubmit;
	}

	public WebElement getCategory() {
		return category;
	}

	public void setCategory(WebElement category) {
		this.category = category;
	}

	public WebElement getOpenNewWindow() {
		return openNewWindow;
	}

	public void setOpenNewWindow(WebElement openNewWindow) {
		this.openNewWindow = openNewWindow;
	}

	public WebElement getKeyWordFunction() {
		return keyWordFunction;
	}

	public void setKeyWordFunction(WebElement keyWordFunction) {
		this.keyWordFunction = keyWordFunction;
	}

	public WebElement getBtnAddNew() {
		return btnAddNew;
	}

	public void setBtnAddNew(WebElement btnAddNew) {
		this.btnAddNew = btnAddNew;
	}

	public WebElement getBtnKeyWordConfirm() {
		return btnKeyWordConfirm;
	}

	public void setBtnKeyWordConfirm(WebElement btnConfirm) {
		this.btnKeyWordConfirm = btnConfirm;
	}

	public WebElement getCompleteAddMessage() {
		return completeAddMessage;
	}

	public void setCompleteAddMessage(WebElement completeAddMessage) {
		this.completeAddMessage = completeAddMessage;
	}

	public WebElement getBtnBackToLits() {
		return btnBackToLits;
	}

	public void setBtnBackToLits(WebElement btnBackToLits) {
		this.btnBackToLits = btnBackToLits;
	}
	
	public WebElement getBtnConfirmKeywordDelete() {
		return btnConfirmKeywordDelete;
	}

	public void setBtnConfirmKeywordDelete(WebElement btnConfirmDelete) {
		this.btnConfirmKeywordDelete = btnConfirmDelete;
	}
	/*End get element of keyword*/
	
	/* 
	 * Define web element for theme list
	 */

	@FindBy(xpath = "/html/body/div/div[1]/article/nav/ul/li[3]/ul/li[2]/a")
	private WebElement themeFunction;

	@FindBy(xpath = "//*[@id='form_k02']/td/input")
	private WebElement themeName;

	@FindBy(xpath = "//*[@id='directory']")
	private WebElement systemIdentificationName;

	/*@FindBy(xpath = "//*[@id='form_k03']/td/input") //*[@id="form_k03"]/td/input
	private WebElement themeFile;*/
	@FindBy(name = "theme[zip]")
	private WebElement themeFile;

	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div[2]/input")
	private WebElement btnThemeSubmit;

	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnThemeConfirm;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnThemeConfirmDelete;

	public WebElement getThemeName() {
		return themeName;
	}

	public WebElement getThemeFunction() {
		return themeFunction;
	}

	public void setThemeFunction(WebElement themeFunction) {
		this.themeFunction = themeFunction;
	}
	
	public WebElement getSystemIdentificationName() {
		return systemIdentificationName;
	}

	public void setSystemIdentificationName(WebElement systemIdentificationName) {
		this.systemIdentificationName = systemIdentificationName;
	}

	public WebElement getThemeFile() {
		return themeFile;
	}

	public void setThemeFile(WebElement themeFile) {
		this.themeFile = themeFile;
	}
	public void setThemeName(WebElement themeName) {
		this.themeName = themeName;
	}
	
	public WebElement getBtnThemeSubmit() {
		return btnThemeSubmit;
	}

	public void setBtnThemeSubmit(WebElement btnThemeSubmit) {
		this.btnThemeSubmit = btnThemeSubmit;
	}

	public WebElement getBtnThemeConfirm() {
		return btnThemeConfirm;
	}

	public void setBtnThemeConfirm(WebElement btnThemeConfirm) {
		this.btnThemeConfirm = btnThemeConfirm;
	}
	
	public WebElement getBtnThemeConfirmDelete() {
		return btnThemeConfirmDelete;
	}

	public void setBtnThemeConfirmDelete(WebElement btnThemeConfirmDelete) {
		this.btnThemeConfirmDelete = btnThemeConfirmDelete;
	}
	/*End get element of theme*/
	
	/*
	 * Define web element for Banner
	 */

	@FindBy(xpath = "/html/body/div/div[1]/article/nav/ul/li[4]/ul/li[3]/a")
	private WebElement bannerFunction;

	@FindBy(xpath = "//*[@id='form_k02']/td/input")
	private WebElement bannerName;

	@FindBy(xpath = "//*[@id='type']")
	private WebElement postingType;

	@FindBy(xpath = "//*[@id='form_k04']/td/input")
	private WebElement bannerFilePC;

	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[5]/td/input")
	private WebElement altTextPC;

	@FindBy(xpath = "//*[@id='form_k04']/td/input")
	private WebElement bannerFileSP;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[7]/td/input")
	private WebElement altTextSP;
	
	@FindBy(xpath = "//*[@id='form_k05']/td/input")
	private WebElement bannerNoteText;

	@FindBy(xpath = "//*[@id='form_k06']/td/input[1]")
	private WebElement bannerUrl;
	
	@FindBy(xpath = "//*[@id='link_brank']")
	private WebElement openNewWindowBannerUrl;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div[2]/input")
	private WebElement btnBannerSubmit;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnBannerConfirm;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnBannerConfirmDelete;

	public WebElement getBannerFunction() {
		return bannerFunction;
	}

	public void setBannerFunction(WebElement bannerFunction) {
		this.bannerFunction = bannerFunction;
	}

	public WebElement getBannerName() {
		return bannerName;
	}

	public void setBannerName(WebElement bannerName) {
		this.bannerName = bannerName;
	}

	public WebElement getPostingType() {
		return postingType;
	}

	public void setPostingType(WebElement postingType) {
		this.postingType = postingType;
	}

	public WebElement getBannerFilePC() {
		return bannerFilePC;
	}

	public void setBannerFilePC(WebElement bannerFilePC) {
		this.bannerFilePC = bannerFilePC;
	}

	public WebElement getAltTextPC() {
		return altTextPC;
	}

	public void setAltTextPC(WebElement altTextPC) {
		this.altTextPC = altTextPC;
	}

	public WebElement getBannerFileSP() {
		return bannerFileSP;
	}

	public void setBannerFileSP(WebElement bannerFileSP) {
		this.bannerFileSP = bannerFileSP;
	}

	public WebElement getAltTextSP() {
		return altTextSP;
	}

	public void setAltTextSP(WebElement altTextSP) {
		this.altTextSP = altTextSP;
	}

	public WebElement getBannerNoteText() {
		return bannerNoteText;
	}

	public void setBannerNoteText(WebElement noteText) {
		this.bannerNoteText = noteText;
	}

	public WebElement getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(WebElement bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public WebElement getOpenNewWindowBannerUrl() {
		return openNewWindowBannerUrl;
	}

	public void setOpenNewWindowBannerUrl(WebElement openNewWindowBannerUrl) {
		this.openNewWindowBannerUrl = openNewWindowBannerUrl;
	}

	public WebElement getBtnBannerSubmit() {
		return btnBannerSubmit;
	}

	public void setBtnBannerSubmit(WebElement btnBannerSubmit) {
		this.btnBannerSubmit = btnBannerSubmit;
	}

	public WebElement getBtnBannerConfirm() {
		return btnBannerConfirm;
	}

	public void setBtnBannerConfirm(WebElement btnBannerConfirm) {
		this.btnBannerConfirm = btnBannerConfirm;
	}
	
	
	public WebElement getBtnBannerConfirmDelete() {
		return btnBannerConfirmDelete;
	}

	public void setBtnBannerConfirmDelete(WebElement btnBannerConfirmDelete) {
		this.btnBannerConfirmDelete = btnBannerConfirmDelete;
	}
	/* End get element of banner*/
	
	/*
	 * Define element of Ranking function
	 */
	@FindBy(xpath = "/html/body/div/div[1]/article/nav/ul/li[3]/ul/li[3]/a")
	private WebElement rankingFunction;

	@FindBy(xpath = "//*[@id='form_k02']/td/input")
	private WebElement rankingName;

	@FindBy(xpath = "//*[@id='category']")
	private WebElement rankingType;

	@FindBy(xpath = "//*[@id='disp_flag_1']")
	private WebElement rankingPublicFlag;
	
	@FindBy(xpath = "//*[@id='disp_flag_2']")
	private WebElement rankingNotPublicFlag;

	@FindBy(xpath = "//*[@id='form_k04']/td/input[1]")
	private WebElement productCode1;

	@FindBy(xpath = "//*[@id='form_k05']/td/input[1]")
	private WebElement productCode2;
	
	@FindBy(xpath = "//*[@id='form_k06']/td/input[1]")
	private WebElement productCode3;
	
	@FindBy(xpath = "//*[@id='form_k07']/td/input[1]")
	private WebElement productCode4;

	@FindBy(xpath = "//*[@id='form_k08']/td/input[1]")
	private WebElement productCode5;
	
	@FindBy(xpath = "//*[@id='form_k09']/td/input[1]")
	private WebElement productCode6;
	
	@FindBy(xpath = "//*[@id='form_k10']/td/input[1]")
	private WebElement productCode7;
	
	@FindBy(xpath = "//*[@id='form_k11']/td/input[1]")
	private WebElement productCode8;
	
	@FindBy(xpath = "//*[@id='form_k12']/td/input[1]")
	private WebElement productCode9;
	
	@FindBy(xpath = "//*[@id='form_k13']/td/input[1]")
	private WebElement productCode10;
	
	@FindBy(xpath = "//*[@id='form_k04']/td/input[2]")
	private WebElement btnSearchProductCode1;

	@FindBy(xpath = "//*[@id='form_k05']/td/input[2]")
	private WebElement btnSearchProductCode2;
	
	@FindBy(xpath = "//*[@id='form_k06']/td/input[2]")
	private WebElement btnSearchProductCode3;
	
	@FindBy(xpath = "//*[@id='form_k07']/td/input[2]")
	private WebElement btnSearchProductCode4;

	@FindBy(xpath = "//*[@id='form_k08']/td/input[2]")
	private WebElement btnSearchProductCode5;
	
	@FindBy(xpath = "//*[@id='form_k09']/td/input[2]")
	private WebElement btnSearchProductCode6;
	
	@FindBy(xpath = "//*[@id='form_k10']/td/input[2]")
	private WebElement btnSearchProductCode7;
	
	@FindBy(xpath = "//*[@id='form_k11']/td/input[2]")
	private WebElement btnSearchProductCode8;
	
	@FindBy(xpath = "//*[@id='form_k12']/td/input[2]")
	private WebElement btnSearchProductCode9;
	
	@FindBy(xpath = "//*[@id='form_k13']/td/input[2]")
	private WebElement btnSearchProductCode10;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div[2]/input")
	private WebElement btnRankingSubmit;

	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnRankingConfirm;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div/input")
	private WebElement btnRankingConfirmDelete;

	public WebElement getRankingFunction() {
		return rankingFunction;
	}

	public void setRankingFunction(WebElement rankingFunction) {
		this.rankingFunction = rankingFunction;
	}

	public WebElement getRankingName() {
		return rankingName;
	}

	public void setRankingName(WebElement rankingName) {
		this.rankingName = rankingName;
	}

	public WebElement getRankingType() {
		return rankingType;
	}

	public void setRankingType(WebElement rankingType) {
		this.rankingType = rankingType;
	}

	public WebElement getRankingPublicFlag() {
		return rankingPublicFlag;
	}

	public void setRankingPublicFlag(WebElement rankingPublicFlag) {
		this.rankingPublicFlag = rankingPublicFlag;
	}

	public WebElement getRankingNotPublicFlag() {
		return rankingNotPublicFlag;
	}

	public void setRankingNotPublicFlag(WebElement rankingNotPublicFlag) {
		this.rankingNotPublicFlag = rankingNotPublicFlag;
	}

	public WebElement getProductCode1() {
		return productCode1;
	}

	public void setProductCode1(WebElement productCode1) {
		this.productCode1 = productCode1;
	}

	public WebElement getProductCode2() {
		return productCode2;
	}

	public void setProductCode2(WebElement productCode2) {
		this.productCode2 = productCode2;
	}

	public WebElement getProductCode3() {
		return productCode3;
	}

	public void setProductCode3(WebElement productCode3) {
		this.productCode3 = productCode3;
	}

	public WebElement getProductCode4() {
		return productCode4;
	}

	public void setProductCode4(WebElement productCode4) {
		this.productCode4 = productCode4;
	}

	public WebElement getProductCode5() {
		return productCode5;
	}

	public void setProductCode5(WebElement productCode5) {
		this.productCode5 = productCode5;
	}

	public WebElement getProductCode6() {
		return productCode6;
	}

	public void setProductCode6(WebElement productCode6) {
		this.productCode6 = productCode6;
	}

	public WebElement getProductCode7() {
		return productCode7;
	}

	public void setProductCode7(WebElement productCode7) {
		this.productCode7 = productCode7;
	}

	public WebElement getProductCode8() {
		return productCode8;
	}

	public void setProductCode8(WebElement productCode8) {
		this.productCode8 = productCode8;
	}

	public WebElement getProductCode9() {
		return productCode9;
	}

	public void setProductCode9(WebElement productCode9) {
		this.productCode9 = productCode9;
	}

	public WebElement getProductCode10() {
		return productCode10;
	}

	public void setProductCode10(WebElement productCode10) {
		this.productCode10 = productCode10;
	}

	public WebElement getBtnSearchProductCode1() {
		return btnSearchProductCode1;
	}

	public void setBtnSearchProductCode1(WebElement btnSearchProductCode1) {
		this.btnSearchProductCode1 = btnSearchProductCode1;
	}

	public WebElement getBtnSearchProductCode2() {
		return btnSearchProductCode2;
	}

	public void setBtnSearchProductCode2(WebElement btnSearchProductCode2) {
		this.btnSearchProductCode2 = btnSearchProductCode2;
	}

	public WebElement getBtnSearchProductCode3() {
		return btnSearchProductCode3;
	}

	public void setBtnSearchProductCode3(WebElement btnSearchProductCode3) {
		this.btnSearchProductCode3 = btnSearchProductCode3;
	}

	public WebElement getBtnSearchProductCode4() {
		return btnSearchProductCode4;
	}

	public void setBtnSearchProductCode4(WebElement btnSearchProductCode4) {
		this.btnSearchProductCode4 = btnSearchProductCode4;
	}

	public WebElement getBtnSearchProductCode5() {
		return btnSearchProductCode5;
	}

	public void setBtnSearchProductCode5(WebElement btnSearchProductCode5) {
		this.btnSearchProductCode5 = btnSearchProductCode5;
	}

	public WebElement getBtnSearchProductCode6() {
		return btnSearchProductCode6;
	}

	public void setBtnSearchProductCode6(WebElement btnSearchProductCode6) {
		this.btnSearchProductCode6 = btnSearchProductCode6;
	}

	public WebElement getBtnSearchProductCode7() {
		return btnSearchProductCode7;
	}

	public void setBtnSearchProductCode7(WebElement btnSearchProductCode7) {
		this.btnSearchProductCode7 = btnSearchProductCode7;
	}

	public WebElement getBtnSearchProductCode8() {
		return btnSearchProductCode8;
	}

	public void setBtnSearchProductCode8(WebElement btnSearchProductCode8) {
		this.btnSearchProductCode8 = btnSearchProductCode8;
	}

	public WebElement getBtnSearchProductCode9() {
		return btnSearchProductCode9;
	}

	public void setBtnSearchProductCode9(WebElement btnSearchProductCode9) {
		this.btnSearchProductCode9 = btnSearchProductCode9;
	}

	public WebElement getBtnSearchProductCode10() {
		return btnSearchProductCode10;
	}

	public void setBtnSearchProductCode10(WebElement btnSearchProductCode10) {
		this.btnSearchProductCode10 = btnSearchProductCode10;
	}

	public WebElement getBtnRankingSubmit() {
		return btnRankingSubmit;
	}

	public void setBtnRankingSubmit(WebElement btnRankingSubmit) {
		this.btnRankingSubmit = btnRankingSubmit;
	}

	public WebElement getBtnRankingConfirm() {
		return btnRankingConfirm;
	}

	public void setBtnRankingConfirm(WebElement btnRankingConfirm) {
		this.btnRankingConfirm = btnRankingConfirm;
	}

	public WebElement getBtnRankingConfirmDelete() {
		return btnRankingConfirmDelete;
	}

	public void setBtnRankingConfirmDelete(WebElement btnRankingConfirmDelete) {
		this.btnRankingConfirmDelete = btnRankingConfirmDelete;
	}
	/* End get element of ranking*/
	
	/*
	 * WebElement for product function
	 */
	@FindBy(xpath = "/html/body/div[1]/div[1]/article/nav/ul/li[4]/ul/li[1]/a")
	private WebElement ProductFunction;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[1]/header/a")
	private WebElement btnAddProduct;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[1]/td/input")
	private WebElement productCode;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[2]/td/input")
	private WebElement serviceName;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[3]/td/label[1]/input")
	private WebElement publicPrFlag;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[3]/td/label[2]/input")
	private WebElement nonPublicPrFlag;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[5]/td/label[1]/input")
	private WebElement displayDetail;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[5]/td/label[2]/input")
	private WebElement displayReview;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[5]/td/label[3]/input")
	private WebElement displayAll;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[6]/td/label[1]/input")
	private WebElement rentalProducts;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[6]/td/label[2]/input")
	private WebElement serviceRelated;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[6]/td/label[3]/input")
	private WebElement salesProduct;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[7]/td/input")
	private WebElement displayOrder;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[10]/td/label[1]/input")
	private WebElement newDisplay;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[10]/td/label[2]/input")
	private WebElement nonNewDisplay;
	
	@FindBy(xpath = "//*[@id='tabs-1']/table/tbody/tr[15]/td/textarea")
	private WebElement tagSEO;
	
	@FindBy(xpath = "//*[@id='ui-id-4']")
	private WebElement switchToCartTag ;
	
	@FindBy(xpath = "//*[@id='tabs-7']/table/tbody/tr[2]/td/label[1]/input")
	private WebElement displayDelivInfo;
	
	@FindBy(xpath = "//*[@id='tabs-7']/table/tbody/tr[2]/td/label[2]/input")
	private WebElement nonDisplayDelivInfo;
	
	@FindBy(xpath = "//*[@id='tabs-7']/table/tbody/tr[4]/td/label[1]/input")
	private WebElement displayNote;
	
	@FindBy(xpath = "//*[@id='tabs-7']/table/tbody/tr[4]/td/label[2]/input")
	private WebElement nonDisplayNote;
	
	@FindBy(xpath = "//*[@id='tabs']/form/div[9]/input")
	private WebElement btnProductSubmit;
	
	@FindBy(xpath = "//*[@id='tabs']/form/div[10]/input")
	private WebElement btnProductConfirm;
	
	

	public WebElement getProductFunction() {
		return ProductFunction;
	}

	public void setProductFunction(WebElement btnProduct) {
		this.ProductFunction = btnProduct;
	}

	public WebElement getBtnAddProduct() {
		return btnAddProduct;
	}

	public void setBtnAddProduct(WebElement btnAddProduct) {
		this.btnAddProduct = btnAddProduct;
	}

	public WebElement getProductCode() {
		return productCode;
	}

	public void setProductCode(WebElement productCode) {
		this.productCode = productCode;
	}

	public WebElement getServiceName() {
		return serviceName;
	}

	public void setServiceName(WebElement serviceName) {
		this.serviceName = serviceName;
	}

	public WebElement getPublicPrFlag() {
		return publicPrFlag;
	}

	public void setPublicPrFlag(WebElement publicPrFlag) {
		this.publicPrFlag = publicPrFlag;
	}

	public WebElement getNonPublicPrFlag() {
		return nonPublicPrFlag;
	}

	public void setNonPublicPrFlag(WebElement nonPublicPrFlag) {
		this.nonPublicPrFlag = nonPublicPrFlag;
	}

	public WebElement getDisplayDetail() {
		return displayDetail;
	}

	public void setDisplayDetail(WebElement displayDetail) {
		this.displayDetail = displayDetail;
	}

	public WebElement getDisplayReview() {
		return displayReview;
	}

	public void setDisplayReview(WebElement displayReview) {
		this.displayReview = displayReview;
	}

	public WebElement getDisplayAll() {
		return displayAll;
	}

	public void setDisplayAll(WebElement displayAll) {
		this.displayAll = displayAll;
	}

	public WebElement getRentalProducts() {
		return rentalProducts;
	}

	public void setRentalProducts(WebElement rentalProducts) {
		this.rentalProducts = rentalProducts;
	}

	public WebElement getServiceRelated() {
		return serviceRelated;
	}

	public void setServiceRelated(WebElement serviceRelated) {
		this.serviceRelated = serviceRelated;
	}

	public WebElement getSalesProduct() {
		return salesProduct;
	}

	public void setSalesProduct(WebElement salesProduct) {
		this.salesProduct = salesProduct;
	}

	public WebElement getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(WebElement displayOrder) {
		this.displayOrder = displayOrder;
	}

	public WebElement getNewDisplay() {
		return newDisplay;
	}

	public void setNewDisplay(WebElement newDisplay) {
		this.newDisplay = newDisplay;
	}

	public WebElement getNonNewDisplay() {
		return nonNewDisplay;
	}

	public void setNonNewDisplay(WebElement nonNewDisplay) {
		this.nonNewDisplay = nonNewDisplay;
	}

	public WebElement getTagSEO() {
		return tagSEO;
	}

	public void setTagSEO(WebElement tagSEO) {
		this.tagSEO = tagSEO;
	}

	public WebElement getSwitchToCartTag() {
		return switchToCartTag;
	}

	public void setSwitchToCartTag(WebElement switchToCartTag) {
		this.switchToCartTag = switchToCartTag;
	}

	public WebElement getDisplayDelivInfo() {
		return displayDelivInfo;
	}

	public void setDisplayDelivInfo(WebElement displayDelivInfo) {
		this.displayDelivInfo = displayDelivInfo;
	}

	public WebElement getNonDisplayDelivInfo() {
		return nonDisplayDelivInfo;
	}

	public void setNonDisplayDelivInfo(WebElement nonDisplayDelivInfo) {
		this.nonDisplayDelivInfo = nonDisplayDelivInfo;
	}

	public WebElement getDisplayNote() {
		return displayNote;
	}

	public void setDisplayNote(WebElement displayNote) {
		this.displayNote = displayNote;
	}

	public WebElement getNonDisplayNote() {
		return nonDisplayNote;
	}

	public void setNonDisplayNote(WebElement nonDisplayNote) {
		this.nonDisplayNote = nonDisplayNote;
	}

	public WebElement getBtnProductSubmit() {
		return btnProductSubmit;
	}

	public void setBtnProductSubmit(WebElement btnProductSubmit) {
		this.btnProductSubmit = btnProductSubmit;
	}

	public WebElement getBtnProductConfirm() {
		return btnProductConfirm;
	}

	public void setBtnProductConfirm(WebElement btnProductConfirm) {
		this.btnProductConfirm = btnProductConfirm;
	}
	
	/* End get element of product*/
	
	/*
	 * WebElement for Category function
	 */
	@FindBy(xpath = "/html/body/div/div[1]/article/nav/ul/li[3]/ul/li[1]/a")
	private WebElement CategoryFunction;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[1]/td/input")
	private WebElement categoryName;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[2]/td/select")
	private WebElement themeDesign;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[3]/td/input")
	private WebElement pathName;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[4]/td/input")
	private WebElement listFileName;
	
	@FindBy(xpath = "//*[@id='disp_flag_1']")
	private WebElement PublicCaFlag;
	
	@FindBy(xpath = "//*[@id='disp_flag_2']")
	private WebElement noPublicCaFlag;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div[2]/input")
	private WebElement btnCategorySubmit ;

	public WebElement getCategoryFunction() {
		return CategoryFunction;
	}

	public void setCategoryFunction(WebElement categoryFunction) {
		CategoryFunction = categoryFunction;
	}

	public WebElement getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(WebElement categoryName) {
		this.categoryName = categoryName;
	}

	public WebElement getThemeDesign() {
		return themeDesign;
	}

	public void setThemeDesign(WebElement themeDesign) {
		this.themeDesign = themeDesign;
	}

	public WebElement getPathName() {
		return pathName;
	}

	public void setPathName(WebElement pathName) {
		this.pathName = pathName;
	}

	public WebElement getListFileName() {
		return listFileName;
	}

	public void setListFileName(WebElement listFileName) {
		this.listFileName = listFileName;
	}

	public WebElement getPublicCaFlag() {
		return PublicCaFlag;
	}

	public void setPublicCaFlag(WebElement publicCaFlag) {
		PublicCaFlag = publicCaFlag;
	}

	public WebElement getNoPublicCaFlag() {
		return noPublicCaFlag;
	}

	public void setNoPublicCaFlag(WebElement noPublicCaFlag) {
		this.noPublicCaFlag = noPublicCaFlag;
	}

	public WebElement getBtnCategorySubmit() {
		return btnCategorySubmit;
	}

	public void setBtnCategorySubmit(WebElement btnCategorySubmit) {
		this.btnCategorySubmit = btnCategorySubmit;
	}
	
	/*
	 * WebElement for Category function
	 */
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[1]/td/select")
	private WebElement categoryParent;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[2]/td/input")
	private WebElement subCategoryName;
	
	@FindBy(xpath = "//*[@id='directory']")
	private WebElement directoryName;
	
	@FindBy(xpath = "//*[@id='product_filename']")
	private WebElement listFileSub;
	
	@FindBy(xpath = "//*[@id='product_filename']")
	private WebElement detailDirectory;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/table/tbody/tr[7]/td/textarea")
	private WebElement tagSEOSubCategory;
	
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div[2]/input")
	private WebElement btnSubCategorySubmit ;

	public WebElement getCategoryParent() {
		return categoryParent;
	}

	public void setCategoryParent(WebElement categoryParent) {
		this.categoryParent = categoryParent;
	}

	public WebElement getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(WebElement subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public WebElement getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(WebElement directoryName) {
		this.directoryName = directoryName;
	}

	public WebElement getListFileSub() {
		return listFileSub;
	}

	public void setListFileSub(WebElement listFileSub) {
		this.listFileSub = listFileSub;
	}

	public WebElement getDetailDirectory() {
		return detailDirectory;
	}

	public void setDetailDirectory(WebElement detailDirectory) {
		this.detailDirectory = detailDirectory;
	}

	public WebElement getTagSEOSubCategory() {
		return tagSEOSubCategory;
	}

	public void setTagSEOSubCategory(WebElement tagSEOSubCategory) {
		this.tagSEOSubCategory = tagSEOSubCategory;
	}

	public WebElement getBtnSubCategorySubmit() {
		return btnSubCategorySubmit;
	}

	public void setBtnSubCategorySubmit(WebElement btnSubCategorySubmit) {
		this.btnSubCategorySubmit = btnSubCategorySubmit;
	}
	
	/* End defind */
}
