package nonAlcohol;

import java.awt.*;
import javax.swing.*;

import lib.*;

import java.util.LinkedList;

public class smoothie extends JLayeredPane{

	public smoothie() {
		
		Color blue = Color.decode("#69A592"), lightBlue = Color.decode("#648E9A");
		
		LinkedList<lib.item> items = nData.smoothie.item;
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.X_AXIS));
		itemContainer.setPreferredSize(new Dimension(2085, 525));
		
		//itemContainer.setBounds(37, 180, 2085, 525);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.setPreferredSize(new Dimension(1008, 525));
		
		JLayeredPane item1 = new container(items.get(0), blue);
		item1.addMouseListener(lib.removeMouse(new orderF(items.get(0))));
		
		panel1.add(item1);
		//panel1.add(Box.createHorizontalStrut(10));
		
		JLayeredPane item2 = new container(items.get(1), lightBlue);
		item2.addMouseListener(lib.removeMouse(new orderF(items.get(1))));
		
		panel1.add(item2);
		
		JLayeredPane item3 = new container(items.get(2), blue);
		item3.addMouseListener(lib.removeMouse(new orderF(items.get(2))));
		
		panel1.add(item3);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.setPreferredSize(new Dimension(1008, 525));
	
		JLayeredPane item4 = new container(items.get(3), lightBlue);
		item4.addMouseListener(lib.removeMouse(new orderF(items.get(3))));
		
		panel2.add(item4);
		
		JLayeredPane item5 = new container(items.get(4), blue);
		item5.addMouseListener(lib.removeMouse(new orderF(items.get(4))));
		
		panel2.add(item5);
		
		JLayeredPane item6 = new container(items.get(5), lightBlue);
		item6.addMouseListener(lib.removeMouse(new orderF(items.get(5))));
		
		panel2.add(item6);
		
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		itemContainer.setOpaque(false);
		
		itemContainer.add(panel1);
		itemContainer.add(panel2);
		
		
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setBounds(37, 160, 1080-37, 525);
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
			image.setBounds(25, 10, 250, 175);
			
			JLabel name = new JLabel(items.name);
			name.setBounds(10, 200, 275, 25);
			name.setForeground(Color.white);
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(items.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setBounds(10, 225, 275, 200);
			desc.setFont(tools.RegularFont(13));
			desc.setForeground(Color.white);
			
			JLabel price = new JLabel(items.price);
			price.setBounds(10, 425, 100, 50);
			price.setForeground(Color.white);
			price.setFont(tools.BoldFont(24));
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
	}
	
}
