import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* //zad 1

        Point point1 = new Point();

        //zad 2

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Point point2 = new Point(a,b);

        //zad 3

        point1.setX(12);
        System.out.println("Dla punktu1 wspolrzedne wynosza: x = " + point1.getX() + " y = " + point1.getY());

        point2.setY(30);
        System.out.println("Dla punktu2 wspolrzedne wynosza: x = " + point2.getX() + " y = " + point2.getY());
*/



        //zad 4

        List<Figure> figures = new ArrayList<>();
        Figure figure1 = new Figure();
        figures.add (figure1);

        Figure figure2 = new Figure("Black");
        figures.add (figure2);

        Point point3 = new Point(40,80);
        Figure figure3 = new Figure (point3);
       // Figure figure3 = new Figure (new Point(5,7));
        figures.add(figure3);

        //zad 5
        //for (int i = 0; i < figures.size(); i++)
        for (Figure figure : figures) {
            figure.point.setX(figure.point.getX() - 2);
        }


        //zad 6     sprawdzanie czy maja takie same kolory bo nazw sie nie da

        for (int i = 0; i < figures.size(); i++) {
            for (int j = i + 1; j < figures.size(); j++) {

                if (figures.get(i).getColor().equals(figures.get(j).getColor())) {
                    System.out.println("Takie same kolory");
                    return;
                }

            }
        }



    }



}

// zad 7

enum Cwiartki {
    I,
    II,
    III,
    IV,
    OX,
    OY,
    OO
}