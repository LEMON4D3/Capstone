package Alcohol.fermented;

import javax.swing.*;

import Alcohol.fermented.wine.fermentedHeader.bottomHeader;
import Alcohol.fermented.wine.fermentedHeader.container;
import Alcohol.fermented.wine.fermentedHeader.searchBar;
import lib.tools;
import lib.lib;
import lib.orderA;

import java.awt.*;
import java.util.LinkedList;

public class perry extends JLayeredPane{

	public perry() {
		
		LinkedList<lib.item> items = fermentedData.perry.items;
		
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
			
				
			JLayeredPane temp1 = new container(items.get(i), (green) ? Color.decode("#54B492") : Color.decode("#60A8B9"), false);
			temp1.addMouseListener(lib.removeMouse(new orderA(items.get(i))));
			temp1.setBounds(0, 0, 530, 300);
			
			i++;
			
			if(i == 0 || i == 3 || i == 4 || i == 7)
				green = true;
			else 
				green = false;
			
			JLayeredPane temp2 = new container(items.get(i), (green) ? Color.decode("#54B492") : Color.decode("#60A8B9"), false);
			temp2.addMouseListener(lib.removeMouse(new orderA(items.get(i))));
			temp2.setBounds(532, 0, 530, 300);
			
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
		//this.add(new fermentedHeader(4, this), Integer.valueOf(1));
		
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
			
			JLabel desc = new JLabel("<html>" + items.desc + "</html>");
			
			JLabel price = new JLabel(items.price);
			
			this.add(new background(), Integer.valueOf(0));
			
			if(rightSide) {
				
				image.setBounds(289, 15, 220, 256);
				name.setBounds(28, 42, 227, 43);
				desc.setBounds(29, 102, 248, 141);
				price.setBounds(34, 227, 87, 57);
				
				this.add(image, Integer.valueOf(1));
				this.add(name, Integer.valueOf(1));
				this.add(desc, Integer.valueOf(1));
				this.add(price, Integer.valueOf(1));
				
				return;
			}
			
			image.setBounds(14, 17, 220, 256);
			name.setBounds(266, 42, 227, 43);
			desc.setBounds(266, 101, 248, 141);
			price.setBounds(277, 227, 87, 57);
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
			
		}
		
	}
	
}
