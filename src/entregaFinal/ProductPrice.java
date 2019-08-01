package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPrice extends PageObject {
	
	
	private WebElement productprice= driver.findElement(By.cssSelector(".col-sm-4 > .list-unstyled:nth-child(4) > li:nth-child(2)"));

	public ProductPrice(WebDriver driver) {
		super(driver);
	}
	
	public String getValueProductPrice(){
		return this.productprice.getText();
	}
}