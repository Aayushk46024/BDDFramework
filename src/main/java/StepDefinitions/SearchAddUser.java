package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static StepDefinitions.AddUser.userName;
import static StepDefinitions.BaseTest.driver;

public class SearchAddUser {

    @And("^user enters Username in the Username text field for search$")
    public void user_enters_Username_in_the_Username_text_field_for_search()
    {
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys(userName);
    }

    @Then("user clicks on the Search button")
    public void user_clicks_on_the_Search_button()
    {
        driver.findElement(By.id("searchBtn")).click();
        driver.close();
    }
}
