package co.com.automation.endava.questions;

import co.com.automation.endava.userinterface.PassengersInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.automation.endava.userinterface.PassengersInformationPage.*;

public class ValidateElementPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return PASSENGER_TWO.resolveFor(actor).isVisible();
    }

    public static ValidateElementPage passengerInfo(){
        return new ValidateElementPage();
    }
}
