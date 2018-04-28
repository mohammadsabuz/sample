package amazonMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AmazonMain extends CommonAPIChrome{
    String url = "https://www.amazon.com";
    //test1 Browser
    public void mainAmazonBrowserLaunch(){
        chromeDriver.get(url);
    }
    //test2 Login
    public void mainAmazonLogin(){
        mainAmazonBrowserLaunch();
        chromeDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        chromeDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        chromeDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }
    //test3 Searchbar
    public void mainFindSearchbar(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox"));
    }
    //test4 Search items
    public void mainSearchForItems(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
    }
    //test5 Navigation
    public void mainSearchGoBack(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
    }
    //test6 Refresh
    public void mainSearchGoBackAndRefresh(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().refresh();
    }
    //test7 Navigation
    public void mainSearchGoBackGoForward(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
    }
    //test8 Clear Search
    public void mainSearchGoBackGoForwardClearSearch(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).clear();
    }
    //test9 Search More
    public void mainSearchForItemsGoBackAndSearchMore(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacAir", Keys.ENTER);
        chromeDriver.navigate().back();
    }
    //test10 Search Go back / forward and Search More
    public void mainSearchGoBackGoForwardClearSearchAndSearchForMoreItems(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).clear();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cuff Links", Keys.ENTER);
    }
    //test11 Close Browser
    public void mainAmazonBrowserClose(){
        chromeDriver.get(url);
        chromeDriver.close();
    }
    //test12 Get Page Title
    public void mainAmzonBrowserTitle(){
        chromeDriver.get(url);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();
    }
    //test13 Categories
    public void mainCategories(){
        chromeDriver.get(url);
        List<WebElement> categories = chromeDriver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        for(WebElement search:categories){
            System.out.println(search.getText());

        chromeDriver.close();
        }
    }
    //test14 Deliver
    public void mainDeliverTo(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.cssSelector(".nav-a.nav-a-2.a-popover-trigger.a-declarative")).click();
    }
    //test15 Done
    public void mainClickDone(){
        mainDeliverTo();
        chromeDriver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
        chromeDriver.close();
    }
