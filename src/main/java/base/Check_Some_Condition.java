package base;

public class Check_Some_Condition extends Base_Definition {

	private String addKeywordTitle = "キーワード新規追加 入力";
	private String editKeywordTitle = "キーワード編集 入力";
	private String addThemeTitle = "テーマ新規追加 入力";
	private String editThemeTitle = "テーマ編集 入力";
	private String addBannerTitle = "バナー・重要なお知らせ新規追加 入力";
	private String editBannerTitle = "バナー・重要なお知らせ編集 入力";
	private String addRankingTitle = "ランキング新規追加 入力";
	private String editRankingTitle = "キーワード編集 入力";
	
	private String addKeywordConfirmTitle = "キーワード新規追加 確認";
	private String editKeywordConfirmTitle = "キーワード編集 確認";
	private String addThemeConfirmTitle = "テーマ新規追加 確認";
	private String editThemeConfirmTitle = "テーマ編集 確認";
	private String addBannerConfirmTitle = "バナー・重要なお知らせ新規追加 確認";
	private String editBannerConfirmTitle = "バナー・重要なお知らせ編集 確認";
	private String addRankingConfirmTitle = "ランキング新規追加 確認";
	private String editRankingConfirmTitle = "キーワード編集 確認";

	public boolean CheckTitle() {
		if (driver.getTitle().toString().equals(addKeywordTitle)
				|| driver.getTitle().toString().equals(editKeywordTitle)
				|| driver.getTitle().toString().equals(addThemeTitle)
				|| driver.getTitle().toString().equals(editThemeTitle)
				|| driver.getTitle().toString().equals(addBannerTitle)
				|| driver.getTitle().toString().equals(editBannerTitle)
				|| driver.getTitle().toString().equals(addRankingTitle)
				|| driver.getTitle().toString().equals(editRankingTitle)) {
			return true;
		}
		return false;
	}
	
	public boolean CheckConfirmTitle() {
		if (driver.getTitle().toString().equals(addKeywordConfirmTitle)
				|| driver.getTitle().toString().equals(editKeywordConfirmTitle)
				|| driver.getTitle().toString().equals(addThemeConfirmTitle)
				|| driver.getTitle().toString().equals(editThemeConfirmTitle)
				|| driver.getTitle().toString().equals(addBannerConfirmTitle)
				|| driver.getTitle().toString().equals(editBannerConfirmTitle)
				|| driver.getTitle().toString().equals(addRankingConfirmTitle)
				|| driver.getTitle().toString().equals(editRankingConfirmTitle)) {
			return true;
		}
		return false;
	}
}
