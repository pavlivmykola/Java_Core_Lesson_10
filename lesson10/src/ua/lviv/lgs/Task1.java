package ua.lviv.lgs;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		if (str.length() == 5) {
			StringBuffer sb = new StringBuffer(str);
			if (str.contains(sb.reverse())) {
				System.out.println("������� ����� � ����������");
			} else {
				System.out.println("������� ����� �� � ����������");
			}
		} else {
			System.out.println("������� ����� ���������� �� � 5 ����");
		}

	}

}
