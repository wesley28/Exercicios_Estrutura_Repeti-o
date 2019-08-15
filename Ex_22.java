package estrutura_controle;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, cent,dez,uni;
		
		System.out.println("Digite um n�mero menor que 1000: ");
		num = entrada.nextInt();
		
		if (num<1000) {			
			uni = num % 10;
			num = (num - uni)/10;
			dez = num % 10;
			num = (num - dez)/10;
			cent = num;
			if(cent>1) {
				System.out.println(cent+ " centenas, "+dez+" dezenas e "+uni+" unidades ");
			}else {
				System.out.println(cent+ " centena, "+dez+" dezena e "+uni+" unidade ");
			}
		}else{
			System.out.println("N�mero inv�lido.");
		}
		entrada.close();
		
	}

}
