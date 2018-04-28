package commonAPI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class CommonAPIFirefox {

    public WebDriver geckoDriver;

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
        public void before(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\moham\\IdeaProjects\\AutomationTeam6\\driver\\geckodriver.exe");
        geckoDriver = new FirefoxDriver();
    }
}
