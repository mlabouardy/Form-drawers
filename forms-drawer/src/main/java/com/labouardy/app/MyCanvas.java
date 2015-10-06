package com.labouardy.app;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;

import com.labouardy.model.Form;

public class MyCanvas extends JPanel {
	private List<Form> forms;
	
	
	public MyCanvas(List<Form> forms, int width, int height){
		this.forms=forms;
		setBackground(Color.WHITE);
		setSize(width, height);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        for(Form f:forms){
        	f.draw(g);
        }
    }  
}
