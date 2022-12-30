package ObjectRepositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	// DECLARATION
		@FindBy(id = "mat-input-0")
		private WebElement EmailAddress;
		
		@FindBy(id = "mat-input-1")
		private WebElement Password;
		
		@FindBy(xpath = "//button[text()='Login']")
		private WebElement Login;
		
		@FindBy(xpath = "forgot-password-wrapper")
		private WebElement ForgotPassword;
		
		// INITIALIZATION
		public SignInPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		// UTILISATION
		public WebElement getEmailAddress() {
			return EmailAddress;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getLogin() {
			return Login;
		}

		public WebElement getForgotPassword() {
			return ForgotPassword;
		}
		
	// BUSINESS LIBRARY LOGICS
	   /**
	    * This method is used to Sign In to Application
	    */
	   public void signin(String email,String password)
	   {
		   EmailAddress.sendKeys(email);
		   Password.sendKeys(password);
		   Login.click();
	   }
		

}
