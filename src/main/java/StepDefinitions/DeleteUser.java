package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static StepDefinitions.Login.driver;

public class DeleteUser {
    @And("^user selects the user as per the enter name$")
    public void user_selects_the_user_as_per_the_enter_name()
    {
        driver.findElement(By.id("ohrmList_chkSelectAll")).click();
    }

    @And("^user clicks on the Delete button$")
    public void user_clicks_on_the_Delete_button()
    {
        driver.findElement(By.id("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();
    }

    @Then("^user is successfully Deleted$")
    public void user_is_successfully_Deleted()
    {
        driver.close();
    }
}
