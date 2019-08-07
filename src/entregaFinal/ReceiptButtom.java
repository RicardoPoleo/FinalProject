package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReceiptButtom extends PageObject {

	private WebElement myaccount = driver.findElement(By.cssSelector(".list-group-item:nth-child(1)"));
	
	
	public ReceiptButtom(WebDriver driver) {
		super(driver);
	}

 	public boolean isInitialized() {
		return myaccount.isDisplayed();
	}

	public String confirmationText(){
		return myaccount.getText();
	} 

}
