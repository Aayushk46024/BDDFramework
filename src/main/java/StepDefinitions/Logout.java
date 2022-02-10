package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;
import org.openqa.selenium.By;

import static StepDefinitions.Login.driver;

public class Logout {
    @And("^user is click on Welcome user button$")
    public void user_is_click_on_Welcome_user_button()
    {
        driver.findElement(By.id("welcome")).click();

    }

    @Then("^user clicks on the Logout button$")
    public void user_clicks_on_the_Logout_button()
    {
        driver.findElement(By.partialLinkText("Logout")).click();

        driver.close();
    }
}
