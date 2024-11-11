package ru.Driamin.Main;

import ru.Driamin.Figure.CircleShape4_4;
import ru.Driamin.Figure.RectangleShape4_4;
import ru.Driamin.Figure.SquareShape4_4;
import ru.Driamin.Figure.TriangleShape4_4;
import ru.Driamin.Line.BrokenLine1_3;
import ru.Driamin.Line.ClosedPolyline3_2;
import ru.Driamin.Line.ComparisonPolylines6_4;
import ru.Driamin.Line.CloningPoint8_4;
import ru.Driamin.Figure.Square1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|=== лабораторная работа № 3 === 11 заданий =======================|");
        System.out.println("|Для выбора нужной задачи введите номер следующим образом: сначало |");
        System.out.println("|пишется номер задания ( 1, 2, 3 или 4 ), затем точка, после этого |");
        System.out.println("|идет номер задачи (четные номера). Пример: 1.6                    |");
        System.out.println("|==================================================================|");
        System.out.print("введите номер задания: ");
        String example_number = in.nextLine();
        switch (example_number) {
            case "1.3":
                System.out.print("Введите координату X точки левого вехнего угла квадрата: ");
                int pointX = in.nextInt();
                System.out.print("Введите координату Y точки левого вехнего угла квадрата: ");
                int pointY = in.nextInt();
                System.out.print("Введите длину стороны квадрата: ");
                int len_sq = in.nextInt();
                if (len_sq <= 0) {
                    System.out.print("Некоректные входные данные");
                    break;
                }
                Square1_3 a1_3 = new Square1_3(pointX, pointY, len_sq);
                System.out.println(a1_3.toString());
                a1_3.makeBrokenLine(); break;
            case "2.4":

            case "3.2":
                System.out.print("Введите количество точек: ");
                int np = in.nextInt();
                int[] arr_of_X;
                int[] arr_of_Y;
                arr_of_X = new int[np];
                arr_of_Y = new int[np];
                int p = 0;
                for (int i = 0; i < np; i++) {
                    System.out.print("Введите координату X: ");
                    p = in.nextInt();
                    arr_of_X[i] = p;
                    System.out.print("Введите координату Y: ");
                    p = in.nextInt();
                    arr_of_Y[i] = p;
                }
                ClosedPolyline3_2 b3_2 = new ClosedPolyline3_2(arr_of_X, arr_of_Y);
                System.out.println(b3_2.lenBrokenLine()); break;
            case "4.4":
                System.out.print("введите название фигуры(окружность, квадрат, прямоугольник, треугольник): ");
                String figure = in.nextLine();
                switch (figure) {
                    case "окружность":
                        System.out.print("Введите координату X точки центра окружности: ");
                        int X4_4a = in.nextInt();
                        System.out.print("Введите координату Y точки центра окружности: ");
                        int Y4_4a = in.nextInt();
                        System.out.print("Введите радиус окружности: ");
                        int len4_4a = in.nextInt();
                        CircleShape4_4 a4_4 = new CircleShape4_4(X4_4a, Y4_4a, len4_4a);
                        System.out.println(a4_4.toString());
                        System.out.println(a4_4.square()); break;
                    case "квадрат":
                        System.out.print("Введите координату X точки левого вехнего угла квадрата: ");
                        int X4_4b = in.nextInt();
                        System.out.print("Введите координату Y точки левого вехнего угла квадрата: ");
                        int Y4_4b = in.nextInt();
                        System.out.print("Введите длину стороны квадрата: ");
                        int len4_4b = in.nextInt();
                        SquareShape4_4 b4_4 = new SquareShape4_4(X4_4b, Y4_4b, len4_4b);
                        System.out.println(b4_4.toString());
                        System.out.println(b4_4.square()); break;
                    case "прямоугольник":
                        System.out.print("Введите координату X точки левого вехнего угла квадрата: ");
                        int X4_4c = in.nextInt();
                        System.out.print("Введите координату Y точки левого вехнего угла квадрата: ");
                        int Y4_4c = in.nextInt();
                        System.out.print("Введите длину первой стороны квадрата: ");
                        int len14_4c = in.nextInt();
                        System.out.print("Введите длину второй стороны квадрата: ");
                        int len24_4c = in.nextInt();
                        RectangleShape4_4 c4_4 = new RectangleShape4_4(X4_4c, Y4_4c, len14_4c, len24_4c);
                        System.out.println(c4_4.toString());
                        System.out.println(c4_4.square()); break;
                    case "треугольник":
                        System.out.print("Введите координату X первой точки треугольника: ");
                        int X14_4d = in.nextInt();
                        System.out.print("Введите координату Y первой точки треугольника: ");
                        int Y14_4d = in.nextInt();
                        System.out.print("Введите координату X второй точки треугольника: ");
                        int X24_4d = in.nextInt();
                        System.out.print("Введите координату Y второй точки треугольника: ");
                        int Y24_4d = in.nextInt();
                        System.out.print("Введите координату X третьей точки треугольника: ");
                        int X34_4d = in.nextInt();
                        System.out.print("Введите координату Y третьей точки треугольника: ");
                        int Y34_4d = in.nextInt();
                        TriangleShape4_4 d4_4 = new TriangleShape4_4(X14_4d, Y14_4d, X24_4d, Y24_4d, X34_4d, Y34_4d);
                        System.out.println(d4_4.toString());
                        System.out.println(d4_4.square()); break;
                } break;
            case "5.5":
                BrokenLine1_3 b5_5 = new BrokenLine1_3(new String[]{"{7;-2}", "{11;-2}", "{14;-6}"}, new int[]{7, 11, 14}, new int[]{-2, -2, -6});
                ClosedPolyline3_2 a5_5 = new ClosedPolyline3_2(new int[]{3, 6, 6, 3}, new int[]{-5, -5, -8, -8});
                System.out.println(LengthMeasurement(new int[]{3, 6, 6, 3}, new int[]{-5, -5, -8, -8}, true, new int[]{7, 11, 14}, new int[]{-2, -2, -6}, false)); break;
            case "5.7":

            case "6.4":
                System.out.print("Введите количество точек первой ломаной: ");
                int np_1 = in.nextInt();
                int[] arr_of_X_1;
                int[] arr_of_Y_1;
                arr_of_X_1 = new int[np_1];
                arr_of_Y_1 = new int[np_1];
                int p_1 = 0;
                for (int i = 0; i < np_1; i++) {
                    System.out.print("Введите координату X первой ломаной: ");
                    p_1 = in.nextInt();
                    arr_of_X_1[i] = p_1;
                    System.out.print("Введите координату Y первой ломаной: ");
                    p_1 = in.nextInt();
                    arr_of_Y_1[i] = p_1;
                }
                ComparisonPolylines6_4 a6_4a = new ComparisonPolylines6_4(arr_of_X_1, arr_of_Y_1);
                System.out.print("Введите количество точек второй ломаной: ");
                int np_2 = in.nextInt();
                int[] arr_of_X_2;
                int[] arr_of_Y_2;
                arr_of_X_2 = new int[np_2];
                arr_of_Y_2 = new int[np_2];
                int p_2 = 0;
                for (int i = 0; i < np_1; i++) {
                    System.out.print("Введите координату X второй ломаной: ");
                    p_2 = in.nextInt();
                    arr_of_X_2[i] = p_2;
                    System.out.print("Введите координату Y второй ломаной: ");
                    p_2 = in.nextInt();
                    arr_of_Y_2[i] = p_2;
                }
                ComparisonPolylines6_4 a6_4b = new ComparisonPolylines6_4(arr_of_X_2, arr_of_Y_2);
                System.out.print(a6_4a.equality(a6_4a, a6_4b)); break;
            case "7.3":
                System.out.print("Введите число: ");
                String x7_3 = in.nextLine();
                System.out.print("Введите степень: ");
                String y7_3 = in.nextLine();
                System.out.print(Exponentiation7_3 (x7_3, y7_3)); break;
            case "8.4":
                System.out.print("Введите координату X точки: ");
                int x8_4 = in.nextInt();
                System.out.print("Введите координату Y точки: ");
                int y8_4 = in.nextInt();
                CloningPoint8_4 a8_4 = new CloningPoint8_4(x8_4, y8_4);
                System.out.println(a8_4.toString());
                System.out.println(a8_4.Clone()); break;
        }
    }

    public static String Exponentiation7_3 (String x, String y) { // 1.2
        double X = Integer.parseInt(x);
        double Y = Integer.parseInt(x);
        return "Результат возведения в степень: " + Double.toString(Math.pow(X, Y));
    }

    public static String LengthMeasurement (int[] X1, int[] Y1, boolean isIsolation1, int[] X2, int[] Y2, boolean isIsolation2) {
        double l1 = 0;
        for (int i = 0; i < X1.length; i++) {
            int j = i + 1;
            if (isIsolation1 == true && j == X1.length) {
                j = 0;
            }
            if ((X1[i] != X1[j] && Y1[i] == Y1[j]) || (X1[i] == X1[j] && Y1[i] != Y1[j])) {
                if (X1[i] != X1[j] && Y1[i] == Y1[j]) {
                    l1 = l1 + Math.abs(X1[i] - X1[j]);
                }
                if (X1[i] == X1[j] && Y1[i] != Y1[j]) {
                    l1 = l1 + Math.abs(Y1[i] - Y1[j]);
                }
            } else {
                l1 = l1 + Math.sqrt(Math.pow(Math.abs(Y1[i] - Y1[j]), 2) + Math.pow(Math.abs(X1[i] - X1[j]), 2));
            }
            if (isIsolation1 == false && i == X1.length - 2) {
                i++;
            }
        }
        double l2 = 0;
        for (int i = 0; i < X2.length; i++) {
            int j = i + 1;
            if (isIsolation2 == true && j == X2.length) {
                j = 0;
            }
            if ((X2[i] != X2[j] && Y2[i] == Y2[j]) || (X2[i] == X2[j] && Y2[i] != Y2[j])) {
                if (X2[i] != X2[j] && Y2[i] == Y2[j]) {
                    l2 = l2 + Math.abs(X2[i] - X2[j]);
                }
                if (X2[i] == X2[j] && Y2[i] != Y2[j]) {
                    l2 = l2 + Math.abs(Y2[i] - Y2[j]);
                }
            } else {
                l2 = l2 + Math.sqrt(Math.pow(Math.abs(Y2[i] - Y2[j]), 2) + Math.pow(Math.abs(X2[i] - X2[j]), 2));
            }
            if (isIsolation2 == false && i == X2.length - 2) {
                i++;
            }
        }
        return "суммарная длина объектов: " + Double.toString(l1 + l2);
    }
}