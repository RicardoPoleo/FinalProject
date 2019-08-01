package entregaFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends PageObject {
	
	@FindBy(name="search")
	private WebElement searchbar;

	public SearchBar(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.searchbar.isDisplayed();
	}
	
	public void enterSearch(String searchbar){
		this.searchbar.clear();
		this.searchbar.sendKeys(searchbar);
	}
}