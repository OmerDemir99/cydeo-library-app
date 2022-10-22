package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "navbarDropdown")
    public WebElement usernameDropdown;

    @FindBy(className = "dropdown-item")
    public WebElement logoutButton;

    @FindBy(xpath = "//h2[.='1239']")
    public WebElement userCount;

    @FindBy(id = "book_count")
    public WebElement bookCount;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksLink;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardLink;


}
