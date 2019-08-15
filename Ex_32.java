package estrutura_controle;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int i;
		
		String[] respostas = new String[10];
		
		System.out.println("Responda as dez quest�es com A, B, C ou D: ");
		for (i=0; i<10; i++) {
			  respostas[i] = entrada.nextLine(); 
			  System.out.print(respostas[i]);
			}
		
		
		String respostasV[] = {"a", "a","b","b","c","c","d","d","e","e"};
 
			  System.out.print(respostasV[i]);
		entrada.close();
			
	}
}


