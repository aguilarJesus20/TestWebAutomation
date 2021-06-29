package co.com.automation.endava.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassengersInformationPage {
    public static final Target PASSENGER_NAME = Target.the("Writing passenger name")
            .located(By.id("passengers0.personalInformationForm.firstName"));

    public static final Target PASSENGER_SECOND_NAME = Target
            .the("Writing passenger second name")
            .located(By.id("passengers0.personalInformationForm.middleName"));

    public static final Target PASSENGER_LAST_NAME = Target
            .the("Writing passenger last name")
            .located(By.id("passengers0.personalInformationForm.lastName"));

    public static final Target FREQUENT_FLYER_PROGRAM = Target
            .the("Frequent Flyer Program")
            .located(By.id("passengers0.frequentFlyerProgram"));

    public static final Target FREQUENT_FLYER_NUMBER = Target
            .the("Frequent Flyer Number")
            .located(By.id("passengers0.frequentFlyerNumber"));


    public static final Target DATE_FORM_DAY = Target
            .the("Date form day")
            .located(By.id("passengers0.dateComponentForm.day"));

    public static final Target DATE_FORM_MONTH = Target
            .the("Date form month")
            .located(By.id("passengers0.dateComponentForm.month"));

    public static final Target DATE_FORM_YEAR = Target
            .the("Date form year")
            .located(By.id("passengers0.dateComponentForm.year"));

    public static final Target GENDER_PASSENGER = Target
            .the("gender passenger")
            .located(By.id("passengers0.personalInformationForm.gender"));


    public static final Target RESIDENCY_COUNTRY = Target
            .the("Residency country")
            .located(By.id("passengers0.residencyInfo.country"));


    public static final Target REDRESS_NUMBER = Target
            .the("Redress Number passenger")
            .located(By.id("passengers0.secureFlightData.redressNumber"));


    public static final Target PASSPORT_NUMBER = Target
            .the("passport number")
            .located(By.id("passengers0.passportForm.number"));

    public static final Target PASSPORT_DAY = Target
            .the("passport day")
            .located(By.id("passengers0.passportForm.expirationDate.day"));

    public static final Target PASSPORT_MONTH = Target
            .the("passport month")
            .located(By.id("passengers0.passportForm.expirationDate.month"));

    public static final Target PASSPORT_YEAR = Target
            .the("passport year")
            .located(By.id("passengers0.passportForm.expirationDate.year"));

    public static final Target NATIONALITY_PASSENGER = Target
            .the("NATIONALITY PASSENGER")
            .located(By.id("passengers0.passportForm.nationality"));



    public static final Target PASSENGER_TWO = Target
            .the("Passenger two information ")
            .locatedBy("//h3[@class='papercut-header' and text()='Pasajero 2 ']");



}
