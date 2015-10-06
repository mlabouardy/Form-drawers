package com.labouardy.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.labouardy.controller.MouseClickedOnBoardCtrl;
import com.labouardy.controller.MouseClickedOnToolbarCtrl;
import com.labouardy.model.Circle;
import com.labouardy.model.Form;
import com.labouardy.model.Square;

public class Main {
	private static final int SCREEN_WIDTH = 800;
	private static final int SCREEN_HEIGHT = 400;
	private static final int TOOLBAR_WIDTH = 120;

	public static void main(String[] args) {
		JFrame window = new JFrame("Forms Drawer");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		window.setLayout(null);

		// Create toolbar panel
		List<Form> listOfFormsOfToolBar = new ArrayList<Form>();
		Form square = new Square(10, 10, Color.BLUE, 80);
		Form circle = new Circle(10, 100, Color.pink, 80);

		listOfFormsOfToolBar.add(square);
		listOfFormsOfToolBar.add(circle);

		MyCanvas toolbar = new MyCanvas(listOfFormsOfToolBar, TOOLBAR_WIDTH, SCREEN_HEIGHT);
		window.add(toolbar);
		
		MouseClickedOnToolbarCtrl toolbarCtrl=new MouseClickedOnToolbarCtrl(toolbar, listOfFormsOfToolBar);
		toolbar.addMouseListener(toolbarCtrl);
		
		//Create Board panel
		List<Form> listOfFormsOfBoard = new ArrayList<Form>();
		MyCanvas board = new MyCanvas(listOfFormsOfBoard, SCREEN_WIDTH, SCREEN_HEIGHT);
		board.setLocation(120, 0);
		window.add(board);

		MouseClickedOnBoardCtrl boardCtrl=new MouseClickedOnBoardCtrl(board, listOfFormsOfBoard);
		board.addMouseListener(boardCtrl);
		
		window.setVisible(true);
		window.setLocationRelativeTo(null);

	}
}
