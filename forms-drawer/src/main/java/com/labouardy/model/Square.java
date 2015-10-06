package com.labouardy.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import static java.lang.Math.*;

public class Square extends FormImp{
	private int length;
	
	public Square(int posX, int posY, Color color, int length){
		super(posX, posY, color);
		this.length=length;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(posX, posY, length,length);
	}

	public boolean isIn(int x, int y) {
		Rectangle rectangle=new Rectangle(posX, posY, length,length);
		return rectangle.contains(x, y);
	}


}
