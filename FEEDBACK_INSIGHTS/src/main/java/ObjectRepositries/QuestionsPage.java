package ObjectRepositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.PropertyFileLibrary;
import GenericLibraries.WebDriverLibrary;

public class QuestionsPage {
	
	PropertyFileLibrary pLib = new PropertyFileLibrary();
	WebDriverLibrary wLib = new WebDriverLibrary();
	WebDriver driver;

	// DECLARATION

	@FindBy(xpath = "(//span[@class='question-type'])[1]")
	private WebElement WelcomeScreen;

	@FindBy(xpath  = "(//span[@class='question-type'])[2]")
	private WebElement ThankYouScreen;

	@FindBy(xpath = "(//span[@class='question-type'])[3]")
	private WebElement Message;

	@FindBy(xpath = "(//span[@class='question-type'])[4]")
	private WebElement  OpenEndedSingleEntries;

	@FindBy(xpath  = "//span[text()='Open Ended Multiple Entries']")
	private WebElement OpenEndedMultipleEntries;

	@FindBy(xpath  = "(//span[@class='question-type'])[6]")
	private WebElement singleChoice;

	@FindBy(xpath  = "(//span[@class='question-type'])[7]")
	private WebElement Mutiple;

	@FindBy(xpath = "//div[@data-placeholder=\"Enter your welcome text here\"]")
	private WebElement Question;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement Save;

	@FindBy(xpath = "//div[@data-placeholder=\"Enter Option\"]")
	private WebElement  Option1;

	@FindBy(xpath  = "(//div[@data-placeholder=\"Enter Option\"])[2]")
	private WebElement  Option2;

	@FindBy(xpath  = "//button[text()=\"AUTOSET\"]")
	private WebElement AUTOSET;

	@FindBy(xpath  = "(//i[@class=\"fa fa-plus-circle\"])[1]")
	private WebElement Plus1;
	
	@FindBy(xpath = "//button[text()='Preview Survey']")
	private WebElement PreviewSurvey;

	// INITIALIZATION
	public QuestionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// UTILIZATION

	public WebElement getWelcomeScreen() {
		return WelcomeScreen;
	}

	public WebElement getThankYouScreen() {
		return ThankYouScreen;
	}

	public WebElement getMessage() {
		return Message;
	}

	public WebElement getOpenEndedSingleEntries() {
		return OpenEndedSingleEntries;
	}

	public WebElement getOpenEndedMultipleEntries() {
		return OpenEndedMultipleEntries;
	}

	public WebElement getSingleChoice() {
		return singleChoice;
	}

	public WebElement getMutiple() {
		return Mutiple;
	}

	public WebElement getQuestion() {
		return Question;
	}

	public WebElement getSave() {
		return Save;
	}

	public WebElement getOption1() {
		return Option1;
	}

	public WebElement getOption2() {
		return Option2;
	}

	public WebElement getAUTOSET() {
		return AUTOSET;
	}

	public WebElement getPlus1() {
		return Plus1;
	}

	public WebElement getPreviewSurvey() {
		return PreviewSurvey;
	}

	// BUSINESS LIBRARY LOGICS
	/**
	 * This method is used to Create Question in WelcomeScreen module
	 * @throws Throwable 
	 * 
	 */
	public void WelComeScreen() throws Throwable 
	{
        WelcomeScreen.click();
		String q1 = pLib.getpropertyfile("Q1");
		Question.sendKeys(q1);
		Save.click();		
	}
	
	/**
	 * This Method is used to Create Question in Thankyou Screen Module
	 * @throws Throwable
	 */
	public void ThankyouScreen() throws Throwable 
	{
		ThankYouScreen.click();
		String q2 = pLib.getpropertyfile("Q2");
		Question.sendKeys(q2);
		Save.click();
	}
	
	/**
	 * This Method is used to Create Question in Thankyou Screen Module
	 * @throws Throwable
	 */
	public void Message() throws Throwable 
	{
		Message.click();
		String q3 = pLib.getpropertyfile("Q3");
		Question.sendKeys(q3);
		Save.click();
	}
	
	/**
	 * This method is used to create the Question in Open Ended Single Entry
	 * @throws Throwable
	 */
	public void OpenEndedSingleEntry() throws Throwable
	{
		OpenEndedSingleEntries.click();
		String q4 = pLib.getpropertyfile("Q4");
		Question.sendKeys(q4);
		Option1.sendKeys("Adarsh");
		AUTOSET.click();
		Save.click();
		Option1.clear();
	}
	
	/**
	 * This method is used to create the Question in Multiple Ended Single Entry
	 * @throws Throwable
	 */
	
	public void OpenEndedMultipleEntry() throws Throwable
	{		
		try
		{
			OpenEndedMultipleEntries.sendKeys();
		}
		catch(Exception e) {
			
			OpenEndedMultipleEntries.click();
			String q5 = pLib.getpropertyfile("Q5");
			Question.sendKeys(q5);
			Option2.sendKeys("Ankit");
			AUTOSET.click();
			Save.click();
			Option2.clear();
		}
		
	}
	
	/**
	 * This method is used to create the question in Single choice Module 
	 * @throws Throwable
	 */
	public void SingleChoice() throws Throwable
	{
		singleChoice.click();
		String q6 = pLib.getpropertyfile("Q6");
		Question.sendKeys(q6);
		Option2.sendKeys("Anmol");
		AUTOSET.click();
		Save.click();
		Option2.clear();
		
	}

}
