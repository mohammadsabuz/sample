package amazonTests;

import amazonMain.AmazonMain;
import commonAPI.CommonAPIChrome;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class Amazon extends AmazonMain {

    @Test //test1 Browser
    public void amazonBrowserLaunch(){
        mainAmazonBrowserLaunch();
    }
    @Test //test2 Login
    public void amazonLogin(){
        mainAmazonLogin();
    }
    @Test //test3 Searchbar
    public void findSearchbar(){
        mainFindSearchbar();
    }
    @Test //test4 Search items
    public void searchForItems(){
        mainSearchForItems();
    }
    @Test //test5 Navigation
    public void searchGoBack(){
        mainSearchGoBack();
    }
    @Test //test6 Refresh
    public void searchGoBackAndRefresh(){
        mainSearchGoBackAndRefresh();
    }
    @Test //test7 Navigation
    public void searchGoBackGoForward(){
        mainSearchGoBackGoForward();
    }
    @Test //test8 Clear Search
    public void searchGoBackGoForwardClearSearch(){
        mainSearchGoBackGoForwardClearSearch();
    }
    @Test //test9 Search More
    public void searchForItemsGoBackAndSearchMore(){
        mainSearchForItemsGoBackAndSearchMore();
    }
    @Test //test10 Search Go back / forward and Search More
    public void searchGoBackGoForwardClearSearchAndSearchForMoreItems(){
        mainSearchGoBackGoForwardClearSearchAndSearchForMoreItems();
    }
    @Test //test11 Close Browser
    public void amazonBrowserClose(){
        mainAmazonBrowserClose();
    }
    @Test //test12 Get Page Title
    public void amzonBrowserTitle(){
        mainAmzonBrowserTitle();
    }
    @Test //test13 Categories
    public void categories(){
        mainCategories();
    }
    @Test //test14 Deliver
    public void deliverTo(){
        mainDeliverTo();
    }
    @Test //test15 Done
    public void clickDone(){
        mainClickDone();
    }
//===========================================//
    @Test //test16 Department Categories
    public void categoriesDrop(){
        mainCategoriesdrop();
    }
    @Test //test17 Categories: Alexa
    public void categoriesAlexa(){
        mainCategoriesAlexa();
    }
    //test18 Amazon Device
    public void categoriesDevice(){
        mainCategoriesDevice();
    }
    //test19 Amazon Fresh
    public void categoriesAmazonFresh(){
        mainCategoriesAmazonFresh();
    }
    //test20 Warehouse Deals
    public void categoriesWarehouseDeals(){
        mainCategoriesWarehouseDeals();
    }
    //test21 Appliances
    public void categoriesAppliances(){
        mainCategoriesAppliances();
    }
    //test22 Apps & Gammes
    public void categoriesAppsGames(){
        mainCategoriesAppsGames();
    }
    //test23 Arts, Crafts & Sewing
    public void categoriesArtsCrafts(){
        mainCategoriesArtsCrafts();
    }
    //test24 Automotive Parts & Accessories
    public void categoriesArtsAutomotive(){
        mainCategoriesArtsAutomotive();
    }
    //test25 Automotive Parts
    public void categoriesArtsAutomotiveParts(){
        mainCategoriesArtsAutomotiveParts();
    }
    //test26 Baby
    public void categoriesBaby(){
        mainCategoriesBaby();
    }
    //test27 Beauty & Personal Care
    public void categoriesBeautyPersonal(){
        mainCategoriesBeautyPersonal();
    }
    //test28 Books
    public void categoriesBooks(){
        mainCategoriesBooks();
    }
    //test29 CDs & Vinyl
    public void categoriesCDVinyl(){
        mainCategoriesCDVinyl();
    }
    //test30 Cell Phones & Accessories
    public void categoriesCellphoneAcc(){
        mainCategoriesCellphoneAcc();
    }
    //test31 Clothing, Shoes & Jewelry
    public void categoriesClothingShoes(){
        mainCategoriesClothingShoes();
    }
    //test32 Women
    public void categoriesWomen(){
        mainCategoriesWomen();
    }
    //test33 Men
    public void categoriesMen(){
        mainCategoriesMen();
    }
    //test34 Girls
    public void categoriesGirls(){
        mainCategoriesGirls();
    }
    //test35 Boys
    public void categoriesBoys(){
        mainCategoriesBoys();
    }
    //test36 Baby Fashion
    public void categoriesBabyFashion(){
        mainCategoriesBabyFashion();
    }
    //test37 Collectibles & Fine Art
    public void categoriesCollectibles(){
        mainCategoriesCollectibles();
    }
    //test38 Computers
    public void categoriesComputers(){
        mainCategoriesComputers();
    }
    //test39 Courses
    public void categoriesCourses(){
        mainCategoriesCourses();
    }
    //test40 Credit and Payment Cards
    public void categoriesCredit(){
        mainCategoriesCredit();
    }
    //test41 Digital Music
    public void categoriesDigitalMusic(){
        mainCategoriesDigitalMusic();
    }
    //test42 Electronics
    public void categoriesElectronics(){
        mainCategoriesElectronics();
    }
    //test43 Garden & Outdoor
    public void categoriesGarden(){
        mainCategoriesGarden();
    }
    //test44 Gift Cards
    public void categoriesGiftCard(){
        mainCategoriesGiftCard();
    }
    //test45 Grocery & Gourmet Food
    public void categoriesGrocery(){
        mainCategoriesGrocery();
    }
    //test46 Handmade
    public void categoriesHandmade(){
        mainCategoriesHandmade();
    }
    //test47 Health, Household & Baby Care
    public void categoriesHealth(){
        mainCategoriesHealth();
    }
    //test48 Home & Business Services
    public void categoriesHomeBusinessService(){
        mainCategoriesHomeBusinessService();
    }
    //test49 Home & Kitchen
    public void categoriesHomeKitchen(){
        mainCategoriesHomeKitchen();
    }
    //test50 Industrial & Scientific
    public void categoriesIndustrial(){
        mainCategoriesIndustrial();
    }
    //test51 Kindle Store
    public void categoriesKindle(){
        mainCategoriesKindle();
    }
    //test52 Luggage & Travel Gear
    public void categoriesTravel(){
        mainCategoriesTravel();
    }
    //test53 Luxury Beauty
    public void categoriesLuxury(){
        mainCategoriesLuxury();
    }
    //test54 Magazine Subscriptions
    public void categoriesMagazine(){
        mainCategoriesMagazine();
    }
    //test55 Movies & TV
    public void categoriesMovies(){
        mainCategoriesMovies();
    }
    //test56 Musical Instruments
    public void categoriesMusical(){
        mainCategoriesMusical();
    }
    //test57 Office Products
    public void categoriesOfficeProducts(){
        mainCategoriesOfficeProducts();
    }
    //test58 Pet Supplies
    public void categoriesPetSupplies(){
        mainCategoriesPetSupplies();
    }
    //test59 Prime Exclusive Savings
    public void categoriesPrimeSavings(){
        mainCategoriesPrimeSavings();
    }
    //test60 Prime Pantry
    public void categoriesPrimePantry(){
        mainCategoriesPrimePantry();
    }
    //test61 Prime Video
    public void categoriesPrimeVideo(){
        mainCategoriesPrimeVideo();
    }
    //test62 Software
    public void categoriesSoftware(){
        mainCategoriesSoftware();
    }
    //test63 Sports & Outdoors
    public void categoriesSports(){
        mainCategoriesSports();
    }
    //test64 Tools & Home Improvement
    public void categoriesHomeImprovement(){
        mainCategoriesHomeImprovement();
    }
    //test65 Toys & Games
    public void categoriesToysGames(){
        mainCategoriesToysGames();
    }
    //test66 Vehicles
    public void categoriesVehicles(){
        mainCategoriesVehicles();
    }
    //test67 Categories: Video Games
    public void categoriesVideogames(){
        mainCategoriesVideogames();
    }
    //test68 Select a game
    public void game(){
        mainGame();
    }
    //test69 Add to Cart
    public void addGOWToCart(){
        mainAddGOWToCart();
    }
    //test70 Continue to Cart
    public void continueToCart(){
        mainContinueToCart();
    }
//===========================================//
    //test71 Departments
    public void clickDepartment(){
        mainClickDepartment();
    }
    //test72 Links Under Prime Video Section
    public void primeVideo(){
        mainPrimeVideo();
    }
//===========================================//
    //test73 Capture Screenshots of Test
    public void screenShots(){
        mainScreenShots();
    }
}
