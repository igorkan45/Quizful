package quizful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfileSettings {

	private static final String NAME = "Igor";
	private static final String SURNAME = "Kanunnikov";
	private static final String YEAR = "1991";
	private static final String WEBSITE = "park.by";
	private static final String COMPANY = "EC HTP";
	private static final String ABOUT = "Some text about me";

	private WebDriver driver;

	public ProfileSettings() {
		super();
	}

	public ProfileSettings(WebDriver driver) {
		this.driver = driver;
	}

	public Profile setPrivateData() {
		WebElement privateDataHeader = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]"));
		privateDataHeader.click();

		WebElement name = driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[1]/td[2]/input"));
		name.click();
		name.clear();
		name.sendKeys(NAME);

		WebElement surname = driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[2]/td[2]/input"));
		surname.click();
		surname.clear();
		surname.sendKeys(SURNAME);

		WebElement year = driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[3]/td[2]/input"));
		year.click();
		year.clear();
		year.sendKeys(YEAR);

		WebElement website = driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[4]/td[2]/input"));
		website.click();
		website.clear();
		website.sendKeys(WEBSITE);

		WebElement company = driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[5]/td[2]/input"));
		company.click();
		company.clear();
		company.sendKeys(COMPANY);

		Select dropdownCountry = new Select(driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[1]/td[4]/select")));
		dropdownCountry.selectByValue("XisgEe4sJp28");

		driver.switchTo().defaultContent();

		Select dropdownCity = new Select(driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[2]/td[4]/select")));
		dropdownCity.selectByValue("3BgV5tBoGfXr");

		driver.switchTo().defaultContent();

		Select timeZone = new Select(driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[3]/td[4]/select")));
		timeZone.selectByValue("Europe/Minsk");

		driver.switchTo().defaultContent();

		WebElement textField = driver
				.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[6]/td/textarea"));
		textField.click();
		textField.clear();
		textField.sendKeys(ABOUT);

		WebElement buttonSave = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[3]/form/div/input"));
		buttonSave.click();

		return new Profile();

	}

	public Profile setNotifications() {
		WebElement notification = driver.findElement(By.xpath("//*[@id='profile-notifications-form']/div[1]"));
		notification.click();

		WebElement notifyMe = driver
				.findElement(By.xpath("//*[@id='profile-notifications-form']/div[2]/form/label[1]/input"));
		if (notifyMe.isSelected()) {
			notifyMe.click();
		}

		WebElement spamMe = driver
				.findElement(By.xpath("//*[@id='profile-notifications-form']/div[2]/form/label[2]/input"));
		if (spamMe.isSelected()) {
			spamMe.click();
		}

		WebElement buttonSave = driver
				.findElement(By.xpath("//*[@id='profile-notifications-form']/div[2]/form/div/input"));
		buttonSave.click();

		return new Profile();
	}

	public Profile setConfidential() {

		WebElement confidential = driver.findElement(By.xpath("//*[@id='profile-privacy-form']/div[1]"));
		confidential.click();
		
		WebElement onlyMe = driver.findElement(
			By.xpath("//*[text()='Только я'][@='profile-privacy-form']/div[2]/form/table/tbody/tr[4]/td[1]/label"));
		onlyMe.click();
		
		WebElement buttonSave = driver
				.findElement(By.xpath("//*[@id='profile-privacy-form']/div[2]/form/div/input"));
		buttonSave.click();

		return new Profile();
	}

}
