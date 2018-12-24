package ua.lviv.lgs;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		if (str.length() == 5) {
			StringBuffer sb = new StringBuffer(str);
			if (str.contains(sb.reverse())) {
				System.out.println("¬ведене слово Ї пал≥ндромом");
			} else {
				System.out.println("¬ведене слово не Ї пал≥ндромом");
			}
		} else {
			System.out.println("¬ведене слово складаЇтьс€ не з 5 букв");
		}

	}

}
