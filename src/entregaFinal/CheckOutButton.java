package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckOutButton extends PageObject {
	
    private WebElement checkoutbutton =  driver.findElement(By.cssSelector("li:nth-child(5) .hidden-xs"));
    
    Actions builder = new Actions(driver);
    
	public CheckOutButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.checkoutbutton.isDisplayed();
	}
	
	public void PerformCheckOutButton(){
		
		builder.moveToElement(checkoutbutton).perform();
		
	}
	
	
	
	public void CheckOutButtonClick(){
	
		this.checkoutbutton.click();
	}
	
}