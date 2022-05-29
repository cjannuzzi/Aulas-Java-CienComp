import javax.swing.*;

class ProgrDecisao
{
	public static void main (String entrada[])
	{
		//declaração das variáveis
		int num;
		char op=0;
		String msg = "", msgEntr="Digite 1 para par/ímpar\nDigite 2 para positivo/negativo";
		
		//entrada de dados
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro","Entrada de dados",3));
		op = (JOptionPane.showInputDialog(null,(msgEntr),"Entrada de dados",3)).charAt(0);
		
		//processamento
		switch(op)
		{
			case '1':
			{
				if (num % 2==0)
				{
					msg = msg + num + " eh par. \n";
				}
				else
				{
					msg = msg + num + " eh ímpar.\n";
				}
				break;
			}
			case '2':
			{
				if(num>0)
				{
					msg = msg + num + " eh positivo.\n";
				}
				else
				{
					msg = msg + num + " eh não positivo.\n";
				}
				break;
			}
			default: JOptionPane.showMessageDialog(null,"Opção invalida, calculos não realizados");
		}
					
		//saída de resultados
		if(op == '1' || op == '2')
		{
			JOptionPane.showMessageDialog(null, msg);
		}
		System.exit(0);
		
	}
	
}