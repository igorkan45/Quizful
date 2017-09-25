package quizful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	private WebDriver driver;

	public Homepage() {
		super();
	}

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public Loginform enterLoginForm() {
		WebElement loginLink = driver.findElement(By.xpath("//*[@id='user-panel']/li[1]"));
		loginLink.click();
		return new Loginform();
	}
	
	public Profile clickProfileLink(){
		WebElement profileLink = driver.findElement(By.xpath("//*[@id='user-panel']/li[1]"));
		profileLink.click();
		return new Profile();
	}

}
