package estrutura_controle;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, num2;
		
		System.out.print("Informe um n�mero inteiro: ");
		num = entrada.nextInt();
		
		if (num%2==0) {
			num2 = num +1;
			System.out.println(num + " foi o n�mero que voc� digitou, o mesmo � um n�mero par, agora transformando ele em �mpar: " + num2);
		}else {
			num2 = num +1;
			System.out.println(num + " foi o n�mero que voc� digitou, o mesmo � um n�mero �mpar, agora transformando ele em par: " + num2);
		}
		
		entrada.close();
		
	}

}
