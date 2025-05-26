public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumber = 0;
        int oddNumber = 0;

        while (number <= finishNumber) {
            number++;

            if(!isEvenNumber(number)) {
                oddNumber++;
                continue;
            }

            if(isEvenNumber(number)) {
                evenNumber++;
                System.out.println(number);

                if(evenNumber == 5) {
                    break;
                }
            }


        }
        System.out.println("Number of even numbers is: " + evenNumber + " and number of odd numbers is: " + oddNumber);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
