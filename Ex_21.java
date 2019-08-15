package estrutura_controle;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dia, mes, ano, num;
		num =0;
		
		
		System.out.print("Informe dia: ");
		dia = entrada.nextInt();
		
		System.out.print("Informe m�s: ");
		mes = entrada.nextInt();
		
		System.out.print("Informe ano: ");
		ano = entrada.nextInt();
		
			if (dia>0 && dia<31) {
				if (mes>0 && mes<=12) {
					if ((dia>=1 && dia<=9) && (mes>=1 && mes<=9)) {
							System.out.println("A data que voc� digitou � v�lida: " +num+ + dia + "/" +num+ mes+"/" +ano );						
						}
					}if ((dia>9) && (mes>9)) {
						System.out.println("A data que voc� digitou � v�lida: "  + dia + "/" +mes+"/" +ano );
				}
			}else {
				System.out.println("Data inv�lida");
			}
			entrada.close();
	}
		
}


