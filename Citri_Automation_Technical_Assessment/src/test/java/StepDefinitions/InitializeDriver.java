package StepDefinitions;

/*
 * Author: Mulisa Gangashe
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//BELOW CLASS IS FOR Initializing the chrome driver
public class InitializeDriver {
    protected static WebDriver driver;
/*    protected static WebDriver getDriver(){
        if(driver == null){
            *//*
             *********Read Driver from PROJECT location *//*
            //Set system property so that we can chrome driver
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();

            //Set system property so that we can chrome driver
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }*/

    public WebDriver getDriver(String browser) throws Exception{
        if(browser.equalsIgnoreCase("chrome")) //Check if parameter passed
        {
            /*create chrome instance*/
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }
        else if(browser.equalsIgnoreCase("firefox")) //Check if parameter passed
        {
            /*create firefox instance*/
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            throw new Exception("Incorrect Browser"); //Throw an exception if no browser is passed throw
        }
        return driver;
    }
}
