package ObjectRepositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// DECLARATION
	@FindBy(xpath = "//button[text()='Create Survey']")
	private WebElement CreateSurvey;
	
	@FindBy(xpath = "//span[text()='Manoj']")
	private WebElement ProfileName;
	
	@FindBy(linkText = "Logout")
	private WebElement LogoutButton;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement ConfirmButton;

	// INITIALIZATION
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// UTILIZATION
	public WebElement getCreatesurvey() {
		return CreateSurvey;
	}
	
	public WebElement getProfileName() {
		return ProfileName;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	public WebElement getConfirmButton() {
		return ConfirmButton;
	}

// BUSINESS LIBRARY LOGICS
	/**
	 * This method is used to click on create survey button
	 */
	public void CreateSurvey()
	{
		CreateSurvey.click();
	}
	
	/**
	 * This method is used to Signout from the application
	 */
	public void LogoutFromApp()
	{
		ProfileName.click();
		LogoutButton.click();
		ConfirmButton.click();
	}

}
