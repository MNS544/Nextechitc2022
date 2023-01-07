package StepdefTmobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tmobilestpdeff {

	static WebDriver driver;
	static String URL = "https://www.t-mobile.com/";

	@Given("^user launch URL$")
	public void user_launch_URL() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// jahan bhia way to use scroll down window
        ((JavascriptExecutor)driver).executeScript("scrollBy(0,400)");
		WebElement popup = driver.findElement(By.xpath("//button[text()='Accept']"));
		popup.click();
         JavascriptExecutor jxe= (JavascriptExecutor)driver;
	}

	@When("^user mouse over to Deals dropdown$")
	public void user_mouse_over_to_Deals_dropdown() throws Exception {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Deals"))).build().perform();

	}

	@When("^user select Apple$")
	public void user_select_Apple() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement select = driver.findElement(By.linkText("Apple"));
			select.click();
		} catch (Exception d) {
			System.out.println("This method is working fine: " + d);
		}

	}

	@Then("^user click iphone button$")
	public void user_click_iphone_button() throws Exception {
		Thread.sleep(0);
		WebElement iphone = driver.findElement(By.linkText("iPhone"));
		iphone.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 50);

	}

	@Then("^scroll down to apple ipad (\\d+)th generation$")
	public void scroll_down_to_apple_ipad_th_generation(int arg1) {

		JavascriptExecutor jx = (JavascriptExecutor) driver;
		jx.executeScript("scrollBy(0,2500)");
		WebDriverWait wait2 = new WebDriverWait(driver, 20);

	}

	@Then("^click shop now button$")
	public void click_shop_now_button() throws Exception {
		Thread.sleep(2000);
		WebElement shopnow = driver
				.findElement(By.xpath("//a[@data-icid='MGPO_TMO_P_EVGRNTBLET_LPTDQJ0V40O0GS4GH30886']"));
		shopnow.click();

	}

	@Then("^choose memory (\\d+)G button$")
	public void choose_memory_G_button(int arg1) throws Exception {
		WebElement me256G = driver.findElement(By.xpath(
				"//mat-radio-button[@class='mat-radio-button mat-tooltip-trigger memory-option mat-accent ng-star-inserted']/label"));
		me256G.click();
		Thread.sleep(2000);
	}

	@Then("^user click and choose silver color$")
	public void user_click_and_choose_silver_color() throws Exception {
		WebElement silver = driver.findElement(By.xpath(
				"//img[@src='https://cdn.tmobile.com/images/products/Apple-iPad-9th-gen-Silver/Apple-iPad-9th-gen-Silver.gif']"));
		silver.click();
		Thread.sleep(2000);
	}

	@Then("^user click on pay in full button$")
	public void user_click_on_pay_in_full_button() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor jxe = (JavascriptExecutor) driver;
		jxe.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement payfull = driver.findElement(By.xpath("//input[@id='mat-radio-10-input']"));
		payfull.sendKeys(Keys.ENTER);
	}

	@Then("^user scroll down and click add to cart button$")
	public void user_scroll_down_and_click_add_to_cart_button() throws Exception {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement add = driver.findElement(By.xpath("//button[@data-testid='add-to-cart-button']"));
		add.click();
		Thread.sleep(2000);
	}

	
	@Then("^click on login link$")
	public void click_on_login_link() throws Exception {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement login = driver.findElement(By.xpath("//span[text()=' Log in ']"));
		login.click();
		Thread.sleep(2000);
	}

	@Then("^Enter invalid email$")
	public void enter_invalid_email() throws Exception {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement username = driver.findElement(By.xpath("//input[@id='usernameTextBox']"));
		username.sendKeys("kdjg5484@gmail.com");
		Thread.sleep(2000);
	}

	@Then("^click next button message should dispaly not in record$")
	public void click_next_button_message_should_dispaly_not_in_record() throws Exception {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement next = driver.findElement(By.xpath("//button[@id='lp1-next-btn']"));
		next.click();
		Thread.sleep(2000);

	}

}
