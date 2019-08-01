package entregaFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpEmail extends PageObject {
	
	@FindBy(id="input-email")
	private WebElement email;

	public SignUpEmail(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.email.isDisplayed();
	}
	
	public void enterEmail(String email){
		this.email.clear();
		this.email.sendKeys(email);
	}
}