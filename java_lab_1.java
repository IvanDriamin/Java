package first;

import java.util.Scanner;
import java.util.Arrays;

public class java_lab_1 {
	public static void main(String[] args) {
		java_lab_1 obj = new java_lab_1();
		Scanner in = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("=== лабораторная работа № 1 === 20 заданий =======================|");
		System.out.println("Для выбора нужной задачи введите номер следующим образом: сначало |");
		System.out.println("пишется номер задания ( 1, 2, 3 или 4 ), затем точка, после этого |");
		System.out.println("идет номер задачи (четные номера). Пример: 1.6                    |");
		System.out.println("==================================================================|");
		System.out.print("введите номер задания: ");
		String example_number = in.nextLine();
		switch (example_number) {
			case "1.2":
				System.out.print("введите число, которое больше или равно 10: ");
				int x1_2 = in.nextInt();
				System.out.print(obj.sumLastNums (x1_2)); break;
			case "1.4":
				System.out.print("введите число x: ");
				int x1_4 = in.nextInt();
				System.out.print(obj.isPositive (x1_4)); break;
			case "1.6":
				System.out.print("введите один символ: ");
				char x1_6 = in.next().charAt(0);
				System.out.print(obj.isUpperCase(x1_6)); break;
			case "1.8":
				System.out.print("введите число a: ");
				int x1_8 = in.nextInt();
				System.out.print("введите число b: ");
				int y1_8 = in.nextInt();
				System.out.print(obj.isDivisor (x1_8, y1_8)); break;
			case "1.10":
				System.out.print("введите число a: ");
				int x1_10 = in.nextInt();
				System.out.print("введите число b: ");
				int y1_10 = in.nextInt();
				System.out.print(obj.lastNumSum(x1_10, y1_10)); break;
			case "2.2":
				System.out.print("введите число a: ");
				int x2_2 = in.nextInt();
				System.out.print("введите число b: ");
				int y2_2 = in.nextInt();
				System.out.print(obj.safeDiv (x2_2, y2_2)); break;
			case "2.4":
				System.out.print("введите число a: ");
				int x2_4 = in.nextInt();
				System.out.print("введите число b: ");
				int y2_4 = in.nextInt();
				System.out.print(obj.makeDecision(x2_4, y2_4)); break;
			case "2.6":
				System.out.print("введите число a: ");
				int x2_6 = in.nextInt();
				System.out.print("введите число b: ");
				int y2_6 = in.nextInt();
				System.out.print("введите число c: ");
				int z2_6 = in.nextInt();
				System.out.print(obj.sum3(x2_6, y2_6, z2_6)); break;
			case "2.8":
				System.out.print("введите число a: ");
				int x2_8 = in.nextInt();
				System.out.print(obj.age(x2_8)); break;
			case "2.10":
				System.out.print("введите день недели с маленькой буквы: ");
				String x2_10 = in.nextLine();
				obj.printDays (x2_10); break;
			case "3.2":
				System.out.print("введите число: ");
				int x3_2 = in.nextInt();
				System.out.print(obj.reverseListNums(x3_2)); break;
			case "3.4":
				System.out.print("введите число: ");
				int x3_4 = in.nextInt();
				System.out.print("введите степень: ");
				int y3_4 = in.nextInt();
				System.out.print(obj.pow(x3_4, y3_4)); break;
			case "3.6":
				System.out.print("введите число: ");
				int x3_6 = in.nextInt();
				System.out.print(obj.equalNum (x3_6)); break;
			case "3.8":
				System.out.print("введите число звезд: ");
				int x3_8 = in.nextInt();
				obj.leftTriangle (x3_8); break;
			case "3.10":
				obj.guessGame(); break;
			case "4.2":
				System.out.print("введите число x: ");
				int x4_2 = in.nextInt();
				System.out.print("введите длину массива: ");
				int len = in.nextInt();
				int[] arr4_2 = new int[len];
				for (int i = 0; i < len; i++) {
					System.out.print("введите элемент массива: ");
					arr4_2[i] = in.nextInt();
				}
				System.out.print(obj.findLast(arr4_2, x4_2)); break;
			case "4.4":
				System.out.print("введите число x: ");
				int x4_4 = in.nextInt();
				System.out.print("введите позицию числа x: ");
				int pos = in.nextInt();
				System.out.print("введите длину массива: ");
				int len4_4 = in.nextInt();
				int[] arr4_4 = new int[len4_4];
				for (int i = 0; i < len4_4; i++) {
					System.out.print("введите элемент массива: ");
					arr4_4[i] = in.nextInt();
				}
				obj.add(arr4_4, x4_4, pos); break;
			case "4.6":
				System.out.print("введите длину массива: ");
				int len4_6 = in.nextInt();
				int[] arr4_6 = new int[len4_6];
				for (int i = 0; i < len4_6; i++) {
					System.out.print("введите элемент массива: ");
					arr4_6[i] = in.nextInt();
				}
				obj.reverse (arr4_6); break;
			case "4.8":
				System.out.print("введите длину массива a: ");
				int len4_8a = in.nextInt();
				int[] arr4_8a = new int[len4_8a];
				for (int i = 0; i < len4_8a; i++) {
					System.out.print("введите элемент массива a: ");
					arr4_8a[i] = in.nextInt();
				}
				System.out.print("введите длину массива b: ");
				int len4_8b = in.nextInt();
				int[] arr4_8b = new int[len4_8b];
				for (int i = 0; i < len4_8b; i++) {
					System.out.print("введите элемент массива b: ");
					arr4_8b[i] = in.nextInt();
				}
				obj.concat (arr4_8a, arr4_8b); break;
			case "4.10":
				System.out.print("введите длину массива: ");
				int len4_10 = in.nextInt();
				int[] arr4_10 = new int[len4_10];
				for (int i = 0; i < len4_10; i++) {
					System.out.print("введите элемент массива: ");
					arr4_10[i] = in.nextInt();
				}
				obj.deleteNegative (arr4_10); break;
		}
    }
	//----------------------------------------------------------------------------------------
	
