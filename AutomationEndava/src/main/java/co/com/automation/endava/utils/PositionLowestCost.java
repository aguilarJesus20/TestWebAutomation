package co.com.automation.endava.utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class PositionLowestCost {
    public String lowestCost(List<WebElementFacade> informationPrice) {
        int flat = 0;
        int price = Integer.valueOf(informationPrice.get(0).getText()
                .replace("." , "")
                .replace("," , "")
                .trim());
        for (int i = 0; i < informationPrice.size(); i++) {
            int priceCompare = Integer.valueOf(informationPrice.get(i)
                    .getText().replace("." , "")
                    .replace("," , "")
                    .trim());
            if (priceCompare < price) {
                price = priceCompare;
                flat = i + 1;
            }
        }
        flat = flat == 0 ? 1 : flat;
        return String.valueOf(flat);
    }
}
