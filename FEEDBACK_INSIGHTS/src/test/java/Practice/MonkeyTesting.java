package Practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericLibraries.PropertyFileLibrary;
import ObjectRepositries.SignInPage;



public class MonkeyTesting {
	
	static WebDriver driver;
	
	public static void attack()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String script = " javascript: (function() {\r\n"
				+ "    function callback() {\r\n"
				+ "        gremlins.createHorde({\r\n"
				+ "            species: [gremlins.species.clicker(),gremlins.species.toucher(),gremlins.species.formFiller(),gremlins.species.scroller(),gremlins.species.typer()],\r\n"
				+ "            mogwais: [gremlins.mogwais.alert(),gremlins.mogwais.fps(),gremlins.mogwais.gizmo()],\r\n"
				+ "            strategies: [gremlins.strategies.distribution(),gremlins.strategies.allTogether(),gremlins.strategies.bySpecies()]\r\n"
				+ "        }).unleash();\r\n"
				+ "    }\r\n"
				+ "    var s = document.createElement(\"script\");\r\n"
				+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
				+ "    if (s.addEventListener) {\r\n"
				+ "        s.addEventListener(\"load\", callback, false);\r\n"
				+ "    } else if (s.readyState) {\r\n"
				+ "        s.onreadystatechange = callback;\r\n"
				+ "    }\r\n"
				+ "    document.body.appendChild(s);\r\n"
				+ "    })()";
		jse.executeAsyncScript(script);
	}

	public static void main(String[] args) throws Throwable {
		
		/*PropertyFileLibrary pLib = new PropertyFileLibrary();
		String EMAIL = pLib.getpropertyfile("email");
		String PASSWORD = pLib.getpropertyfile("password");*/
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
	/*	SignInPage sp = new SignInPage(driver);
		sp.signin(EMAIL, PASSWORD); */
		
		attack();
	}

}
