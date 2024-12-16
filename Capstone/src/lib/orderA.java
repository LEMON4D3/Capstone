package lib;

import javax.swing.*;

import lib.orderF.background;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class orderA extends JLayeredPane{

	int quantity = 1;
	
	String imageLoc = "src/rsc/main/search/";
	
	ImageIcon backIcon = new ImageIcon(imageLoc + "back.png");

	JLabel quantityI = new JLabel("" + quantity, SwingConstants.CENTER);
	JLabel price = new JLabel();
	
	//JLayeredPane frame = this;
	
	public orderA(lib.item item){
		
		this.setPreferredSize(new Dimension(1080, 720));
		
		/*
		JLabel back = new JLabel();
		back.setIcon(backIcon);
		back.setBounds(0, 9, 80, 55);
		back.addMouseListener(lib.change2(this, new mainPage.alcoholCategories()));
		*/
		
		JLabel nonAlcoholic = new JLabel("Alcoholic");
		nonAlcoholic.setBounds(413, 44, 254, 44);
		nonAlcoholic.setFont(tools.BoldFont(36));
		nonAlcoholic.setForeground(new Color(0, 0, 0, 135));
		
		JLabel name = new JLabel("<html>" + item.name + "</html>");
		
		name.setBounds(500, 100, 500, 100);
		name.setFont(tools.BoldFont(32));
		
		JLabel desc = new JLabel(item.desc);
		desc.setVerticalAlignment(JLabel.TOP);
		desc.setBounds(500, 200, 507, 316);
		desc.setFont(tools.RegularFont(18));
		
		JLabel image = new JLabel();
		image.setIcon(item.image);
		image.setBounds(113, 213, 292, 268);
		
		JLabel quantityT = new JLabel("Quantity");
		quantityT.setBounds(409, 580, 102, 29);
		quantityT.setFont(tools.BoldFont(24));
		
		JLabel minus = new JLabel("-", SwingConstants.CENTER);
		minus.setBounds(527, 578, 45, 35);
		minus.setBackground(Color.decode("#919191"));
		minus.setForeground(Color.white);
		minus.setOpaque(true);
		minus.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(quantity == 1)
					return;
				
				quantity--;
				quantityI.setText(String.format("%d", quantity));

				quantityI.revalidate();
				quantityI.repaint();
				
				price.setText(String.format("Price: %.2f", Double.parseDouble(item.price.substring(2)) * quantity));
				price.revalidate();
				price.repaint();
				
			}
			
		});
		
		quantityI.setBounds(572, 579, 59, 29);
		quantityI.setFont(tools.BoldFont(24));
		
		JLabel plus = new JLabel("+", SwingConstants.CENTER);
		plus.setBounds(631, 578, 45, 35);
		plus.setBackground(Color.decode("#919191"));
		plus.setForeground(Color.white);
		plus.setOpaque(true);
		plus.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				quantity++;
				quantityI.setText(String.format("%d", quantity));

				quantityI.revalidate();
				quantityI.repaint();
				
				price.setText(String.format("Price: %.2f", Double.parseDouble(item.price.substring(2)) * quantity));
				price.revalidate();
				price.repaint();
				
			}
			
		});
		
		JLabel confirmOrder = new JLabel("Confirm Order");
		confirmOrder.setHorizontalAlignment(JLabel.CENTER);
		confirmOrder.setBounds(385, 643, 448, 51);
		confirmOrder.setFont(tools.BoldFont(36));
		confirmOrder.setBackground(Color.decode("#919191"));
		confirmOrder.setForeground(Color.white);
		confirmOrder.setOpaque(true);
		confirmOrder.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				lib.item temp = new lib.item(item.name, item.desc, item.price, item.image);
				
				temp.price = "" + (Double.parseDouble(item.price.substring(2)) * quantity);
				temp.quantity = quantity;
				
				user.user.add(temp);
				
				lib.remove(new mainPage.alcoholCategories());
				
			}
			
		});
		
		price.setText(String.format("Price: %.2f", Double.parseDouble(item.price.substring(2)) * quantity));
		price.setBounds(500, 518, 227, 29);
		price.setFont(tools.BoldFont(24));
		
		
		this.add(new background(), Integer.valueOf(0));
		
		//this.add(back, Integer.valueOf(2));
		
		this.add(nonAlcoholic, Integer.valueOf(1));
		
		this.add(name, Integer.valueOf(1));
		
		this.add(desc, Integer.valueOf(1));
		
		this.add(image, Integer.valueOf(1));
		
		this.add(quantityT, Integer.valueOf(1));
		this.add(minus, Integer.valueOf(1));
		this.add(quantityI, Integer.valueOf(1));
		this.add(plus, Integer.valueOf(1));
		
		this.add(price, Integer.valueOf(1));
		
		this.add(confirmOrder, Integer.valueOf(1));
		
	}
	
	class background extends JPanel{
		
		String imageLoc = "src/rsc/main/orderF/";
		
		Image image = new ImageIcon(imageLoc + "background.png").getImage();
		
		background(){
			
			this.setBounds(0, 0, 1080, 720);
			
		}
		
		public void paint(Graphics g) {
			
			g.drawImage(image, 0, 0, null);
			
		}
		
	}
	
}
