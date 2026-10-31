package com.oaah.pe.animation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Rectangulo {
	Color color;

	public Rectangulo(Graphics g, int x, int y, String nombre) {

		g.setColor(Color.GREEN);
		g.fillRect(x, y, 65, 65);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 65, 65);
		g.drawString(nombre, x + 15, y + 25);

	}

}
