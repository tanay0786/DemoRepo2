//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_already_on_login_page() throws InterruptedException{
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanay Chawla\\Desktop\\ChromeDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.freecrm.com/index.html");
//		Thread.sleep(15);
//		
//		
//		}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM(){
//		
//		String title = driver.getTitle();
//		System.out.println("Title:->"+title);
//		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
//	}
//	
//	@Then("^user enters \"(.*)\" and User enters \"(.*)\"$")
//	public void user_enters_username_and_User_enters_password(String username,String password) throws InterruptedException {
//		
//		driver.findElement(By.name("username")).sendKeys(username);
//		
//		driver.findElement(By.name("password")).sendKeys(password);
//		Thread.sleep(5000);
//	
//		
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//	    
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	    
//	}
//	
//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() throws InterruptedException  {
//	    
//	    String title = driver.getTitle();
//	    System.out.println("New title="+title);
//	    Assert.assertEquals("CRMPRO",title);
//	    Thread.sleep(5000);
//	    driver.quit();
//	    
//	}
//	
//	
//	
//	
//	
//
//}
