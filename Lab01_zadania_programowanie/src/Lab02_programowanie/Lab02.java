package Lab02_programowanie;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {

        /*
        //Zadanie 1

        double delta ;
        double potega=2;
        final double a,b,c;
        System.out.println("Podaj liczby a, b i c ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        System.out.println("Podaj c: ");
        c = scanner.nextInt();

        delta = (Math.pow(b, potega) -4*a*c);
        System.out.println("delta to " + delta);

        double x1 = ((-b - Math.sqrt(delta))/(2*a));
        double x2 =  ((-b + Math.sqrt(delta))/(2*a));
        double xo = (-b/(2*a));

        if (delta > 0) {
            System.out.println("Rownanie kwadratowe posiada dwa rozwiazania: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }

        else if (delta == 0) {
            System.out.println("Rownanie kwadratowe posiada jedno rozwiazanie ");
            System.out.println("x0=" + xo);
        }

        else  {
            System.out.println("Rownanie kwadratowe nie posiada rozwiazania ");
        }

        */

        /*
        Zadanie 2
        float x, wynik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x: ");
        x = scanner.nextInt();

        System.out.println("Funkcja a(x): ");

        if(x>0) {
        wynik = 2*x;
            System.out.println("Wynik to: " + wynik);
        }

        else if  (x==0) {
            wynik = 0;
            System.out.println("Wynik to: " + wynik);
        }

        else if (x<0) {
            wynik = -3*x;
            System.out.println("Wynik to: " + wynik);
        }
*/
   //Zadanie3();

    }

    public static void Zadanie3() {


       int[] tablica = {12,5,3};
       int temp=0;


        //uporzadkowanie tablicy
        for (int i = 0; i < 3; i++)
            for (int j = i + 1; j < 3; j++)
                if (tablica[i] > tablica[j])
                {
                    temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }

        //wypisanie uporzadzkowanej tablicy
        for(int i=0; i<3; i++) {
            System.out.println(tablica[i]);
        }

    }

}
