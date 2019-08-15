package estrutura_controle;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char turno;
		
		System.out.println("Digite o turno que voc� estuda: " );
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		turno = entrada.nextLine().charAt(0);
		
			if(turno=='M'||turno=='m') {
				System.out.println("Bom dia!");
			}else if (turno=='V'||turno=='v') {
				System.out.println("Boa tarde!");
			}else if (turno=='N'||turno=='n') {
				System.out.println("Boa noite!");
			}else {
				System.out.println("Letra inv�lida!");
			}
		
		entrada.close();

	}

}
