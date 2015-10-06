package com.labouardy.model;

import static java.lang.Math.pow;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends FormImp {
	private int radius;
	
	public Circle(int posX, int posY, Color color, int radius){
		super(posX, posY, color);
		this.radius=radius;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(posX, posY, radius, radius);
	}

	public boolean isIn(int x, int y) {
		return (pow(x-posX,2)+pow(y-posY,2)) < pow(radius,2);
	}

}
