package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefs {



	static WebDriver driver;
	@Given("Test me app is launched")
	public void test_me_app_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver =new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		  driver.manage().window().maximize();
	    
	}

	@Then("user clicks on log in button")
	public void user_clicks_on_log_in_button() {
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("user enters valid username {string}")
	public void user_enters_valid_username(String uname) {
	   driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@Then("user enters pssword {string}")
	public void user_enters_pssword(String pass1) {
		driver.findElement(By.name("password")).sendKeys(pass1);
		driver.findElement(By.name("Login")).click();
		//driver.close();
		
	   
	}
	@Given("user logged in into test me app")
	public void user_logged_in_into_test_me_app() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
//		  driver =new ChromeDriver();
//		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
//		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
//		driver.findElement(By.name("userName")).sendKeys("Lalitha");
//		driver.findElement(By.name("password")).sendKeys("Password123");
		//Thread.sleep(1000);
//		driver.findElement(By.name("Login")).click();
		System.out.println("code is already present my testtt");
		Thread.sleep(5000);
	   
	}

	@Then("user search the products")
	public void user_search_the_products() throws Exception {
	Actions act1 = new Actions(driver);
		//act1.moveToElement(driver.findElement(By.xpath)
	act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).click().perform(); //cat
	act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().build().perform(); //sb ct
	Thread.sleep(2000);
	act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform(); //ele
	
	}

	@Then("user selects the product")
	public void user_selects_the_product() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();//add to cart
		System.out.println("code is already present my testtt code2");
	}

	@Then("add the product to cart")
	public void add_the_product_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();//cartlink
	System.out.println("code for add cart link");
		System.out.println("code is already present my testtt code3");
	}

	@Then("user purchases the product")
	public void user_purchases_the_product() {
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();//checkout
    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click(); //proceed to pay
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();//bank name
	    driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();//continuebtn
    driver.findElement(By.name("username")).sendKeys("123456");
	    driver.findElement(By.name("password")).sendKeys("Pass@456");
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    String Expected="Your order has been confirmed";
		String Actual=driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
	Assert.assertEquals(Expected,Actual);
		System.out.println("code is already present my testtt code4");
		driver.close();
	}
	@Given("user sign in into testme app")
	public void user_sign_in_into_testme_app() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver =new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("user tries to search the particular product like headphone")
	public void user_tries_to_search_the_particular_product_like_headphone() {
		
		//driver.findElement(By.name("products")).sendKeys("head");
		System.out.println("This code is not needed");
		
		
		
		
	    
	}

	@Then("try to proceed to payment without adding any item to cart")
	public void try_to_proceed_to_payment_without_adding_any_item_to_cart() throws InterruptedException {
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).click().perform(); //cat
		a1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().build().perform(); //sb ct
		Thread.sleep(2000);
		a1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform(); //ele
		
		
	}

	@Then("test me app does not display cart icon")
	public void test_me_app_does_not_display_cart_icon() {

		boolean Actual=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		Assert.assertTrue(Actual);
		driver.close();
	}

	
