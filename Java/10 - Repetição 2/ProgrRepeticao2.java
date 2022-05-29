import javax.swing.*;

class ProgrRepeticao2
{
	public static void main (String entrada[])
	{
		//declaração das variáveis
		int n1, n2, soma=0;
		char op=0;
		String msg = "", msgEntr="Digite 1 para adição\nDigite 2 para somatória\n";
		
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro","Entrada de dados",3));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número inteiro","Entrada de dados",3));
		op = (JOptionPane.showInputDialog(null,(msgEntr),"Entrada de dados",3)).charAt(0);
		
		//processamento
		switch(op)
		{
			case '1':
			{
				if (n1%2==0 && n2%2==0)
				{
					soma = n1 + n2;
					msg = msg + "Soma de  "+ n1 + " por " + n2 + " = " + soma + "\n\n";;
				}				
				break;
			}
			case '2':
			{
				for (int i=1; i<=n2; i=i+1)
				{
					soma = soma + n1;
				}
				msg = msg + "Somatória de " + n1 + ", " + n2 + " vezes eh: " + soma + "\n\n";				
				break;		
			}
			default: JOptionPane.showMessageDialog(null,"Opção invalida, calculos não realizados");
		}
					
		//saída de resultados
		if(op >= '1' && op <= '2')
		{
			JOptionPane.showMessageDialog(null, msg);
		}
		System.exit(0);
		
	}
	
}