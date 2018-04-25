package home;

import commonAPI.CommonAPIApoorva;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainBestBuy extends CommonAPIApoorva {

    public static void closePopUp(){
        WebDriverWait wait = new WebDriverWait(Driver, 10);
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
    }

    public static void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public static void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,-500)");
    }

    public static void sleep(){
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
