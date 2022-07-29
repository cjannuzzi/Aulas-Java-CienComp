import javax.swing.*;

class Programa04
{
	public static void main (String entrada[])
	{
		//declaração das variáveis
		int n1, n2, div;
		double pot;
		String msg = "";
		
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro","Entrada de dados",3));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número inteiro","Entrada de dados",3));
		
		//processamento
		div= (int)n1 /(int) n2;
		pot = Math.pow(n1, n2);
		
		//saída de resultados
		msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
		msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
		
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}