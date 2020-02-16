package aula1;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaDivisao implements Runnable{
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public TarefaDivisao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void run() {
		
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		BigInteger calculo = new BigInteger("0");
		
		while(valor1 >= valor2) {
			valor1 -= valor2;
			calculo = calculo.add(new BigInteger("1"));
		}
		
		resultado.setText(calculo.toString());
		
	}

}
