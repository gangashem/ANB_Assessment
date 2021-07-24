package StepDefinitions;
/*
* Author: Mulisa Gangashe
* */
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static StepDefinitions.ReusableMethods.*;

//Login Class
public class Login extends InitializeDriver //Login class extend the initialize Driver Class
{
    public static String sDefaultPath = System.getProperty("user.dir");
    WebDriver driver = getDriver("firefox"); //

    public Login() throws Exception {
    }
    //public InitializeChromeDriver InitD = new InitializeChromeDriver();

    @Given("^I launch the citrii browser$")
    public void Ilaunchthecitriibrowser() throws Throwable {
        String citrii_URL = "https://poc9.citrii-software.co.za/login"; //Load Application url
        driver.manage().window().maximize(); //Maximize the window
        driver.get(citrii_URL); //Invoke the application url
        Thread.sleep(2000); //wait for 2 seconds
        TakeScreenShot(driver, "GUI", "Critrii", "Login", "01_Critrii Login Page"); //take screenshot before capturing login details
    }

    @And("^i enter the username$")
    public void iEnterTheUsername() throws Throwable{
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("Username", sDefaultPath + "/ElementLocators/ElementsLocator.properties")))
                .sendKeys(ReusableMethods.datareading(sDefaultPath + "/ExcelData/TestData.xlsx",0,1,0)); // locate the username input data in the Excel and input them
        Thread.sleep(2000); //wait for 2 seconds
        TakeScreenShot(driver, "GUI", "Critrii", "Login", "02_Username Entered"); //take screenshot with Username Entered
    }

    @And("^i enter the password$")
    public void iEnterThePassword() throws Throwable{
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("Password", sDefaultPath + "/ElementLocators/ElementsLocator.properties")))
                .sendKeys(ReusableMethods.datareading(sDefaultPath + "/ExcelData/TestData.xlsx",0,1,1)); // locate the password input data in the Excel and input them
        Thread.sleep(2000); //wait for 2 seconds
        TakeScreenShot(driver, "GUI", "Critrii", "Login", "03_Password Entered"); //take screenshot with Password Entered
    }

    @Then("^i click on Login button$")
    public void iClickOnLoginButton() throws Throwable{
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("LoginButton", sDefaultPath + "/ElementLocators/ElementsLocator.properties"))).click();// Click on login button
        Thread.sleep(2000); //wait for 2 seconds
        TakeScreenShot(driver, "GUI", "Critrii", "Login", "04_Login Results"); //take screenshot after clicking on Login Button
    }

    @Given("^I verified the error message$")
    public void iVerifiedTheErrorMessage() throws Throwable{
        Thread.sleep(2000); //wait for 2 seconds
        boolean result = (ReusableMethods.ValidateTextOnPage(driver,"Invalid username or password")); //Verify error message as “Invalid Username or Password” is displayed
        Assert.assertTrue("[ERROR - Text not found on the Page]",result); // Error message
        TakeScreenShot(driver, "GUI", "Critrii", "Login", "05_Login Error Message"); //take screenshot of the error message after clicking on Login Button
    }

    @Then("^I click on the close browser button$")
    public void iClickOnTheCloseBrowserButton() throws Throwable {
        driver.close();//Close Browser
    }
}
