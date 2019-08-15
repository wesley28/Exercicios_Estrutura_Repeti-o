package estrutura_controle;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int sexo=0;
		float peso, altura, pesoIdeal= 0;
		
		System.out.println("1- Mulher");
		System.out.println("2- Homem");
		sexo = entrada.nextInt();
		
			if (sexo==1) {
				
				System.out.print("Digite seu peso: ");
				peso = entrada.nextFloat();
				
				System.out.print("Digite seu altura: ");
				altura = entrada.nextFloat();
				
				pesoIdeal = (float) (((72.7*altura)-58));
				
				System.out.println("Seu peso: " + peso + " sua altura: " + altura+ " sua ideologia: " +sexo+" seu peso ideal: "+pesoIdeal);
				
					if (peso>pesoIdeal) {
						System.out.println("Voc� est� acima do peso.");			
					}else if (peso<pesoIdeal) {
						System.out.println("Voc� est� abaixo do peso.");
					}else {
						System.out.println("Voc� est� no peso ideal.");
					}
			
			} else if (sexo == 2) {
				
				System.out.print("Digite seu peso: ");
				peso = entrada.nextFloat();
				
				System.out.print("Digite seu altura: ");
				altura = entrada.nextFloat();
				
				pesoIdeal = (float) (((62.1*altura)-44.7));
				
				System.out.println("Seu peso: " + peso + " sua altura: " + altura+ " sua ideologia: " +sexo+ " seu peso ideal: "+pesoIdeal);
				
					if (peso>pesoIdeal) {
						System.out.println("Voc� est� acima do peso.");			
					}else if (peso<pesoIdeal) {
						System.out.println("Voc� est� abaixo do peso.");
					}else {
						System.out.println("Voc� est� no peso ideal.");
					}
				
			} else {
				System.out.println("Sexo inv�lido!");
			}
		
		entrada.close();

	}

}
