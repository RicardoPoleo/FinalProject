package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentMethodButton extends PageObject {
	
    private WebElement paymentmethodbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[2]"));
	
	public PaymentMethodButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(paymentmethodbutton));
		return this.paymentmethodbutton.isDisplayed();
	}
	
	public void PaymentMethodButtonClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", paymentmethodbutton);
	}
		
}