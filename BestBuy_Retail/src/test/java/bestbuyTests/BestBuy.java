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



public class BestBuy extends CommonAPIApoorva {

    String url = "https://www.bestbuy.com";

@BeforeMethod
public void launchBrowser(){
    //Test 1 - launching BestBuy Website
    Driver.get(url);
    Driver.manage().window().maximize();
}

    @Test
    public void homepageTesting() {

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
   /* @Test
    public void bestbuyLogin(){
        ChDriver.get(url);
        ChDriver.findElement(By.xpath("//div[@class='fullbleed-wrap dark-bleed']//nav[@class='utility-nav']//li[@class='account js-navitem']//a[@id='profileMenuWrap1']"));
    }
*/

    }
}
