package Alcohol.Distilled;

import java.awt.*;
import javax.swing.*;

import lib.*;

import java.util.LinkedList;

public class gin extends JLayeredPane{

	public gin() {
		
		JLayeredPane pane = this;
		
		Color blue = Color.decode("#7AAAB8"), lightBlue = Color.decode("#60A8B9");
		
		Color green = Color.decode("#6FA997");
		
		LinkedList<lib.item> items = distilledData.gin.items;
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.X_AXIS));
		itemContainer.setPreferredSize(new Dimension(2085, 525));
		
		//itemContainer.setBounds(37, 180, 2085, 525);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.setPreferredSize(new Dimension(1008, 525));
		
		JLayeredPane item1 = new container(items.get(0), green);
		item1.addMouseListener(lib.removeMouse(new orderA(items.get(0))));
		
		panel1.add(item1);
		//panel1.add(Box.createHorizontalStrut(10));
		
		JLayeredPane item2 = new container(items.get(1), lightBlue);
		item2.addMouseListener(lib.removeMouse(new orderA(items.get(1))));
		
		panel1.add(item2);
		
		JLayeredPane item3 = new container(items.get(2), blue);
		item3.addMouseListener(lib.removeMouse(new orderA(items.get(2))));
		
		panel1.add(item3);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.setPreferredSize(new Dimension(1008, 525));
	
		JLayeredPane item4 = new container(items.get(3), green);
		item4.addMouseListener(lib.removeMouse(new orderA(items.get(3))));
		
		panel2.add(item4);
		
		JLayeredPane item5 = new container(items.get(4), lightBlue);
		item5.addMouseListener(lib.removeMouse(new orderA(items.get(4))));
		
		panel2.add(item5);
		
		JLayeredPane item6 = new container(items.get(5), blue);
		item6.addMouseListener(lib.removeMouse(new orderA(items.get(5))));
		
		panel2.add(item6);
		
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		itemContainer.setOpaque(false);
		
		itemContainer.add(panel1);
		itemContainer.add(panel2);
		
		
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setBounds(37, 210, 1080-37, 525);
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		//itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.getHorizontalScrollBar().setUnitIncrement(16);
		itemPane.setBorder(BorderFactory.createEmptyBorder());
		
		itemPane.setOpaque(false);
		itemPane.getViewport().setOpaque(false);
		
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(itemPane, Integer.valueOf(2));
		
	}
	
	class container extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background() {
				
				this.setBounds(0, 0, 306, 476);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				
				g.fillRoundRect(0, 0, 306, 476, 20, 20);
				
			}
			
		}
		
		container(lib.item items, Color color){
			
			this.color = color;
			
			this.setBounds(0, 0, 306, 476);
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			image.setBounds(83, 17, 150, 150);
			
			JLabel name = new JLabel(items.name);
			name.setBounds(25, 175, 256, 34);
			name.setFont(tools.BoldFont(16));
			name.setForeground(Color.white);
			
			JLabel desc = new JLabel(items.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setBounds(20, 210, 274, 225);
			desc.setForeground(Color.white);
			desc.setFont(tools.RegularFont(12));
			
			JLabel price = new JLabel(items.price);
			price.setForeground(Color.white);
			price.setFont(tools.BoldFont(15));
			price.setBounds(20, 430, 66, 41);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
	}
	
}
