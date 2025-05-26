public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);
    }

    public static boolean hasEqualSum(int firstParameter, int secondParameter, int thirdParameter) {
        if ((firstParameter + secondParameter) == thirdParameter) {
            return true;
        } else {
            return false;
        }
    }
}
