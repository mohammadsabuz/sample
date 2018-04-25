package commonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class CommonAPIApoorva {

    public static WebDriver Driver;
    @BeforeMethod

    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoor\\IdeaProjects\\AutomationTeam6\\driver\\chromedriver.exe");
        Driver = new ChromeDriver();
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
    }

