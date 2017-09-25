package quizful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginform {

	private static final String USERNAME = "igorkan1991";
	private static final String PASSWORD = "11nov1991";

	private WebDriver driver;

	public Loginform(WebDriver driver) {
		this.driver = driver;
	}

	public Loginform() {
		super();
	}

	public void enterUserName() {
		WebElement userNameField = driver.findElement(By.xpath("//*[@id='login']"));
		userNameField.click();
		userNameField.sendKeys(USERNAME);
	}

	public void enterPassword() {
		WebElement passwordField = driver.findElement(By.xpath("//*[@id='login-form']/div[3]/form/label[2]/input"));
		passwordField.click();
		passwordField.sendKeys(PASSWORD);

	}
	
	public Homepage clickLogin(){
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-form']/div[3]/form/p/input"));
		loginButton.click();
		return new Homepage();
	}
	
}
