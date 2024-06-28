package guide.cars.pages;

import guide.cars.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "buy + sell")
    WebElement buysell;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/buy-a-car/new-car-search']")
    WebElement newCarPath;

    @CacheLookup
    //@FindBy(xpath = "//a[@href='/buy-a-car/used-car-search']")
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCarPath;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New Cars For Sale')]")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealer;



    public void mouseHoverAndClickOnMenuTab() {
        mouseHoverToElement(buysell);
        log.info("Mouse hover on buy and sell Tab and click " + buysell.toString());
    }

    public void subMenuClick(String menus) {
        if(menus.equals("newPath")){
            clickOnElement(newCarPath);
        } else {
            clickOnElement(usedCarPath);
        }
        log.info("Menu hover on sub menu as " + menus.toString());
    }

    public void pageNavigateSuccessfully(String page){
        Assert.assertEquals(pageTitle.getText(), page + " Cars For Sale", "Page is not navigated");
    }

    public void clickOnFindDealer() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(findDealer);
    }
}
