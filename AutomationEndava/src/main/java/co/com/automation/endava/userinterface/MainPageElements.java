package co.com.automation.endava.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPageElements {
    public static final Target ORIGIN_CITY =
            Target.the("Origin Airport")
                    .located(By.id("reservationFlightSearchForm.originAirport"));

    public static final Target DESTINATION_CITY =
            Target.the("Destination Airport")
                    .located(By.id("reservationFlightSearchForm.destinationAirport"));

    public static final Target COUNT_PASSENGER =
            Target.the("Destination Airport")
                    .located(By.id("flightSearchForm.adultOrSeniorPassengerCount"));

    public static final Target SELECTING_CITY =
            Target.the("Selecting origin city")
                    .locatedBy("//a[contains(@id,'ui-id') and contains(text(),'{0}')]");

    public static final Target CALENDAR_BUTTON =
            Target.the("Click on depart button")
                    .locatedBy("(//button[contains(@class,'datepicker-trigger')])[{0}]");


    public static final Target DATE_SELECT =
            Target.the("Selecting date")
                    .locatedBy("//td[@data-month='{0}' and @data-year='{1}']/a[text()='{2}']");

    public static final Target SEARCH_BUTTON =
            Target.the("Click on search button")
                    .located(By.id("flightSearchForm.button.reSubmit"));

    public static final Target WAIT_PROCESS =
            Target.the("Waiting for the information")
                    .locatedBy("//span[@class='aa-busy-text']");

    public static final Target DEPART_DATE =
            Target.the("Writing depart date")
                    .located(By.id("aa-leavingOn"));

    public static final Target RETURN_DATE =
            Target.the("Writing return date")
                    .located(By.id("aa-returningFrom"));

    public static final Target ADV_BUTTON = Target.the("Advanced button")
            .located(By.id("advBookingSearch"));
}

