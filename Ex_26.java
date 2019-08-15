package estrutura_controle;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Informe um n�mero inteiro: ");
		num = entrada.nextInt();
		
		if (num%2==0) {
			
			System.out.println(num + " foi o n�mero que voc� digitou, o mesmo � um n�mero par");
		}else {
			
			System.out.println(num + " foi o n�mero que voc� digitou, o mesmo � um n�mero �mpar " );
		}
		
		entrada.close();
	}

}
