import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|=== лабораторная работа № 2 === 6 заданий ========================|");
        System.out.println("|Для выбора нужной задачи введите номер следующим образом: сначало |");
        System.out.println("|пишется номер задания ( 1, 2, 3 или 4 ), затем точка, после этого |");
        System.out.println("|идет номер задачи (четные номера). Пример: 1.6                    |");
        System.out.println("|==================================================================|");
        System.out.print("введите номер задания: ");
        String example_number = in.nextLine();
        switch (example_number) {
            case "1.3":
                Name a1_3 = new Name();
                a1_3.setName("Пушкин", "Александр", "Сергеевич");
                System.out.println(a1_3.getName());
                Name b1_3 = new Name();
                b1_3.setName("Маяковский", "Владимир", "");
                System.out.println(b1_3.getName());
                Name c1_3 = new Name();
                c1_3.setName("Клеопатра", "", "");
                System.out.println(c1_3.getName()); break;
            case "2.2":
                Man_with_name c2_2 = new Man_with_name();
                c2_2.setMan_with_name("Клеопатра", "", "", 152);
                System.out.println(c2_2.getMan_with_name());
                Man_with_name a2_2 = new Man_with_name();
                a2_2.setMan_with_name("Пушкин", "Александр", "Сергеевич", 167);
                System.out.println(a2_2.getMan_with_name());
                Man_with_name b2_2 = new Man_with_name();
                b2_2.setMan_with_name("Маяковский", "Владимир", "", 189);
                System.out.println(b2_2.getMan_with_name()); break;
            case "2.3":
                Man_with_parent a2_3 = new Man_with_parent();
                a2_3.setMan_with_parent("Чудов", "Иван", "", 188, null);
                System.out.println(a2_3.getMan_with_parent());
                Man_with_parent b2_3 = new Man_with_parent();
                b2_3.setMan_with_parent("Чудов", "Петр", "", 191, a2_3);
                System.out.println(b2_3.getMan_with_parent());
                Man_with_parent с2_3 = new Man_with_parent();
                с2_3.setMan_with_parent("Чудов", "Борис", "", 189, b2_3);
                System.out.println(с2_3.getMan_with_parent()); break;
            case "3.2":
                Broken_line a3_2 = new Broken_line();
                a3_2.setBroken_line(new String[]{"{1;5}", "{2;8}", "{5;3}"});
                System.out.println(a3_2.getBroken_line());
                Broken_line b3_2 = new Broken_line();
                b3_2.setBroken_line(new String[]{"{1;5}", "{2;-5}", "{4;-8}", "{5;3}"});
                System.out.println(b3_2.getBroken_line());
                a3_2.setBroken_line(new String[]{"{2;8}", "{5;3}"});
                System.out.println(a3_2.getBroken_line());
                b3_2.setBroken_line(new String[]{"{2;-5}", "{4;-8}", "{5;3}"});
                System.out.println(b3_2.getBroken_line()); break;
            case "4.9":
                System.out.print("Введите количество точек в кривой: ");
                String num = in.nextLine();
                Make_broken_line a4_9 = new Make_broken_line();
                if (num != "") {
                    int st = Integer.parseInt(num);
                    System.out.println("Точки вводятся следующим образом: {1;2}");
                    String[] arr_point = new String[st];
                    for (int i = 0; i < st; i++) {
                        System.out.print("Введите точку: ");
                        String point = in.nextLine();
                        arr_point[i] = point;
                    }
                    a4_9.setMake_broken_line(arr_point);
                } else {
                    a4_9.setMake_broken_line(null);
                }
                System.out.println(a4_9.getMake_broken_line()); break;
            case "5.7":

        }
    }
}