package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpLoginOption extends PageObject {

	public SignUpLoginOption(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized(){
		if(driver.findElement(By.linkText("Login")).isDisplayed()) {
			driver.findElement(By.linkText("Login")).click();
   			return true;
		}
		return false;
	}
	
}
