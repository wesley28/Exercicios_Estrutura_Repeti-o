package estrutura_controle;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char res1,res2,res3,res4,res5;
		int con=0;
		
		System.out.println("Responda com sim ou n�o");
		System.out.print("Telefonou para a v�tima?");
		res1=entrada.nextLine().charAt(0);
		
		System.out.print("Esteve no local do crime?");
		res2=entrada.nextLine().charAt(0); 
		
		System.out.print("Mora perto da v�tima?");
		res3=entrada.nextLine().charAt(0); 
		
		System.out.print("Devia para a v�tima?");
		res4=entrada.nextLine().charAt(0); 
		
		System.out.print("J� trabalhou com a v�tima?");
		res5=entrada.nextLine().charAt(0); 
		
		if (res1=='s'|| res1=='S') {
			con = con+1;			
		}else if (res2=='s'|| res2=='S') {
			con = con+1;
		}else if (res3=='s'|| res3=='S') {
			con = con+1;
		}else if (res4=='s'|| res4=='S') {
			con = con+1;
		}else if (res5=='s'|| res5=='S') {
			con = con+1;
		}
		
		if (con ==2) {
			System.out.println("Suspeito.");
		}else if (con==3||con==4) {
			System.out.println("C�mplice." );
		}else if (con==5) {
			System.out.println("Assassino.");
		}else {
			System.out.println("Inocente.");
		}
		entrada.close();
	}

}
