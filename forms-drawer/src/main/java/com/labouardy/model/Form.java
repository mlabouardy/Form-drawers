package com.labouardy.model;

import java.awt.Graphics;

public interface Form {
	public void draw(Graphics g);
	public boolean isIn(int x, int y);
}
