package estrutura_controle;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Digite a letra desejada: ");
		letra = entrada.nextLine().charAt(0);
		
		if(letra=='A'||letra=='a'||letra=='E'||letra=='e'||letra=='I'||letra=='i'||letra=='O'||letra=='o'||letra=='U'||letra=='u') {
			System.out.println( letra +" � uma letra vogal.");			
		}else {
			System.out.println(letra + " � uma letra consoante.");
		}
		
		entrada.close();
		

	}

}
