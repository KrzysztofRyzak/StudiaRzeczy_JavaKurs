import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int loopCounter = 0;

        while (true) {

            //System.out.println("Enter some numbers, or enter character to exit");
            String nextEntry = scanner.nextLine();

            try {
                int numbers = Integer.parseInt(nextEntry);
                sum += numbers;
                loopCounter ++;

            } catch(NumberFormatException nfe) {
                break;

            }

        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / loopCounter));

    }
}
