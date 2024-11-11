package ru.Driamin.Line;

public class ComparisonPolylines6_4 {
    private int[] X, Y;

    public ComparisonPolylines6_4() {
        this.X = null;
        this.Y = null;
    }

    public ComparisonPolylines6_4(int[] X, int[] Y) {
        this.X = X;
        this.Y = Y;
    }

    public String equality (ComparisonPolylines6_4 A, ComparisonPolylines6_4 B) {
        if (A.X.length == B.X.length && A.Y.length == B.Y.length) {
            for (int i = 0; i < A.X.length; i++) {
                if (A.X[i] != B.X[i]) {
                    return "Ломаные не равны";
                }
            }
            for (int i = 0; i < A.Y.length; i++) {
                if (A.Y[i] != B.Y[i]) {
                    return "Ломаные не равны";
                }
            }
        } else {
            return "Ломаные не равны";
        }
        return "Ломаные равны";
    }

    public String toString(int[] X, int[] Y) {
        String point_arr = "";
        for (int i = 0; i < X.length; i++) {
            point_arr = point_arr + "{" + Integer.toString(X[i]) + ";" + Integer.toString(Y[i]) + "} ";
        }
        return point_arr;
    }
}
