package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


public class SearchResult_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    UsersPage usersPage = new UsersPage();


    @When("click Users button")
    public void click_users_button() {
        dashboardPage.usersLink.click();
    }


    @Then("verify name of columns is correct")
    public void verify_name_of_columns_is_correct(List<String> element) {
        List<WebElement> titles = new ArrayList<>();
        usersPage.total(titles);

        for (int i = 0; i < element.size(); i++) {
            Assert.assertEquals(element.get(i), titles.get(i).getText());
        }

    }

}
