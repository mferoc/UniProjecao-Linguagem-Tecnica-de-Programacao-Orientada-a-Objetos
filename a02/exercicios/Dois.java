	//Exercicio 2 da aula 2

import java.util.Scanner;

public class Dois
{
	public static void main(String args[])
	{
		System.out.println("Digite os numeros inteiros A, B, C e D respectivamente afim de executar uma operação: ");

		int a;
		Scanner x;
		x = new Scanner(System.in);
		System.out.println("A: ");
		a = x.nextInt();


		int b;
		Scanner w;
		w = new Scanner(System.in);
		System.out.println("B: ");
		b = w.nextInt();


		int c;
		Scanner y;
		y = new Scanner(System.in);
		System.out.println("C: ");
		c = y.nextInt();


		int d;
		Scanner z;
		z = new Scanner(System.in);
		System.out.println("D: ");
		d = z.nextInt();

		int res = (a * b) - (c * d);

		System.out.printf("Resultado da operação: %d\n" , res);
	}
}
