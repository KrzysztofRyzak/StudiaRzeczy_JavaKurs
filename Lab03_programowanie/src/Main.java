import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zadanie1();
        zadanie2();

    }

    // zadanie 1
    public static void zadanie1()  {
        int n, a=0, b=10;
        double suma = 0, pkt, ile = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc studentow");
        n = input.nextInt();
        if(n>0) {
            while (n>0) {
                System.out.println("Podaj ilosc pkt: 0 - 10");
                pkt = input.nextDouble();
                if(pkt>=a && pkt <=b) {
                    suma +=pkt;
                    ile++;
                    n--;
                }
            } // koniec while
            System.out.println("ile: "+ ile);
            System.out.println("suma pkt: "+ suma);
            System.out.println("srednia: "+ suma/ile);
        }
        else {
            System.out.println("Ilosc studentow musi byc liczba > 0");
        }
    }


    //Zadanie 2

    public static double Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double n = input.nextDouble();
        return n;
    }
    public static void zadanie2() {
        int ile_d = 0, ile_u = 0;
        double sumaD = 0, sumaU = 0, liczb;
        for (int i = 0; i < 4; i++) {
            liczb = Input();
            if (liczb >= 0) {
                ile_d++;
                sumaD += liczb;
            } else {
                ile_u++;
                sumaU += liczb;
            }
        }
    }//koniec for



    //Zadanie 3
    /*
    public static void zadanie3() {
    }
    */

   /*
    public static boolean zadanie5(String s) {
        int l = s.length() -1;
        s.toLowerCase(Locale.ROOT);
        for(int i=0; i<s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l)) return false;
            l--;
        }
        return true;
    }
*/





}

