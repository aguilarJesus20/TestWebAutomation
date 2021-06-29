package co.com.automation.endava.stepdefintions;

import co.com.automation.endava.interactions.ContinueAsGuest;
import co.com.automation.endava.interactions.FillInPassengerDetails;
import co.com.automation.endava.interactions.SelectLowestPrice;
import co.com.automation.endava.questions.ValidateElementPage;
import co.com.automation.endava.task.FillInForm;
import co.com.automation.endava.utils.ClearCacheDriver;
import co.com.automation.endava.utils.GetDriver;
import co.com.automation.endava.utils.SetInformationTrip;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.automation.endava.interactions.CloseAdsWindow.closeCookies;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchATripStepDefinitions {
    private SetInformationTrip informationTrip = new SetInformationTrip();
    private SetInformationTrip passengerInfo = new SetInformationTrip();


    @Before
    public void setUp() throws InterruptedException {
        setTheStage(new OnlineCast());
        ClearCacheDriver.clearCache();
    }

    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {
        theActorCalled("User").can(BrowseTheWeb.with(GetDriver.chrome()));
        theActorInTheSpotlight().attemptsTo(closeCookies());

    }


    @When("he search a trip from specific information")
    public void heSearchATripFromSpecificInformation(DataTable dataTableInformation) {
        theActorInTheSpotlight().attemptsTo(FillInForm
                .withTripInformation(informationTrip.info(dataTableInformation)));
    }

    @When("he selects the lowest price for both trips")
    public void heSelectsTheLowestPriceForBothTrips() {
        theActorInTheSpotlight().attemptsTo(SelectLowestPrice.optionsInformation());
        theActorInTheSpotlight().attemptsTo(ContinueAsGuest.clickButton());
    }

    @When("he register his personal information")
    public void heRegisterHisPersonalInformation(DataTable dataTableInformation) {
        theActorInTheSpotlight().attemptsTo(FillInPassengerDetails
                .writeHisInformation(passengerInfo.infoPassenger(dataTableInformation)));
    }

    @Then("he should see the all information about the trip")
    public void heShouldSeeTheAllInformationAboutTheTrip() {
        theActorInTheSpotlight()
                .attemptsTo(Ensure.thatTheAnswerTo(ValidateElementPage
                        .passengerInfo()).isTrue());
    }
}
