package ua.lviv.lgs;

import java.util.Arrays;

public class task3 {

	public static void main(String[] args) {
		
		
		
		String str1 = "Порахувати кількість слів у реченні.";
		String s1[] = str1.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println("У реченні "+s1.length+" слів");

		
		
		
		String str2 = "Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем, "
				+ "паліндромом (приклади: «пилип», «ротор»). Якщо введено слово не з 5 букв, то "
				+ "повідомляти про помилку. Програма повинна нормально обробляти слово, навіть якщо в" + 
				"ньому використані символи різного регістра. Наприклад, слова «Комок» або «РОТОР» слід також вважати паліндромами.";
		String s2[] = str2.split("\\.");
		System.out.println(Arrays.toString(s2));
		System.out.println("У тексті "+s2.length+" речень");
		
		
		String str3 = str1.replace(".", "");
		String str4 = str3.replace(",", "");
		String str5 = str4.replace("«", "");
		String str6 = str5.replace("»", "");
		
		String s3[] = str6.split(" ");
		System.out.println(Arrays.toString(s3));
		String s4[] = str6.split(" ");
		String word="";
		String maxWord="";
		int number=0;
		int maxNumber=0;
		
		for (String str7:s3) {
			word=str7.toString();
			number=0;
			for (String str8:s4) {
				if (word.contains(str8.toString())) {
					number++;
				}
			}
			if (number>maxNumber) {
				maxNumber=number;
				maxWord=word;
			}
		}
		
		System.out.println("Найчастіше зустрічається: "+maxWord);
		

	
		String str7 = str2.replace(".", "");
		String str8 = str7.replace(",", "");
		String str9 = str8.replace("«", "");
		String str10 = str9.replace("»", "");
		
		String s5[] = str10.split(" ");
		System.out.println(Arrays.toString(s5));
		String s6[] = str10.split(" ");
		word="";
		maxWord="";
		number=0;
		maxNumber=0;

		
		
		for (String str11:s5) {
			word=str11.toString();
			number=0;
			for (String str12:s6) {
				if (word.contains(str12.toString())) {
					number++;
				}
			}
			if (number>maxNumber) {
				maxNumber=number;
				maxWord=word;
			}
		}
		
		System.out.println("Найчастіше зустрічається: "+maxWord);
	
	}

}
