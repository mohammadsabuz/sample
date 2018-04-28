package commonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class CommonAPIApoorva {

    public static WebDriver Driver;
    //public static WebDriver Driver1;
    @BeforeMethod


    public void before() {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoor\\IdeaProjects\\AutomationTeam6\\driver\\chromedriver.exe");
        //Driver1 = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver","C:\\Users\\apoor\\IdeaProjects\\AutomationTeam6\\driver\\geckodriver.exe");
        Driver = new FirefoxDriver();
    }

    public static void launchBrowser(String url){
        //Test 1 - launching BestBuy Website
        Driver.get(url);
        Driver.manage().window().maximize();
    }
    public static void sleepFor(int sec)throws InterruptedException{
        Thread.sleep(sec * 1000);
    }

    //Handling New Tabs
    public static WebDriver handleNewTab(WebDriver Driver){
            String oldTab = Driver.getWindowHandle();
            List<String> newTabs = new ArrayList<String>(Driver.getWindowHandles());
            newTabs.remove(oldTab);
            Driver.switchTo().window(newTabs.get(0));
            return Driver;
        }

        }

