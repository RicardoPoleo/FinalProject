package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpEditAccount extends PageObject {
	
	public SignUpEditAccount(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized(){
		if(driver.findElement(By.linkText("Edit Account")).isDisplayed()) {
			driver.findElement(By.linkText("Edit Account")).click();
   			return true;
		}
		return false;
	}
	
}
