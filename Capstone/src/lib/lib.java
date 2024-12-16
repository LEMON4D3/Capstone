package lib;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Alcohol.Distilled.distilledData;
import Alcohol.Distilled.*;
import Alcohol.fermented.beer;
import Alcohol.fermented.categories;
import Alcohol.fermented.cider;
import Alcohol.fermented.fermentedData;
import Alcohol.fermented.perry;
import Alcohol.fermented.*;
import nonAlcohol.coffee;
import nonAlcohol.juice;
import nonAlcohol.milk;
import nonAlcohol.milkShake;
import nonAlcohol.mockTail;
import nonAlcohol.nData;
import nonAlcohol.smoothie;
import nonAlcohol.tea;

public class lib {
	
	static public JFrame frame;
	
	static public JLayeredPane currentPane;
	
	static public LinkedList<item> allItem = new LinkedList<item>();
	
	public lib(){
		
		new distilledData();
		
		allItem.addAll(distilledData.rum.items);
		allItem.addAll(distilledData.vodka.items);
		allItem.addAll(distilledData.brandy.items);
		allItem.addAll(distilledData.gin.items);
		allItem.addAll(distilledData.tequila.items);
		
		new fermentedData();
		
		allItem.addAll(fermentedData.wine.item);
		allItem.addAll(fermentedData.beer.item);
		allItem.addAll(fermentedData.cider.item);
		allItem.addAll(fermentedData.perry.items);
		
		new nData();
		
		allItem.addAll(nData.juice.item);
		allItem.addAll(nData.tea.item);
		allItem.addAll(nData.smoothie.item);
		allItem.addAll(nData.milk.item);
		
	}
	
