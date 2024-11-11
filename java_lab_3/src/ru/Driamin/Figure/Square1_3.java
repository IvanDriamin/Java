package ru.Driamin.Figure;

import ru.Driamin.Line.BrokenLine1_3;

public class Square1_3 {
    private int x, y, len;

    BrokenLine1_3 aa1_3 = new BrokenLine1_3();

    public Square1_3() {
        this.x = 0;
        this.y = 0;
        this.len = 0;
    }

    public Square1_3(int x, int y, int len) {
        this.x = x;
        this.y = y;
        this.len = len;
    }

    public void makeBrokenLine () {
        String s1 = "{" + Integer.toString(x) + ";" + Integer.toString(y) + "}";
        String s2 = "{" + Integer.toString(x + len) + ";" + Integer.toString(y) + "}";
        String s3 = "{" + Integer.toString(x + len) + ";" + Integer.toString(y - len) + "}";
        String s4 = "{" + Integer.toString(x) + ";" + Integer.toString(y - len) + "}";
        String[] arr = new String[]{s1, s2, s3, s4};
        int[] X = new int[]{x, x + len, x + len, x};
        int[] Y = new int[]{y, y, y - len, y - len};
        BrokenLine1_3 aa1_3 = new BrokenLine1_3(arr, X, Y);
        System.out.println(aa1_3.toString());
    }

    public void lenBrokenLine(int[] X, int[] Y) {
        System.out.println(aa1_3.lenghtBrokenLine(X, Y));
    }

    public void setterBrokenLine() {
        String s1 = "{" + Integer.toString(x) + ";" + Integer.toString(y) + "}";
        String s2 = "{" + Integer.toString(x + len) + ";" + Integer.toString(y) + "}";
        String s3 = "{" + Integer.toString(x + len) + ";" + Integer.toString(y - len) + "}";
        aa1_3.setBrokenLine(new String[]{s1, s2, s3, "{15;25}"}, new int[]{x, x + len, x + len, 15}, new int[] {y, y, y - len, 25});
        System.out.println(aa1_3.toString());
    }

    public String toString() {
        return "Квадрат в точке {" + Integer.toString(x) + ";" + Integer.toString(y) + "} со стороной " + Integer.toString(len);
    }
}
