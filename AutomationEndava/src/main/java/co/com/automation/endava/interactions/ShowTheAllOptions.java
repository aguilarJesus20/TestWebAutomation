package co.com.automation.endava.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automation.endava.userinterface.OptionsPageElements.SHOW_MORE_BUTTON;


public class ShowTheAllOptions implements Interaction {
    public static ShowTheAllOptions withThePrice() {
        return new ShowTheAllOptions();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        do {
            actor.attemptsTo(Click.on(SHOW_MORE_BUTTON));
        } while (SHOW_MORE_BUTTON.resolveFor(actor).isVisible());
    }
}
