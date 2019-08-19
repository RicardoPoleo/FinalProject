package entregaFinal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class FunctionalTest {

	protected static WebDriver driver;
	
	protected static String url = "https://opencart.abstracta.us";
	
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		
		System.setProperty("webdriver.gecko.driver","src//geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
        cap.setBrowserName("firefox");
        driver = new FirefoxDriver();
        /*    driver = new MarionetteDriver();
	/*	driver = new FirefoxDriver(); */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	
	@BeforeMethod
	public void setTime() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown(){
		driver.close();
	}	
	
}
