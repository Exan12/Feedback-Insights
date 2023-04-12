package BackToDashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepositries.HomePage;
import ObjectRepositries.QuestionsPage;

public class QuestionTypesTest extends BaseClass {

	@Test
	public void questionTypesTest() throws Throwable
	{
		// Entering Into Homepage
		HomePage hp = new HomePage(driver);
		hp.CreateSurvey();
		Reporter.log("Entered to Homepage Succcesfully",true);

		// Writing Questions into QuestionType Section
		QuestionsPage qp = new QuestionsPage(driver);
		qp.WelComeScreen();
		System.out.println("Question 1 clicked");
		qp.ThankyouScreen();
		System.out.println("Question 2 clicked");
		qp.Message();
		System.out.println("Question 3 clicked");
		qp.OpenEndedSingleEntry();
		System.out.println("Question 4 clicked");

		qp.OpenEndedMultipleEntry();
		System.out.println("Question 5 Clicked");

		qp.SingleChoice();
	}

	@Test
	public void printingAllQuestions()
	{
		// Entering Into Homepage
		HomePage hp = new HomePage(driver);
		hp.CreateSurvey();
		Reporter.log("Entered to Homepage Succcesfully",true);
		
		// Printing all the Questions in the Webpage
		List<WebElement> allQue = driver.findElements(By.xpath("//ul[@class='options-types']"));
		for (int i=0;i<=allQue.size()-1;i++)
		{
			WebElement oneQue = allQue.get(i);
			String text = oneQue.getText();
			System.out.println(text);
		}
	}

}
