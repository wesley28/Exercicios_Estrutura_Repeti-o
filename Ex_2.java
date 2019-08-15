package estrutura_controle;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float num;
		
		System.out.print("Digite o n�mero desejado: ");
		num = entrada.nextFloat();
		
			if (num>0) {
				System.out.println("O n�mero " + num + " � positivo.");
			} else if (num <0) {
				System.out.println("O n�mero " + num + " � negativo.");
			}else  {
				System.out.println("O n�mero " + num + " � zero.");
			}
		
		entrada.close();
		

	}

}
