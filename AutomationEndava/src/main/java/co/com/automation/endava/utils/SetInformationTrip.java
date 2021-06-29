package co.com.automation.endava.utils;

import co.com.automation.endava.models.PassengersInformation;
import co.com.automation.endava.models.TripInformation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetInformationTrip {
    public List<TripInformation> info(DataTable dataTableInformation) {
        List<TripInformation> information = new ArrayList<>();
        List<Map<String, String>> mapTrip = dataTableInformation.asMaps();
        for (Map<String, String> map : mapTrip) {
            information.add(new ObjectMapper().convertValue(map, TripInformation.class));
        }
        return information;
    }

    public List<PassengersInformation> infoPassenger(DataTable dataTableInformation) {
        List<PassengersInformation> information = new ArrayList<>();
        List<Map<String, String>> mapTrip = dataTableInformation.asMaps();
        for (Map<String, String> map : mapTrip) {
            information.add(new ObjectMapper().convertValue(map, PassengersInformation.class));
        }
        return information;
    }
}
