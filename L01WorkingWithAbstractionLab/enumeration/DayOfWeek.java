package L01WorkingWithAbstractionLab.enumeration;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DayOfWeek(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
