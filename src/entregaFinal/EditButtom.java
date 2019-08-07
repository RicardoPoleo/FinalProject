package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditButtom extends PageObject {
	
    private WebElement buttom_primary = driver.findElement(By.cssSelector(".btn-primary"));
	
	public EditButtom(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.buttom_primary.isDisplayed();
	}
	

	public ReceiptButtom submit(){
		this.buttom_primary.click();
		return new ReceiptButtom(driver);
	}
	
}