package com.oaah.pe.animation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSimulacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSimulacion frame = new FrmSimulacion();
					frame.setVisible(true);
					System.out.println("hello world");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmSimulacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel jPanelSimulacion = new JPanel();
		jPanelSimulacion.setBackground(new Color(135, 206, 235));
		jPanelSimulacion.setBounds(24, 31, 790, 444);
		contentPane.add(jPanelSimulacion);

		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Rectangulo r = new Rectangulo(jPanelSimulacion.getGraphics(),10,10,"Hilo");
				/*
				Hilo h1 = new Hilo("thread-1", 1000, jPanelSimulacion, 10);
				h1.start();

				Hilo h2 = new Hilo("thread-2", 1000, jPanelSimulacion, 80);
				h2.start();
				
				Hilo h3 = new Hilo("thread-3", 1000, jPanelSimulacion, 160);
				h3.start();
				*/
				createThread(1,jPanelSimulacion,10);
				createThread(10,jPanelSimulacion,80);
				

			}
		});
		btnSimular.setBounds(24, 10, 84, 20);
		contentPane.add(btnSimular);

	}

	public void createThread(int countThread, JPanel jPanelSimulacion,int spaceY) {
		int space = 0;
		for (int i = 0; i < countThread; i++) {
			Hilo h = new Hilo("thread-"+i, 1000, jPanelSimulacion, space);
			h.start();
			space+=spaceY;
		}

	}
}
