package estrutura_controle;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double hora, valorHora, descIr, descSind, descFGTS, salarioBruto, salarioLiquido, descontos, descInss;
		double pIr, pSind, pFGTS, pInss;
		pSind = 0.03;
		pFGTS= 0.11;
		
		System.out.print("Informe quanto vale a hora: ");
		valorHora = entrada.nextDouble();
		
		System.out.print("Informe quantas horas voc� trabalhou: ");
		hora = entrada.nextDouble();
		
		salarioBruto = (valorHora*hora);
		
		if (salarioBruto<=900) {
			pIr= 0;
			descIr = pIr;					
			descSind = salarioBruto * pSind;			
			descFGTS = salarioBruto * pFGTS;
			pInss = 0.08;
			descInss = salarioBruto * pInss ;
			
			salarioLiquido = (salarioBruto-(descIr+descSind+descFGTS+descInss));
			descontos = (descIr+descSind+descFGTS+descInss);
			
			System.out.println("Salario bruto:( " + valorHora+ " * " + hora + " ) R$: "  + salarioBruto);
			
			System.out.println("(-) IR: ( " +(pIr*100)+" % ) R$: " + descIr);
			
			System.out.println("(-) INSS: ( " +(pInss*100)+" % ) R$: " + descInss);
			
			System.out.println("FGTS ( " +(pFGTS*100)+" % ) R$: " + descFGTS);
			
			System.out.println("Sindicato: ( " +(pSind*100)+" % ) R$: " + descSind);
			
			System.out.println("Foi descontado o total: R$ " + descontos);
			
			System.out.println("Seu salario liquido: R$ " + salarioLiquido);	
			
		}else if (salarioBruto>900 && salarioBruto <= 1500) {
			pIr= 0.05;
			descIr = pIr;					
			descSind = salarioBruto * pSind;			
			descFGTS = salarioBruto * pFGTS;
			pInss = 0.08;
			descInss = salarioBruto * pInss ;
			
			salarioLiquido = (salarioBruto-(descIr+descSind+descFGTS+descInss));
			descontos = (descIr+descSind+descFGTS+descInss);
			
			System.out.println("Salario bruto:( " + valorHora+ " * " + hora + " ) R$: "  + salarioBruto);
			
			System.out.println("(-) IR: ( " +(pIr*100)+" % ) R$: " + descIr);
			
			System.out.println("(-) INSS: ( " +(pInss*100)+" % ) R$: " + descInss);
			
			System.out.println("FGTS ( " +(pFGTS*100)+" % ) R$: " + descFGTS);
			
			System.out.println("Sindicato: ( " +(pSind*100)+" % ) R$: " + descSind);
			
			System.out.println("Foi descontado o total: R$ " + descontos);
			
			System.out.println("Seu salario liquido: R$ " + salarioLiquido);	
			
		}else if (salarioBruto>1500 && salarioBruto <= 2500) {
			pIr= 0.1;
			descIr = pIr;					
			descSind = salarioBruto * pSind;			
			descFGTS = salarioBruto * pFGTS;
			pInss = 0.09;
			descInss = salarioBruto * pInss ;
			
			salarioLiquido = (salarioBruto-(descIr+descSind+descFGTS+descInss));
			descontos = (descIr+descSind+descFGTS+descInss);
			
			System.out.println("Salario bruto:( " + valorHora+ " * " + hora + " ) R$: "  + salarioBruto);
			
			System.out.println("(-) IR: ( " +(pIr*100)+" % ) R$: " + descIr);
			
			System.out.println("(-) INSS: ( " +(pInss*100)+" % ) R$: " + descInss);
			
			System.out.println("FGTS ( " +(pFGTS*100)+" % ) R$: " + descFGTS);
			
			System.out.println("Sindicato: ( " +(pSind*100)+" % ) R$: " + descSind);
			
			System.out.println("Foi descontado o total: R$ " + descontos);
			
			System.out.println("Seu salario liquido: R$ " + salarioLiquido);	
			
		}else if (salarioBruto>2500) {
			pIr= 0.2;
			descIr = pIr;					
			descSind = salarioBruto * pSind;			
			descFGTS = salarioBruto * pFGTS;
			pInss = 0.11;
			descInss = salarioBruto * pInss ;
			
			salarioLiquido = (salarioBruto-(descIr+descSind+descFGTS+descInss));
			descontos = (descIr+descSind+descFGTS+descInss);
			
			System.out.println("Salario bruto:( " + valorHora+ " * " + hora + " ) R$: "  + salarioBruto);
			
			System.out.println("(-) IR: ( " +(pIr*100)+" % ) R$: " + descIr);
			
			System.out.println("(-) INSS: ( " +(pInss*100)+" % ) R$: " + descInss);
			
			System.out.println("FGTS ( " +(pFGTS*100)+" % ) R$: " + descFGTS);
			
			System.out.println("Sindicato: ( " +(pSind*100)+" % ) R$: " + descSind);
			
			System.out.println("Foi descontado o total: R$ " + descontos);
			
			System.out.println("Seu salario liquido: R$ " + salarioLiquido);	
			
		}
		
		entrada.close();
	}

}
