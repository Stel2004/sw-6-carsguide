package guide.cars.pages;

import guide.cars.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewCarPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='make']")
    WebElement make;

    @CacheLookup
    @FindBy(xpath = "//select[@id='model']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//select[@id='state']")
    WebElement state;

    @CacheLookup
    @FindBy(xpath="//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Show new vehicles')]")
    WebElement newVehiclesButton;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='h1Text search--title']")
    WebElement searchTitle;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Show used vehicles')]")
    WebElement usedVehiclesButton;

    public void clickOnMake(String option) throws InterruptedException {
        selectByVisibleTextFromDropDown(make,option);
        Thread.sleep(3000);
        log.info("selected make option " + option + "from "+ make.toString());
    }

    public void clickOnModel(String option1) {
        selectByVisibleTextFromDropDown(model,option1);
        log.info("select model option " + option1 + "from "+ model.toString());
    }

    public void clickOnState(String stateOpt){
        selectByVisibleTextFromDropDown(state,stateOpt);
        log.info("select state from "+ stateOpt +" from " +state.toString());
    }

    public void clickOnPrice(String priceOpt){
        selectByVisibleTextFromDropDown(price,priceOpt);
        log.info("enter price "+priceOpt +" from " + price.toString());
    }

    public void clickOnButton(){
        clickOnElement(newVehiclesButton);
    }

    public void clickOnUsedButton(){
        clickOnElement(usedVehiclesButton);
    }

    public void verifyTextFromTitle(String makeRes){
        //verifyThatTextContains(searchTitle, makeRes);
        Assert.assertFalse(verifyThatTextContains(searchTitle, makeRes), "Make as "+ makeRes + " is not available");
    }


}
