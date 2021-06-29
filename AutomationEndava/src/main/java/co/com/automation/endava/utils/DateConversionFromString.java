package co.com.automation.endava.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConversionFromString {
    private String date;


    public DateConversionFromString(String date) {
        this.date = date;

    }

    public Calendar setUpCalendar() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(this.date);
            dateFormat.format(date);
        } catch (Exception e) {
            System.out.println("invalid format");
        }
        calendar.setTime(date);
        return calendar;
    }

    public int month() {
        return setUpCalendar().get(Calendar.MONTH);
    }

    public int year() {
        return setUpCalendar().get(Calendar.YEAR);
    }

    public int day() {
        return setUpCalendar().get(Calendar.DAY_OF_MONTH);
    }
}
