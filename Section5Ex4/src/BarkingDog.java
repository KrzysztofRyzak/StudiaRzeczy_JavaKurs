public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if((barking == true) && (hourOfDay >= 0 && hourOfDay < 8 ) || (hourOfDay == 23 )) {
            return true;
        } else if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else
            return false;
    }
}
