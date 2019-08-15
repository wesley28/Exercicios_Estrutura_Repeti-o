package estrutura_controle;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int ano;
		float div4, div100, div400;
		
		System.out.print("Digite o ano desejado, coloque os quatro digitos: ");
		ano = entrada.nextInt();
		
		div4 = ano%4;
		div100=ano%100;
		div400=ano%400;
		
			if ((div4 == 0) && (div100 != 0 || div400 ==0)) {
				System.out.println("O ano " + ano + " � bissexto.");			
			} else {
				System.out.println("O ano " + ano + " n�o � bissexto.");
			}
		
		entrada.close();

	}

}
