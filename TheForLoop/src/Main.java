public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        //System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for(double rate = 2.0; rate <= 5; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
        System.out.println("");

        for(double i = 7.5; i <= 10; i+=0.25) {
            double interestAmount2 = calculateInterest(100.0, i);
            if(interestAmount2 > 8.5) {
                break;
            }
            System.out.println("$100 at " + i + "% interest = $" + interestAmount2);
        }




    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
