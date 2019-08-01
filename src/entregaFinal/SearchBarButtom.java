package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBarButtom extends PageObject {
	
	private WebElement buttom_search=driver.findElement(By.cssSelector(".btn-default"));

	public SearchBarButtom(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.buttom_search.isDisplayed();
	}
	
	public ProductZero submit(){
		this.buttom_search.click();
		return new ProductZero(driver);
	}
	
}