package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductZero extends PageObject {
	
	private WebElement productzero = driver.findElement(By.cssSelector(".product-layout:nth-child(1) .img-responsive"));

	public ProductZero(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.productzero.isDisplayed();
	}
	
	public ProductPrice ClickProductZero(){
		this.productzero.click();
		return new ProductPrice(driver);
	}
	
}