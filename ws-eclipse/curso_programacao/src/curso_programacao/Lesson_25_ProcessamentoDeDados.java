package curso_programacao;

public class Lesson_25_ProcessamentoDeDados {

	public static void main(String[] args) {
		

		int x, y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println("Exemplo 01:");
		System.out.println(x);
		System.out.println(y);
		
		int x1;
		double y1;
		
		x1 = 5;
		y1 = 2 * x1;
		
		System.out.println();
		System.out.println("Exemplo 02:");
		System.out.println(x1);
		System.out.println(y1);
		
		double b, B, h, area;
		//Sempre indique o tipo do n?mero, se a express?o for de ponto flutuante (n?o inteira). Para double use: .0; Para float use: f;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B)/ 2.0 * h;
		
		System.out.println();
		System.out.println("Exemplo 03:");
		System.out.println(area);
		
		int a, b1;
		double resultado;
		
		a = 5;
		b1 = 2;
		
		resultado = (double) a/b1;
		//double na frente da express?o ? orientando o c?digo a realizar casting
		System.out.println();
		System.out.println("Exemplo 04:");
		System.out.println(resultado);
		
		double a1;
		int b2;
		
		a1 = 5.0;
		b2 = (int) a1;
		System.out.println();
		System.out.println("Exemplo 05:");
		System.out.println(b2);

	}

}
