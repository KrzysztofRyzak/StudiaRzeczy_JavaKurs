public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if(seconds < 0) {
            return " Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsLeft =  (seconds - ((hours * 3600) + (minutes * 60))) ;


        return hours +" h " + minutes  + " m " + secondsLeft + " s";
    }


    public static String getDurationString(int minutes, int seconds) {


        if(minutes < 0) {
            return " Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }


        if (seconds <= 0 || seconds >= 59) {
            return " Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int allSeconds = (minutes * 60) + seconds;
        return getDurationString(allSeconds);
    }


    // rozwiazanie z kursu (bez bonusu)

    /*
    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return detDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes  + "m " + remainingSeconds + "s";
    }

     */


}
