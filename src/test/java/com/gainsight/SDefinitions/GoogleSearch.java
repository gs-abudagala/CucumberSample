package com.gainsight.SDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver;

    @Given("To Open Browser")
    public void openBrowser()
    {

        System.setProperty("webdriver.chrome.driver","/Users/abudagala/Downloads/chromedriver");
        driver=new ChromeDriver();
        driver.get("http://www.google.co.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @When("Search Some thing in opened page \"(.*)\"")
    public void searchSomething(String searchText)
    {

        driver.findElement(By.name("q")).sendKeys(searchText);
        driver.findElement(By.name("q")).submit();

    }
    @Then("Verify the results")
    public void verifyPageTitle()
    {
        Assert.assertEquals("Google",driver.getTitle());

    }

}
