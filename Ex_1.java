package estrutura_controle;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		float num1, num2;
		
		System.out.print("Digite o primeiro numero: ");
		num1= entrada.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		num2= entrada.nextFloat();
		
			if (num1>num2) {
				System.out.println("Entre " + num1 + " e "+ num2 + " o maior Nº: " + num1);
			}else if (num2>num1) {
				System.out.println("Entre " + num1 + " e "+ num2 + " o maior Nº: " + num2);
			}else {
				System.out.println("Os n�meros que voc digitou são iguais.");
			}
			
		entrada.close();
		
	

	}

}
