package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentButton extends PageObject {
	
    private WebElement paymentbutton = driver.findElement(By.xpath("(/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/input[1])"));
     
	public PaymentButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		 wait.until(ExpectedConditions.visibilityOf(paymentbutton));
		return this.paymentbutton.isDisplayed();
	}
	
	public void PaymentButtonClick(){
	
		this.paymentbutton.click();
	
	}
}