package com.song;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	
	public Calculator() {
		super("����");
		
		// JPanel
		JPanel mainPanel = new JPanel();
		
		// Label
		JLabel label = new JLabel("���ڸ� �Է����ּ���");
		
		// button
		JButton btn1 = new JButton("test button");
		
		mainPanel.add(label);
		mainPanel.add(btn1);
		
		add(mainPanel);
		// size ����
		setSize(450, 800);
		setVisible(true);
		
		// ���� �̺�Ʈ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		
	}

}
