package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class LoginWithDataTable_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    // DATA TABLE

    // Student

    @When("As a student user enter username and password")
    public void as_a_student_user_enter_username_and_password(Map<String ,String > credentials) {
        loginPage.username.sendKeys(credentials.get("username"));
        loginPage.password.sendKeys(credentials.get("password"));
        loginPage.signInButton.click();
    }
    @Then("As a student user should be able to see homepage")
    public void as_a_student_user_should_be_able_to_see_homepage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("books"));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));
    }


    // Librarian

    @When("As a librarian user enter username and password")
    public void as_a_librarian_user_enter_username_and_password(Map<String ,String > credentials) {

        /*
        loginPage.username.sendKeys(credentials.get("username"));
        loginPage.password.sendKeys(credentials.get("password"));
        loginPage.signInButton.click();

         */

        for (Map.Entry<String, String> entry : credentials.entrySet()) {

            switch (entry.getKey()) {
                case "username":
                    loginPage.username.sendKeys(credentials.get("username"));
                    loginPage.password.sendKeys(credentials.get("password"));
                    loginPage.signInButton.click();
                    dashboardPage.usernameDropdown.click();
                    dashboardPage.logoutButton.click();
                    break;
                case "username1":
                    loginPage.username.sendKeys(credentials.get("username1"));
                    loginPage.password.sendKeys(credentials.get("password1"));
                    loginPage.signInButton.click();
                    dashboardPage.usernameDropdown.click();
                    dashboardPage.logoutButton.click();
                    break;
                case "username2":
                    loginPage.username.sendKeys(credentials.get("username2"));
                    loginPage.password.sendKeys(credentials.get("password2"));
                    loginPage.signInButton.click();

                    break;
            }
        }
    }
    @Then("As a librarian user should be able to see dashboard")
    public void as_a_librarian_user_should_be_able_to_see_dashboard() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }

}
