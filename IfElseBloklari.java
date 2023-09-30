package Temel_Kavramlar;


import java.util.Scanner;
public class IfElseBloklari {

	public static void main(String[] args) {
		// iki sayıyı karşılaştıran program
		Scanner scan = new Scanner(System.in);
		
		int s1;
		int s2;
		System.out.println("Birinci sayıyı giriniz: ");
		s1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		s2 = scan.nextInt();
		
		
		if(s1 > s2) {
			System.out.println(s1 + " büyüktür " + s2 + " sayısından ");
		}
		else if(s1 < s2) {
			System.out.println(s1 + " küçüktür " + s2 + " sayısından ");
		}
		else {
			System.out.println(s1 + " eşittir " + s2);
		}
	}

}
