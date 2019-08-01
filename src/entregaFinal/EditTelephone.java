package entregaFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTelephone extends PageObject {
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	public EditTelephone(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.telephone.isDisplayed();
	}
	
	public void enterTelephone(String telephone){
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}
	
	
}