//===========================================//
    //test16 Department Categories
    public void mainCategoriesdrop(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).click();
    }
    //test17 Categories: Alexa
    public void mainCategoriesAlexa(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=alexa-skills']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("alexa", Keys.ENTER);
    }
    //test18 Amazon Device
    public void mainCategoriesDevice(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=amazon-devices']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("amazon device", Keys.ENTER);
    }
    //test19 Amazon Fresh
    public void mainCategoriesAmazonFresh(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=amazonfresh']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("amazon fresh", Keys.ENTER);
    }
    //test20 Warehouse Deals
    public void mainCategoriesWarehouseDeals(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=warehouse-deals']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("warehouse deals", Keys.ENTER);
    }
    //test21 Appliances
    public void mainCategoriesAppliances(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=appliances']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("appliances", Keys.ENTER);
    }
    //test22 Apps & Gammes
    public void mainCategoriesAppsGames(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=mobile-apps']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apps and games", Keys.ENTER);
    }
    //test23 Arts, Crafts & Sewing
    public void mainCategoriesArtsCrafts(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=arts-crafts']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("arts and crafts", Keys.ENTER);
    }
    //test24 Automotive Parts & Accessories
    public void mainCategoriesArtsAutomotive(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=automotive']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("automotive parts", Keys.ENTER);
    }
    //test25 Automotive Parts
    public void mainCategoriesArtsAutomotiveParts(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=automotive']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("automotive parts", Keys.ENTER);
    }
    //test26 Baby
    public void mainCategoriesBaby(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=baby-products']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("baby", Keys.ENTER);
    }
    //test27 Beauty & Personal Care
    public void mainCategoriesBeautyPersonal(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=beauty']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Beauty & Personal Care", Keys.ENTER);
    }
    //test28 Books
    public void mainCategoriesBooks(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=stripbooks']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("books", Keys.ENTER);
    }
    //test29 CDs & Vinyl
    public void mainCategoriesCDVinyl(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=popular']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("CDs & Vinyl", Keys.ENTER);
    }
    //test30 Cell Phones & Accessories
    public void mainCategoriesCellphoneAcc(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=mobile']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cell Phones & Accessories", Keys.ENTER);
    }
    //test31 Clothing, Shoes & Jewelry
    public void mainCategoriesClothingShoes(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=fashion']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Clothing, Shoes & Jewelry", Keys.ENTER);
    }
    //test32 Women
    public void mainCategoriesWomen(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='value=\"search-alias=fashion-womens\"']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("womens", Keys.ENTER);
    }
    //test33 Men
    public void mainCategoriesMen(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=fashion-mens']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men", Keys.ENTER);
    }
    //test34 Girls
    public void mainCategoriesGirls(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=fashion-girls']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("girls", Keys.ENTER);
    }
    //test35 Boys
    public void mainCategoriesBoys(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=fashion-boys']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("boys", Keys.ENTER);
    }
    //test36 Baby Fashion
    public void mainCategoriesBabyFashion(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=fashion-baby']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("baby fashion", Keys.ENTER);
    }
    //test37 Collectibles & Fine Art
    public void mainCategoriesCollectibles(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=collectibles']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("collectibles", Keys.ENTER);
    }
    //test38 Computers
    public void mainCategoriesComputers(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=computers']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("computers", Keys.ENTER);
    }
    //test39 Courses
    public void mainCategoriesCourses(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=courses']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("courses", Keys.ENTER);
    }
    //test40 Credit and Payment Cards
    public void mainCategoriesCredit(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=financial']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Credit and Payment Cards", Keys.ENTER);
    }
    //test41 Digital Music
    public void mainCategoriesDigitalMusic(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=digital-music']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("digital music", Keys.ENTER);
    }
    //test42 Electronics
    public void mainCategoriesElectronics(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=electronics']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("electronics", Keys.ENTER);
    }
    //test43 Garden & Outdoor
    public void mainCategoriesGarden(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=lawngarden']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Garden & Outdoor", Keys.ENTER);
    }
    //test44 Gift Cards
    public void mainCategoriesGiftCard(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=gift-cards']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("gift cards", Keys.ENTER);
    }
    //test45 Grocery & Gourmet Food
    public void mainCategoriesGrocery(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=grocery']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Grocery & Gourmet Food", Keys.ENTER);
    }
    //test46 Handmade
    public void mainCategoriesHandmade(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=handmade']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("handmade", Keys.ENTER);
    }
    //test47 Health, Household & Baby Care
    public void mainCategoriesHealth(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=hpc']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Health, Household & Baby Care", Keys.ENTER);
    }
    //test48 Home & Business Services
    public void mainCategoriesHomeBusinessService(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=local-services']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home & Business Services", Keys.ENTER);
    }
    //test49 Home & Kitchen
    public void mainCategoriesHomeKitchen(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=garden']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home & Kitchen", Keys.ENTER);
    }
    //test50 Industrial & Scientific
    public void mainCategoriesIndustrial(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=industrial']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Industrial & Scientific", Keys.ENTER);
    }
    //test51 Kindle Store
    public void mainCategoriesKindle(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=digital-text']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kindle Store", Keys.ENTER);
    }
    //test52 Luggage & Travel Gear
    public void mainCategoriesTravel(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=fashion-luggage']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Luggage & Travel Gear", Keys.ENTER);
    }
    //test53 Luxury Beauty
    public void mainCategoriesLuxury(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=luxury-beauty']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Luxury Beauty", Keys.ENTER);
    }
    //test54 Magazine Subscriptions
    public void mainCategoriesMagazine(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=magazines']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Magazine Subscriptions", Keys.ENTER);
    }
    //test55 Movies & TV
    public void mainCategoriesMovies(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=movies-tv']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Movies & TV", Keys.ENTER);
    }
    //test56 Musical Instruments
    public void mainCategoriesMusical(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=mi']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Musical Instruments", Keys.ENTER);
    }
    //test57 Office Products
    public void mainCategoriesOfficeProducts(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=office-products']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Office Products", Keys.ENTER);
    }
    //test58 Pet Supplies
    public void mainCategoriesPetSupplies(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=pets']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Pet Supplies", Keys.ENTER);
    }
    //test59 Prime Exclusive Savings
    public void mainCategoriesPrimeSavings(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=prime-exclusive']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Exclusive Savings", Keys.ENTER);
    }
    //test60 Prime Pantry
    public void mainCategoriesPrimePantry(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=pantry']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Pantry", Keys.ENTER);
    }
    //test61 Prime Video
    public void mainCategoriesPrimeVideo(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=instant-video']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Video", Keys.ENTER);
    }
    //test62 Software
    public void mainCategoriesSoftware(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=software']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("software", Keys.ENTER);
    }
    //test63 Sports & Outdoors
    public void mainCategoriesSports(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=sporting']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Sports & Outdoors", Keys.ENTER);
    }
    //test64 Tools & Home Improvement
    public void mainCategoriesHomeImprovement(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=tools']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Tools & Home Improvement", Keys.ENTER);
    }
    //test65 Toys & Games
    public void mainCategoriesToysGames(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=toys-and-games']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Toys & Games", Keys.ENTER);
    }
    //test66 Vehicles
    public void mainCategoriesVehicles(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=vehicles']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Vehicles", Keys.ENTER);
    }
    //test67 Categories: Video Games
    public void mainCategoriesVideogames(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=videogames']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ps4 games", Keys.ENTER);
    }
    //test68 Select a game
    public void mainGame(){
        mainCategoriesVideogames();
        chromeDriver.findElement(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']//li[@id='result_4']//img[@class='s-access-image cfMarker']")).click();
    }
    //test69 Add to Cart
    public void mainAddGOWToCart(){
        mainGame();
        chromeDriver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    }
    //test70 Continue to Cart
    public void mainContinueToCart(){
        mainAddGOWToCart();
        sleep();
        chromeDriver.findElement(By.xpath("//span[@id='smartShelfAddToCartContinue']//input[@name='submit.addToCart']")).click();
    }
//===========================================//
    //test71 Departments
    public void mainClickDepartment(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@class='nav-fill']//span[@class='nav-line-2']")).click();
    }
    //test72 Links Under Prime Video Section
    public void mainPrimeVideo(){
        mainClickDepartment();
        WebElement element = chromeDriver.findElement(By.xpath("//div[@class='fsdDeptBox']//div[@class='fsdDeptCol']"));
        List<WebElement> links = element.findElements(By.tagName("a"));

        for (WebElement urls:links)
            System.out.println(urls.getText());
    }
//===========================================//
    //test73 Capture Screenshots of Test
    public void mainScreenShots(){
        mainCategoriesdrop();
        chromeDriver.findElement(By.xpath("//option[@value='search-alias=videogames']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Assasins Creed", Keys.ENTER);
    }

    //test74 Get all links

}
