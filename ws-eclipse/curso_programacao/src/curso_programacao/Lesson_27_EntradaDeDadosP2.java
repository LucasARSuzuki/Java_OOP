package curso_programacao;

import java.util.Scanner;

public class Lesson_27_EntradaDeDadosP2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		/*Quando é utilizado um comando de leitura diferente do nextLine() e dá alguma quebra de linha, 
		essa quebra de linha fica "pendente" na entrada padrão. Se for realizado um nextLine() aquela 
		quebra de linha pendente será absorvida pela nextLine(). Solução: Fazer nextLine() antes de fazer
		o nextLine() de interesse.*/
		
		sc.nextLine(); //nextLine() "extra" para não ter um valor vazio
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
