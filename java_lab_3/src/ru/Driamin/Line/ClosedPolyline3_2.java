package ru.Driamin.Line;

public class ClosedPolyline3_2 {
    private int[] X, Y;

    public ClosedPolyline3_2() {
        this.X = null;
        this.Y = null;
    }

    public ClosedPolyline3_2(int[] X, int[] Y) {
        this.X = X;
        this.Y = Y;
    }

    public String lenBrokenLine() {
        double l = 0;
        for (int i = 0; i < X.length; i++) {
            int j = i + 1;
            if (j == X.length) {
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

    public String toString(int[] X, int[] Y) {
        String point_arr = "";
        for (int i = 0; i < X.length; i++) {
            point_arr = point_arr + "{" + Integer.toString(X[i]) + ";" + Integer.toString(Y[i]) + "} ";
        }
        return point_arr;
    }
}
