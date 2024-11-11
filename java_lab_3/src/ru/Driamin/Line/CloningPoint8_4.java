package ru.Driamin.Line;

import java.util.Arrays;

public class CloningPoint8_4 {
    private int x, y;

    public CloningPoint8_4() {
        this.x = 0;
        this.y = 0;
    }

    public CloningPoint8_4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CloningPoint8_4 Clone () {
        CloningPoint8_4 a = new CloningPoint8_4(x, y);
        return a;
    }
    public String toString() {
        return "Точка в координатах {" + Integer.toString(x) + ";" + Integer.toString(y) + "}";
    }
}
