package com.labouardy.controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import com.labouardy.app.MyCanvas;
import com.labouardy.model.Form;
import com.labouardy.model.Square;

public class MouseClickedOnBoardCtrl implements MouseListener{
	private List<Form> forms;
	private MyCanvas canvas;
	
	public MouseClickedOnBoardCtrl(MyCanvas canvas, List<Form> forms){
		this.canvas=canvas;
		this.forms=forms;
	}
	
	public void mouseClicked(MouseEvent e) {
		int x=e.getX();
	    int y=e.getY();
	    System.out.println(x+","+y);
	    forms.add(new Square(x, y, Color.GREEN, 30));
	    canvas.repaint();
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
