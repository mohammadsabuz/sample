package amazonTests;

import amazonMain.AmazonMain;
import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon extends AmazonMain {

    @Test //test1
    public void amazonBrowserLaunch(){
        mainAmazonBrowserLaunch();
    }
    @Test //test2
    public void amazonLogin(){
        mainAmazonLogin();
    }
    @Test //test3
    public void findSearchbar(){
        mainFindSearchbar();
    }
    @Test //test4
    public void searchForItems(){
        mainSearchForItems();
    }
    @Test //test5
    public void searchGoBack(){
        mainSearchGoBack();
    }
    @Test //test6
    public void searchGoBackAndRefresh(){
        mainSearchGoBackAndRefresh();
    }
    @Test //test7
    public void searchGoBackGoForward(){
        mainSearchGoBackGoForward();
    }
    @Test //test8
    public void searchGoBackGoForwardClearSearch(){
        mainSearchGoBackGoForwardClearSearch();
    }
    @Test //test9
    public void searchForItemsGoBackAndSearchMore(){
        mainSearchForItemsGoBackAndSearchMore();
    }
    @Test //test10
    public void searchGoBackGoForwardClearSearchAndSearchForMoreItems(){
        mainSearchGoBackGoForwardClearSearchAndSearchForMoreItems();
    }
    @Test //test11
    public void amazonBrowserClose(){
        mainAmazonBrowserClose();
    }
    @Test //test12
    public void amzonBrowserTitle(){
        mainAmzonBrowserTitle();
    }
    @Test //test13
    public void categories(){
        mainCategories();
    }
    @Test //test14
    public void deliverTo(){
        mainDeliverTo();
    }
    @Test //test15
    public void clickDone(){
        mainClickDone();
    }
    @Test //test16
    public void clickDepartment(){
        mainClickDepartment();
    }
    @Test //test17
    public void categoriesDrop(){
        mainCategoriesdrop();
    }
    @Test //test18
    public void categoriesAlexa(){
        mainCategoriesAlexa();
    }
    @Test //test19
    public void categoriesVideogames(){
        mainCategoriesVideogames();
    }
    @Test //test20
    public void godOfWar(){
        mainGodOfWar();
    }
    @Test //test21
    public void addGOWToCart(){
        mainAddGOWToCart();
    }
    @Test //test22
    public void continueoCart(){
        mainContinueToCart();
    }
    
}
