package co.com.automation.endava.interactions;

import co.com.automation.endava.utils.PositionLowestCost;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.automation.endava.userinterface.OptionsPageElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectLowestPrice implements Interaction {
    private PositionLowestCost position = new PositionLowestCost();

    public static SelectLowestPrice optionsInformation() {
        return new SelectLowestPrice();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int count = Integer.valueOf(actor.recall("countPassengers"));
        do {
            actor.attemptsTo(ShowTheAllOptions.withThePrice());
            List<WebElementFacade> informationPrice = ALL_PRICE_OPTIONS.resolveAllFor(actor);
            actor.attemptsTo(MoveMouse
                    .to(FLIGHT_BASIC_ECONOMY_BUTTON.of(position.lowestCost(informationPrice)))
                    .andThen(actions -> actions.click()));
            if(count==2){
                actor.attemptsTo(WaitUntil.the(ACCEPT_RESTRICTIONS_BUTTON, isVisible())
                        , Click.on(ACCEPT_RESTRICTIONS_BUTTON));
            }

            actor.attemptsTo(WaitProcess.untilElement());
            count--;
        } while (count != 0);


    }
}
