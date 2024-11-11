package ru.Driamin.Figure;

public class TriangleShape4_4 {
    private int x1, y1, x2, y2, x3, y3;

    public TriangleShape4_4() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 0;
    }

    public TriangleShape4_4(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = x3;
    }

    public String square() {
        return "Площадь треугольника: " + Double.toString(Math.abs(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))));
    }

    public String toString() {
        return "Квадрат в точках {" + Integer.toString(x1) + ";" + Integer.toString(y1) + "}, " + "{" + Integer.toString(x2) + ";" + Integer.toString(y2) + "} и " + "{" + Integer.toString(x3) + ";" + Integer.toString(y3) + "}";
    }
}
