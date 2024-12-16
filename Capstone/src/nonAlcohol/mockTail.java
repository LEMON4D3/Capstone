package nonAlcohol;

import javax.swing.*;
import java.awt.*;

import lib.*;

public class mockTail extends JLayeredPane{
	
	enum sideEnum {
		left,
		right
	}
	
	enum smallColor {
		Blue,
		Green
	}
	
	sideEnum side = sideEnum.left;
	smallColor sColor = smallColor.Blue;
	
	public mockTail() {
		
		JLayeredPane pane = this;
		
		
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
		
		this.setBounds(0, 0, 1080, 720);
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		
		
		
		for(int i = 0; i < nData.mockTail.item.size() / 3; i++) {
			
			JLayeredPane temp = new JLayeredPane();
			temp.setPreferredSize(new Dimension(1080, 580));
			
			JLayeredPane big = new JLayeredPane();
			JLayeredPane upSmall = new JLayeredPane();
			JLayeredPane bottomSmall = new JLayeredPane();
			
			
			for(int a = i * 3; a < (i * 3) + 3; a++) {
				
				switch(a % 3) {
				
				case 0:
					big = new bigContainer(nData.mockTail.item.get(a));
					big.addMouseListener(lib.removeMouse(new orderA(nData.mockTail.item.get(a))));
					break;
				case 1:
					upSmall = new smallContainer(nData.mockTail.item.get(a));
					upSmall.addMouseListener(lib.removeMouse(new orderA(nData.mockTail.item.get(a))));
					break;
				case 2:
					bottomSmall = new smallContainer(nData.mockTail.item.get(a));
					bottomSmall.addMouseListener(lib.removeMouse(new orderA(nData.mockTail.item.get(a))));
					break;
				
				}
				
				
				
			}
			
			switch(side) {
			
			case left:
				big.setBounds(0, 0, big.getWidth(), big.getHeight());
				upSmall.setBounds(445, 0, 644, 281);
				bottomSmall.setBounds(445, 290, 635, 279);
				side = sideEnum.right;
				break;
			case right:
				big.setBounds(641, 0, 439, 564);
				upSmall.setBounds(0, 0, 644, 281);
				bottomSmall.setBounds(0, 290, 635, 279);
				side = sideEnum.left;
				break;
			
			}
			
			
			temp.add(big);
			temp.add(upSmall);
			temp.add(bottomSmall);
			temp.setOpaque(false);
			
			
			itemContainer.add(temp, Integer.valueOf(4));
			itemContainer.setOpaque(false);
		}
		
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.setBorder(BorderFactory.createEmptyBorder() );
		itemPane.getVerticalScrollBar().setUnitIncrement(16);
		
		itemPane.setBounds(14, 160, 1080 - 14, 720 - 150);
		itemPane.setOpaque(false);
		itemPane.getViewport().setOpaque(false);
		
		this.add(itemPane, Integer.valueOf(4));
	}
	
	
	class bigContainer extends JLayeredPane{
		
		class background extends JPanel{
			
			background() {
				
				this.setSize(new Dimension(439, 569));
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(Color.decode("#6FA997"));
				g.fillRoundRect(0, 0, 439, 569, 20, 20);
				
			}
		}
		
		bigContainer(lib.item items) {
			
			this.setSize(new Dimension(439, 569));
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			image.setBounds(62, 19, 308, 262);
			
			JLabel name = new JLabel(items.name);
			name.setBounds(62, 290, 373, 41);
			name.setFont(tools.BoldFont(24));
			
			JLabel desc = new JLabel("<html>" + items.desc + "</html>");
			desc.setBounds(62, 332, 274, 182);
			desc.setFont(tools.RegularFont(16));
		
			
			JLabel price = new JLabel(items.price);
			price.setBounds(62, 505, 86, 41);
			price.setFont(tools.BoldFont(24));
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
		
		
	}

	class smallContainer extends JLayeredPane{
		
		Color color;
		
		class background extends JPanel{
			
			background() {
				this.setSize(new Dimension(635, 281));
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				
				g.fillRoundRect(0, 0, 635, 281, 20, 20);
				
			}
			
		}
		
		smallContainer(lib.item items) {
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			
			JLabel name = new JLabel(items.name);
			name.setFont(tools.BoldFont(24));
			
			JLabel desc = new JLabel("<html>" + items.desc + "</html>");
			desc.setFont(tools.RegularFont(15));
			
			JLabel price = new JLabel(items.price);
			price.setFont(tools.BoldFont(24));
			
			switch(sColor) {
			
			case Blue:
				color = Color.decode("#7AAABB");
				sColor = smallColor.Green;
				
				image.setBounds(39, 25, 230, 232);
				name.setBounds(298, 14, 346, 41);
				desc.setBounds(298, 59, 274, 175);
				price.setBounds(298, 229, 86, 41);
				
				break;
			case Green:
				color = Color.decode("#F6B69A");
				sColor = smallColor.Blue;
				
				image.setBounds(367, 19, 230, 232);
				name.setBounds(25, 19, 346, 41);
				desc.setBounds(26, 68, 274, 175);
				price.setBounds(26, 229, 86, 41);
				
				break;
			}
			
			this.setSize(new Dimension(635, 281));
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
	}
}
