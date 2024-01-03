/*
 Exercício 01
 
 Faça um programa para ler dois valores inteiros, e depois mostrar 
na tela a soma desses números com uma
mensagem explicativa. 

*/

package curso_programacao;

import java.util.Scanner;

public class ExercicioProposto1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.printf("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		int soma = (numero1 + numero2);
		
		System.out.printf("SOMA = " + soma);
		
		sc.close();

	}

}
