public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        //long hours = minutes / 60;
        //long days = hours / 24;
        long days = (minutes / 60) / 24;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = days / 365;
            long leftDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + leftDays + " d");
        }
    }
}
