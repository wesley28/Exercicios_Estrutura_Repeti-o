package estrutura_controle;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade1, idade2, idade3;
		float media;
		
		System.out.println("Digite a idade do primeiro aluno: ");
		idade1=entrada.nextInt();
		
		System.out.println("Digite a idade do segundo aluno: ");
		idade2=entrada.nextInt();
		
		System.out.println("Digite a idade do terceiro aluno: ");
		idade3=entrada.nextInt();
		
		media=(idade1+idade2+idade3)/3;
		
		if (media<25) {
			System.out.println("Turma Jovem.");
		}else if(media>=25 && media<=40) {
			System.out.println("Turma Adulta.");
		}else if(media>40) {
			System.out.println("Turma Idosa.");
		}
		entrada.close();

	}

}
