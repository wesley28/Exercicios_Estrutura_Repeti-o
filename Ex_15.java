package estrutura_controle;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		float valor,x;
		
		System.out.println("Digite o valor do produto: ");
	    valor=entrada.nextFloat();
	    
	    System.out.println("Digite o codigo de Origem: ");
	    x=entrada.nextFloat();
	    if (x == 1){
	    	System.out.println("O produto de valor tem sua procedencia do SUL!!"+ valor + x);
	    }	else if (x == 2){
	    	System.out.println("O produto de valor  tem sua procedencia do NORTE!! "+ valor + x);
	    }	else  if (x == 3){
	    	System.out.println("O produto de valor  tem sua procedencia do LESTE!! "+ valor + x);
		}	else if (x == 4){
			System.out.println("O produto de valor  tem sua procedencia do OESTE!! "+ valor + x);
	    }	else if (x ==5 || x==6){
	    	System.out.println("O produto de valor  tem sua procedencia do NORDESTE!! "+ valor + x);
	    }
	    if (x == 7.8 || x==9){
	    	System.out.println("O produto de valor  tem sua procedencia do SUDESTE!! "+ valor + x);
	    }	else if (x >=10 && x <=20){
	    	System.out.printf("O produto de valor  tem sua procedencia do CENTRO-OESTE!! ", + valor + x);
	    }	else if (x >=21 && x <=30){
	    	System.out.println("O produto de valor  tem sua procedencia do NOROESTE!!"+ valor + x);
	    }
	    
	    if (x >=10 && x <=20){
	    	System.out.printf("O produto de valor tem sua procedencia do CENTRO-OESTE!!", valor,x);
	    }	else if (x >=21 && x <=30){
	        	System.out.printf("O produto de valor tem sua procedencia do NOROESTE!!", valor,x);
	        }
	    entrada.close();
	
	}

	}

