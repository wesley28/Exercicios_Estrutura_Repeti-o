package estrutura_controle;
import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Digite F ou M: ");
		letra = entrada.nextLine().charAt(0);
		
			if (letra == 'f' || letra == 'F' ){
				System.out.println(letra + "  - Feminino");
			}else if (letra == 'm' || letra == 'M') {
				System.out.println(letra + "  - Masculino");
			}else {
				System.out.println("Letra incorreta!!");
			}
			
		entrada.close();

	}

}
