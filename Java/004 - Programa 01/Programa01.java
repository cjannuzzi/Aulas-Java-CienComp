// salvar como Programa01.java
class Programa01
{
	public static void main (String entrada[]) // metodo principal por onde vai acontecer o programa.
	{
		//declaração de variáveis
		int NumInt; //numero inteiro
		double NumReal, soma; //numero com virgula 
		char Caracter;
		
		// entrada de dados
		NumInt = Integer.parseInt(entrada[0]); ////pega a 1º entrada de dados e converte para um numero inteiro
		NumReal = Double.parseDouble(entrada[1]); //pega a 2º entrada de dados e converte para um numero real
		Caracter = (entrada[2].charAt(0)); //pega a 3º entrada de dados e converte para texte com o parametro .charAt
		
		// processamento
		soma = (double)NumInt + NumReal; // (double)NumInt converteu o numero inteiro para numero real 
		
		//saída de resultados
		System.out.println((double)NumInt+ " + " + NumReal + " = " + soma + " sinal " + Caracter);

		System.exit(0);
	}
}