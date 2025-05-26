public class Main {
    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {

        int divider = 1;
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            while (divider <= number) {
                if (number % divider == 0) {
                    System.out.println(divider);
                }
                divider++;
            }
        }
    }
}
