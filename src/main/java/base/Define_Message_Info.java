package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Define_Message_Info {
	
	// Message of keyword page
	/*
	 * Actual message
	 */
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement KEYWORD_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement URL_ACTUAL;	
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement CATEGORY_ACTUAL;
	@FindBy(linkText = "")
	@CacheLookup
	private WebElement POST_FLAG_ACTUAL;

	
	/*
	 * Expected message
	 */
	private String KEYWORD_ERROR_EXPECTED = "";
	private String KEYWORD_MAXLENGHT_EXPECTED = "";
	private String URL_ERROR_EXPECTED = "";
	private String URL_MAXLENGHT_EXPECTED = "";
	private String CATEGORY_ERROR_EXPECTED = "";
	private String POST_FLAG_ERROR_EXPECTED = "";
	public WebElement getKEYWORD_ACTUAL() {
		//KEYWORD_ACTUAL.getText().toString();
		return KEYWORD_ACTUAL;
	}
	public void setKEYWORD_ACTUAL(WebElement kEYWORD_ACTUAL) {
		KEYWORD_ACTUAL = kEYWORD_ACTUAL;
	}
	public WebElement getURL_ACTUAL() {
		//URL_ACTUAL.getText().toString();
		return URL_ACTUAL;
	}
	public void setURL_ACTUAL(WebElement uRL_ACTUAL) {
		URL_ACTUAL = uRL_ACTUAL;
	}
	public WebElement getCATEGORY_ACTUAL() {
		//CATEGORY_ACTUAL.getText().toString();
		return CATEGORY_ACTUAL;
	}
	public void setCATEGORY_ACTUAL(WebElement cATEGORY_ACTUAL) {
		CATEGORY_ACTUAL = cATEGORY_ACTUAL;
	}
	public WebElement getPOST_FLAG_ACTUAL() {
		//POST_FLAG_ACTUAL.getText().toString();
		return POST_FLAG_ACTUAL;
	}
	public void setPOST_FLAG_ACTUAL(WebElement pOST_FLAG_ACTUAL) {
		POST_FLAG_ACTUAL = pOST_FLAG_ACTUAL;
	}
	public String getKEYWORD_ERROR_EXPECTED() {
		return KEYWORD_ERROR_EXPECTED;
	}
	public void setKEYWORD_ERROR_EXPECTED(String kEYWORD_ERROR_EXPECTED) {
		KEYWORD_ERROR_EXPECTED = kEYWORD_ERROR_EXPECTED;
	}
	public String getKEYWORD_MAXLENGHT_EXPECTED() {
		return KEYWORD_MAXLENGHT_EXPECTED;
	}
	public void setKEYWORD_MAXLENGHT_EXPECTED(String kEYWORD_MAXLENGHT_EXPECTED) {
		KEYWORD_MAXLENGHT_EXPECTED = kEYWORD_MAXLENGHT_EXPECTED;
	}
	public String getURL_ERROR_EXPECTED() {
		return URL_ERROR_EXPECTED;
	}
	public void setURL_ERROR_EXPECTED(String uRL_ERROR_EXPECTED) {
		URL_ERROR_EXPECTED = uRL_ERROR_EXPECTED;
	}
	public String getURL_MAXLENGHT_EXPECTED() {
		return URL_MAXLENGHT_EXPECTED;
	}
	public void setURL_MAXLENGHT_EXPECTED(String uRL_MAXLENGHT_EXPECTED) {
		URL_MAXLENGHT_EXPECTED = uRL_MAXLENGHT_EXPECTED;
	}
	public String getCATEGORY_ERROR_EXPECTED() {
		return CATEGORY_ERROR_EXPECTED;
	}
	public void setCATEGORY_ERROR_EXPECTED(String cATEGORY_ERROR_EXPECTED) {
		CATEGORY_ERROR_EXPECTED = cATEGORY_ERROR_EXPECTED;
	}
	public String getPOST_FLAG_ERROR_EXPECTED() {
		return POST_FLAG_ERROR_EXPECTED;
	}
	public void setPOST_FLAG_ERROR_EXPECTED(String pOST_FLAG_ERROR_EXPECTED) {
		POST_FLAG_ERROR_EXPECTED = pOST_FLAG_ERROR_EXPECTED;
	}
	
	// Message of THEME_NAME page
	/*
	 * Actual message
	 */
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement THEME_NAME_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement SYSTEM_NAME_ACTUAL;	
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement THEME_FILE_ACTUAL;

	
	/*
	 * Expected message
	 */
	private String THEME_NAME_ERROR_EXPECTED = "";
	private String THEME_NAME_MAXLENGHT_EXPECTED = "";
	private String THEME_NAME_NOTNULL_EXPECTED = "必須項目が入力されていません。";
	private String SYSTEM_NAME_ERROR_EXPECTED = "";
	private String SYSTEM_NAME_MAXLENGHT_EXPECTED = "";
	private String SYSTEM_NAME_NOTNULL_EXPECTED = "必須項目が入力されていません。";
	private String THEME_FILE_ERROR_EXPECTED = "";
	private String THEME_FILE_NOTNULL_EXPECTED = "必須項目が入力されていません。";
	
	public WebElement getTHEME_NAME_ACTUAL() {
		//THEME_NAME_ACTUAL.getText().toString();
		return THEME_NAME_ACTUAL;
	}
	public void setTHEME_NAME_ACTUAL(WebElement THEME_NAME_ACTUAL) {
		THEME_NAME_ACTUAL = THEME_NAME_ACTUAL;
	}
	public WebElement getSYSTEM_NAME_ACTUAL() {
		//SYSTEM_NAME_ACTUAL.getText().toString();
		return SYSTEM_NAME_ACTUAL;
	}
	public void setSYSTEM_NAME_ACTUAL(WebElement SYSTEM_NAME_ACTUAL) {
		SYSTEM_NAME_ACTUAL = SYSTEM_NAME_ACTUAL;
	}
	public WebElement getTHEME_FILE_ACTUAL() {
		//THEME_FILE_ACTUAL.getText().toString();
		return THEME_FILE_ACTUAL;
	}
	public void setTHEME_FILE_ACTUAL(WebElement THEME_FILE_ACTUAL) {
		THEME_FILE_ACTUAL = THEME_FILE_ACTUAL;
	}
	public String getTHEME_NAME_ERROR_EXPECTED() {
		return THEME_NAME_ERROR_EXPECTED;
	}
	public void setTHEME_NAME_ERROR_EXPECTED(String THEME_NAME_ERROR_EXPECTED) {
		THEME_NAME_ERROR_EXPECTED = THEME_NAME_ERROR_EXPECTED;
	}
	public String getTHEME_NAME_MAXLENGHT_EXPECTED() {
		return THEME_NAME_MAXLENGHT_EXPECTED;
	}
	public void setTHEME_NAME_MAXLENGHT_EXPECTED(String THEME_NAME_MAXLENGHT_EXPECTED) {
		THEME_NAME_MAXLENGHT_EXPECTED = THEME_NAME_MAXLENGHT_EXPECTED;
	}
	public String getSYSTEM_NAME_ERROR_EXPECTED() {
		return SYSTEM_NAME_ERROR_EXPECTED;
	}
	public void setSYSTEM_NAME_ERROR_EXPECTED(String SYSTEM_NAME_ERROR_EXPECTED) {
		SYSTEM_NAME_ERROR_EXPECTED = SYSTEM_NAME_ERROR_EXPECTED;
	}
	public String getSYSTEM_NAME_MAXLENGHT_EXPECTED() {
		return SYSTEM_NAME_MAXLENGHT_EXPECTED;
	}
	public void setSYSTEM_NAME_MAXLENGHT_EXPECTED(String SYSTEM_NAME_MAXLENGHT_EXPECTED) {
		SYSTEM_NAME_MAXLENGHT_EXPECTED = SYSTEM_NAME_MAXLENGHT_EXPECTED;
	}
	public String getTHEME_NAME_NOTNULL_EXPECTED() {
		return THEME_NAME_NOTNULL_EXPECTED;
	}
	public void setTHEME_NAME_NOTNULL_EXPECTED(String tHEME_NAME_NOTNULL_EXPECTED) {
		THEME_NAME_NOTNULL_EXPECTED = tHEME_NAME_NOTNULL_EXPECTED;
	}
	public String getSYSTEM_NAME_NOTNULL_EXPECTED() {
		return SYSTEM_NAME_NOTNULL_EXPECTED;
	}
	public void setSYSTEM_NAME_NOTNULL_EXPECTED(String sYSTEM_NAME_NOTNULL_EXPECTED) {
		SYSTEM_NAME_NOTNULL_EXPECTED = sYSTEM_NAME_NOTNULL_EXPECTED;
	}
	public String getTHEME_FILE_NOTNULL_EXPECTED() {
		return THEME_FILE_NOTNULL_EXPECTED;
	}
	public void setTHEME_FILE_NOTNULL_EXPECTED(String tHEME_FILE_NOTNULL_EXPECTED) {
		THEME_FILE_NOTNULL_EXPECTED = tHEME_FILE_NOTNULL_EXPECTED;
	}
	
	// Message of Banner page
	/*
	 * Actual message
	 */
	@FindBy(xpath = "/html/body/div/div[2]/article[2]/form/div[1]/ul/li[2]")
	@CacheLookup
	private WebElement BANNER_NAME_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement POSTING_TYPE_ACTUAL;	
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement BANNER_FILE_PC_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement BANNER_FILE_SP_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement ALT_TEXT_PC_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement ALT_TEXT_SP_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement NOTE_TEXT_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement BANNER_URL_ACTUAL;
	
	/*
	 * Expected message
	 */
	private String BANNER_NAME_MAXLENGHT_EXPECTED = "[項目名] エラーメッセージ。";
	private String BANNER_NAME_NOTNULL_EXPECTED = "not null";
	private String POSTING_TYPE_NOTNULL_EXPECTED = "";
	private String ALTTEXT_PC_MAXLENGHT_EXPECTED = "";
	private String ALTTEXT_SP_MAXLENGHT_EXPECTED = "";
	private String BANNER_URL_MAXLENGHT_EXPECTED = "";
	private String BANNER_URL_ERROR_EXPECTED = "";
	private String BANNER_NOTETEXT_MAXLENGHT_EXPECTED = "";
	private String BANNER_SP_FILE_NOTNULL_EXPECTED = "";
	private String BANNER_PC_FILE_NOTNULL_EXPECTED = "";
	
	public String getTHEME_FILE_ERROR_EXPECTED() {
		return THEME_FILE_ERROR_EXPECTED;
	}
	public void setTHEME_FILE_ERROR_EXPECTED(String tHEME_FILE_ERROR_EXPECTED) {
		THEME_FILE_ERROR_EXPECTED = tHEME_FILE_ERROR_EXPECTED;
	}
	public WebElement getBANNER_NAME_ACTUAL() {
		return BANNER_NAME_ACTUAL;
	}
	public void setBANNER_NAME_ACTUAL(WebElement bANNER_NAME_ACTUAL) {
		BANNER_NAME_ACTUAL = bANNER_NAME_ACTUAL;
	}
	public WebElement getPOSTING_TYPE_ACTUAL() {
		return POSTING_TYPE_ACTUAL;
	}
	public void setPOSTING_TYPE_ACTUAL(WebElement pOSTING_TYPE_ACTUAL) {
		POSTING_TYPE_ACTUAL = pOSTING_TYPE_ACTUAL;
	}
	public WebElement getBANNER_FILE_PC_ACTUAL() {
		return BANNER_FILE_PC_ACTUAL;
	}
	public void setBANNER_FILE_PC_ACTUAL(WebElement bANNER_FILE_PC_ACTUAL) {
		BANNER_FILE_PC_ACTUAL = bANNER_FILE_PC_ACTUAL;
	}
	public WebElement getBANNER_FILE_SP_ACTUAL() {
		return BANNER_FILE_SP_ACTUAL;
	}
	public void setBANNER_FILE_SP_ACTUAL(WebElement bANNER_FILE_SP_ACTUAL) {
		BANNER_FILE_SP_ACTUAL = bANNER_FILE_SP_ACTUAL;
	}
	public WebElement getALT_TEXT_PC_ACTUAL() {
		return ALT_TEXT_PC_ACTUAL;
	}
	public void setALT_TEXT_PC_ACTUAL(WebElement aLT_TEXT_PC_ACTUAL) {
		ALT_TEXT_PC_ACTUAL = aLT_TEXT_PC_ACTUAL;
	}
	public WebElement getALT_TEXT_SP_ACTUAL() {
		return ALT_TEXT_SP_ACTUAL;
	}
	public void setALT_TEXT_SP_ACTUAL(WebElement aLT_TEXT_SP_ACTUAL) {
		ALT_TEXT_SP_ACTUAL = aLT_TEXT_SP_ACTUAL;
	}
	public WebElement getNOTE_TEXT_ACTUAL() {
		return NOTE_TEXT_ACTUAL;
	}
	public void setNOTE_TEXTACTUAL(WebElement nOTE_TEXT_ACTUAL) {
		NOTE_TEXT_ACTUAL = nOTE_TEXT_ACTUAL;
	}
	public WebElement getBANNER_URL_ACTUAL() {
		return BANNER_URL_ACTUAL;
	}
	public void setBANNER_URL_ACTUAL(WebElement bANNER_URL_ACTUAL) {
		BANNER_URL_ACTUAL = bANNER_URL_ACTUAL;
	}
	public String getBANNER_NAME_MAXLENGHT_EXPECTED() {
		return BANNER_NAME_MAXLENGHT_EXPECTED;
	}
	public void setBANNER_NAME_MAXLENGHT_EXPECTED(
			String bANNER_NAME_MAXLENGHT_EXPECTED) {
		BANNER_NAME_MAXLENGHT_EXPECTED = bANNER_NAME_MAXLENGHT_EXPECTED;
	}
	public String getBANNER_NAME_NOTNULL_EXPECTED() {
		return BANNER_NAME_NOTNULL_EXPECTED;
	}
	public void setBANNER_NAME_NOTNULL_EXPECTED(String bANNER_NAME_NOTNULL_EXPECTED) {
		BANNER_NAME_NOTNULL_EXPECTED = bANNER_NAME_NOTNULL_EXPECTED;
	}
	public String getPOSTING_TYPE_NOTNULL_EXPECTED() {
		return POSTING_TYPE_NOTNULL_EXPECTED;
	}
	public void setPOSTING_TYPE_NOTNULL_EXPECTED(
			String pOSTING_TYPE_NOTNULL_EXPECTED) {
		POSTING_TYPE_NOTNULL_EXPECTED = pOSTING_TYPE_NOTNULL_EXPECTED;
	}
	public String getALTTEXT_PC_MAXLENGHT_EXPECTED() {
		return ALTTEXT_PC_MAXLENGHT_EXPECTED;
	}
	public void setALTTEXT_PC_MAXLENGHT_EXPECTED(
			String aLTTEXT_PC_MAXLENGHT_EXPECTED) {
		ALTTEXT_PC_MAXLENGHT_EXPECTED = aLTTEXT_PC_MAXLENGHT_EXPECTED;
	}
	public String getALTTEXT_SP_MAXLENGHT_EXPECTED() {
		return ALTTEXT_SP_MAXLENGHT_EXPECTED;
	}
	public void setALTTEXT_SP_MAXLENGHT_EXPECTED(
			String aLTTEXT_SP_MAXLENGHT_EXPECTED) {
		ALTTEXT_SP_MAXLENGHT_EXPECTED = aLTTEXT_SP_MAXLENGHT_EXPECTED;
	}
	public String getBANNER_URL_MAXLENGHT_EXPECTED() {
		return BANNER_URL_MAXLENGHT_EXPECTED;
	}
	public void setBANNER_URL_MAXLENGHT_EXPECTED(
			String bANNER_URL_MAXLENGHT_EXPECTED) {
		BANNER_URL_MAXLENGHT_EXPECTED = bANNER_URL_MAXLENGHT_EXPECTED;
	}
	public String getBANNER_URL_ERROR_EXPECTED() {
		return BANNER_URL_ERROR_EXPECTED;
	}
	public void setBANNER_URL_ERROR_EXPECTED(String bANNER_URL_ERROR_EXPECTED) {
		BANNER_URL_ERROR_EXPECTED = bANNER_URL_ERROR_EXPECTED;
	}
	public String getBANNER_NOTETEXT_MAXLENGHT_EXPECTED() {
		return BANNER_NOTETEXT_MAXLENGHT_EXPECTED;
	}
	public void setBANNER_NOTETEXT_MAXLENGHT_EXPECTED(
			String bANNER_NOTETEXT_MAXLENGHT_EXPECTED) {
		BANNER_NOTETEXT_MAXLENGHT_EXPECTED = bANNER_NOTETEXT_MAXLENGHT_EXPECTED;
	}
	public String getBANNER_SP_FILE_NOTNULL_EXPECTED() {
		return BANNER_SP_FILE_NOTNULL_EXPECTED;
	}
	public void setBANNER_SP_FILE_NOTNULL_EXPECTED(
			String bANNER_SP_FILE_NOTNULL_EXPECTED) {
		BANNER_SP_FILE_NOTNULL_EXPECTED = bANNER_SP_FILE_NOTNULL_EXPECTED;
	}
	public String getBANNER_PC_FILE_NOTNULL_EXPECTED() {
		return BANNER_PC_FILE_NOTNULL_EXPECTED;
	}
	public void setBANNER_PC_FILE_NOTNULL_EXPECTED(
			String bANNER_PC_FILE_NOTNULL_EXPECTED) {
		BANNER_PC_FILE_NOTNULL_EXPECTED = bANNER_PC_FILE_NOTNULL_EXPECTED;
	}

	// Message of Banner page
	/*
	 * Actual message
	 */
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement RANKING_NAME_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement RANKING_TYPE_ACTUAL;	
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement RANKING_POST_FLAG_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement PRODUCT1_ACTUAL;
	/*
	 * Expected message
	 */
	private String RANKING_NAME_MAXLENGHT_EXPECTED = "";
	private String RANKING_NAME_NOTNULL_EXPECTED = "";
	private String RANKING_TYPE_EXPECTED = "";
	private String RANKING_POST_FLAG_NOTNULL_EXPECTED = "";
	private String PRODUCT1_EXPECTED = "";
	public WebElement getRANKING_NAME_ACTUAL() {
		return RANKING_NAME_ACTUAL;
	}
	public void setRANKING_NAME_ACTUAL(WebElement rANKING_NAME_ACTUAL) {
		RANKING_NAME_ACTUAL = rANKING_NAME_ACTUAL;
	}
	public WebElement getRANKING_TYPE_ACTUAL() {
		return RANKING_TYPE_ACTUAL;
	}
	public void setRANKING_TYPE_ACTUAL(WebElement rANKING_TYPE_ACTUAL) {
		RANKING_TYPE_ACTUAL = rANKING_TYPE_ACTUAL;
	}
	public WebElement getRANKING_POST_FLAG_ACTUAL() {
		return RANKING_POST_FLAG_ACTUAL;
	}
	public void setRANKING_POST_FLAG_ACTUAL(WebElement rANKING_POST_FLAG_ACTUAL) {
		RANKING_POST_FLAG_ACTUAL = rANKING_POST_FLAG_ACTUAL;
	}
	public WebElement getPRODUCT1_ACTUAL() {
		return PRODUCT1_ACTUAL;
	}
	public void setPRODUCT1_ACTUAL(WebElement pRODUCT1_ACTUAL) {
		PRODUCT1_ACTUAL = pRODUCT1_ACTUAL;
	}
	public String getRANKING_NAME_MAXLENGHT_EXPECTED() {
		return RANKING_NAME_MAXLENGHT_EXPECTED;
	}
	public void setRANKING_NAME_MAXLENGHT_EXPECTED(
			String rANKING_NAME_MAXLENGHT_EXPECTED) {
		RANKING_NAME_MAXLENGHT_EXPECTED = rANKING_NAME_MAXLENGHT_EXPECTED;
	}
	public String getRANKING_NAME_NOTNULL_EXPECTED() {
		return RANKING_NAME_NOTNULL_EXPECTED;
	}
	public void setRANKING_NAME_NOTNULL_EXPECTED(
			String rANKING_NAME_NOTNULL_EXPECTED) {
		RANKING_NAME_NOTNULL_EXPECTED = rANKING_NAME_NOTNULL_EXPECTED;
	}
	public String getRANKING_TYPE_EXPECTED() {
		return RANKING_TYPE_EXPECTED;
	}
	public void setRANKING_TYPE_ACTUAL_EXPECTED(String rANKING_TYPE_EXPECTED) {
		RANKING_TYPE_EXPECTED = rANKING_TYPE_EXPECTED;
	}
	public String getRANKING_POST_FLAG_NOTNULL_EXPECTED() {
		return RANKING_POST_FLAG_NOTNULL_EXPECTED;
	}
	public void setRANKING_POST_FLAG_NOTNULL_EXPECTED(
			String rANKING_POST_FLAG_NOTNULL_EXPECTED) {
		RANKING_POST_FLAG_NOTNULL_EXPECTED = rANKING_POST_FLAG_NOTNULL_EXPECTED;
	}
	public String getPRODUCT1_EXPECTED() {
		return PRODUCT1_EXPECTED;
	}
	public void setPRODUCT1_EXPECTED(String pRODUCT1_EXPECTED) {
		PRODUCT1_EXPECTED = pRODUCT1_EXPECTED;
	}
	public void setNOTE_TEXT_ACTUAL(WebElement nOTE_TEXT_ACTUAL) {
		NOTE_TEXT_ACTUAL = nOTE_TEXT_ACTUAL;
	}
		
	// Message of Banner page
	/*
	 * Actual message
	 */
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement PRODUCT_CODE_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement SERVICE_NAME_ACTUAL;	
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement DISPLAY_ORDER_ACTUAL;
	@FindBy(xpath = "")
	@CacheLookup
	private WebElement TAGSEO_ACTUAL;
	/*
	 * Expected message
	 */
	private String PRODUCT_CODE_NOTNULL_EXPECTED = "";
	private String SERVICE_NAME_NOTNULL_EXPECTED = "";
	private String DISPLAY_ORDER_NOTNULL_EXPECTED = "";
	private String TAGSEO_NOTNULL_EXPECTED = "";
	public WebElement getPRODUCT_CODE_ACTUAL() {
		return PRODUCT_CODE_ACTUAL;
	}
	public void setPRODUCT_CODE_ACTUAL(WebElement pRODUCT_CODE_ACTUAL) {
		PRODUCT_CODE_ACTUAL = pRODUCT_CODE_ACTUAL;
	}
	public WebElement getSERVICE_NAME_ACTUAL() {
		return SERVICE_NAME_ACTUAL;
	}
	public void setSERVICE_NAME_ACTUAL(WebElement sERVICE_NAME_ACTUAL) {
		SERVICE_NAME_ACTUAL = sERVICE_NAME_ACTUAL;
	}
	public WebElement getDISPLAY_ORDER_ACTUAL() {
		return DISPLAY_ORDER_ACTUAL;
	}
	public void setDISPLAY_ORDER_ACTUAL(WebElement dISPLAY_ORDER_ACTUAL) {
		DISPLAY_ORDER_ACTUAL = dISPLAY_ORDER_ACTUAL;
	}
	public WebElement getTAGSEO_ACTUAL() {
		return TAGSEO_ACTUAL;
	}
	public void setTAGSEO_ACTUAL(WebElement tAGSEO_ACTUAL) {
		TAGSEO_ACTUAL = tAGSEO_ACTUAL;
	}
	public String getPRODUCT_CODE_NOTNULL_EXPECTED() {
		return PRODUCT_CODE_NOTNULL_EXPECTED;
	}
	public void setPRODUCT_CODE_NOTNULL_EXPECTED(
			String pRODUCT_CODE_NOTNULL_EXPECTED) {
		PRODUCT_CODE_NOTNULL_EXPECTED = pRODUCT_CODE_NOTNULL_EXPECTED;
	}
	public String getSERVICE_NAME_NOTNULL_EXPECTED() {
		return SERVICE_NAME_NOTNULL_EXPECTED;
	}
	public void setSERVICE_NAME_NOTNULL_EXPECTED(
			String sERVICE_NAME_NOTNULL_EXPECTED) {
		SERVICE_NAME_NOTNULL_EXPECTED = sERVICE_NAME_NOTNULL_EXPECTED;
	}
	public String getDISPLAY_ORDER_NOTNULL_EXPECTED() {
		return DISPLAY_ORDER_NOTNULL_EXPECTED;
	}
	public void setDISPLAY_ORDER_NOTNULL_EXPECTED(
			String dISPLAY_ORDER_NOTNULL_EXPECTED) {
		DISPLAY_ORDER_NOTNULL_EXPECTED = dISPLAY_ORDER_NOTNULL_EXPECTED;
	}
	public String getTAGSEO_NOTNULL_EXPECTED() {
		return TAGSEO_NOTNULL_EXPECTED;
	}
	public void setTAGSEO_NOTNULL_EXPECTED(String tAGSEO_NOTNULL_EXPECTED) {
		TAGSEO_NOTNULL_EXPECTED = tAGSEO_NOTNULL_EXPECTED;
	}
	
	
}
