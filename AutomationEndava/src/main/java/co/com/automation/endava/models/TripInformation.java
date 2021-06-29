package co.com.automation.endava.models;

public class TripInformation {
    private String originCity;
    private String destinationCity;
    private String countPassengers;
    private String depart;
    private String returnDate;




    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(String countPassengers) {
        this.countPassengers = countPassengers;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
