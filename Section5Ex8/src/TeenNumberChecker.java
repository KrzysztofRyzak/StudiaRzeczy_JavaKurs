public class TeenNumberChecker {
    public static void main(String[] args) {

        hasTeen(0,0,13);
        isTeen(9);
    }

    public static boolean hasTeen (int firstParameter, int secondParameter, int thirdParameter) {
        if ((firstParameter >= 13 && firstParameter <= 19) ||
                (secondParameter >= 13 && secondParameter <= 19) ||
                (thirdParameter >= 13 && thirdParameter <= 19)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isTeen(int firstParameter) {
        if((firstParameter >= 13 && firstParameter <= 19)) {
            return true;
        }
        else return false;
    }
}
