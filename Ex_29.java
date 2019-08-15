package estrutura_controle;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		float litro;
		double valor = 0;
		double valorPag, des = 0,  total;
		
		System.out.print(" A-�lcool, G-gasolina");
		letra = entrada.nextLine().charAt(0);
		
		System.out.print("Quantos litros voc� deseja: ");
		litro=entrada.nextFloat();
		
		if (letra=='a'||letra=='A') {
			valor=1.90;
			if(litro<=20) {
				des=0.03;
			}else {
				des=0.05;
			}
			
		}else if (letra=='g'||letra=='G') {
			valor=2.50;
			if(litro<=20) {
				des=0.04;
			}else {
				des=0.06;
			}
			
		}else {
			System.out.println("Letra inv�lida");
		}
		total = litro*valor;
		valorPag = total - (total*des);
		System.out.println("O valor a ser pago: R$ " + valorPag);
		
		entrada.close();
	}

}
