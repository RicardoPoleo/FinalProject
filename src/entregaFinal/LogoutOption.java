package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutOption extends PageObject {

	public LogoutOption(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized(){
		if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
			driver.findElement(By.linkText("Logout")).click();
   			return true;
		}
		return false;
	}
	
}
