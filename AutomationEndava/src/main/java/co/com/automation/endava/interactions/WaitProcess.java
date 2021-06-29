package co.com.automation.endava.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automation.endava.userinterface.MainPageElements.WAIT_PROCESS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class WaitProcess implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(WAIT_PROCESS,
                isNotVisible()).forNoMoreThan(2).seconds());
    }

    public static WaitProcess untilElement() {
        return new WaitProcess();
    }
}
