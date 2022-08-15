package src.main.java.co.org.mycompany.javaexercises.Model;

public enum Schedule {

    DAY1("MONDAY", "Working Day"),
    DAY2("TUESDAY", "Working Day"),
    DAY3("WEDNESDAY", "Working Day"),
    DAY4("THURSDAY", "Working Day"),
    DAY5("FRIDAY", "Working Day"),
    DAY6("SATURDAY", "Holiday"),
    DAY7("SUNDAY", "Holiday");

    private String day, info;

    private Schedule(String day, String info){
        this.day = day;
        this.info = info;
    }

    public String getDay() {
        return day;
    }

    public String getInfo() {
        return info;
    }

}
