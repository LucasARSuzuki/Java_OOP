package curso_programacao;

import java.util.Scanner;

public class Lesson_26_EntradaDeDadosP1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome:");
		String x;
		x = sc.next();
		
		System.out.println("Voc? digitou: " + x);
		System.out.println();
				
		int x1;
		
		System.out.println("Informe um n?mero (somente n?meros inteiros):");
		x1 = sc.nextInt();
	
		System.out.println("Voc? digitou: " + x1);
		System.out.println();
		
		double x2;
		
		System.out.println("Informe um valor com v?rgula:");
		x2 = sc.nextDouble();
		
		System.out.printf("Voc? digitou: %.2f%n",x2);
		System.out.println();
		
		char x3;
		
		System.out.println("Digite qualquer palavra:");
		x3 = sc.next().charAt(0);
		
		System.out.println("A primeira letra da palavra digitada ?: " + x3);
		
		String x4;
		int y4;
		double z4;
		
		System.out.println();
		System.out.println("Informe seu primeiro nome:");
		x4 = sc.next();
		System.out.println("Informe um n?mero (somente n?meros inteiros):");
		y4 = sc.nextInt();
		System.out.println("Informe um valor com v?rgula:");
		z4 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Dados digitados:");
		System.out.println(x4);
		System.out.println(y4);
		System.out.println(z4);
		
		sc.close();

	}

}
