package com.oaah.pe.animation;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class Hilo extends Thread {

	private String nombre;
	private int sleep;
	private JPanel jPanel;
	private int y;

	public Hilo(String nombre, int sleep, JPanel jPanel,int y) {
		this.nombre = nombre;
		this.sleep = sleep;
		this.jPanel = jPanel;
		this.y = y;
	}

	public void run() {
		int x = 10;
		for (int i = 1; i <= 10; i++) {

			Rectangulo rectangulo = new Rectangulo(jPanel.getGraphics(), x, y, this.nombre +":"+i);
			System.out.println("numero de hilo" + this.nombre);
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, e);
			}
			x += 75;
		}
	}

}
