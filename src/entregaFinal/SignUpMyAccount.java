package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpMyAccount extends PageObject {

	public SignUpMyAccount(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		if(driver.findElement(By.cssSelector(".dropdown .hidden-xs")).isDisplayed()) {
			driver.findElement(By.cssSelector(".dropdown .hidden-xs")).click();
			return true;
		}
   		return false;
	}
	
}
