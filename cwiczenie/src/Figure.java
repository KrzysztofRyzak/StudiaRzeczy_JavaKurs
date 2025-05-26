public class Figure {
    Point point;
    String color = "white";

    // zad 9
    Cwiartki cwiartka;

    Figure() {
        point = new Point(0, 0);
        cwiartka = Cwiartki.OO;

    }

    Figure(String color) {
        this.color = color;
    }

    Figure(Point point) {
        this.point = point;
    }

    String getColor() {
        return color;
    }



}
