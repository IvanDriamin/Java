import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|=== лабораторная работа № 4 === 7 заданий ========================|");
        System.out.println("|Для выбора нужной задачи введите номер следующим образом: сначало |");
        System.out.println("|пишется номер задания ( 1, 2, 3 или 4 ), затем точка, после этого |");
        System.out.println("|идет номер задачи (четные номера). Пример: 1.6                    |");
        System.out.println("|==================================================================|");
        System.out.print("введите номер задания: ");
        String example_number = in.nextLine();
        switch (example_number) {
            case "1.1":
                Box1_1 a1_1 = new Box1_1(3);
                System.out.println(a1_1.isFull());
                System.out.println(a1_1.toString());
                System.out.println(a1_1.add(2));
                a1_1.delFromBox();
                System.out.println(a1_1.isFull());
                System.out.println(a1_1.add(2));
                System.out.println(a1_1.toString()); break;
            case "1.2":
                Storage1_2 a1_2 = new Storage1_2<>(null, 0);
                System.out.println(a1_2.toString());
                System.out.println(a1_2.get());
                Storage1_2 b1_2 = new Storage1_2<>(99, -1);
                System.out.println(b1_2.toString());
                System.out.println(b1_2.get());
                Storage1_2 c1_2 = new Storage1_2<>(null, "default");
                System.out.println(c1_2.toString());
                System.out.println(c1_2.get());
                Storage1_2 d1_2 = new Storage1_2<>("hello", "hello world");
                System.out.println(d1_2.toString());
                System.out.println(d1_2.get()); break;
            case "2.2":
                System.out.print("введите количество коробок: ");
                int e = in.nextInt();
                if (e <= 0) {
                    System.out.print("Некоректные входные данные");
                    break;
                }
                List<Box1_1<Double>> a2_2 = new ArrayList<>();
                for (int i = 0; i < e; i++) {
                    System.out.print("Введите значение коробки: ");
                    double a = in.nextDouble();
                    Box1_1 b1 = new Box1_1(a);
                    a2_2.add(b1);
                }
                double max = obj.searchMax2_2(a2_2);
                System.out.println("Наибольшее значение из всех коробок: " + max); break;
            case "3.1":
                List<String> a3_1 = List.of("qwerty", "asdfg", "zx");
                List<Integer> b3_1 = Applay3_1.func3_1(a3_1, String::length);
                System.out.println("Длина строк: " + b3_1);

                List<Integer> c3_1 = List.of(1, -3, 7);
                List<Integer> d3_1 = Applay3_1.func3_1(c3_1, x -> x < 0 ? -x : x);
                System.out.println("Положительные числа: " + d3_1);

                List<int[]> e3_1 = List.of(new int[]{1, 5, 2}, new int[]{8, 3, 9}, new int[]{-1, 0, 5});
                List<Integer> f3_1 = Applay3_1.func3_1(e3_1, arr -> {
                    int m = Integer.MIN_VALUE;
                    for (int i : arr) {
                        if (i > m) {
                            m = i;
                        }
                    }
                    return m;
                });
                System.out.println("Максимальные значения: " + f3_1); break;
            case "3.4":

        }
    }

    public <T extends Double> double searchMax2_2(List<Box1_1<T>> a) {
        double max = 0;
        for (Box1_1<T> b1 : a) {
            double x = b1.getBox();
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}