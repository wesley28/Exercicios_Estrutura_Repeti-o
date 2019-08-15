package estrutura_controle;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2,num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1=entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2=entrada.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		num3=entrada.nextInt();
		
			if (num1>num2 && num1>num3) {
				System.out.println("Dentre os n�meros digitados o maior �: " + num1);
			}else if (num2>num1 && num2>num3) {
				System.out.println("Dentre os n�meros digitados o maior �: " + num2);
			}else if (num3>num1 && num3>num2) {
				System.out.println("Dentre os n�meros digitados o maior �: " + num3);
			}
			
			if (num1<num2 && num1<num3) {
				System.out.println("Dentre os n�meros digitados o menor �: " + num1);
			}else if (num2<num1 && num2<num3) {
				System.out.println("Dentre os n�meros digitados o menor �: " + num2);
			}else if (num3<num1 && num3<num2) {
				System.out.println("Dentre os n�meros digitados o menor �: " + num3);
			}
			
		entrada.close();

	}

}
