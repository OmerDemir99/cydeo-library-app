package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enter username")
    public void user_enter_username(){
        //loginPage.username.sendKeys("student8@library");
        loginPage.username.sendKeys(ConfigurationReader.getProperty("studentUsername"));

    }
    @When("user enter password")
    public void user_enter_password() {
        //loginPage.password.sendKeys("1DaJSz1z");
        loginPage.password.sendKeys(ConfigurationReader.getProperty("studentPassword"));
    }

    @When("user click sign in button")
    public void user_click_sign_in_button() {
        loginPage.signInButton.click();
    }

    @Then("user should be able to dashboard")
    public void user_should_be_able_to_dashboard()  {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("books"));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));

    }

    @When("users enter username")
    public void usersEnterUsername() {

        //loginPage.username.sendKeys("librarian8@library");
        loginPage.username.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
    }

    @And("users enter password")
    public void usersEnterPassword() {
        //loginPage.password.sendKeys("UECJkTnl");
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    }

    @Then("users should be able to dashboard")
    public void usersShouldBeAbleToDashboard() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));

        //Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

        String expectedResult = "Test Librarian 10";
        Assert.assertEquals(expectedResult, dashboardPage.accountName.getText());
    }











}
