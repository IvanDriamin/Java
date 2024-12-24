import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|=== лабораторная работа № 5 === 8 заданий ========================|");
        System.out.println("|Для выбора нужной задачи введите номер следующим образом: сначало |");
        System.out.println("|пишется номер задания ( 1, 2, 3 или 4 ), затем точка, после этого |");
        System.out.println("|идет номер задачи (четные номера). Пример: 1.6                    |");
        System.out.println("|==================================================================|");
        System.out.print("введите номер задания: ");
        String example_number = in.nextLine();


        //сделать интерфейс, шаблон и внутри шаблона сделать кэширование(перовод дроби в десятичный вид), подсчет мяуканья


        switch (example_number) {
            case "1.1":
                Fraction<Integer> frac1 = new Fraction<>(1, 2);
                System.out.println(frac1);
                System.out.println(frac1.getDoubleValue());

                Fraction<Integer> frac2 = new Fraction<>(-3, 4);
                System.out.println(frac2);
                System.out.println(frac2.getDoubleValue()); break;
            case "2.1":
                Cat cat = new Cat("Barsik");
                System.out.println(cat); // кот: Barsik
                List<Cat> cats = List.of(cat);

                MeowNum.makeAllMeow(cats); // Barsik: мяу!
                System.out.println("Количество мяуканий кота " + cat.getMeowCount());

                MeowNum.makeAllMeow(cats); // Barsik: мяу!
                MeowNum.makeAllMeow(cats); // Barsik: мяу!
                System.out.println("Количество мяуканий кота " + cat.getMeowCount()); break;
            case "3.10":
                List3_10 a3_10 = new List3_10();
                List<Integer> n = List.of(1, 2, 2, 3, 4, 4, 5, 1);
                List<Integer> uniqueNumbers = a3_10.listT(n);
                System.out.println("Входные данные: " + n);
                System.out.println("В списке: " + uniqueNumbers);

                List<String> s = List.of("apple", "banana", "apple", "orange", "banana", "grape");
                List<String> uniqueStrings = a3_10.listT(s);
                System.out.println("Входные данные: " + s);
                System.out.println("В списке: " + uniqueStrings); break;
            case "5.10":
                Set5_10 a5_10 = new Set5_10();
                String filePath = "C:\\Users\\ivand\\OneDrive\\Рабочий стол\\input.txt";
                try {
                    Set<Character> uniqueChars = a5_10.SetT(filePath);
                    System.out.println("Уникальные символы: " + uniqueChars);
                } catch (IOException e) {
                    System.err.println("Ошибка чтения файла: " + e.getMessage());
                } break;
            case "6.5":
                Queue6_5 a6_5 = new Queue6_5();
                List<Integer> n2_1 = List.of(1, 2, 3, 4, 5);
                Queue<Integer> n2 = new LinkedList<>(n2_1);
                Queue<Integer> reversedNumbers = a6_5.QueueT(n2);
                System.out.println("Входные данные: " + n2_1);
                System.out.println("Перевернутая очередь: " + reversedNumbers);

                List<String> s2_1 = List.of("a", "b", "c", "d", "e");
                Queue<String> s2 = new LinkedList<>(s2_1);
                Queue<String> reversedStrings = a6_5.QueueT(s2);
                System.out.println("Входные данные: " + s2_1);
                System.out.println("Перевернутая очередь: " + reversedStrings); break;
        }
    }
}