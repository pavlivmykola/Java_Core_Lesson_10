package ua.lviv.lgs;

public class Task2 {

	public static void main(String[] args) {
		String s1="замініть всі голосні букви в тексті на тире ";
		String s2 = s1.replace("у", "-");
		String s3 = s2.replace("е", "-");
		String s4 = s3.replace("ї", "-");
		String s5 = s4.replace("і", "-");
		String s6 = s5.replace("а", "-");
		String s7 = s6.replace("о", "-");
		String s8 = s7.replace("є", "-");
		String s9 = s8.replace("я", "-");
		String s10 = s9.replace("и", "-");
		String s11 = s10.replace("ю", "-");
		System.out.println(s11);

	}

}
