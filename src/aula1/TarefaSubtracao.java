package aula1;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaSubtracao implements Runnable{
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public TarefaSubtracao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void run() {
		
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		BigInteger calculo = new BigInteger("0");
		
		for(int i = 0; i < valor1; i++) {
			calculo = calculo.add(new BigInteger("1"));
		}
		for(int j = 0; j < valor2; j++) {
			calculo = calculo.subtract(new BigInteger("1"));
		}
		
		resultado.setText(calculo.toString());
		
	}

}
