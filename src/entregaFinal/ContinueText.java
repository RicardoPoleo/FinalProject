package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContinueText extends PageObject {
	
    private WebElement continuetext = driver.findElement(By.linkText("Continue"));
	
	public ContinueText(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.continuetext.isDisplayed();
	}
	
	public void ConfirmButtonClick(){
		this.continuetext.click();
	}
		
}