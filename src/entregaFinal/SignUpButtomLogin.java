package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpButtomLogin extends PageObject {
	
	private WebElement buttom_login=driver.findElement(By.cssSelector(".btn:nth-child(3)"));

	public SignUpButtomLogin(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.buttom_login.isDisplayed();
	}
	
	public ReceiptButtom submit(){
		this.buttom_login.click();
		return new ReceiptButtom(driver);
	}
	
}