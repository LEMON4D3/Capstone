package Alcohol.fermented;

import lib.*;
import lib.lib.item;

import javax.swing.*;

import Alcohol.fermented.wine.fermentedHeader.bottomHeader;
import Alcohol.fermented.wine.fermentedHeader.container;
import Alcohol.fermented.wine.fermentedHeader.searchBar;

import java.awt.*;

import java.util.*;

public class beer extends JLayeredPane{

	public static JLayeredPane pane = new JLayeredPane();
	
	
	public beer() {
		
		
		
		LinkedList<lib.item> item = fermentedData.beer.item; 
		
		Color color[] = {
				Color.decode("#F6869A"),
				Color.decode("#7AC288"),
				Color.decode("#7AAB8"),
				Color.decode("#B5D5C6"),
				Color.decode("#6FA997"),
		};
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		container.setPreferredSize(new Dimension(998, 575));
		
		
		//container.setBounds(41, 0, 998, 575);
		
		JPanel container1 = new JPanel();
		container1.setLayout(new BoxLayout(container1, BoxLayout.Y_AXIS));
		container1.setPreferredSize(new Dimension(455, 541));
		
		JLayeredPane item1 = new bigContainer(item.get(0), color[0], true);
		item1.addMouseListener(lib.removeMouse(new orderA(item.get(0))));
		
		JLayeredPane item2 = new bigContainer(item.get(1), color[1], false);
		item2.addMouseListener(lib.removeMouse(new orderA(item.get(1))));
		
		container1.add(item1);
		container1.add(item2);
		
		JPanel container2 = new JPanel();
		container2.setLayout(new BoxLayout(container2, BoxLayout.Y_AXIS));
		container2.setPreferredSize(new Dimension(494, 541));
		
		JLayeredPane item3 = new smallContainer(item.get(2), color[2], false);
		item3.addMouseListener(lib.removeMouse(new orderA(item.get(2))));
		
		JLayeredPane item4 = new smallContainer(item.get(3), color[3], true);
		item4.addMouseListener(lib.removeMouse(new orderA(item.get(3))));
		
		JLayeredPane item5 = new smallContainer(item.get(4), color[4], false);
		item5.addMouseListener(lib.removeMouse(new orderA(item.get(4))));
		
		container2.add(item3);
		container2.add(item4);
		container2.add(item5);
		
		container.setOpaque(false);
		container1.setOpaque(false);
		container2.setOpaque(false);
		
		
		container.add(container1);
		container.add(container2);
		
		JScrollPane itemPane = new JScrollPane(container);
		itemPane.setBounds(41, 210, 998, 541);
		
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.getVerticalScrollBar().setUnitIncrement(16);
		
		itemPane.setOpaque(false);
		itemPane.getViewport().setOpaque(false);
		
		itemPane.setBorder(BorderFactory.createEmptyBorder());
		
		
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(itemPane, Integer.valueOf(2));
		
	}
	
	class bigContainer extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background(){
				
				this.setBounds(0, 0, 455, 243);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				g.fillRoundRect(0, 0, 455, 243, 20, 20);
				
			}
			
		}
		
		bigContainer(lib.item item, Color color, boolean rightSide){
			
			this.color = color;
			
			JLabel image = new JLabel();
			image.setIcon(item.image);
			
			JLabel name = new JLabel(item.name);
			
			JLabel desc = new JLabel("<html>" + item.desc + "</html>");
			
			JLabel price = new JLabel(item.price);
			
			if(rightSide) {
				
				image.setBounds(22, 23, 130, 197);
				name.setBounds(235, 29, 393, 71);
				
				this.add(new background(), Integer.valueOf(0));
				
				this.add(image, Integer.valueOf(1));
				this.add(name, Integer.valueOf(1));
				
				return;
			}
			
			image.setBounds(290, 29, 130, 197);
			name.setBounds(125, 29, 393, 71);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			
		}
		
	}
	
	class smallContainer extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background(){
				
				this.setBounds(0, 0, 497, 182);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				g.fillRoundRect(0, 0, 497, 182, 20, 20);
				
			}
			
		}
		
		smallContainer(lib.item item, Color color, boolean rightSide){
			
			this.color = color;
			this.setPreferredSize(new Dimension(497, 182));
			
			
			JLabel image = new JLabel();
			image.setIcon(item.image);
			
			JLabel name = new JLabel(item.name);
			
			JLabel desc = new JLabel("<html>" + item.desc + "</html>");
			
			JLabel price = new JLabel(item.price);
			
			if(rightSide) {
				
				image.setBounds(15, 18, 131, 131);
				name.setBounds(250, 23, 393, 71);
				
				this.add(new background(), Integer.valueOf(0));
				
				this.add(image, Integer.valueOf(1));
				this.add(name, Integer.valueOf(1));
				
				return;
			}
			
			image.setBounds(345, 25, 131, 131);
			name.setBounds(20, 25, 316, 38);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			
		}
		
	}
}
