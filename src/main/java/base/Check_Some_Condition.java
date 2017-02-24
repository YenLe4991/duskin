package base;

public class Check_Some_Condition extends Base_Definition {

	private String addKeywordTitle = "�L�[���[�h�V�K�ǉ� ����";
	private String editKeywordTitle = "�L�[���[�h�ҏW ����";
	private String addThemeTitle = "�e�[�}�V�K�ǉ� ����";
	private String editThemeTitle = "�e�[�}�ҏW ����";
	private String addBannerTitle = "�o�i�[�E�d�v�Ȃ��m�点�V�K�ǉ� ����";
	private String editBannerTitle = "�o�i�[�E�d�v�Ȃ��m�点�ҏW ����";
	private String addRankingTitle = "�����L���O�V�K�ǉ� ����";
	private String editRankingTitle = "�L�[���[�h�ҏW ����";
	
	private String addKeywordConfirmTitle = "�L�[���[�h�V�K�ǉ� �m�F";
	private String editKeywordConfirmTitle = "�L�[���[�h�ҏW �m�F";
	private String addThemeConfirmTitle = "�e�[�}�V�K�ǉ� �m�F";
	private String editThemeConfirmTitle = "�e�[�}�ҏW �m�F";
	private String addBannerConfirmTitle = "�o�i�[�E�d�v�Ȃ��m�点�V�K�ǉ� �m�F";
	private String editBannerConfirmTitle = "�o�i�[�E�d�v�Ȃ��m�点�ҏW �m�F";
	private String addRankingConfirmTitle = "�����L���O�V�K�ǉ� �m�F";
	private String editRankingConfirmTitle = "�L�[���[�h�ҏW �m�F";

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
