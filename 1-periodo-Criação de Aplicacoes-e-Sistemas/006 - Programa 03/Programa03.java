import javax.swing.*;

class Programa03
{
	public static void main (String entrada[])
	{
		//declaração das variáveis
		int n1, n2, mod;
		double raiz1, raiz2;
		String msg = "";
		
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro","Entrada de dados",3));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número inteiro","Entrada de dados",3));
		
		//processamento
		mod= n1 % n2;
		raiz1 = Math.sqrt(n1);
		raiz2 = Math.sqrt(n2);
		
		//saída de resultados
		msg = msg + "resto da divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
		msg = msg + "raiz quadrada de " + n1 + " = " + raiz1 + "\n";
		msg = msg + "raiz quadrada de " + n2 + " = " + raiz2 + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}