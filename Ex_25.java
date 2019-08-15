package estrutura_controle;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int notas100 ,saque,notas50,notas10,notas5,saqueinicial,notas1;
		
		System.out.println("Digite o valor do saque: ");
		System.out.print("Obs: Valor m�nimo: R$10. Valor m�ximo: R$600.");
		saque=entrada.nextInt();
		saqueinicial = saque;
		
		if (saque < 10 || saque > 600) {
			System.out.println ("N�o � possivel realizar o saque!");
		}
		notas100 = saque/100;
		saque -= notas100 * 100;
		
		notas50 = saque /50;
		saque -= notas50 * 50;
			    
		notas10 = saque /10;
		saque -= notas10 * 10;
			    
		notas5 = saque /5;
		saque -= notas5 * 5;
		
		notas1 = saque /1;
		saque -= notas1 * 1;
		
		System.out.println("O valor que voc� deseja: " + saqueinicial + " usadas " + notas100 + " notas de R$ 100, " + notas50 + " notas de R$ 50, ");
		System.out.print(+ notas10 + " notas de R$ 10, "+ notas5 + " notas de R$ 5, "+ notas1 + " notas de R$ 1. ");
	    entrada.close();
	}

}
