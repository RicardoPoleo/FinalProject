package entregaFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditFax extends PageObject {
    
	@FindBy(id="input-fax")	
    private WebElement fax;
    
	public EditFax(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.fax.isDisplayed();
	}
	
	public void enterFax(String fax){
		this.fax.clear();
		this.fax.sendKeys(fax);
	}
	
}