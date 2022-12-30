package ObjectRepositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// DECLARATION
	@FindBy(xpath = "//button[text()='Create Survey']")
	private WebElement createsurvey;

	// INITIALIZATION
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// UTILIZATION
	public WebElement getCreatesurvey() {
		return createsurvey;
	}

	// BUSINESS LIBRARY LOGICS
	/**
	 * This method is used to click on create survey button
	 */
	public void CreateSurvey()
	{
		createsurvey.click();
	}

}
