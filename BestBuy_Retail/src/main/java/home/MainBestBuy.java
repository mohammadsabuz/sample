package home;

import commonAPI.CommonAPIApoorva;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainBestBuy extends CommonAPIApoorva {
    static WebDriverWait wait = new WebDriverWait (Driver, 1,500);

    public static void closePopUp(){

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

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void account() throws InterruptedException {

        WebElement account = Driver.findElement(By.cssSelector("li.account > a:nth-child(1)"));
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOf(account)); //this will wait for elememt to be visible for 20 seconds

        account.click(); //now it clicks on element
    }
    public static void accountButton(){

        WebElement account = Driver.findElement(By.cssSelector("a.am-create-account__button"));
        wait.until(ExpectedConditions.visibilityOf(account)); //this will wait for elememt to be visible for 20 seconds
        account.click(); //now it clicks on element
    }

    public static void createAccount() throws InterruptedException {
        WebElement createAccount = null;
        Driver.findElement(By.cssSelector("#fld-firstName")).sendKeys("team");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-lastName")).sendKeys("selenium6");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-e")).sendKeys("team6.selenium@gmail.com");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-p1")).sendKeys("TEam@612345");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-p2")).sendKeys("TEam@612345");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-phone")).sendKeys("123456789");
        Thread.sleep(2000);
       createAccount = Driver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(createAccount)); //this will wait for elememt to be visible for 20 seconds
        createAccount.click();

    }
    public static void signInButton(){

        WebElement signInB = null;
        signInB = Driver.findElement(By.cssSelector(".lam-signIn__button"));
        wait.until(ExpectedConditions.visibilityOf(signInB)); //this will wait for elememt to be visible for 20 seconds
        signInB.click();
    }

    public static void signIn() throws InterruptedException {
        WebElement signIn = null;
        Driver.findElement(By.cssSelector("#fld-e")).sendKeys("team6.selenium@gmail.com");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-p1")).sendKeys("TEam@612345");
        Thread.sleep(2000);
        signIn = Driver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(signIn)); //this will wait for elememt to be visible for 20 seconds
        signIn.click();
    }

    public static void featuredItems() {
        String title = Driver.findElement(By.cssSelector(".featured > h2:nth-child(1)")).getText();
        System.out.println("The "+ title + " items are:");

        for(WebElement link: Driver.findElements(By.xpath("//div[@class=\"featured\"]//a")))
        {
            System.out.println(link.getText());
        }

        }
    }


   /* public static void scrollMostViewed(){
        Point item =Driver.findElement(By.xpath('//*[@id="widget-be0c78f8-cc60-4414-aa27-058521107900"]/div/div[2]/div/div/div[2]/a[2]/div')).getLocation();
        ((JavascriptExecutor)Driver).executeScript("window.scrollBy(0,"+(item.getY())+");");
        actions.moveToElement(right).click().build().perform();
    }
*/
