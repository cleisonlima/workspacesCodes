package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double numeroHora = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		
		double salario = numeroHora * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = %.2f%n", + salario);
		

		sc.close();
	}

}

