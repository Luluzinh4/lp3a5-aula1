package aula1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	private String operacao;
	
	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado, String operacao) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
		this.operacao = operacao;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(operacao.equals("soma")) {
			TarefaAdicao tarefaAdicao = new TarefaAdicao(primeiro, segundo, resultado);
			Thread threadAdicao = new Thread(tarefaAdicao, "Thread Adição");
			threadAdicao.start();
		}
		if(operacao.equals("subt")) {
			TarefaSubtracao tarefaSubt = new TarefaSubtracao(primeiro, segundo, resultado);
			Thread threadSubt = new Thread(tarefaSubt, "Thread Subtração");
			threadSubt.start();
		}
		if(operacao.equals("mult")) {
			TarefaMultiplicacao tarefaMult = new TarefaMultiplicacao(primeiro, segundo, resultado);
			Thread threadMult = new Thread(tarefaMult, "Thread Multiplicação");
			threadMult.start();
		}
		if(operacao.equals("div")) {
			TarefaDivisao tarefaDiv = new TarefaDivisao(primeiro, segundo, resultado);
			Thread threadDiv = new Thread(tarefaDiv, "Tarefa Divisão");
			threadDiv.start();
		}
		
	}

}
