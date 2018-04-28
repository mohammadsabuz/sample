package chaseTests;

import chaseMain.ChaseMain;
import commonAPI.CommonAPIChrome;
import commonAPI.CommonAPIFirefox;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Chase extends ChaseMain {

    @Test //test1 Browser
    public void browserLaunch(){
        chaseBrowserLaunch();
    }
    @Test //test2 Side Menu
    public void sideMenu(){
        chaseSideMenu();
    }
//=================================//
    @Test //test3 Home Screen
    public void homeScreen(){
        chaseHomeScreen();
    }
    @Test //test4 LoginScreen
    public void loginScreen(){
        chaseLoginScreen();
    }
    @Test //test5 Free Credit Score
    public void freeCreditScore(){
        chaseFreeCreditScore();
    }
    @Test //test6 News & Stories
    public void newsStories(){
        chaseNewsStories();
    }
//=================================//
    @Test //test7 Credit Cards
    public void creditCards(){
        chaseCreditCards();
    }
    @Test //test8 Checking Accounts
    public void checkingAccounts(){
        chaseCheckingAccounts();
    }
    @Test //test9 Savings & CD
    public void savingsCD(){
        chaseSavingsCD();
    }
    @Test //test10 Prepaid Cards
    public void prepaidCards(){
        chasePrepaidCards();
    }
    @Test //test11 Car Buying & Loans
    public void carBuyingLoans(){
        chaseCarBuyingLoans();
    }
    @Test //test12 Mortgage
    public void mortgage(){
        chaseMortgage();
    }
    @Test //test13 Home Equity
    public void homeEquity(){
        chaseHomeEquity();
    }
    @Test //test14 Investing
    public void investing(){
        chaseInvesting();
    }
    @Test //test15 Chase for Business
    public void forBusiness(){
        chaseForBusiness();
    }
    @Test //test16 Commercial Banking
    public void commercialBanking(){
        chaseCommercialBanking();
    }
    @Test //test17 See all
    public void seeAll(){
        chaseSeeAll();
    }
//=================================//
    @Test //test18 Contact us
    public void contactUs(){
        chaseContactUs();
    }
    @Test //test19 Give feedback
    public void giveFeedback(){
        chaseGiveFeedback();
    }
//=================================//
    /* -----------  Get Text -----------  */
    @Test //test20 Explore Products and Title
    public void exploreProductsTitle(){
        chaseExploreProductsTitle();
    }
    @Test //test21 Connect with Chase
    public void connectWithChase(){
        chaseConnectWithChase();
    }
    @Test //test22 Footer
    public void footerText(){
        chaseFooterText();
    }
//=================================//
    @Test //test23 Home Screen
    public void homeScreenText(){
        chaseHomeScreenText();
    }
    @Test //test24 Login Screen
    public void loginScreenText(){
        chaseLoginScreenText();
    }
    @Test //test25 Free Credit Score
    public void freeCreditScoreText(){
        chaseFreeCreditScoreText();
    }
    @Test //test26 News & Stories
    public void newsStoriesText(){
        chaseNewsStoriesText();
    }
//=================================//
    @Test //test27 Credit Cards
    public void creditCardsText(){
        chaseCreditCardsText();
    }
    @Test //test28 Checking Accounts
    public void checkingAccountsText(){
        chaseCheckingAccountsText();
    }
    @Test //test29 Savings & CD
    public void savingsCDText(){
        chaseSavingsCDText();
    }
    @Test //test30 Prepaid Cards
    public void prepaidCardsText(){
        chasePrepaidCardsText();
    }
    @Test //test31 Car Buying & Loans
    public void carBuyingLoansText(){
        chaseCarBuyingLoansText();
    }
    @Test //test32 Mortgage
    public void mortgageText(){
        chaseMortgageText();
    }
    @Test //test33 Home Equity
    public void homeEquityText(){
        chaseHomeEquityText();
    }
    @Test //test34 Investing
    public void investingText(){
        chaseInvestingText();
    }
    @Test //test35 Chase for Business
    public void forBusinessText(){
        chaseForBusinessText();
    }
    @Test //test36 Commercial Banking
    public void commercialBankingText(){
        chaseCommercialBankingText();
    }
    @Test //test37 See all
    public void seeAllText(){
        chaseSeeAllText();
    }
//=================================//
    @Test //test38 Contact us
    public void contactUsText(){
        chaseContactUsText();
    }
    @Test //test39 Give feedback
    public void giveFeedbackText(){
        chaseGiveFeedbackText();
    }

 /* This is the starting point of the screenshot code ...
    Capture Screenshots of Web pages -- This will be applied for all text cases, check CommonAPI

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

        File sourceFile = ((TakesScreenshot)geckoDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + fileName));
 This is the end of the screenshot capture code
    Capture Screenshots of Web pages -- This will be applied for all text cases, check CommonAPI

        geckoDriver.close();
    }*/
}
