package co.com.automation.endava.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdsPage {

    public static final Target ADS_BLOCK = Target.the("Ads block")
            .locatedBy("//div[contains(@class,'multi_title')]/p[contains(text(),'cookies')]");
    public static final Target OPT_CHECKBOX = Target.the("Opt checkbox cookies")
            .located(By.id("aa_optoutmulti_checkBox"));
    public static final Target CONTINUE_BUTTON_ADS = Target.the("continue button ads")
            .located(By.name("optoutmulti_button"));
}