	public int sumLastNums (int x) { // 1.2
		int num1 = x % 10;
		int num2 = x % 100;
		int num3 = num2 / 10;
		return num1 + num3;
	}
	
	
	public boolean isPositive (int x) { // 1.4
		if (x > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	 public boolean isUpperCase (char x) { // 1.6
		 char [] mass = new char[26];
		 String str = "QWERTYUIOPASDFGHJKLZXCVBNM";
		 mass = str.toCharArray();
		 boolean f = false;
		 for (int i = 0; i < 26; i++) {
			 if (mass[i] == x) {
				 f = true;
			 }
		 }
		 if (f == true) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 
	 public boolean isDivisor (int a, int b) { // 1.8
		 if (a % b == 0 || b % a == 0) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 
	 public int lastNumSum(int a, int b) { // 1.10
		 Scanner in = new Scanner(System.in);
		 for (int i = 0; i < 4; i++) {
			 if (i != 0) {
				 if (i == 1) {
					 System.out.println("Введите число b ещё 3 раза");
				 }
				 System.out.print("Введите число b: ");
				 b = in.nextInt();
			 }
			 int num1 = a % 10;
			 int num2 = b % 10;
			 int sum = num1 + num2;
			 if (i != 3) {
				 System.out.print(" это ");
				 System.out.println(sum);
			 } else {
				 System.out.print("итог: ");
			 }
			 a = sum;
		 }
		 return a;
	 }
	 
	 
	 public double safeDiv (int x, int y) { // 2.2
		 if (y == 0) {
			 return 0;
		 } else {
			 double xd = x;
			 double yd = y;
			 return xd / yd;
		 }
	 }

	 
	 public String makeDecision (int x, int y) { // 2.4
		 String s = Integer.toString(x);
		 if (x < y) {
			 s = s + " < " + Integer.toString(y);
		 }
		 if (x == y) {
			 s = s + " == " + Integer.toString(y);
		 }
		 if (x > y) {
			 s = s + " > " + Integer.toString(y);
		 }
		 return s;
	 }

	 
	 public boolean sum3 (int x, int y, int z) { // 2.6
		 if (x + y == z || x + z == y || z + y == x) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 
	 public String age (int x) { // 2.8
		 String s = Integer.toString(x);
		 if (x % 10 == 1 && x != 11) {
			 s = s + " год";
		 } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && x != 12 && x != 13 && x != 14) {
			 s = s + " года";
		 } else {
			 s = s + " лет";
		 }
		 return s;
	 }

	 
	 public void printDays (String x) { // 2.10
		 switch(x) {
		 case "понедельник":
			 System.out.println("понедельник");
			 System.out.println("вторник");
			 System.out.println("среда");
			 System.out.println("четверг");
			 System.out.println("пятница");
			 System.out.println("суббота");
			 System.out.println("воскресенье"); break;
		 case "вторник":
			 System.out.println("вторник");
			 System.out.println("среда");
			 System.out.println("четверг");
			 System.out.println("пятница");
			 System.out.println("суббота");
			 System.out.println("воскресенье"); break;
		 case "среда":
			 System.out.println("среда");
			 System.out.println("четверг");
			 System.out.println("пятница");
			 System.out.println("суббота");
			 System.out.println("воскресенье"); break;
		 case "четверг":
			 System.out.println("четверг");
			 System.out.println("пятница");
			 System.out.println("суббота");
			 System.out.println("воскресенье"); break;
		 case "пятница":
			 System.out.println("пятница");
			 System.out.println("суббота");
			 System.out.println("воскресенье"); break;
		 case "суббота":
			 System.out.println("суббота");
			 System.out.println("воскресенье"); break;
		 case "воскресенье":
			 System.out.println("воскресенье"); break;
		 default:
			 System.out.println("это не день недели"); break;
		 }
			 
	 }
	 
	 
	 public String reverseListNums (int x) { // 3.2
		 String s = "";
		 for (int i = x; i >= 0; i--) {
			 s = s + Integer.toString(i) + " ";
		 }
		 return s;
	 }
	 
	 
	 public int pow (int x, int y) { // 3.4
		 int x1 = x;
		 for (int i = 1; i < y; i++) {
			 x = x * x1;
		 }
		 return x;
	 }
	 
	 
	 public boolean equalNum (int x) { // 3.6
		 int p = x % 10;
		 for (int i = 0; x != 0; i++) {
			 if (x % 10 != p) {
				 return false;
			 }
			 x = x / 10;
		 }
		 return true;
	 }
	 
	 
	 public void leftTriangle (int x) { // 3.8
		 String s = "*";
		 for (int i = 0; i < x; i++) {
			 s = s + "*";
		 }
	 }

	 
	 public void guessGame() { // 3.10
		 Scanner in = new Scanner(System.in);
		 int t = 1;
		 while (true) {
			 int r = (int) (Math.random() * 10) + 1;
			 System.out.print("угадайте число от 0 до 10: ");
			 int x = in.nextInt();
			 if (r == x) {
				 System.out.print("Вам потребовалось попыток: ");
				 System.out.print(t);
				 break;
			 }
			 t++;
		 }
	 }
	 
	 
	 public int findLast (int[] arr, int x) { // 4.2
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] == x) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 
	 public int[] add (int[] arr, int x, int pos) { // 4.4
		 int[] arr2 = new int[arr.length + 1];
		 for (int i = 0; i < arr.length; i++) {
			 arr2[i] = arr[i];
		 }
		 int p = arr2[pos];
		 arr2[pos] = x;
		 arr2[arr2.length - 1] = p;
		 System.out.println(Arrays.toString(arr2));
		 return arr2;
	 }
	 
	 
	 public void reverse (int[] arr) { // 4.6
		 int[] arr2 = new int[arr.length];
		 for (int i = 0; i < arr.length; i++) {
			 arr2[i] = arr[arr.length - i - 1];
		 }
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = arr2[i];
		 }
		 System.out.println(Arrays.toString(arr));
	 }
	 
	 
	 public int[] concat (int[] arr1, int[] arr2) { // 4.8
		 int[] arr3 = new int[arr1.length + arr2.length];
		 for (int i = 0; i < arr1.length; i++) {
			 arr3[i] = arr1[i];
		 }
		 for (int i = 0; i < arr2.length; i++) {
			 arr3[i + arr1.length] = arr2[i];
		 }
		 System.out.println(Arrays.toString(arr3));
		 return arr3;
	 }
	 
	 
	 public int[] deleteNegative (int[] arr) { // 4.10
		 int t = 0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] < 0) {
				 t++;
			 }
		 }
		 int[] arr2 = new int[arr.length - t];
		 int j = 0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] > 0) {
				 arr2[j] = arr[i];
				 j++;
			 }
		 }
		 System.out.println(Arrays.toString(arr2));
		 return arr2;
	 }
}
