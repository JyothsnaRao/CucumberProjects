import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyScript{
//	System
	WebDriver driver;
	@Given("^Browser navigated to \"([^\"]*)\" login page$")
	public void givenMethod(String app)
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		if(app.equals("Facebook"))
		{
			driver.get("https://www.facebook.com/");
		}
		if(app.equals("Gmail"))
		{
			driver.get("https://www.gmail.com/");
		}
		if(app.equals("LinkedIn"))
		{
			driver.get("https://www.google.com/");
			
		}
	}
	@When("^I Entered ([^\"]*) userName, Password and click login button$")
	public void whenMethod(String str)
	{
		System.out.println(str);
	}
	@Then("^\"([^\"]*)\" home page should launch$")
	public void thenMethod(String str)
	{
		System.out.println(str + " home page should launch");
	}
	@Then("^([^\"]*) Message$")
	public void thenMethod2(String str)
	{
		System.out.println(str + " Message");
	}

}
