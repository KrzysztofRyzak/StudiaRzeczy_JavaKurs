package Lab01_programowanie;

import java.util.Scanner;
public class Lab01 {

    public static void main(String[] args) {
        //Zadanie1Lab01();
        //Zadanie2Lab01();
        //Zadanie3Lab01();
        //Zadanie4Lab01();
        //Zadanie5Lab01();
       // Zadanie6Lab01();


        //Zadanie7 - Lab01

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj b: ");
        int b = scanner.nextInt();

        // Generujemy trzy losowe liczby z przedziału <a,b>
        int x = a + (int) (Math.random() * (b - a + 1));
        int y = a + (int) (Math.random() * (b - a + 1));
        int z = a + (int) (Math.random() * (b - a + 1));

        // Sprawdzamy, czy z odcinków o długości x, y i z można zbudować trójkąt prostokątny
        if (isRightTriangle(x, y, z)) {
            System.out.println("Z odcinków o długościach " + x + ", " + y + " i " + z + " można zbudować trójkąt prostokątny.");
        } else {
            System.out.println("Z odcinków o długościach " + x + ", " + y + " i " + z + " nie można zbudować trójkąt prostokątny.");
        }
    }

    public static boolean isRightTriangle(int x, int y, int z) {
        // Sprawdzamy, czy każdy z odcinków jest mniejszy od sumy pozostałych
        return x < y + z && y < x + z && z < x + y;

    }

    public static void Zadanie1Lab01() {
        //deklaracja zmiennych
        String MojeImie = "Krzysiek";
        int MojWiek = 21;

        System.out.println("Moje imie to: "+MojeImie+ " \t Moj wiek to: "+ MojWiek);


    }

    public static void Zadanie2Lab01() {

        int liczba1,liczba2;


        Scanner input = new Scanner(System.in);

        System.out.println("Podaj dwie liczby: ");
        System.out.println("\n");
        System.out.println("Liczba 1= ");
        liczba1 = input.nextInt();
        System.out.println("Liczba 2= ");
        liczba2 = input.nextInt();

        System.out.println("Suma dwoch liczb wynosi: ");
        System.out.println(liczba1+liczba2);
        System.out.println("Roznica dwoch liczb wynosi: ");
        System.out.println(liczba1-liczba2);
        System.out.println("Iloraz dwoch liczb wynosi: ");
        System.out.println(liczba1/liczba2);

    }

/*
    double Zadanie2(int liczba1, int liczba2) {

        System.out.println("Podaj liczbe 1: ");
        liczba1 = input.nextInt();
        System.out.println("Podaj liczbe 2: ");
    }

 */

    public static void  Zadanie3Lab01() {
        Scanner input = new Scanner(System.in);
        double Liczba;
        boolean Parzysta = true;
        System.out.println("Podaj liczbe zeby sprawdzic czy jest parzysta" );
        Liczba = input.nextInt();


        if(Liczba % 2 == 0) System.out.println(Parzysta);
                else System.out.println(false);

    }


    public static void  Zadanie4Lab01() {
        Scanner input = new Scanner(System.in);
        double Liczba;
        System.out.println("Podaj liczbe zeby sprawdzic czy jest podzielna przez 3 i 5 " );
        Liczba = input.nextInt();


        if(Liczba % 3 == 0 && Liczba % 5 == 0) System.out.println(true);
        else System.out.println(false);

    }



    public static void Zadanie5Lab01() {
        Scanner input = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbe zeby pdosniesc ja do potegi 3:"  );
        liczba = input.nextInt();
        System.out.println(Math.pow(liczba,3));

    }

   // public double  Zadanie5Lab01(double liczba) {
   //
  //      return (Math.pow (liczba,3));
  // }


    public static void Zadanie6Lab01() {
        Scanner input = new Scanner(System.in);
        double  liczba;
        System.out.println("Podaj liczbe zeby ja spierwiastkowac: ");
        liczba = input.nextInt();
        System.out.println(Math.sqrt(liczba));

    }



}
