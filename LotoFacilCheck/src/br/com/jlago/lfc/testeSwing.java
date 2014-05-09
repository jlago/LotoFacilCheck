package br.com.jlago.lfc;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testeSwing {

	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    frame.setBounds(100, 100, 450, 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    {
	        JPanel panel = new JPanel();
	        frame.getContentPane().add(panel, BorderLayout.NORTH);
	        panel.setLayout(new GridLayout(0, 1, 0, 0));
	        {
	        	JPanel panel_1 = new JPanel();
	            panel.add(panel_1);
	            {
	                JLabel lblPanelFlowlayout = new JLabel("Panel 2: FlowLayout");
	                panel_1.add(lblPanelFlowlayout);
	            }
	        }
	        {
	        	JPanel panel_2 = new JPanel();
	            panel.add(panel_2);
	            {
	            	JLabel lblPanel = new JLabel("Panel 3: FlowLayout");
	                panel_2.add(lblPanel);
	            }
	        }
	    }
	    
	    frame.pack();
	    frame.setVisible(true);
	}
}
