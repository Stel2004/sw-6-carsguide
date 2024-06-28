package guide.cars.steps;

import guide.cars.pages.HomePage;
import guide.cars.pages.NewCarPage;
import guide.cars.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuySteps extends Utility {
    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverAndClickOnMenuTab();
    }

    @And("I click on {string} link")
    public void iClickOnNewLink(String menu) {
        new HomePage().subMenuClick(menu);
    }

    @Then("I navigate to {string} Cars For Sale page")
    public void iNavigateToNewCarsForSalePage(String page) {
        new HomePage().pageNavigateSuccessfully(page);
    }

    @And("I select make {string}")
    public void iSelectMake(String make) throws InterruptedException {
        new NewCarPage().clickOnMake(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new NewCarPage().clickOnModel(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String state) {
        new NewCarPage().clickOnState(state);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new NewCarPage().clickOnPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewCarPage().clickOnButton();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String makeRes) {
        new NewCarPage().verifyTextFromTitle(makeRes);
    }


    @And("I click on Show used vehicles")
    public void iClickOnShowUsedVehicles() {
        new NewCarPage().clickOnUsedButton();
    }
}
