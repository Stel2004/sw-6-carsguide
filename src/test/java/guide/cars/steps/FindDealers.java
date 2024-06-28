package guide.cars.steps;

import guide.cars.pages.FindDealersPage;
import guide.cars.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FindDealers {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on buy+sell tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverAndClickOnMenuTab();
    }

    @Then("I navigate to {string} page")
    public void iNavigateToCarDealersPage(boolean display) throws InterruptedException {
        //new FindDealersPage().dealershipPageVerification();
    }

    @And("I click {string}")
    public void iClickFindADealer() throws InterruptedException {
        new HomePage().clickOnFindDealer();
    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName) {
        Assert.assertTrue(new FindDealersPage().findDealer(dealersName),"dealer is not there");

    }
}
