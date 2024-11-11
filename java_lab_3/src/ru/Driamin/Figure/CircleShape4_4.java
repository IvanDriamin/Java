package ru.Driamin.Figure;

public class CircleShape4_4 {
    private int x, y, rad;

    public CircleShape4_4() {
        this.x = 0;
        this.y = 0;
        this.rad = 0;
    }

    public CircleShape4_4(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public String square() {
        return "Площадь окружности: " + Double.toString(3.14 * rad * rad);
    }

    public String toString() {
        return "Окружность с центром в точке {" + Integer.toString(x) + ";" + Integer.toString(y) + "} и радиусом " + Integer.toString(rad);
    }
}
