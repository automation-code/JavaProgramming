package Class14_Enums;

/*
 An enum constructor is a special method that is called when an enum constant is created.
 It allows you to initialize the fields of the enum constants with specific values.
*/


public class EnumConstructorExample {
    public enum Day {
        MONDAY("Start of the week"),
        TUESDAY("Second day of the week"),
        WEDNESDAY("Midweek"),
        THURSDAY("Almost there"),
        FRIDAY("End of the workweek"),
        SATURDAY("Weekend!"),
        SUNDAY("Rest day");

        private String description;

        // Enum constructor
        Day(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}
