package co.com.automation.endava.interactions;

import co.com.automation.endava.userinterface.OptionsPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automation.endava.userinterface.OptionsPageElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ContinueAsGuest implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CONTINUE_GUEST_BUTTON
                , isVisible()), Click.on(CONTINUE_GUEST_BUTTON));
    }

    public static ContinueAsGuest clickButton(){
        return new ContinueAsGuest();
    }
}
