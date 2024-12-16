package Alcohol.Distilled;

import javax.swing.*;

import lib.tools;
import lib.lib;
import lib.orderA;
import lib.orderF;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

public class brandy extends JLayeredPane{

	
	
	public brandy() {
		
		JLayeredPane pane = this;
		
		LinkedList<lib.item> items = distilledData.brandy.items;
		
		this.setBounds(0, 0, 1080, 720);
		
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
		itemContainer.setBounds(8, 172, 1062, 1221);
		
		boolean green = true;
		
		for(int i = 0; i < items.size(); i++) {
			
			JPanel temp = new JPanel();
			temp.setPreferredSize(new Dimension(1080, 305));
			temp.setLayout(null);
			
			if(i == 4 || i == 3 || i == 0)
				green = true;
			else 
				green = false;
			
			int counter1 = i;
				
			JLayeredPane temp1 = new container(items.get(i), (green) ? Color.decode("#54B492") : Color.decode("#60A8B9"), false);
			temp1.setBounds(0, 0, 530, 300);
			
			i++;
			
			if(i == 0 || i == 3 || i == 4 || i == 7)
				green = true;
			else 
				green = false;
			
			JLayeredPane temp2 = new container(items.get(i), (green) ? Color.decode("#54B492") : Color.decode("#60A8B9"), true);
			temp2.setBounds(532, 0, 530, 300);
			
			int counter2 = i;
			
			temp1.addMouseListener(lib.removeMouse(new orderA(items.get(counter1))));
			
			temp2.addMouseListener(lib.removeMouse(new orderA(items.get(counter2))));
			
			temp.add(temp1);
			temp.add(temp2);
			temp.setOpaque(false);
			
			itemContainer.add(temp);
			itemContainer.setOpaque(false);
			
		}
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setBounds(8, 210, 1062, 530);
		itemPane.getViewport().setOpaque(false);
		itemPane.setOpaque(false);
		itemPane.setBorder(BorderFactory.createEmptyBorder());
		
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.getVerticalScrollBar().setUnitIncrement(16);
		
		
		this.add(new lib.background(), Integer.valueOf(0));
		this.add(itemPane, Integer.valueOf(2));
		
		
	}
	
	class container extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background() {
				
				this.setSize(new Dimension(530, 300));
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				
				g.fillRoundRect(0, 0, 530, 300, 20, 20);
				
			}
			
		}
		
		container(lib.item items, Color color, boolean rightSide) {
			
			this.color = color;
			
			this.setPreferredSize(new Dimension(530, 300));
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			
			JLabel name = new JLabel(items.name);
			name.setFont(tools.BoldFont(16));
			name.setForeground(Color.white);
			
			JLabel desc = new JLabel(items.desc);
			desc.setFont(tools.RegularFont(15));
			desc.setForeground(Color.white);
			desc.setVerticalAlignment(JLabel.TOP);
			
			JLabel price = new JLabel(items.price);
			price.setForeground(Color.white);
			price.setFont(tools.BoldFont(16));
			
			this.add(new background(), Integer.valueOf(0));
			
			if(rightSide) {
				
				image.setBounds(384, 17, 125, 275);
				name.setBounds(14, 5, 380, 54);
				desc.setBounds(14, 50, 372, 213);
				price.setBounds(14, 250, 87, 57);
				
				this.add(image, Integer.valueOf(1));
				this.add(name, Integer.valueOf(1));
				this.add(desc, Integer.valueOf(1));
				this.add(price, Integer.valueOf(1));
				
				return;
			}
			
			image.setBounds(14, 17, 125, 275);
			name.setBounds(143, 5, 380, 54);
			desc.setBounds(143, 50, 372, 213);
			price.setBounds(143, 250, 87, 57);
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
			
		}
		
	}
	
}
