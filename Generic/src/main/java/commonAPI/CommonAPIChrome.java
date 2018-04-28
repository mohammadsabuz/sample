package commonAPI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonAPIChrome {

    public WebDriver chromeDriver;

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\IdeaProjects\\AutomationTeam6\\driver\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        sleep();
    }

/* This is the starting point of the screenshot code ...
    Capture Screenshots of Web pages -- This will be applied for all text cases, check CommonAPI */

    // Screenshot Capturing
    public static String randomFileName(int length){
        StringBuilder stringBuilder = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++){
            int index = (int) Math.random() * characters.length();
            stringBuilder.append(characters.charAt(index));
        }
        return stringBuilder.toString();
    }
    @AfterMethod
    public void screenshot() throws Exception {
        String fileName = randomFileName(5)+ ".png";
        String directory = "C:\\Users\\moham\\IdeaProjects\\AutomationTeam6\\Amazon_ECommerce\\amazonScreenShot\\screenshot";

        File sourceFile = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + fileName));
/* This is the end of the screenshot capture code
    Capture Screenshots of Web pages -- This will be applied for all text cases, check CommonAPI */

        chromeDriver.close();
    }
}
