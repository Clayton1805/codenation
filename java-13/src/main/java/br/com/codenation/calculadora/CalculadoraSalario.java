package br.com.codenation.calculadora;


public class CalculadoraSalario {
	static double descontar(double salario, double desconto) {
		return salario - (salario * desconto);
	}
	
	static double INSS(double salarioBase) {
		if (salarioBase <= 1500.00) {
			return descontar(salarioBase, 0.08);
		}
		if (salarioBase > 1500.00 && salarioBase <= 4000.00) {			
			return descontar(salarioBase, 0.09);
		}
		return descontar(salarioBase, 0.11);
	}
	
	static double IRRF(double salarioBruto) {
		if (salarioBruto <= 3000.00) {
			return salarioBruto;
		}
		if (salarioBruto > 3000.00 && salarioBruto <= 6000.00) {			
			return descontar(salarioBruto, 0.075);
		}
		return descontar(salarioBruto, 0.15);
	}

	public long calcularSalarioLiquido(double salarioBase) {
		if (salarioBase < 1039.00) {
			return 0;
		}
		double salarioBruto = INSS(salarioBase);
		double salarioLiquido = IRRF(salarioBruto);
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
		return Math.round(salarioLiquido);
	}
//	public static void main(String[] args) {
//		System.out.println(calcularSalarioLiquido(1039));
//	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/