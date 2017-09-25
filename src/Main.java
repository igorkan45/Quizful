package quizful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.quizful.net");
		
		Homepage homePage = new Homepage(driver);
		homePage.enterLoginForm();
		
		Loginform loginForm = new Loginform(driver);
		loginForm.enterUserName();
		loginForm.enterPassword();
		loginForm.clickLogin();
		
		Homepage homePageLoggedIn = new Homepage(driver);
		homePageLoggedIn.clickProfileLink();
		
		Profile profile = new Profile(driver);
		profile.clickProfileSettings();
		
		ProfileSettings profileSettings = new ProfileSettings(driver);
		profileSettings.setPrivateData();
		
		profile.clickProfileSettings();
		
		profileSettings.setNotifications();
		
		profile.clickProfileSettings();
		
		profileSettings.setConfidential();


	}

}
