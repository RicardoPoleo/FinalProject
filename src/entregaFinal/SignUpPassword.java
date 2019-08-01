package entregaFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPassword extends PageObject {
	
	@FindBy(id="input-password")
	private WebElement password;

	
	public SignUpPassword(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.password.isDisplayed();
		
	}

	public void enterPassword(String password){
		this.password.clear();
		this.password.sendKeys(password);
	}
	
}