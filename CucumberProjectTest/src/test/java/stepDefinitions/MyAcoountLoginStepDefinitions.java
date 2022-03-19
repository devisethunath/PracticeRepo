package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyAcoountLoginStepDefinitions {
	
	public WebDriver driver;
	
	@Given("open browser")
	public void open_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/sethu/Downloads/chromedriver_win32/chromedriver.exe");
		 driver= new ChromeDriver();

		
		driver.manage().window().maximize();
	}

	@When("Enter the url {string}")
	public void enter_the_url(String url) {
		
		driver.get(url);
	}

	@When("Click on My Account Menu")
	public void click_on_my_account_menu() {
		
		driver.findElement(By.linkText("My Account")).click();
	}

	/*@When("Enter Registered username and password")
	public void enter_registered_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("sethunath.chandran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sethu@197519");
	}*/
	
	/*@When("Enter Registered username {string} and password {string}")
	public void enter_registered_username_and_password(String user, String pwd) {
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}*/
	
	/*@When("Enter Registered username  and password")
	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials) {
	   List<List<String>>data=credentials.cells();

		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}*/

	
	@When("Enter Registered username  and password")
	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials) {
		List<Map<String, String>>data =credentials.asMaps(String.class,String.class);
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
	    
	}



	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("User must successfullylogin to the webpage")
	public void user_must_successfullylogin_to_the_webpage() {
		
		String username=driver.findElement(By.xpath("//strong[normalize-space()='sethunath.chandran']")).getText();
		Assert.assertEquals("sethunath.chandran", username);
	}
	
	@Then("Verify login")
	public void verify_login() {
		
		String text=driver.findElement(By.cssSelector("ul[class='woocommerce-error'] li")).getText();
		System.out.println(text);
		if (text.contains("ERROR"))
		{
			Assert.assertTrue("Invalid Input Error page", false);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
