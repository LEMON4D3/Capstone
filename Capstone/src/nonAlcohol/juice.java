package nonAlcohol;

import javax.swing.*;

import lib.tools;
import lib.lib;
import lib.orderF;

import java.awt.*;
import java.util.LinkedList;

public class juice extends JLayeredPane{

	public juice() {
		
		LinkedList<lib.item> items = nData.juice.item;
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
		itemContainer.setBounds(8, 172, 1062, 1221);
		
		Color color[] = {
				Color.decode("#F6B69A"),
				Color.decode("#648E9A"),
				Color.decode("#69A592"),
				Color.decode("#F0DDAC"),
		};
		
		int index = 0;
		boolean loop = false;
		
		for(int i = 0; i < items.size(); i++) {
			
			JPanel temp = new JPanel();
			temp.setPreferredSize(new Dimension(1080, 305));
			temp.setLayout(null);
			
			if(index > color.length - 1 && loop) {
				index = 0;
				loop = false;
			} else if(index > color.length - 1) {
				index = 1;
				loop = true;
			}
				
			JLayeredPane temp1 = new container(items.get(i), color[index], false);
			temp1.addMouseListener(lib.removeMouse(new orderF(items.get(i))));
			temp1.setBounds(0, 0, 530, 300);
			
			i++;
			index++;
			
			if(index > color.length - 1 && loop) {
				index = 0;
				loop = false;
			} else if(index > color.length - 1) {
				index = 1;
				loop = true;
			}
			
			JLayeredPane temp2 = new container(items.get(i), color[index], false);
			temp2.addMouseListener(lib.removeMouse(new orderF(items.get(i))));
			temp2.setBounds(532, 0, 530, 300);
			
			index++;
			
			temp.add(temp1);
			temp.add(temp2);
			temp.setOpaque(false);
			
			itemContainer.add(temp);
			itemContainer.setOpaque(false);
			
		}
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setBounds(8, 160, 1062, 530);
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
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(items.desc);
			desc.setFont(tools.RegularFont(13));
			desc.setVerticalAlignment(JLabel.TOP);
			
			JLabel price = new JLabel(items.price);
			price.setFont(tools.BoldFont(28));
			
			this.add(new background(), Integer.valueOf(0));
			
			if(rightSide) {
				
				image.setBounds(289, 15, 225, 250);
				name.setBounds(28, 42, 227, 43);
				desc.setBounds(29, 102, 248, 141);
				price.setBounds(34, 227, 87, 57);
				
				this.add(image, Integer.valueOf(1));
				this.add(name, Integer.valueOf(1));
				this.add(desc, Integer.valueOf(1));
				this.add(price, Integer.valueOf(1));
				
				return;
			}
			
			image.setBounds(15, 20, 225, 250);
			name.setBounds(250, 20, 225, 50);
			desc.setBounds(250, 75, 250, 175);
			price.setBounds(250, 250, 100, 50);
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
			
		}
		
	}
	
}
