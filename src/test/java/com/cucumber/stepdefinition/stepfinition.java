package com.cucumber.stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.baseclass.BaseClass1;
import com.cucumber.pom.autologin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepfinition extends BaseClass1 {
WebDriver driver;

@Given("^User enter the url$")
public void user_enter_the_url () throws Throwable {
autologin l= new autologin(driver);
clickOntheElement(l.getLogin());
    
}

@When("^User enters the username$")
public void user_enters_the_username() throws Throwable {
    autologin l= new autologin(driver);
    sendkey(l.getMail(), "mathi@gmail.com");
    
}

@Then("^User enters the password$")
public void user_enters_the_password() throws Throwable {
    autologin l=new autologin(driver);
    sendkey(l.getPassword(), "mathi@123");
    
}

@Then("^User click on login page$")
public void user_click_on_login_page() throws Throwable {
    autologin l= new autologin(driver);
    clickOntheElement(l.);
    
}

@Then("^User logouts from website$")
public void user_logouts_from_website() throws Throwable {
    
    
}

@Then("^User quit the browser$")
public void user_quit_the_browser() throws Throwable {
    
    
}

@When("^User enters the username \"([^\"]*)\"$")
public void user_enters_the_username(String arg1) throws Throwable {
    
    
}

@Then("^User enter password \"([^\"]*)\"$")
public void user_enter_password(String arg1) throws Throwable {
    
    
}

@Given("^User enter thr url$")
public void user_enter_thr_url() throws Throwable {
    
    
}

@When("^User enters the username \"([^\"]*)\" in the field$")
public void user_enters_the_username_in_the_field(String arg1) throws Throwable {
    
    
}

@Then("^User enters the password \"([^\"]*)\" in the field$")
public void user_enters_the_password_in_the_field(String arg1) throws Throwable {
    
    
}


}
