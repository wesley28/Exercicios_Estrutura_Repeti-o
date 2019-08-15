package estrutura_controle;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1,num2,resul=0;
		int op;
		
		System.out.println("Informe o 1� valor: ");
		num1=entrada.nextDouble();
		
		System.out.println("Informe o 2� valor: ");
		num2=entrada.nextDouble();
		
		System.out.println("O que voc� deseja fazer:");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		op=entrada.nextInt();
		
		
		if (op==1) {
			resul = num1+num2;			
		}	else if(op==2) {
					resul = num1-num2;
			}	else if(op==3){
					resul= num1*num2;
				}	else if(op==4) {
						resul = num1/num2;
					}else {
						System.out.println("Opera��o inv�lida");
					}
		System.out.println("Resultado = " +resul);
		
		if (resul%2==0) {
			System.out.println("N�mero � par");
		}else {
			System.out.println("N�mero � �mpar");
		}
		
		if (resul<0) {
			System.out.println("N�mero � negativo");
		}else {
			System.out.println("N�mero � positivo");
		}
		

		float fracao = (float) (resul % 1.0f);

		if(fracao == 0.0f){
			System.out.println("N�mero � inteiro");
		}else{
		  System.out.println("N�mero � decimal");
			
		}
			
		entrada.close();
	}}


