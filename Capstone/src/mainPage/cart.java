package mainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import lib.*;


public class cart extends JLayeredPane{

	String imageLoc = "src/rsc/main/search/";
	
	ImageIcon backIcon = new ImageIcon(imageLoc + "back.png");
	
	public cart() {
		
		LinkedList<lib.item> item = user.user.item;
		
		this.setPreferredSize(new Dimension(1080, 720));
		
		JLabel back = new JLabel();
		back.setIcon(backIcon);
		back.setBounds(0, 9, 80, 55);
		back.addMouseListener(lib.removeMouse(new alcoholCategories()));
		
		JLabel header = new JLabel("Order List", SwingConstants.CENTER);
		header.setBounds(0, 0, 1080, 60);
		header.setBackground(Color.decode("#52BE8D"));
		header.setFont(tools.BoldFont(24));
		header.setOpaque(true);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setBounds(0, 0, 1080 - 36, 145);
		
		int index = 0;
		
		for(lib.item i: item) {
			
			JLayeredPane temp = new container(i, index);
			index++;
			//temp.setOpaque(false);
			container.add(temp);
			container.setBounds(19, 85, 1080 - 36, 145 * index);
		}
		
		container.setOpaque(false);
		
		JScrollPane pane = new JScrollPane(container);
		pane.setBounds(19, 85, 1080 - 36, (container.getHeight() < 575) ? container.getHeight() : 575);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pane.getVerticalScrollBar().setUnitIncrement(16);
		pane.setBorder(BorderFactory.createEmptyBorder());
		
		pane.setOpaque(false);
		pane.getViewport().setOpaque(false);
		
		
		JLabel confirmT = new JLabel("Confirm Order", SwingConstants.CENTER);
		confirmT.setBounds(431, 670, 222, 41);
		confirmT.setFont(tools.BoldFont(24));
		confirmT.setBackground(Color.decode("#828282"));
		confirmT.setOpaque(true);
		confirmT.setFocusable((item.size() > 0) ? true : false);
		confirmT.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				
				
				lib.remove(new createReceipt());
				
				lib.frame.pack();
				lib.frame.setLocationRelativeTo(null);
				
			}
			
		});
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(back, Integer.valueOf(2));
		this.add(header, Integer.valueOf(1));
		this.add(pane, Integer.valueOf(1));
		this.add(confirmT, Integer.valueOf(1));
	}
	
	class container extends JLayeredPane{
		
		container(lib.item item, int i){
			
			this.setPreferredSize(new Dimension(1063, 135));
			this.setLayout(null);
			
			
			
			JLabel image = new JLabel();
			image.setIcon(item.image);
			image.setBounds(5, 10, 131, 114);
			
			JLabel name = new JLabel(item.name);
			name.setBounds(179, 5, 700, 29);
			name.setFont(tools.BoldFont(20));
			
			JLabel quantity = new JLabel(String.format("Quantity: %d", item.quantity));
			quantity.setBounds(179, 40, 127, 29);
			quantity.setFont(tools.BoldFont(20));
			
			JLabel price = new JLabel(String.format("Total Price: %s", item.price));
			price.setBounds(179, 83, 188, 29);
			price.setFont(tools.BoldFont(20));
			
			/*
			JLabel deleteItem = new JLabel();
			deleteItem.setBounds(863, 4, 112, 104);
			deleteItem.setOpaque(true);
			deleteItem.setBackground(Color.black);
			deleteItem.addMouseListener(new MouseAdapter() {
				
				public void mousePressed(MouseEvent e) {
					
					user.user.item.remove(i);
					lib.remove(new cart());
				}
				
			});
			*/
			
			this.add(image, Integer.valueOf(1));
			this.add(name, Integer.valueOf(1));
			this.add(quantity, Integer.valueOf(1));
			this.add(price, Integer.valueOf(1));
			//this.add(deleteItem, Integer.valueOf(1));
			
			this.add(new background(), Integer.valueOf(0));
		}
		
		class background extends JPanel{
			
			background(){
				
				this.setBounds(0, 0, 1063, 135);
				
			}
			
			public void paint(Graphics g) {
				
				g.drawLine(5, 134, 1063, 134);
				
			}
			
		}
		

		

	}
	
}
