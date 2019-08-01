package entregaFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditLastName extends PageObject {
	
	@FindBy(id="input-lastname")
    private WebElement lastname;
    
	public EditLastName(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.lastname.isDisplayed();
	}
	
	public void enterLastName(String lastname){
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
}