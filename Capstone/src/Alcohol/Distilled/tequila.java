package Alcohol.Distilled;

import javax.swing.*;

import lib.*;

import java.awt.*;
import java.util.LinkedList;

public class tequila extends JLayeredPane{

	Color green = Color.decode("#69A592"), lightGreen = Color.decode("#B5D5C6"), darkGreen = Color.decode("#648E9A");
	
	public tequila() {
		
		LinkedList<lib.item> items = distilledData.tequila.items;
		
		JLayeredPane pane = this;
		
		
		
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
		itemContainer.setPreferredSize(new Dimension(1070, 1050));
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(1070, 500));
		
		JLayeredPane item1 = new container(items.get(0), green);
		item1.addMouseListener(lib.removeMouse(new orderA(items.get(0))));
		
		JLayeredPane item2 = new container(items.get(1), lightGreen);
		item2.addMouseListener(lib.removeMouse(new orderA(items.get(1))));
		
		JLayeredPane item3 = new container(items.get(2), darkGreen);
		item3.addMouseListener(lib.removeMouse(new orderA(items.get(2))));
		
		panel1.add(item1);
		panel1.add(Box.createHorizontalStrut(20));
		
		panel1.add(item2);
		panel1.add(Box.createHorizontalStrut(20));
		
		panel1.add(item3);
		
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(1070, 500));
		
		JLayeredPane item4 = new container(items.get(3), green);
		item4.addMouseListener(lib.removeMouse(new orderA(items.get(3))));
		
		JLayeredPane item5 = new container(items.get(4), lightGreen);
		item5.addMouseListener(lib.removeMouse(new orderA(items.get(4))));
		
		JLayeredPane item6 = new container(items.get(5), darkGreen);
		item6.addMouseListener(lib.removeMouse(new orderA(items.get(5))));
		
		panel2.add(item4);
		panel2.add(Box.createHorizontalStrut(20));
		
		panel2.add(item5);
		panel2.add(Box.createHorizontalStrut(20));
		
		panel2.add(item6);
		
		itemContainer.setOpaque(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		
		itemContainer.add(panel1);
		itemContainer.add(panel2);
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setBounds(15, 210, 1070, 525);
		itemPane.setBorder(BorderFactory.createEmptyBorder());
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.getVerticalScrollBar().setUnitIncrement(16);
		
		itemPane.setOpaque(false);
		itemPane.getViewport().setOpaque(false);
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(itemPane, Integer.valueOf(2 ));
		
		
		
	}
	
	class container extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background(){
				
				this.setBounds(0, 0, 315, 507);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				
				g.fillRoundRect(0, 0, 318, 507, 20, 20);
				
			}
			
		}
		
		container(lib.item items, Color color){
			
			this.color = color;
			
			this.setPreferredSize(new Dimension(318, 507));
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			image.setBounds(96, 10, 150, 150);
			
			JLabel name = new JLabel(items.name, SwingConstants.CENTER);
			name.setBounds(22, 165, 274, 50);
			name.setForeground((color == lightGreen) ? Color.black : Color.white);
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(items.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setBounds(8, 220, 300, 300);
			desc.setForeground((color == lightGreen) ? Color.black : Color.white);
			desc.setFont(tools.RegularFont(13));
			
			JLabel price = new JLabel(items.price);
			price.setForeground((color == lightGreen) ? Color.black : Color.white);
			price.setFont(tools.BoldFont(15));
			price.setBounds(8, 475, 95, 23);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
		}
		
	}
	
}
