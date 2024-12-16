package nonAlcohol;

import javax.swing.*;


import java.awt.*;
import java.util.LinkedList;

import lib.*;

public class milkShake extends JLayeredPane{
	
	public milkShake() {
		
		
		this.setBounds(0, 0, 1080, 720);
		
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setPreferredSize(new Dimension(1037, 1403));
		
		Color color[] = {
				Color.decode("#B5D5C6"),
				Color.decode("#F0DDAC"),
				Color.decode("#F6B69A"),
				Color.decode("#648E9A"),
				Color.decode("#69A592"),
		};
		
		int index = 0;
		
		
		for(lib.item i : nData.milkShake.item) {
			
			JLayeredPane temp = new container(i, color[index]);
			temp.addMouseListener(lib.removeMouse(new orderF(i)));
			
			container.add(temp);
			
			index++;
		}
		
		
		container.setOpaque(false);
		
		JScrollPane itemPane = new JScrollPane(container);
		itemPane.setBounds(40, 160, 986, 548);
		itemPane.setOpaque(false);
		itemPane.getViewport().setOpaque(false);
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.getVerticalScrollBar().setUnitIncrement(16);
		itemPane.setBorder(BorderFactory.createEmptyBorder());
		
		
		this.add(itemPane, Integer.valueOf(2));
		this.add(new lib.background(), Integer.valueOf(0));
		
	}
	
	
	
	class container extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background(){
				
				this.setBounds(0, 0, 986, 214);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				g.fillRoundRect(0, 0, 986, 214, 20, 20);
				
			}
			
		}
		
		container(lib.item item, Color color) {
			
			this.color = color;
			
			this.setPreferredSize(new Dimension(986, 214));
			
			JLabel image = new JLabel();
			image.setIcon(item.image);
			image.setBounds(23, 17, 215, 170);
			
			JLabel name = new JLabel(item.name);
			name.setBounds(250, 21, 395, 32);
			name.setFont(tools.BoldFont(24));
			
			JLabel desc = new JLabel("<html>" + item.desc + "</html>");
			desc.setFont(tools.RegularFont(24));
			desc.setBounds(250, 35, 669, 164);
			
			JLabel price = new JLabel(item.price);
			price.setBounds(230, 161, 211, 32);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			//this.add(price, Integer.valueOf(1));
			
		}
		
	}
}

