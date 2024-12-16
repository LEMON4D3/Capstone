package nonAlcohol;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

import lib.*;
import nonAlcohol.milkShake.container;

public class tea extends JLayeredPane{
	
	
	public tea() {
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setPreferredSize(new Dimension(1037, 1403));
		
		Color color[] = {
				Color.decode("#648E9A"),
				Color.decode("#F6B69A"),
				Color.decode("#F0DDAC"),
				Color.decode("#69A592"),
				Color.decode("#B5D5C6")
		};
		
		int index = 0;
		
		for(lib.item i : nData.tea.item) {
			
			if(index > color.length - 1)
				index = 0;
			
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
		
		
		this.add(itemPane, Integer.valueOf(1));
		
		
		this.add(new lib.background(), Integer.valueOf(1));
	
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
			image.setBounds(50, 15, 225, 175);
			
			JLabel name = new JLabel(item.name);
			name.setBounds(300, 15, 350, 50);
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(item.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setBounds(300, 60, 669, 100);
			desc.setFont(tools.RegularFont(18));
			
			JLabel price = new JLabel(item.price);
			price.setBounds(300, 165, 211, 32);
			price.setFont(tools.RegularFont(32));
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
	}
	
	
}

