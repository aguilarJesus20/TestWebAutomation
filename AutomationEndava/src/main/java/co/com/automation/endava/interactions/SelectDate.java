package co.com.automation.endava.interactions;

import co.com.automation.endava.utils.DateConversionFromString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automation.endava.userinterface.MainPageElements.CALENDAR_BUTTON;
import static co.com.automation.endava.userinterface.MainPageElements.DATE_SELECT;
import static java.lang.String.valueOf;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectDate implements Interaction {

    private String depart;
    private String returnDate;


    public SelectDate(String depart, String returnDate) {
        this.depart = depart;
        this.returnDate = returnDate;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CALENDAR_BUTTON.of("1")
                , isVisible())
                , Click.on(CALENDAR_BUTTON.of("1")));
        actor.attemptsTo(Click.on(DATE_SELECT.of(valueOf(new DateConversionFromString(depart).month())
                , valueOf(new DateConversionFromString(depart).year())
                , valueOf(new DateConversionFromString(depart).day()))));

        actor.attemptsTo(WaitUntil.the(CALENDAR_BUTTON.of("2")
                , isVisible())
                , Click.on(CALENDAR_BUTTON.of("2"))
                , Click.on(DATE_SELECT.of(valueOf(new DateConversionFromString(returnDate).month())
                        , valueOf(new DateConversionFromString(returnDate).year())
                        , valueOf(new DateConversionFromString(returnDate).day()))));

    }


    public static SelectDate toTrip(String depart, String returnDate) {
        return new SelectDate(depart, returnDate);
    }

}
