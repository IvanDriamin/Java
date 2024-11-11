package ru.Driamin.Line;

import java.util.Arrays;

public class BrokenLine1_3 {
    private String[] point_arr;
    private int[] X, Y;

    public BrokenLine1_3() {
        this.point_arr = null;
        this.X = null;
        this.Y = null;
    }

    public BrokenLine1_3(String[] point_arr, int[] X, int[] Y) {
        this.point_arr = point_arr;
        this.X = X;
        this.Y = Y;
    }

    public String toString() {
        return "Линия " + Arrays.toString(point_arr);
    }

    public String lenghtBrokenLine(int[] X, int[] Y) {
        double l = 0;
        for (int i = 0; i < X.length; i++) {
            int j = i + 1;
            if (j == 4) {
                j = 0;
            }
            if ((X[i] != X[j] && Y[i] == Y[j]) || (X[i] == X[j] && Y[i] != Y[j])) {
                if (X[i] != X[j] && Y[i] == Y[j]) {
                    l = l + Math.abs(X[i] - X[j]);
                }
                if (X[i] == X[j] && Y[i] != Y[j]) {
                    l = l + Math.abs(Y[i] - Y[j]);
                }
            } else {
                l = l + Math.sqrt(Math.pow(Math.abs(Y[i] - Y[j]), 2) + Math.pow(Math.abs(X[i] - X[j]), 2));
            }
        }
       return "длина ломаной: " + Double.toString(l);
    }

    public void setBrokenLine(String[] p, int[] X, int[] Y) {
        this.point_arr = p;
        this.X = X;
        this.Y = Y;
    }
}
