package co.simplon.algo;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre");
		int str = sc.nextInt();
		System.out.println(signeNombre(str));
		sc.close();		
	}
	public static String signeNombre(int nb) {
		String result="";
		
		if (nb>0) {
			result="Ce nombre est positif";}
			
		else if (nb<0) {
			result="Ce nombre est negatif";
			}
		else {
			result="Ce nombre est nul";
				}
		return result;
		
	}
}
