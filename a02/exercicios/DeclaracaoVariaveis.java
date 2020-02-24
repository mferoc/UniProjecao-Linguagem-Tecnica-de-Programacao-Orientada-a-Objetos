//EXERCICIO A DA AULA 2

import java.util.Scanner;

public class DeclaracaoVariaveis
{
	public static void main(String[] args)
	{
		System.out.println("Por favor, entre com o nome, a velocidade máxima e o tempo de acelação até 100km/h assim como o preço de um carro:	");

		String var;
		Scanner x;
		x = new Scanner(System.in);
		var = x.nextLine();

		int vel;
		Scanner y;
		y = new Scanner(System.in);
		vel = y.nextInt();

		float acel;
		Scanner z;
		z = new Scanner(System.in);
		acel = z.nextFloat();

		double prec;
		Scanner w;
		w = new Scanner(System.in);
		prec = w.nextDouble();

		System.out.println("nome: " +var);
		System.out.printf("vel máx: %d\n", vel);
		System.out.printf("aceleração: %f\n", acel);
		System.out.printf("preço: %f\n", prec);
	}
}

