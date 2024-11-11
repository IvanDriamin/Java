package ru.Driamin.Figure;

public class RectangleShape4_4 {
    private int x, y, len1, len2;

    public RectangleShape4_4() {
        this.x = 0;
        this.y = 0;
        this.len1 = 0;
        this.len2 = 0;
    }

    public RectangleShape4_4(int x, int y, int len1, int len2) {
        this.x = x;
        this.y = y;
        this.len1 = len1;
        this.len2 = len2;
    }

    public String square() {
        return "Площадь прямоугольника: " + Integer.toString(len1 * len2);
    }

    public String toString() {
        return "Прямоугольник в точке {" + Integer.toString(x) + ";" + Integer.toString(y) + "} со сторонами " + Integer.toString(len1) + " и " + Integer.toString(len2);
    }
}
