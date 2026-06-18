package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account extends BaseClass {

    @When("Click on New Accounts link and  Enter Account Name and  Click on Save button")
    public void click_on_new_accounts_link_and_enter_account_name_and_click_on_save_button() {

    driver.findElement(By.xpath("//a[text()='New Account']")).click();
    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("BJP");
    driver.findElement(By.xpath("//input[@type='submit'][1]")).click();

    }
    @Then("New account should get created")
    public void new_account_should_get_created() {
        driver.findElement(By.xpath("//td[text()='Account Name:']/following::td[1]")).getText().equals("BJP");

    }



}
