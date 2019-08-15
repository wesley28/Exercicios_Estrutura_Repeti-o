package estrutura_controle;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float nota1,nota2, media;
		
		System.out.print("Informe a primeira nota: ");
		nota1=entrada.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		nota2=entrada.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if (media >=0 && media <=3) {
			System.out.println("Reprovado com m�dia " +media);
		}else if (media >3 && media <=7) {
			System.out.println("Em Exame com m�dia " +media);
		}else if (media >7 && media <10) {
			System.out.println("Aprovado com m�dia " +media);
		}
		
		entrada.close();

	}

}
