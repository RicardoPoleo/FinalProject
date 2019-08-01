package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShippingButton extends PageObject {
	
    private WebElement shippingbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[5]/div[1]/input[1]"));
	
	public ShippingButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(shippingbutton));
		return this.shippingbutton.isDisplayed();
	}
	
	public void ShippingButtonClick(){
		this.shippingbutton.click();
	}
		
}