package bestbuyTests;

import commonAPI.CommonAPIApoorva;
import home.MainBestBuy;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.css.sac.ElementSelector;

import java.util.List;


public class BestBuy extends CommonAPIApoorva {


        @Test

        public void homepageTesting() {

            CommonAPIApoorva.launchBrowser("https://www.bestbuy.com");

            //Test 2 - closing PopUp Window
            // wait for the close button to appear
            home.MainBestBuy.closePopUp();

           //Test 3 - Testing scrollbar - scrolling down
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();

            //Test 4 - Testing scrollbar - Scrolling up
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
        }

    @Test //Test 5 - view account
public void testAccount() throws InterruptedException {
            Driver.get("https://bestbuy.com");
            home.MainBestBuy.closePopUp();
            home.MainBestBuy.account();
            //Test 6 - go to create Account
            home.MainBestBuy.accountButton();
            //Test 7 - create account
             home.MainBestBuy.createAccount();
    }

    @Test
    public void testSignIn() throws InterruptedException {
        Driver.get("https://bestbuy.com");
        home.MainBestBuy.closePopUp();
        home.MainBestBuy.account();
        //Test 8 - go to sign in page
        home.MainBestBuy.signInButton();
        //Test 9 - sign in
        home.MainBestBuy.signIn();
    }

    @Test
    public void product() {

        Driver.get("https://bestbuy.com");
        home.MainBestBuy.closePopUp();
        //Test 10 - go to product
        home.MainBestBuy.sleep();
        Driver.findElement(By.cssSelector("a#menu0")).click();
        home.MainBestBuy.sleep();
        //Test 11 - close product
        Driver.findElement(By.xpath("//*[@id='group0']/div[3]/a")).click();
        //open products again
        Driver.findElement(By.cssSelector("a#menu0")).click();
        //Test 12 - print all featured items
        home.MainBestBuy.featuredItems();

    }

}





