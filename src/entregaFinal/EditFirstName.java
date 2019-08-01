package entregaFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditFirstName extends PageObject {
	
	@FindBy(id="input-firstname")
	private WebElement firstname;
    
	public EditFirstName(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.firstname.isDisplayed();
	}
	
	public void enterFirstName(String firstname){
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
}