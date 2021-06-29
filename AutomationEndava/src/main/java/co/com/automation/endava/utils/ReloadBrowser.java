package co.com.automation.endava.utils;

import net.serenitybdd.core.Serenity;

public class ReloadBrowser {

    public void refreshPage() {
        String url = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        Serenity.getWebdriverManager().getCurrentDriver().navigate().to(url);
    }

}
