package estrutura_controle;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		float nota1,nota2,nota3, media;
		
		System.out.print("Informe a primeira nota: ");
		nota1=entrada.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		nota2=entrada.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		nota3=entrada.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		if (media >= 7 && media<10) {
			System.out.println("Aprovado com m�dia: " +media);
		}else if (media <7) {
			System.out.println("Reprovado com m�dia: " +media);
		}else if (media==10) {
			System.out.println("Aprovado com Distin��o com m�dia: " +media);
		}
		
		entrada.close();
	}

}
