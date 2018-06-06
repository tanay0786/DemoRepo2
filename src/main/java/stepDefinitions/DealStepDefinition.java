package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefinition {
	
	
WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanay Chawla\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(15);
		
		
		}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		
		String title = driver.getTitle();
		System.out.println("Title:->"+title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}
	
	@Then("^user enters username and User enters password$")
	public void user_enters_username_and_User_enters_password(DataTable credentials) throws InterruptedException {
		List<List<String>> data = credentials.raw(); 
		
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
			
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(5000);
	
		
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}
	
	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException  {
	    
	    String title = driver.getTitle();
	    System.out.println("New title="+title);
	    Assert.assertEquals("CRMPRO",title);
	    Thread.sleep(5000);
	    
	    
	}
	
	@Then("^user move to the new deal page$")
	public void user_move_to_the_new_deal_page() throws InterruptedException{
		
	
		driver.switchTo().frame("mainpanel");
	
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		Thread.sleep(10000);
		
		
	    
	}
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealdata)  {
		
		List<List<String>> dealValues =dealdata.raw();
		
		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		driver.quit();
		
	    
	 	
		
	}
}
