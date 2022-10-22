package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWithParameters_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    // PARAMETERIZATION
    // Student

    @When("student enter username {string}")
    public void student_enter_username(String username) {
        loginPage.username.sendKeys(username);
    }

    @When("student enter password {string}")
    public void student_enter_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("student click sign in button")
    public void student_click_sign_in_button() {
        loginPage.signInButton.click();
    }

    @Then("student should be able to access homepage")
    public void student_should_be_able_to_access_homepage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("books"));

        BrowserUtils.verifyUrlWithContains("books");
        //Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));
    }

    // Librarian
    @When("librarian enter username {string}")

    public void librarian_enter_username(String username) {

        loginPage.username.sendKeys(username);
    }

    @When("librarian enter password {string}")
    public void librarian_enter_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("librarian click sign in button")
    public void librarian_click_sign_in_button() {
        loginPage.signInButton.click();
    }

    @Then("librarian should be able to access dashboard")
    public void librarian_should_be_able_to_access_dashboard() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));

        BrowserUtils.verifyUrlWithContains("dashboard");
        //Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }


    // Task 4
    @When("librarian enter username {string} and enter password {string}")
    public void librarian_enter_username_and_enter_password(String username, String password) {

        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.signInButton.click();

    }
    @Then("librarian should be able see {string} users")
    public void librarian_should_be_able_see_users(String numberOfUsers) {

        BrowserUtils.waitForVisibilityOf(dashboardPage.userCount);

        String actualResult = dashboardPage.userCount.getText();
        // System.out.println(actualResult);

        Assert.assertEquals(numberOfUsers, actualResult);

    }
}
