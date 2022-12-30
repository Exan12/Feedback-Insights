package BackToDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import GenericLibraries.PropertyFileLibrary;
import GenericLibraries.WebDriverLibrary;
import ObjectRepositries.HomePage;
import ObjectRepositries.QuestionsPage;
import ObjectRepositries.SignInPage;

public class QuestionTypesTest {

	public static void main(String[] args) throws Throwable {

		WebDriver driver;
		PropertyFileLibrary pLib = new PropertyFileLibrary();
		WebDriverLibrary wLib = new WebDriverLibrary();

		// Opening Browser
	    driver = new ChromeDriver();
		String EMAIL = pLib.getpropertyfile("email");
		String URL = pLib.getpropertyfile("url");
		String PASSWORD = pLib.getpropertyfile("password");
		
		driver.get(URL);
		wLib.maximiseWindow(driver);
		wLib.waitForPageLoad(driver);
		
		// SIGN IN TO THE APPLICATION
		SignInPage sp = new SignInPage(driver);
		sp.signin(EMAIL, PASSWORD);
		Reporter.log("Logged In to the Application Succesfully",true);
		
		// Entering Into Homepage
		HomePage hp = new HomePage(driver);
		hp.CreateSurvey();
		Reporter.log("Entered to Homepage Succcesfully",true);
		
		// Writing Questions into QuestionType Section
		QuestionsPage qp = new QuestionsPage(driver);
		
		String q1 = "welcome to feedback insights";
		qp.WelComeScreen();
		qp.ThankyouScreen();
		qp.Message();
		qp.OpenEndedSingleEntry();
		qp.OpenEndedMultipleEntry();
		qp.SingleChoice();

	}

}
