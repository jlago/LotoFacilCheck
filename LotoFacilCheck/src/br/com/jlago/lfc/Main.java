package br.com.jlago.lfc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.jlago.lfc.util.JTextDocumentCustomizado;

public class Main {

	private JFrame janela;
	private JPanel painelPrincipal;
	private JPanel painelAcerto;	
	private JPanel painelNumerosJogados;
	private JPanel painelNumerosSorteados;
	private JPanel painelBotao;
	private JPanel painelResultado;
	private JTextField txtNum01;
	private JTextField txtNum02;
	private JTextField txtNum03;
	private JTextField txtNum04;
	private JTextField txtNum05;
	private JTextField txtNum06;
	private JTextField txtNum07;
	private JTextField txtNum08;
	private JTextField txtNum09;
	private JTextField txtNum10;
	private JTextField txtNum11;
	private JTextField txtNum12;
	private JTextField txtNum13;
	private JTextField txtNum14;
	private JTextField txtNum15;
	
	private JLabel lblNumeros;
	private JLabel lblNumerosSorteados;
	private JLabel lblNumerosJogados;
	private JLabel lblNumeroAcertosLabel;
	private JLabel lblNumeroAcertos;
	private JLabel lblResultadoLabel;
	private JLabel lblResultado;

	 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main().montaTela();
	}
	
	public void montaTela() {
		preparaJanela();
		preparaPainelPrincipal();
		preparaPainelNumerosJogados();
		preparaNumerosJogados();
		preparaPainelNumerosSorteados();
		preparaNumerosSorteados();
		preparaPainelBotaoCheck();
		preparaPainelAcertos();
		preparaPainelResultado();
		preparaBotaoCheck();
		preparaBotaoLimpar();
		mostraJanela();
	}
	
	private void preparaJanela() {
	    janela = new JFrame("Lotofácil Check");
	    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void preparaPainelPrincipal() {
		  painelPrincipal = new JPanel();
	      janela.getContentPane().add(painelPrincipal);
		  painelPrincipal.setLayout(new GridLayout(0, 1, 0, 0));
		  //janela.add(painelPrincipal);
	}
	
	private void mostraJanela() {
		janela.pack();
	    //janela.setSize(540, 540);
	    janela.setVisible(true);
	 }
	
	private void preparaPainelNumerosJogados(){
		  painelNumerosJogados = new JPanel();
		  painelPrincipal.add(painelNumerosJogados);
	}
	
	private void preparaNumerosJogados(){
		lblNumeros = new JLabel("Números Jogados: ");
		lblNumeros.setHorizontalTextPosition(JLabel.LEFT);
		painelNumerosJogados.add(lblNumeros);

		String numerosJogados="";
		for (Integer numero : Constantes.NUMEROS_JOGADOS) {
			numerosJogados += numero.toString();
			if (!numero.equals(Constantes.NUMEROS_JOGADOS[Constantes.NUMEROS_JOGADOS.length-1])){
				numerosJogados += " - ";
			}
		}
		lblNumerosJogados = new JLabel(numerosJogados);
		lblNumerosJogados.setHorizontalTextPosition(JLabel.LEFT);
		painelNumerosJogados.add(lblNumerosJogados);
	}
	
	private void preparaPainelNumerosSorteados(){
		  painelNumerosSorteados = new JPanel();
		  painelPrincipal.add(painelNumerosSorteados);
	}
	

	private void preparaPainelBotaoCheck(){
		  painelBotao = new JPanel();
		  painelPrincipal.add(painelBotao);
	}
	
	private void preparaPainelResultado(){
		  painelResultado = new JPanel();
		  lblResultadoLabel = new JLabel("Resultado: ");
		  lblResultado=new JLabel("Você está pobre.");
		  painelResultado.add(lblResultadoLabel);
		  painelResultado.add(lblResultado);
		  painelPrincipal.add(painelResultado);
	}
	
	private void preparaPainelAcertos(){
			painelAcerto = new JPanel();
		  lblNumeroAcertosLabel = new JLabel("Acertos: ");
		  lblNumeroAcertos = new JLabel("0");
		  painelAcerto.add(lblNumeroAcertosLabel);
		  painelAcerto.add(lblNumeroAcertos);
		  painelPrincipal.add(painelAcerto);
	}
	
	private void preparaNumerosSorteados(){
		lblNumerosSorteados = new JLabel("Números Sorteados: ");
		txtNum01 = new JTextField(Constantes.LIMITE_CAMPO);
		txtNum01.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum02 = new JTextField(2);
		txtNum02.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum03 = new JTextField(2);
		txtNum03.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum04 = new JTextField(2);
		txtNum04.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum05 = new JTextField(2);
		txtNum05.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum06 = new JTextField(2);
		txtNum06.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum07 = new JTextField(2);
		txtNum07.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum08 = new JTextField(2);
		txtNum08.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum09 = new JTextField(2);
		txtNum09.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum10 = new JTextField(2);
		txtNum10.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum11 = new JTextField(2);
		txtNum11.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum12 = new JTextField(2);
		txtNum12.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum13 = new JTextField(2);
		txtNum13.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum14 = new JTextField(2);
		txtNum14.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		txtNum15 = new JTextField(2);
		txtNum15.setDocument(new JTextDocumentCustomizado(Constantes.LIMITE_CAMPO));
		
		painelNumerosSorteados.add(lblNumerosSorteados);
		painelNumerosSorteados.add(txtNum01);
		painelNumerosSorteados.add(txtNum02);
		painelNumerosSorteados.add(txtNum03);
		painelNumerosSorteados.add(txtNum04);
		painelNumerosSorteados.add(txtNum05);
		painelNumerosSorteados.add(txtNum06);
		painelNumerosSorteados.add(txtNum07);
		painelNumerosSorteados.add(txtNum08);
		painelNumerosSorteados.add(txtNum09);
		painelNumerosSorteados.add(txtNum10);
		painelNumerosSorteados.add(txtNum11);
		painelNumerosSorteados.add(txtNum12);
		painelNumerosSorteados.add(txtNum13);
		painelNumerosSorteados.add(txtNum14);
		painelNumerosSorteados.add(txtNum15);
	}
	
	private void preparaBotaoCheck() {
		  JButton botaoCarregar = new JButton("Check");
		  botaoCarregar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	List<Integer> sorteados = new ArrayList<Integer>();
		    	sorteados.add(getIntegerNumero(txtNum01.getText()));
		    	sorteados.add(getIntegerNumero(txtNum02.getText()));
		    	sorteados.add(getIntegerNumero(txtNum03.getText()));
		    	sorteados.add(getIntegerNumero(txtNum04.getText()));
		    	sorteados.add(getIntegerNumero(txtNum05.getText()));
		    	sorteados.add(getIntegerNumero(txtNum06.getText()));
		    	sorteados.add(getIntegerNumero(txtNum07.getText()));
		    	sorteados.add(getIntegerNumero(txtNum08.getText()));
		    	sorteados.add(getIntegerNumero(txtNum09.getText()));
		    	sorteados.add(getIntegerNumero(txtNum10.getText()));
		    	sorteados.add(getIntegerNumero(txtNum11.getText()));
		    	sorteados.add(getIntegerNumero(txtNum12.getText()));
		    	sorteados.add(getIntegerNumero(txtNum13.getText()));
		    	sorteados.add(getIntegerNumero(txtNum14.getText()));
		    	sorteados.add(getIntegerNumero(txtNum15.getText()));
	    	
		    	Integer qtdeAcertos=0;
		    	for (Integer jogado : Constantes.NUMEROS_JOGADOS) {
		    		for (Integer sorteado : sorteados) {
						if (jogado.equals(sorteado)){
							qtdeAcertos+=1;
							break;
						}
					}
				}
		    	lblNumeroAcertos.setText(qtdeAcertos.toString());
		    	
		    	if (qtdeAcertos>10){
		    		lblResultado.setText("Você ganhou!!!");
		    	}else{
		    		lblResultado.setText("Você não ganhou!!! :(");
		    	}
		    }
		  });
		  painelBotao.add(botaoCarregar);
		}
	
	private void preparaBotaoLimpar() {
		  JButton botaoLimpar = new JButton("Limpar");
		  botaoLimpar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	txtNum01.setText("");
		    	txtNum02.setText("");
		    	txtNum03.setText("");
		    	txtNum04.setText("");
		    	txtNum05.setText("");
		    	txtNum06.setText("");
		    	txtNum07.setText("");
		    	txtNum08.setText("");
		    	txtNum09.setText("");
		    	txtNum10.setText("");
		    	txtNum11.setText("");
		    	txtNum12.setText("");
		    	txtNum13.setText("");
		    	txtNum14.setText("");
		    	txtNum15.setText("");
	    	
		    	lblNumeroAcertos.setText("0");
	    		lblResultado.setText("");
		    }
		  });
		  painelBotao.add(botaoLimpar);
		}
	
	private Integer getIntegerNumero(String numero){
		if (numero==null){
			return 0;
		}
		try{
			return Integer.valueOf(numero);
		}catch (Exception e) {
			return 0;
		}
	}
}
