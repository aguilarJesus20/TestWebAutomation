package co.com.automation.endava.task;

import co.com.automation.endava.interactions.SelectDate;
import co.com.automation.endava.interactions.WaitProcess;
import co.com.automation.endava.models.TripInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.automation.endava.userinterface.MainPageElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillInForm implements Interaction {

    private TripInformation information;

    public FillInForm(List<TripInformation> information) {
        this.information = information.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(ORIGIN_CITY, isVisible())
                , Click.on(ORIGIN_CITY)
                , Enter.theValue(information.getOriginCity()).into(ORIGIN_CITY)
                , WaitUntil.the(SELECTING_CITY.of(information.getOriginCity()), isVisible())
                , Click.on(SELECTING_CITY.of(information.getOriginCity()))
                , Enter.theValue(information.getDestinationCity()).into(DESTINATION_CITY)
                , WaitUntil.the(SELECTING_CITY.of(information.getDestinationCity()), isVisible())
                , Click.on(SELECTING_CITY.of(information.getDestinationCity())));
        COUNT_PASSENGER.resolveFor(actor).select().byValue(information.getCountPassengers());
        actor.attemptsTo(SelectDate.toTrip(information.getDepart(), information.getReturnDate()));
        actor.attemptsTo(WaitUntil.the(SEARCH_BUTTON, isVisible())
                , Click.on(SEARCH_BUTTON));
        actor.attemptsTo(WaitProcess.untilElement());
        actor.remember("countPassengers" , information.getCountPassengers());
    }

    public static FillInForm withTripInformation(List<TripInformation> information) {
        return new FillInForm(information);
    }
}
