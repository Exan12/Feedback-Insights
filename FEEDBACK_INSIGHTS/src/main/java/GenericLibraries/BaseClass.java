package GenericLibraries;

import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepositries.HomePage;
import ObjectRepositries.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	PropertyFileLibrary pLib = new PropertyFileLibrary();
	WebDriverLibrary wLib = new WebDriverLibrary();
	JavaLibrary jLib = new JavaLibrary();
	public WebDriver driver = null;

	@BeforeSuite 
	public void bsConfig() throws SQLException
	{
		Reporter.log(" ---- DB Connection Successfull ---- ",true);
	}
	
	@BeforeClass 
	public void bcConfig() throws Throwable
	{
		String BROWSER = pLib.getpropertyfile("browser");
	    String URL = pLib.getpropertyfile("url");
	    
	    if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log(BROWSER + "--- Browser Launched ---- ");
		}
		else if(BROWSER.equalsIgnoreCase("FIREFOX"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log(BROWSER + "--- Browser Launched ---- ");
		}
		else
		{
			System.out.println("--- Invalid Browser Name --- ");
		}
		
		wLib.maximiseWindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
	    }
		
		@BeforeMethod 
		public void bmConfig() throws Throwable
		{
		
			String Email = pLib.getpropertyfile("email");
			String PASSWORD = pLib.getpropertyfile("password");
			
			SignInPage sp = new SignInPage(driver);
			sp.signin(Email, PASSWORD);
			Reporter.log(" --- Logged In Sucessfully --- ",true);
		
		}
		
		@AfterMethod 
		public void amConfig()
		{
			HomePage hp = new HomePage(driver);
			hp.LogoutFromApp();
			Reporter.log(" --- Logged Out Succesfully --- ",true);
		}
		
		@AfterClass 
		public void acConfig()
		{
			driver.quit();
			Reporter.log(" --- Browser closed Sucessfully --- ",true);
		}
		
		@AfterSuite 
		public void asConfig() throws SQLException
		{
			Reporter.log(" --- Database Connection Closed Succesfully",true);
		}
}

