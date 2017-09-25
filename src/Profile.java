package quizful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile {
	
	private WebDriver driver;

	public Profile() {
		super();
	}
	
	public Profile(WebDriver driver){
		this.driver = driver;
	}
	
	public ProfileSettings clickProfileSettings(){
		WebElement buttonProfile = driver.findElement(By.xpath("//*[@id='middle']/div[2]/div[1]/div[2]/div/a"));
		buttonProfile.click();
		return new ProfileSettings();
	}
	
	

}
