package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartButton extends PageObject {
	
    private WebElement button_cart =  driver.findElement(By.id("button-cart"));
	
	public CartButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.button_cart.isDisplayed();
	}
	

	public void CartButtonClick(){
		this.button_cart.click();
	}
	
}