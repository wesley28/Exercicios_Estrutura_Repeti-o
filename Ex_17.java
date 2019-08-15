package estrutura_controle;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);

			float nota1,nota2, media;
			
			System.out.print("Informe a primeira nota: ");
			nota1=entrada.nextFloat();
			
			System.out.print("Informe a segunda nota: ");
			nota2=entrada.nextFloat();
			
			media = (nota1+nota2)/2;
			
			if (media >=0 && media <=4) {
				System.out.println("Sua primeira nota: " +nota1+ ", sua segunda nota: " +nota2+", sua m�dia: " + media +". Sua nota = E. REPROVADO" );
			}else if (media >4 && media <=6) {
				System.out.println("Sua primeira nota: " +nota1+ ", sua segunda nota: " +nota2+", sua m�dia: " + media +". Sua nota = D. REPROVADO" );
			}else if(media >6 && media <=7.5) {
				System.out.println("Sua primeira nota: " +nota1+ ", sua segunda nota: " +nota2+", sua m�dia: " + media +". Sua nota = C. APROVADO" );
			}else if(media >7.5 && media <=9) {
				System.out.println("Sua primeira nota: " +nota1+ ", sua segunda nota: " +nota2+", sua m�dia: " + media +". Sua nota = B. APROVADO" );
			}else if(media >9 && media <=10) {
				System.out.println("Sua primeira nota: " +nota1+ ", sua segunda nota: " +nota2+", sua m�dia: " + media +". Sua nota = A. APROVADO" );
			}
			
			entrada.close();

	}

}
