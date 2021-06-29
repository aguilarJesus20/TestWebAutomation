package co.com.automation.endava.interactions;

import co.com.automation.endava.models.PassengersInformation;
import co.com.automation.endava.utils.DateConversionFromString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.automation.endava.userinterface.PassengersInformationPage.*;

public class FillInPassengerDetails implements Interaction {
    private PassengersInformation information;

    public FillInPassengerDetails(List<PassengersInformation> information) {
        this.information = information.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(information.getName()).into(PASSENGER_NAME),
                Enter.theValue(information.getSecondName()).into(PASSENGER_SECOND_NAME),
                Enter.theValue(information.getLastName()).into(PASSENGER_LAST_NAME));
        FREQUENT_FLYER_PROGRAM.resolveFor(actor)
                .select().selectByValue(information.getFrequentProgram());
        actor.attemptsTo(Enter.theValue(information.getFrequentNumber())
                .into(FREQUENT_FLYER_NUMBER));

        DATE_FORM_DAY.resolveFor(actor).select()
                .selectByValue(String
                        .valueOf(new DateConversionFromString(information.getDateComponent()).day()));

        DATE_FORM_MONTH.resolveFor(actor).select()
                .selectByValue(String
                        .valueOf(new DateConversionFromString(information.getDateComponent()).month()));

        DATE_FORM_YEAR.resolveFor(actor).select()
                .selectByValue(String
                        .valueOf(new DateConversionFromString(information.getDateComponent()).year()));

        GENDER_PASSENGER.resolveFor(actor).select().selectByValue(information.getGender());
        RESIDENCY_COUNTRY.resolveFor(actor).select().selectByValue(information.getResidencyCoutry());
        actor.attemptsTo(Enter.theValue(information.getRedressNumber())
                .into(REDRESS_NUMBER));
        actor.attemptsTo(Enter.theValue(information.getPassportNumber())
                .into(PASSPORT_NUMBER));

        PASSPORT_DAY.resolveFor(actor).select()
                .selectByValue(String
                        .valueOf(new DateConversionFromString(information
                                .getDateExpirationPass()).day()));
        PASSPORT_MONTH.resolveFor(actor).select()
                .selectByValue(String
                        .valueOf(new DateConversionFromString(information
                                .getDateExpirationPass()).month()));
        PASSPORT_YEAR.resolveFor(actor).select()
                .selectByValue(String
                        .valueOf(new DateConversionFromString(information
                                .getDateExpirationPass()).year()));

        NATIONALITY_PASSENGER.resolveFor(actor)
                .select().selectByValue(information.getNationality());

    }

    public static FillInPassengerDetails writeHisInformation(List<PassengersInformation> information) {
        return new FillInPassengerDetails(information);
    }
}
