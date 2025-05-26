public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));


    }

    public static boolean isPalindrome(int number) {


        if (number < 0) {
            number = number * -1;
        }

        int reverse = 0;
        int stored = number;
        int lastDigit;

        while (stored > 0) {
            lastDigit = stored % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            stored = stored / 10 ;
        }


        if(number == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
