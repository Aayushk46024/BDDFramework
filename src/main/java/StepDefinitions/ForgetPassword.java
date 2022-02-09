package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static StepDefinitions.Login.driver;

public class ForgetPassword {

    @When("^user clicks on the forget password link$")
    public void user_clicks_on_the_forget_password_link()
    {
        driver.findElement(By.linkText("Forgot your password?")).click();
    }

    @Then("^user is redirecting to the ForgetPassword page$")
    public void user_is_redirecting_to_the_ForgetPassword_page()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode");
        driver.close();
    }
}
