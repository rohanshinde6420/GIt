package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class loginsteps extends BaseClass {

    @Given("user is on login page")
    public void user_is_on_login_page() {
    driver=new ChromeDriver();
    driver.get("http://localhost:100/");
    driver.manage().window().maximize();
    }
    @When("user enters valid credentials and click on login")
    public void user_enters_valid_credentials_and_click_on_login() {
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
    }
    @Then("user should be navigate to Home page")
    public void user_should_be_navigate_to_home_page() {

        String Title=driver.getTitle();
        Assert.assertEquals("vtiger CRM - Commercial Open Source CRM",Title);
    }
}
