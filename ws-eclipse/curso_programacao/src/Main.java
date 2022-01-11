import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";	
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		System.out.println(x);
		//Comando printf para redu��o de quantidade de d�gitos ap�s a v�rgula ou ponto.
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Bom dia!");
		//Locale, comando para impress�o nos padr�es de uma determinada regi�o. Necess�rio importar biblioteca do java antes.
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n",x);
		System.out.println("RESULTADO = " + x + " METROS.");
		System.out.printf("RESULTADO = %.2f METROS.%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		// Marcadores: %f = ponto flutuante; %d = inteiro; %s = texto; %n = quebra de linha
		
	}

}
