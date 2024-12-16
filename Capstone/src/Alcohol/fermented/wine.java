package Alcohol.fermented;

import javax.swing.*;


import java.awt.*;
import java.util.LinkedList;

import lib.*;

public class wine extends JLayeredPane{
	
	public wine() {
		
		
		this.setBounds(0, 0, 1080, 720);
		
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setPreferredSize(new Dimension(1037, 1403));
		
		Color color[] = {
				Color.decode("#648E9A"),
				Color.decode("#69A592"),
				Color.decode("#54B492")
		};
		
		int index = 0;
		
		
		for(lib.item i : fermentedData.wine.item) {
			
			if(index > color.length - 1)
				index = 0;
			
			container.add(new container(i, color[index]));
			container.addMouseListener(lib.removeMouse(new orderA(i)));
			index++;
		}
		
		
		container.setOpaque(false);
		
		JScrollPane itemPane = new JScrollPane(container);
		itemPane.setBounds(40, 210, 986, 548);
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
			image.setBounds(23, 17, 159, 175);
			
			JLabel name = new JLabel(item.name);
			name.setBounds(230, 21, 211, 32);
			
			JLabel desc = new JLabel("<html>" + item.desc + "</html>");
			desc.setBounds(230, 59, 211, 32);
			
			JLabel price = new JLabel(item.price);
			price.setBounds(230, 161, 211, 32);
			
			this.add(new background(), Integer.valueOf(0));
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(desc, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			
		}
		
	}
	
	class fermentedHeader extends JLayeredPane{
		
		ImageIcon menu = new ImageIcon("src/rsc/Alcohol/Categories/Menu.png");
		ImageIcon icon = new ImageIcon("src/rsc/Alcohol/Categories/App_Icon.png");
		ImageIcon cart = new ImageIcon("src/rsc/Alcohol/Categories/cart.png");
		
		ImageIcon searchIcon = new ImageIcon("src/rsc/Alcohol/Categories/searchIcon.png");
		
		class container extends JPanel {
			
			tools.roundRect round;
			
			container(tools.roundRect round){
				
				this.setBounds(round.x, round.y, round.width, round.height);
				this.round = round;
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(Color.decode("#80A5E9"));
				g.fillRoundRect(0, 0, round.width, round.height, 20, 20);
			}
			
		}
		
		class searchBar extends JLayeredPane {
			
			searchBar() {
				
				this.setBounds(289, 27, 498, 52);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(Color.decode("#1B4C85"));
				g.fillRoundRect(0, 0, 498, 52, 26, 26);
			
			}
			
		}
		
		class upperHeader extends JLayeredPane{
			
			upperHeader(){
				
				this.setBounds(0, 100, 1080, 50);
				this.setOpaque(true);
				
				
				JLabel categoriesT = new JLabel("Categories");
				categoriesT.setBounds(135, 3, 99, 41);
				categoriesT.setFont(tools.RegularFont(20));
				
				JLabel distilledT = new JLabel("Distilled");
				distilledT.setBounds(505, 3, 77, 41);
				distilledT.setFont(tools.RegularFont(20));
				
				JLabel fermentedT = new JLabel("Fermented");
				fermentedT.setBounds(863, 3, 101, 41);
				fermentedT.setForeground(Color.white);
				fermentedT.setFont(tools.BoldFont(20));
				
				this.add(new container(new tools.roundRect(831, 11, 168, 28)), Integer.valueOf(0));
				
				this.add(categoriesT, Integer.valueOf(1));
				this.add(distilledT, Integer.valueOf(1));
				this.add(fermentedT, Integer.valueOf(1));
				
			}
			
		}
		
		class bottomHeader extends JLayeredPane{
			
			bottomHeader(int choice, JLayeredPane pane) {
				
				this.setBounds(0, 145, 1080, 50);
				this.setOpaque(true);
				
				JLabel wine = new JLabel("Wine");
				wine.setBounds(219, 3, 50, 51);
				wine.setFont(tools.RegularFont(20));
				
				
				JLabel beer = new JLabel("Beer");
				beer.setBounds(398, 3, 56, 51);
				beer.setFont(tools.RegularFont(20));
				//beer.addMouseListener(lib.change2(pane, new beer()));
				
				JLabel cider = new JLabel("Cider");
				cider.setBounds(609, 3, 78, 51);
				cider.setFont(tools.RegularFont(20));
				cider.addMouseListener(lib.change2(pane, new cider()));
				
				JLabel perry = new JLabel("Perry");
				perry.setBounds(805, 13, 51, 28);
				perry.setFont(tools.RegularFont(20));
				perry.addMouseListener(lib.change2(pane, new perry()));
				
				tools.roundRect round = null;
				
				switch(choice) {
				
				case 0:
					round = null;
					break;
				case 1:
					round = new tools.roundRect(197, 15, 87, 30);
					wine.setFont(tools.BoldFont(20));
					wine.setForeground(Color.white);
					
					break;
				case 2:
					round = new tools.roundRect(380, 15, 87, 30);
					beer.setFont(tools.BoldFont(20));
					beer.setForeground(Color.white);
					
					
					break;
				case 3:
					round = new tools.roundRect(603, 15, 87, 30);
					cider.setFont(tools.BoldFont(20));
					cider.setForeground(Color.white);
					
					break;
				case 4:
					round = new tools.roundRect(787, 15, 87, 30);
					perry.setFont(tools.BoldFont(20));
					perry.setForeground(Color.white);
					
					break;
				}
				
				
				
				this.add(wine, Integer.valueOf(1));
				this.add(beer, Integer.valueOf(1));
				this.add(cider, Integer.valueOf(1));
				this.add(perry, Integer.valueOf(1));
				
				if(round == null)
					return;
				
				this.add(new container(round), Integer.valueOf(0));
			}
			
		}
		
		public fermentedHeader(int choice, JLayeredPane pane) {
			
			this.setBounds(0, 0, 1080, 200);
			
			JLabel menuT = new JLabel();
			menuT.setIcon(menu);
			menuT.setBounds(41, 0, 80, 80);
			
			JLabel iconT = new JLabel();
			iconT.setIcon(icon);
			iconT.setBounds(165, 0, 95, 95);
			
			JLabel cartT = new JLabel();
			cartT.setIcon(cart);
			cartT.setBounds(814, 20, 72, 70);
			
			JLabel searchImg = new JLabel();
			searchImg.setIcon(searchIcon);
			searchImg.setBounds(304, 41, 29, 27);
			
			JLabel searchT = new JLabel("Search Bar");
			searchT.setFont(tools.RegularFont(28));
			searchT.setBounds(350, 34, 207, 38);
			searchT.setForeground(Color.white);
			
			this.add(new searchBar(), Integer.valueOf(0));
			this.add(searchImg, Integer.valueOf(1));
			this.add(searchT, Integer.valueOf(1));
			
			this.add(menuT);
			this.add(iconT);
			this.add(cartT);
			
			//this.add(new upperHeader());
			this.add(new bottomHeader(choice, pane));
			
		}
	}
}

