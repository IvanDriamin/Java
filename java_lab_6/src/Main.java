import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|=== лабораторная работа № 6 === 9 заданий ========================|");
        System.out.println("|Для выбора нужной задачи введите номер следующим образом: сначало |");
        System.out.println("|пишется номер задания ( 1, 2, 3 или 4 ), затем точка, после этого |");
        System.out.println("|идет номер задачи (четные номера). Пример: 1.6                    |");
        System.out.println("|==================================================================|");
        System.out.print("введите номер задания: ");
        String example_number = in.nextLine();
        switch (example_number) {
            case "1.1":
                B1_1 a1_1 = new B1_1();
                System.out.println(a1_1.toString()); break;
            case "2.1":
                AC2 a2_1 = new AC2();
                a2_1.Inv(); break;
            case "2.2":
                AC2 a2_2 = new AC2();
                a2_2.set2("Max", 5);
                System.out.println(a2_2.Def()); break;
            case "2.3":
                AC3 a2_3 = new AC3();
                System.out.println(a2_3.toStr()); break;
            case "2.4":
                AC3 a2_4 = new AC3();
                System.out.println(a2_4.toStr()); break;
            case "2.5":
                AC4 a2_5 = new AC4("", 0);
                System.out.println(a2_5.toString()); break;
            case "2.6":
                AC5 a2_6 = new AC5("john", 20, "London"); break;
            case "3.1":

            case "4.1":

        }
    }
}