package estrutura_controle;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float kgMor, kgMac,pMac,pMor,kgTotal,valorPag,totalMac,totalMor;
		
		System.out.println("Quantos Kg de ma�� voc� deseja: ");
		kgMac=entrada.nextFloat();
		
		System.out.println("Quantos Kg de morango voc� deseja: ");
		kgMor=entrada.nextFloat();
		
		if (kgMac<=5) {
			pMac = (float) 1.80;					
		}else {
			pMac = (float) 1.50;
		}
		
		totalMac = pMac*kgMac;
				
		if (kgMor<=5) {
			pMor = (float) 2.50;					
		}else {
			pMor = (float) 2.20;
		}
		
		totalMor = pMor*kgMor;
		
		valorPag = totalMor+totalMac;
		
		kgTotal=kgMac+kgMor;
		
		if (kgTotal>8|| valorPag>25) {
			valorPag = (float) (valorPag - (valorPag*0.1));			
		}
		System.out.println("O valor que voc� vai pagar �: R$ " + valorPag);
		entrada.close();

	}

}
