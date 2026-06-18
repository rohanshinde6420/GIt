package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Contactsteps extends BaseClass{



    @When("user click on new contact")
    public void user_click_on_new_contact() {

        driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
        driver.findElement(By.xpath("//a[text()='New Contact']")).click();

    }
    @When("user enters last name and click on save button")
    public void user_enters_last_name_and_click_on_save_button() {
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shinde");
    driver.findElement(By.xpath("(//input[@class='button'])[1]")).click();

    }
    @Then("lead should be created successfully")
    public void lead_should_be_created_successfully() throws InterruptedException {
        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[1]")).getText().equals("Shinde");
    }
}
