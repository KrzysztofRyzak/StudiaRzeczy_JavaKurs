public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println("toMilesPerHour output: " + toMilesPerHour(75.114));

        printConversion(75.114);


    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            kilometersPerHour = (kilometersPerHour / 1.609d);
            return Math.round(kilometersPerHour);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid value");
        }
    }



}
