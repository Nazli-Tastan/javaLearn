package HalukJava.j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("bir ifade griniz");
		String ifade = sc.nextLine();
		int count = 0;
		for (int i = 0; 1 < ifade.length(); i++) {

			if (ifade.charAt(i) >= '0' && ifade.charAt(i) <= 9) {

			}

			System.out.println("Girdiğiniz stringdeki rakam sayısı:" + count);


		}


	}
}