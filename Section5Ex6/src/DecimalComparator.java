public class DecimalComparator {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(3.0000,3.0025);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int number1 = (int) (firstNumber * 1000);
        int number2 = (int) (secondNumber * 1000);

        if(number1 - number2 == 0) {
            return true;
        } else {
            return false;
        }


    }
}
