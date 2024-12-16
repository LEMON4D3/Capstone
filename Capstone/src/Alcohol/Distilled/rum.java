package Alcohol.Distilled;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;

import lib.*;

public class rum extends JLayeredPane{
	
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
	
	public rum() {
		
		JLayeredPane pane = this;
		
		
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
		
		this.setBounds(0, 0, 1080, 720);
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		
		
		
		for(int i = 0; i < distilledData.rum.items.size() / 3; i++) {
			
			JLayeredPane temp = new JLayeredPane();
			temp.setPreferredSize(new Dimension(1080, 580));
			
			JLayeredPane big = new JLayeredPane();
			JLayeredPane upSmall = new JLayeredPane();
			JLayeredPane bottomSmall = new JLayeredPane();
			
			
			for(int a = i * 3; a < (i * 3) + 3; a++) {
				
				switch(a % 3) {
				
				case 0:
					big = new bigContainer(distilledData.rum.items.get(a));
					big.addMouseListener(lib.removeMouse(new orderA(distilledData.rum.items.get(a))));
					break;
				case 1:
					upSmall = new smallContainer(distilledData.rum.items.get(a));
					upSmall.addMouseListener(lib.removeMouse(new orderA(distilledData.rum.items.get(a))));
					break;
				case 2:
					bottomSmall = new smallContainer(distilledData.rum.items.get(a));
					bottomSmall.addMouseListener(lib.removeMouse(new orderA(distilledData.rum.items.get(a))));
					break;
				
				}
				
				
				
			}
			
			switch(side) {
			
			case left:
				big.setBounds(0, 0, big.getWidth(), big.getHeight());
				upSmall.setBounds(445, 0, 635, 281);
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
		
		itemPane.setBounds(7, 210, 1080 - 14, 720 - 190);
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
			image.setBounds(167, 10, 105, 190);
			
			JLabel name = new JLabel(items.name, SwingConstants.CENTER);
			name.setBounds(25, 193, 380, 41);
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(items.desc);
			desc.setBounds(25, 234, 371, 293);
			desc.setFont(tools.RegularFont(14));
			desc.setVerticalAlignment(JLabel.TOP);
			
			JLabel price = new JLabel(items.price);
			price.setBounds(174, 534, 150, 24);
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
				this.setBounds(0, 0, 635, 281);
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
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(items.desc);
			desc.setFont(tools.RegularFont(15));
			desc.setVerticalAlignment(JLabel.TOP);
			
			JLabel price = new JLabel(items.price, SwingConstants.CENTER);
			price.setFont(tools.BoldFont(16));
			
			switch(sColor) {
			
			case Blue:
				color = Color.decode("#7AAABB");
				sColor = smallColor.Green;
				
				image.setBounds(28, 25, 126, 219);
				name.setBounds(177, 10, 450, 34);
				desc.setBounds(177, 50, 400, 225);
				price.setBounds(28, 251, 125, 16);
				
				break;
			case Green:
				color = Color.decode("#B5D5C6");
				sColor = smallColor.Blue;
				
				image.setBounds(488, 9, 118, 236);
				name.setBounds(21, 9, 450, 37);
				desc.setBounds(21, 40, 400, 225);
				price.setBounds(485, 250, 125, 16);
				
				break;
			}
			
			this.setBounds(0, 0, 635, 281);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
	}
}
