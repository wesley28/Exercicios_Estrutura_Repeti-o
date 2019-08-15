package estrutura_controle;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char tipo,cart;
		float vpagar;
		float kgtotal,kg,pa,pp,pf,desc,valor = 0;
		System.out.println("Informe o tipo de carne: ");
		System.out.println("F - File Duplo ");
		System.out.println("P - Picanha ");
		System.out.println("A - Alcatra");
		tipo=entrada.nextLine().charAt(0);
		
		System.out.println("Informe a quantidade em Kg: ");
		kg=entrada.nextFloat();
		
		if(kg>5) {
			pf = (float) 5.80;
		    pa = (float) 6.80;
		    pp = (float) 7.80;
		}else {
			pf=(float) 4.90;
			pa = (float) 5.90;
		    pp = (float) 6.60;
		}
		
		if (tipo=='p'||tipo=='P') {
			valor=pp*kg;			
		}else if (tipo=='f'||tipo=='F') {
			valor=pf*kg;			
		}else if (tipo=='a'||tipo=='A') {
			valor=pa*kg;			
		}else {
			System.out.println("Letra inv�lida");
		}
				
		System.out.println("Cart�o Tabajara: ");
		System.out.println("S - Sim ");
		System.out.println("P - N�o ");
		cart=entrada.nextLine().charAt(0);
		
		desc = (float) (valor * 0.05);
		
		if (cart=='s'|| cart=='S') {
			vpagar = valor - desc;			
		}else {
			vpagar=valor;
		}
		entrada.close();
		
	}

}
