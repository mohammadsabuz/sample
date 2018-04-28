package chaseMain;

import commonAPI.CommonAPIFirefox;
import org.openqa.selenium.By;

public class ChaseMain extends CommonAPIFirefox{
    String url = "https://www.chase.com";

    //test1 Browser
    public void chaseBrowserLaunch(){
        geckoDriver.get(url);
    }
    //test2 Side Menu
    public void chaseSideMenu(){
        geckoDriver.get(url);
        geckoDriver.findElement(By.xpath("//header[@data-feature='header']//a[@id='skip-sidemenu']")).click();
    }
//=================================//
    //test3 Home Screen
    public void chaseHomeScreen(){
        chaseSideMenu();
        geckoDriver.findElement(By.cssSelector(".chaseanalytics-track-link.category-home")).click();
    }
    //test4 Login Screen
    public void chaseLoginScreen(){
        chaseSideMenu();
        geckoDriver.findElement(By.cssSelector(".chaseanalytics-track-link.signInBtn")).click();
    }
    //test5 Free Credit Score
    public void chaseFreeCreditScore(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Free credit score")).click();
    }
    //test6 News & Stories
    public void chaseNewsStories(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("News & Stories")).click();
    }
//=================================//
    //test7 Credit Cards
    public void chaseCreditCards(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Credit cards")).click();
    }
    //test8 Checking Accounts
    public void chaseCheckingAccounts(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Checking Accounts")).click();
    }
    //test9 Savings & CD
    public void chaseSavingsCD(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Savings and CDS")).click();
    }
    //test10 Prepaid Cards
    public void chasePrepaidCards(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Prepaid cards")).click();
    }
    //test11 Car Buying & Loans
    public void chaseCarBuyingLoans(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Car Buying")).click();
    }
    //test12 Mortgage
    public void chaseMortgage(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Mortgage")).click();
    }
    //test13 Home Equity
    public void chaseHomeEquity(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Home equity")).click();
    }
    //test14 Investing
    public void chaseInvesting(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Investing")).click();
    }
    //test15 Chase for Business
    public void chaseForBusiness(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Chase for Business")).click();
    }
    //test16 Commercial Banking
    public void chaseCommercialBanking(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Commercial Banking")).click();
    }
    //test17 See all
    public void chaseSeeAll(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("See all")).click();
    }
//=================================//
    //test18 Contact us
    public void chaseContactUs(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Contact us")).click();
    }
    //test19 Give feedback
    public void chaseGiveFeedback(){
        chaseSideMenu();
        geckoDriver.findElement(By.partialLinkText("Chase for Business")).click();
    }
//=================================//
    /* -----------  Get Text -----------  */
    //test20 Explore Products
    public void chaseExploreProductsTitle(){
        chaseSideMenu();
        System.out.println(geckoDriver.findElement(By.cssSelector(".sidemenu__menu__section--title")).getText());
    }
    //test21 Connect with Chase
    public void chaseConnectWithChase(){
        chaseSideMenu();
        System.out.println(geckoDriver.findElement(By.cssSelector(".sidemenu__menu__section")).getText());
    }
    //test22 Footer
    public void chaseFooterText(){
        chaseSideMenu();
        System.out.println(geckoDriver.findElement(By.cssSelector(".sidemenu__menu__footer__links")).getText());
    }
//=================================//
    //test23 Home Screen
    public void chaseHomeScreenText(){
        chaseSideMenu();
        chaseHomeScreen();
        geckoDriver.findElement(By.cssSelector(".chaseanalytics-track-link.category-home")).getText();
    }
    //test24 Login Screen
    public void chaseLoginScreenText(){
        chaseSideMenu();
        chaseLoginScreen();
        geckoDriver.findElement(By.cssSelector(".chaseanalytics-track-link.signInBtn")).getText();
    }
    //test25 Free Credit Score
    public void chaseFreeCreditScoreText(){
        chaseSideMenu();
        chaseFreeCreditScore();
        geckoDriver.findElement(By.partialLinkText("Free credit score")).getText();
    }
    //test26 News & Stories
    public void chaseNewsStoriesText(){
        chaseSideMenu();
        chaseNewsStories();
        geckoDriver.findElement(By.partialLinkText("News & Stories")).getText();
    }
//=================================//
    //test27 Credit Cards
    public void chaseCreditCardsText(){
        chaseSideMenu();
        chaseCreditCards();
        geckoDriver.findElement(By.partialLinkText("Credit cards")).getText();
    }
    //test28 Checking Accounts
    public void chaseCheckingAccountsText(){
        chaseSideMenu();
        chaseCheckingAccounts();
        geckoDriver.findElement(By.partialLinkText("Checking Accounts")).getText();
    }
    //test29 Savings & CD
    public void chaseSavingsCDText(){
        chaseSideMenu();
        chaseSavingsCD();
        geckoDriver.findElement(By.partialLinkText("Savings and CDS")).getText();
    }
    //test30 Prepaid Cards
    public void chasePrepaidCardsText(){
        chaseSideMenu();
        chasePrepaidCards();
        geckoDriver.findElement(By.partialLinkText("Prepaid cards")).getText();
    }
    //test31 Car Buying & Loans
    public void chaseCarBuyingLoansText(){
        chaseSideMenu();
        chaseCarBuyingLoans();
        geckoDriver.findElement(By.partialLinkText("Car Buying")).getText();
    }
    //test32 Mortgage
    public void chaseMortgageText(){
        chaseSideMenu();
        chaseMortgage();
        geckoDriver.findElement(By.partialLinkText("Mortgage")).getText();
    }
    //test33 Home Equity
    public void chaseHomeEquityText(){
        chaseSideMenu();
        chaseHomeEquity();
        geckoDriver.findElement(By.partialLinkText("Home equity")).getText();
    }
    //test34 Investing
    public void chaseInvestingText(){
        chaseSideMenu();
        chaseInvesting();
        geckoDriver.findElement(By.partialLinkText("Investing")).getText();
    }
    //test35 Chase for Business
    public void chaseForBusinessText(){
        chaseSideMenu();
        chaseForBusiness();
        geckoDriver.findElement(By.partialLinkText("Chase for Business")).getText();
    }
    //test36 Commercial Banking
    public void chaseCommercialBankingText(){
        chaseSideMenu();
        chaseCommercialBanking();
        geckoDriver.findElement(By.partialLinkText("Commercial Banking")).getText();
    }
    //test37 See all
    public void chaseSeeAllText(){
        chaseSideMenu();
        chaseSeeAll();
        geckoDriver.findElement(By.partialLinkText("See all")).getText();
    }
//=================================//
    //test38 Contact us
    public void chaseContactUsText(){
        chaseSideMenu();
        chaseContactUs();
        geckoDriver.findElement(By.partialLinkText("Contact us")).getText();
    }
    //test39 Give feedback
    public void chaseGiveFeedbackText(){
        chaseSideMenu();
        chaseGiveFeedback();
        geckoDriver.findElement(By.partialLinkText("Chase for Business")).getText();
    }
}
