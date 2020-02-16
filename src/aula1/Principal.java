package aula1;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Calculadora");
		
		JPanel painel = new JPanel();
		
		//Soma
		JTextField somaVar1 = new JTextField(10);
		JTextField somaVar2 = new JTextField(10);
		JButton somaBotao = new JButton(" = ");
		JLabel somaResult = new JLabel("Resultado");
		
		somaBotao.addActionListener(new AcaoBotao(somaVar1, somaVar2, somaResult, "soma"));
		
		//Subtração
		JTextField subtVar1 = new JTextField(10);
		JTextField subtVar2 = new JTextField(10);
		JButton subtBotao = new JButton(" = ");
		JLabel subtResult = new JLabel("Resultado");
		
		subtBotao.addActionListener(new AcaoBotao(subtVar1, subtVar2, subtResult, "subt"));		
		
		//Multiplicação
		JTextField multVar1 = new JTextField(10);
		JTextField multVar2 = new JTextField(10);
		JButton multBotao = new JButton(" = ");
		JLabel multResult = new JLabel("Resultado");
		
		multBotao.addActionListener(new AcaoBotao(multVar1, multVar2, multResult, "mult"));
		
		//Divisão
		JTextField divVar1 = new JTextField(10);
		JTextField divVar2 = new JTextField(10);
		JButton divBotao = new JButton(" = ");
		JLabel divResult = new JLabel("Resultado");
		
		divBotao.addActionListener(new AcaoBotao(divVar1, divVar2, divResult, "div"));
		
		//Montagem do Painel
		painel.add(new JLabel("Adição"));
		painel.add(somaVar1);
		painel.add(new JLabel(" + "));
		painel.add(somaVar2);
		painel.add(somaBotao);
		painel.add(somaResult);
		
		painel.add(new JLabel("Subtração"));
		painel.add(subtVar1);
		painel.add(new JLabel(" - "));
		painel.add(subtVar2);
		painel.add(subtBotao);
		painel.add(subtResult);
		
		painel.add(new JLabel("Multiplicação"));
		painel.add(multVar1);
		painel.add(new JLabel(" x "));
		painel.add(multVar2);
		painel.add(multBotao);
		painel.add(multResult);
		
		painel.add(new JLabel("Divisão"));
		painel.add(divVar1);
		painel.add(new JLabel(" / "));
		painel.add(divVar2);
		painel.add(divBotao);
		painel.add(divResult);
		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setPreferredSize(new Dimension(450, 170));
		janela.pack();
		janela.setVisible(true);
		
	}

}