	public static MouseAdapter removeMouse(JLayeredPane pane) {
		
		return new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				frame.getContentPane().removeAll();
				
				frame.add(pane);
				
				frame.revalidate();
				frame.repaint();
			}
			
		};
	}
	
	public static void remove(JLayeredPane pane) {
		
		frame.getContentPane().removeAll();
		
		frame.add(pane);
		
		frame.revalidate();
		frame.repaint();
	}
	
	public static void quit() {
		
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		
	}
	
	public static MouseAdapter change2(JLayeredPane pane, JLayeredPane nextPane) {
		
		return new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				lib.change(pane, nextPane);
			}
			
		};
		
	}
	
	public static void change(JLayeredPane remove, JLayeredPane change) {
		
		frame.remove(remove);
		
		frame.add(change);
		frame.revalidate();
		frame.repaint();
		
	}
	
	public static class background extends JPanel {
		
		Image background = new ImageIcon("src/rsc/Alcohol/Categories/background.png").getImage();
		
		public background() {
			this.setBounds(0, 0, 1080, 720);
		}
		
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
		
	}
	
	// ---------------------------------------- Start Fermented Header ------------------------------------------
	static class fermentedHeader extends JLayeredPane{
		
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
			
			upperHeader(JLayeredPane pane){
				
				this.setBounds(0, 100, 1080, 50);
				this.setOpaque(true);
				
				
				JLabel categoriesT = new JLabel("Categories");
				categoriesT.setBounds(135, 3, 99, 41);
				categoriesT.setFont(tools.RegularFont(20));
				categoriesT.addMouseListener(change2(pane, new mainPage.alcoholCategories()));
				
				JLabel distilledT = new JLabel("Distilled");
				distilledT.setBounds(505, 3, 77, 41);
				distilledT.setFont(tools.RegularFont(20));
				distilledT.addMouseListener(distilledChange(pane, new Categories(), 0));
				
				JLabel fermentedT = new JLabel("Fermented");
				fermentedT.setBounds(863, 3, 101, 41);
				fermentedT.setForeground(Color.white);
				fermentedT.setFont(tools.BoldFont(20));
				fermentedT.addMouseListener(fermentedChange(new categories(), 0));
				
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
				wine.addMouseListener(fermentedChange(new wine(), 1));
				
				
				JLabel beer = new JLabel("Beer");
				beer.setBounds(398, 3, 56, 51);
				beer.setFont(tools.RegularFont(20));
				beer.addMouseListener(fermentedChange(new beer(), 2));
				
				JLabel cider = new JLabel("Cider");
				cider.setBounds(609, 3, 78, 51);
				cider.setFont(tools.RegularFont(20));
				cider.addMouseListener(fermentedChange(new cider(), 3));
				
				JLabel perry = new JLabel("Perry");
				perry.setBounds(805, 13, 51, 28);
				perry.setFont(tools.RegularFont(20));
				perry.addMouseListener(fermentedChange(new perry(), 4));
				
				tools.roundRect round = null;
				
				switch(choice) {
				
				case 0:
					round = null;
					break;
				case 1:
					round = new tools.roundRect(197, 13, 87, 30);
					wine.setFont(tools.BoldFont(20));
					wine.setForeground(Color.white);
					
					break;
				case 2:
					round = new tools.roundRect(375, 13, 87, 30);
					beer.setFont(tools.BoldFont(20));
					beer.setForeground(Color.white);
					
					
					break;
				case 3:
					round = new tools.roundRect(588, 13, 87, 30);
					cider.setFont(tools.BoldFont(20));
					cider.setForeground(Color.white);
					
					break;
				case 4:
					round = new tools.roundRect(787, 13, 87, 30);
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
			cartT.addMouseListener(change2(pane, new mainPage.cart()));
			
			JLabel searchImg = new JLabel();
			searchImg.setIcon(searchIcon);
			searchImg.setBounds(304, 41, 29, 27);
			
			JLabel searchT = new JLabel("Search Bar");
			searchT.setFont(tools.RegularFont(28));
			searchT.setBounds(350, 34, 207, 38);
			searchT.setForeground(Color.white);
			
			JLayeredPane searchPane = new searchBar();
			searchPane.addMouseListener(change2(pane, new mainPage.search()));
			
			this.add(searchPane, Integer.valueOf(0));
			this.add(searchImg, Integer.valueOf(1));
			this.add(searchT, Integer.valueOf(1));
			
			this.add(menuT);
			this.add(iconT);
			this.add(cartT);
			
			this.add(new upperHeader(pane));
			this.add(new bottomHeader(choice, pane));
			
		}
	}
	
	public static MouseAdapter fermentedChange(JLayeredPane change, int choice) {
		
		return new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				frame.add(new fermentedF(change, choice));

				
			}
			
		};
		
	}
	
	
	public static class fermentedF extends JLayeredPane{
		
		public fermentedF(JLayeredPane pane, int choice){
			
			frame.getContentPane().removeAll();
			
			this.setPreferredSize(new Dimension(1080, 720));
			
			this.add(pane, Integer.valueOf(0));
			this.add(new fermentedHeader(choice, this), Integer.valueOf(1));
			
			
			frame.add(this);
			
			frame.revalidate();
			frame.repaint();
			
			
		}
		
	}
	
	// ---------------------------------------- End Fermented Header ------------------------------------------
	
	
	// ---------------------------------------- Start Fermented Header ------------------------------------------
	
	static class distilledHeader extends JLayeredPane{
		
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
			
			upperHeader(JLayeredPane pane){
				
				this.setBounds(0, 100, 1080, 50);
				this.setOpaque(true);
				
				
				JLabel categoriesT = new JLabel("Categories");
				categoriesT.setBounds(135, 3, 99, 41);
				categoriesT.setFont(tools.RegularFont(20));
				categoriesT.addMouseListener(change2(pane, new mainPage.alcoholCategories()));
				
				JLabel distilledT = new JLabel("Distilled");
				distilledT.setBounds(505, 3, 77, 41);
				distilledT.setForeground(Color.white);
				distilledT.setFont(tools.BoldFont(20));
				distilledT.addMouseListener(distilledChange(pane, new Categories(), 0));
				
				JLabel fermentedT = new JLabel("Fermented");
				fermentedT.setBounds(863, 3, 101, 41);
				fermentedT.setFont(tools.RegularFont(20));
				fermentedT.addMouseListener(fermentedChange(new categories(), 0));
				
				this.add(new container(new tools.roundRect(503, 11, 83, 28)), Integer.valueOf(0));
				
				this.add(categoriesT, Integer.valueOf(1));
				this.add(distilledT, Integer.valueOf(1));
				this.add(fermentedT, Integer.valueOf(1));
				
			}
			
		}
		
		class bottomHeader extends JLayeredPane{
			
			bottomHeader(int choice, JLayeredPane pane) {
				
				this.setBounds(0, 145, 1080, 50);
				this.setOpaque(true);
				
				JLabel whiskey = new JLabel("Whiskey");
				whiskey.setBounds(86, 13, 83, 29);
				whiskey.setFont(tools.RegularFont(20));
				whiskey.addMouseListener(distilledChange(pane, new whiskey(), 1));
				
				
				JLabel rum = new JLabel("Rum");
				rum.setBounds(258, 13, 56, 29);
				rum.setFont(tools.RegularFont(20));
				rum.addMouseListener(distilledChange(pane, new rum(), 2));
				
				JLabel vodka = new JLabel("Vodka");
				vodka.setBounds(424, 13, 78, 29);
				vodka.setFont(tools.RegularFont(20));
				vodka.addMouseListener(distilledChange(pane, new vodka(), 3));
				
				JLabel brandy = new JLabel("Brandy");
				brandy.setBounds(590, 13, 69, 28);
				brandy.setFont(tools.RegularFont(20));
				brandy.addMouseListener(distilledChange(pane, new brandy(), 4));
				
				JLabel gin = new JLabel("Gin");
				gin.setBounds(790, 13, 78, 29);
				gin.setFont(tools.RegularFont(20));
				gin.addMouseListener(distilledChange(pane, new gin(), 5));
				
				JLabel tequila = new JLabel("Tequila");
				tequila.setBounds(979, 13, 78, 29);
				tequila.setFont(tools.RegularFont(20));
				tequila.addMouseListener(distilledChange(pane, new tequila(), 6));
				
				
				tools.roundRect round = null;
				
				switch(choice) {
				
				case 0:
					round = null;
					break;
				case 1:
					round = new tools.roundRect(79, 13, 101, 30);
					whiskey.setFont(tools.BoldFont(20));
					whiskey.setForeground(Color.white);
					
					break;
				case 2:
					round = new tools.roundRect(238, 13, 87, 30);
					rum.setFont(tools.BoldFont(20));
					rum.setForeground(Color.white);
					break;
				case 3:
					round = new tools.roundRect(410, 13, 87, 30);
					vodka.setFont(tools.BoldFont(20));
					vodka.setForeground(Color.white);
					
					break;
				case 4:
					round = new tools.roundRect(581, 13, 87, 30);
					brandy.setFont(tools.BoldFont(20));
					brandy.setForeground(Color.white);
					break;
				case 5:
					round = new tools.roundRect(761, 13, 87, 30);
					gin.setFont(tools.BoldFont(20));
					gin.setForeground(Color.white);
					break;
				case 6:
					round = new tools.roundRect(970, 13, 87, 30);
					tequila.setFont(tools.BoldFont(20));
					tequila.setForeground(Color.white);
					break;				
				}
				
				
				
				this.add(whiskey, Integer.valueOf(1));
				this.add(rum, Integer.valueOf(1));
				this.add(vodka, Integer.valueOf(1));
				this.add(brandy, Integer.valueOf(1));
				this.add(gin, Integer.valueOf(1));
				this.add(tequila, Integer.valueOf(1));
				
				if(round == null)
					return;
				
				this.add(new container(round), Integer.valueOf(0));
			}
			
		}
		
		public distilledHeader(int choice, JLayeredPane pane) {
			
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
			cartT.addMouseListener(removeMouse(new mainPage.cart()));
			
			JLabel searchImg = new JLabel();
			searchImg.setIcon(searchIcon);
			searchImg.setBounds(304, 41, 29, 27);
			
			JLabel searchT = new JLabel("Search Bar");
			searchT.setFont(tools.RegularFont(28));
			searchT.setBounds(350, 34, 207, 38);
			searchT.setForeground(Color.white);
			
			JLayeredPane searchPane = new searchBar();
			searchPane.addMouseListener(change2(pane, new mainPage.search()));
			
			this.add(searchPane, Integer.valueOf(0));
			this.add(searchImg, Integer.valueOf(1));
			this.add(searchT, Integer.valueOf(1));
			
			this.add(menuT);
			this.add(iconT);
			this.add(cartT);
			
			this.add(new upperHeader(pane));
			this.add(new bottomHeader(choice, pane));
			
		}
	}
	
	public static MouseAdapter distilledChange(JLayeredPane remove, JLayeredPane change, int choice) {
		
		return new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				frame.remove(remove);
				
				frame.add(new distilledF(change, choice));
				frame.revalidate();
				frame.repaint();
				
			}
			
		};
		
	}
	
	public static class distilledF extends JLayeredPane{
		
		public distilledF(JLayeredPane pane, int choice){
			
			frame.getContentPane().removeAll();
			
			this.setPreferredSize(new Dimension(1080, 720));
			
			this.add(pane, Integer.valueOf(0));
			this.add(new distilledHeader(choice, this), Integer.valueOf(1));
			
			frame.add(this);
			
			frame.revalidate();
			frame.repaint();
			
		}
		
	}
	
	// ---------------------------------------- End Distilled Header ------------------------------------------
	
	// ---------------------------------------- Start Fruit Header ------------------------------------------
	
	static class fruitHeader extends JLayeredPane{
		
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
		
		class bottomHeader extends JLayeredPane{
			
			bottomHeader(int choice, JLayeredPane pane) {
				
				this.setBounds(0, 100, 1080, 50);
				this.setOpaque(true);
				
				JLabel categories = new JLabel("Categories");
				categories.setBounds(45, 8, 160, 32);
				categories.setFont(tools.RegularFont(28));
				categories.addMouseListener(change2(pane, new mainPage.alcoholCategories()));
				
				JLabel juice = new JLabel("Juice");
				juice.setBounds(228, 8, 86, 32);
				juice.setFont(tools.RegularFont(28));
				juice.addMouseListener(fruitChange(pane, new juice(), 1));
				
				JLabel tea = new JLabel("Tea");
				tea.setBounds(324, 8, 78, 32);
				tea.setFont(tools.RegularFont(28));
				tea.addMouseListener(fruitChange(pane, new tea(), 2));
				
				JLabel smoothie = new JLabel("Smoothie");
				smoothie.setBounds(403, 8, 137, 32);
				smoothie.setFont(tools.RegularFont(28));
				smoothie.addMouseListener(fruitChange(pane, new smoothie(), 3));
				
				JLabel milk = new JLabel("Milk");
				milk.setBounds(560, 8, 78, 32);
				milk.setFont(tools.RegularFont(28));
				milk.addMouseListener(fruitChange(pane, new milk(), 4));
				
				JLabel milkShake = new JLabel("MilkShake");
				milkShake.setBounds(651, 8, 146, 32);
				milkShake.setFont(tools.RegularFont(28));
				milkShake.addMouseListener(fruitChange(pane, new milkShake(), 5));
				
				JLabel coffee = new JLabel("Coffee");
				coffee.setBounds(809, 8, 102, 32);
				coffee.setFont(tools.RegularFont(28));
				coffee.addMouseListener(fruitChange(pane, new coffee(), 6));
				
				JLabel mockTail = new JLabel("Mock Tail");
				mockTail.setBounds(922, 8, 151, 32);
				mockTail.setFont(tools.RegularFont(28));
				mockTail.addMouseListener(fruitChange(pane, new mockTail(), 7));
				
				
				
				tools.roundRect round = null;
				
				switch(choice) {
				
				case 0:
					round = new tools.roundRect(38, 0, 158, 50);
					categories.setFont(tools.BoldFont(28));
					categories.setForeground(Color.white);
					break;
				case 1:
					round = new tools.roundRect(219, 0, 91, 50);
					juice.setFont(tools.BoldFont(28));
					juice.setForeground(Color.white);
					
					break;
				case 2:
					round = new tools.roundRect(302, 0, 91, 50);
					tea.setFont(tools.BoldFont(28));
					tea.setForeground(Color.white);
					break;
				case 3:
					round = new tools.roundRect(400, 0, 140, 50 );
					smoothie.setFont(tools.BoldFont(28));
					smoothie.setForeground(Color.white);
					break;
					
				case 4:
					round = new tools.roundRect(543, 0, 91, 50);
					milk.setFont(tools.BoldFont(28));
					milk.setForeground(Color.white);
					break;
					
				case 5:
					round = new tools.roundRect(644, 0, 158, 50);
					milkShake.setFont(tools.BoldFont(28));
					milkShake.setForeground(Color.white);
					break;
					
				case 6:
					round = new tools.roundRect(799, 0, 106, 50);
					coffee.setFont(tools.BoldFont(28));
					coffee.setForeground(Color.white);
					break;				
				case 7:
					round = new tools.roundRect(910, 0, 150, 50);
					mockTail.setFont(tools.BoldFont(28));
					mockTail.setForeground(Color.white);
					break;				

				}
				
				
				
				this.add(categories, Integer.valueOf(1));
				this.add(juice, Integer.valueOf(1));
				this.add(tea, Integer.valueOf(1));
				this.add(smoothie, Integer.valueOf(1));
				this.add(milk, Integer.valueOf(1));
				this.add(milkShake, Integer.valueOf(1));
				this.add(coffee, Integer.valueOf(1));
				this.add(mockTail, Integer.valueOf(1));
				
				if(round == null)
					return;
				
				this.add(new container(round), Integer.valueOf(0));
			}
			
		}
		
		public fruitHeader(int choice, JLayeredPane pane) {
			
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
			cartT.addMouseListener(removeMouse(new mainPage.cart()));
			
			JLabel searchImg = new JLabel();
			searchImg.setIcon(searchIcon);
			searchImg.setBounds(304, 41, 29, 27);
			
			JLabel searchT = new JLabel("Search Bar");
			searchT.setFont(tools.RegularFont(28));
			searchT.setBounds(350, 34, 207, 38);
			searchT.setForeground(Color.white);
			
			JLayeredPane searchPane = new searchBar();
			searchPane.addMouseListener(change2(pane, new mainPage.search()));
			
			this.add(searchPane, Integer.valueOf(0));
			this.add(searchImg, Integer.valueOf(1));
			this.add(searchT, Integer.valueOf(1));
			
			this.add(menuT);
			this.add(iconT);
			this.add(cartT);
	
			this.add(new bottomHeader(choice, pane));
			
		}
	}
	
	public static MouseAdapter fruitChange(JLayeredPane remove, JLayeredPane change, int choice) {
		
		return new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				frame.remove(remove);
				
				frame.add(new fruitF(change, choice));
				frame.revalidate();
				frame.repaint();
				
			}
			
		};
		
	}
	
	public static class fruitF extends JLayeredPane{
		
		public fruitF(JLayeredPane pane, int choice){
			
			this.setPreferredSize(new Dimension(1080, 720));
			
			this.add(pane, Integer.valueOf(0));
			this.add(new fruitHeader(choice, this), Integer.valueOf(1));
			
			
		}
		
	}
	
	
	// ---------------------------------------- End Fruit Header ------------------------------------------
	
	public static class item{
		
		public String name, desc, price;
		
		public int quantity = 1;
		
		public ImageIcon image;
		
		public item(String name, String desc, String price, ImageIcon image) {
			
			this.name = name;
			this.desc = desc;
			this.price = price;
			
			this.image = image;
		}
		
	}

}

