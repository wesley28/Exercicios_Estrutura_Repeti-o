package estrutura_controle;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Digite o valor do lado 1: ");
		lado1=entrada.nextInt();
		
		System.out.println("Digite o valor do lado 2: ");
		lado2=entrada.nextInt();
		
		System.out.println("Digite o valor do lado 3: ");
		lado3=entrada.nextInt();
		
		if ((lado1 > (lado2 + lado3) || lado2>(lado1 + lado3) || lado3 > (lado1 + lado2))){
			System.out.println("N�o pode ser um tri�ngulo");			
		}else if (lado1==lado2 && lado2==lado3) {
			System.out.println("Equil�tero");			
		}else if (lado1==lado2||lado1==lado3||lado2==lado3) {
			System.out.println("Is�sceles");
		}else {
			System.out.println("Escaleno");
		}
		
		entrada.close();
		
		
	}

}
