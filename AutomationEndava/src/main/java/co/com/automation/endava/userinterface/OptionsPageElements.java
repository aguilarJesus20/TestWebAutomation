package co.com.automation.endava.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OptionsPageElements {
    public static final Target ALL_PRICE_OPTIONS = Target
            .the("The all price information")
            .locatedBy("//button[contains(@class,'fareType')]/child::div/child::div/child::span[@class='price']");


    public static final Target SHOW_MORE_BUTTON = Target.
            the("Show more button")
            .located(By.id("showMoreLink"));
    public static final Target FLIGHT_BASIC_ECONOMY_BUTTON = Target
            .the("Click on lowest cost")
            .locatedBy("(//button[contains(@id,'Flight')])[{0}]");

    public static final Target ACCEPT_RESTRICTIONS_BUTTON = Target
            .the("Click on accept restrictions")
            .located(By.id("beAcceptRestrictions"));

    public static final Target CONTINUE_GUEST_BUTTON = Target
            .the("Click on continue guest")
            .located(By.id("button_continue_guest"));

}

