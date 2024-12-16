package Alcohol.Distilled;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import lib.lib;
import lib.orderA;
import lib.tools;
import lib.lib.background;

public class Categories extends JLayeredPane {
	
	
	class itemBox extends JLabel{
		
		int x, y, height, width, size;
		
		Color color;
		String text;
		
		itemBox(int x, int y, int width, int height, int size, String text, Color color){
			
			this.setBounds(x, y, width, height);
			this.setOpaque(true);
			
			
			this.x = x;
			this.y = y;
			this.height = height;
			this.width = width;
			this.size = size;
			
			this.color = color;		
			
			this.text = text;
		}
		
		
		public void paint(Graphics g) {
			
			
			g.setColor(color);
			g.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), size, size);
			

			g.setColor(Color.black);
			FontMetrics metrics = g.getFontMetrics(tools.BoldFont(36));
			g.setFont(tools.BoldFont(36));
			g.drawString(text, (this.getWidth() - metrics.stringWidth(text)) / 2, this.getHeight() / 2);
			
		    
		}
		
		
	}
	
	
	
	public Categories(){
		
		JLayeredPane pane = this;
		
		this.setBounds(0, 0, 1080, 720);
		this.setLayout(null);
		
		JLabel whiskey = new itemBox(32, 210, 316, 217, 30, "Whiskey", Color.decode("#B5D5C6"));
		JLabel rum = new itemBox(381, 210, 316, 217, 30, "Rum", Color.decode("#FCCCB7"));
		JLabel vodka = new itemBox(730, 210, 316, 217, 30, "Vodka", Color.decode("#69A592"));
		JLabel brandy = new itemBox(32, 472, 316, 217, 30, "Brandy", Color.decode("#F0DDAC"));
		JLabel gin = new itemBox(381, 472, 316, 217, 30, "Gin", Color.decode("#FFFFFF"));
		JLabel tequila = new itemBox(730, 472, 316, 217, 30, "tequila", Color.decode("#83ADB7"));
		
		whiskey.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				new lib.distilledF(new whiskey(), 1);
				}}
		);
		
		rum.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				new lib.distilledF(new rum(), 2);
				}}
		);
		
		vodka.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				new lib.distilledF(new vodka(), 3);
				}}
		);
		
		brandy.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				new lib.distilledF(new brandy(), 4);
				}}
		);
		
		gin.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				new lib.distilledF(new gin(), 5);
				}}
		);
		
		tequila.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				new lib.distilledF(new tequila(), 6);
				}}
		);
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(whiskey, Integer.valueOf(1));
		this.add(rum, Integer.valueOf(1));
		this.add(vodka, Integer.valueOf(1));
		this.add(brandy, Integer.valueOf(1));
		this.add(gin, Integer.valueOf(1));
		this.add(tequila, Integer.valueOf(1));
	}
	
	
}
