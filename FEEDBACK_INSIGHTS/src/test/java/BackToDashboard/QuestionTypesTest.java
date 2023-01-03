package BackToDashboard;

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

}
