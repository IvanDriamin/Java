package ru.Driamin.Figure;

public class SquareShape4_4 {
    private int x, y, len;

    public SquareShape4_4() {
        this.x = 0;
        this.y = 0;
        this.len = 0;
    }

    public SquareShape4_4(int x, int y, int len) {
        this.x = x;
        this.y = y;
        this.len = len;
    }

    public String square() {
        return "Площадь квадрата: " + Integer.toString(len * len);
    }

    public String toString() {
        return "Квадрат в точке {" + Integer.toString(x) + ";" + Integer.toString(y) + "} со стороной " + Integer.toString(len);
    }
}
