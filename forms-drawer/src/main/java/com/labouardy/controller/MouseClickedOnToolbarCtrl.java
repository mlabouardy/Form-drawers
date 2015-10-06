package com.labouardy.controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import com.labouardy.app.MyCanvas;
import com.labouardy.model.*;

public class MouseClickedOnToolbarCtrl implements MouseListener {
	private MyCanvas canvas;
	private List<Form> forms;
	
	public MouseClickedOnToolbarCtrl(MyCanvas canvas, List<Form> forms){
		this.canvas=canvas;
		this.forms=forms;
	}
	
	public void mouseClicked(MouseEvent e) {
		int x=e.getX();
	    int y=e.getY();
	    System.out.println("toolbar: "+x+","+y);
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
