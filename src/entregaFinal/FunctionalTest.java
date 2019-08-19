package entregaFinal;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class FunctionalTest {

	protected static WebDriver driver;
	
	protected static String url = "https://opencart.abstracta.us";
	
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		File gecko = new File("src//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",gecko.getAbsolutePath());
		FirefoxBinary binary = new FirefoxBinary();
        binary.addCommandLineOptions("-headless");
        Map<String, String> environmentVariables = new HashMap<>();
		environmentVariables.put("DISPLAY",":80");
		driver = new FirefoxDriver(new GeckoDriverService.Builder().usingFirefoxBinary(binary).withEnvironment(environmentVariables).build());	
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
