public class Point {
    protected double x, y;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public void zeruj() {
        this.x = 0;
        this.y = 0;
    }


}
