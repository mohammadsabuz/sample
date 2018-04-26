package amazonMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonMain extends CommonAPIChrome{

    String url = "https://www.amazon.com";

    //test1
    public void mainAmazonBrowserLaunch(){
        chromeDriver.get(url);
    }
    //test2
    public void mainAmazonLogin(){
        mainAmazonBrowserLaunch();
        chromeDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        chromeDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        chromeDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }
    //test3
    public void mainFindSearchbar(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox"));
    }
    //test4
    public void mainSearchForItems(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
    }
    //test5
    public void mainSearchGoBack(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
    }
    //test6
    public void mainSearchGoBackAndRefresh(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().refresh();
    }
    //test7
    public void mainSearchGoBackGoForward(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
    }
    //test8
    public void mainSearchGoBackGoForwardClearSearch(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).clear();
    }
    //test9
    public void mainSearchForItemsGoBackAndSearchMore(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacAir", Keys.ENTER);
        chromeDriver.navigate().back();
    }
    //test10
    public void mainSearchGoBackGoForwardClearSearchAndSearchForMoreItems(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).clear();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cuff Links", Keys.ENTER);
    }
    //test11
    public void mainAmazonBrowserClose(){
        chromeDriver.get(url);
        chromeDriver.close();
    }
    //test12
    public void mainAmzonBrowserTitle(){
        chromeDriver.get(url);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();
    }
    //test13
    public void mainCategories(){
        chromeDriver.get(url);
        List<WebElement> categories = chromeDriver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        for(WebElement search:categories){
            System.out.println(search.getText());
        }
    }
    //test14
    public void mainDeliverTo(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.cssSelector(".nav-a.nav-a-2.a-popover-trigger.a-declarative")).click();
    }
    //test15
    public void mainClickDone(){
        mainDeliverTo();
        chromeDriver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
    }
    //test16
    public void mainClickDepartment(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@class='nav-fill']//span[@class='nav-line-2']")).click();
    }
    //test17
    public void mainCategoriesdrop(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).click();
    }

    //test18
    public void mainCategoriesAlexa(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=alexa-skills']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("technology", Keys.ENTER);
    }
    //test19
    public void mainCategoriesVideogames(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=videogames']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ps4 games", Keys.ENTER);
    }
    //test20
    public void mainGodOfWar(){
        mainCategoriesVideogames();
        chromeDriver.findElement(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']//li[@id='result_4']//img[@class='s-access-image cfMarker']")).click();
    }
    //test21
    public void mainAddGOWToCart(){
        mainGodOfWar();
        chromeDriver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    }
    //test22
    public void mainContinueToCart(){
        mainAddGOWToCart();
        sleep();
        chromeDriver.findElement(By.xpath("//span[@id='smartShelfAddToCartContinue']//input[@name='submit.addToCart']")).click();
    }
    //test23
    
    //test24

    //test25

    //test26

    //test27

    //test28

    //test29

    //test30


}
