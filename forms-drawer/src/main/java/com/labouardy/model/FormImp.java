package com.labouardy.model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class FormImp implements Form {
	protected int posX, posY;
	protected Color color;
	
	public FormImp(int posX, int posY, Color color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

}
