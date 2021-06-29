package co.com.automation.endava.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automation.endava.userinterface.AdsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CloseAdsWindow implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil
                        .the(ADS_BLOCK, isVisible()).forNoMoreThan(1).seconds()
                , Click.on(OPT_CHECKBOX)
                , Click.on(CONTINUE_BUTTON_ADS));
    }

    public static CloseAdsWindow closeCookies() {
        return new CloseAdsWindow();
    }
}
