package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShippingMethodButton extends PageObject {
	
    private WebElement shippingmethodbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]"));
	
	public ShippingMethodButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {

		wait.until(ExpectedConditions.visibilityOf(shippingmethodbutton));
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]"))));

		return this.shippingmethodbutton.isDisplayed();
	}
	
	public void ShippingMethodButtonClick(){
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", shippingmethodbutton);
		
	}
		
}