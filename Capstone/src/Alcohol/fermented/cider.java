package Alcohol.fermented;

import javax.swing.*;

import Alcohol.fermented.wine.fermentedHeader.bottomHeader;
import Alcohol.fermented.wine.fermentedHeader.container;
import Alcohol.fermented.wine.fermentedHeader.searchBar;
import lib.*;

import java.awt.*;
import java.util.LinkedList;

public class cider extends JLayeredPane{

	public cider() {
		
		LinkedList<lib.item> list = fermentedData.cider.item;
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel itemPane = new JPanel();
		itemPane.setLayout(new BoxLayout(itemPane, BoxLayout.Y_AXIS));
		
		itemPane.setBounds(15, 0, 1053, 806);
		itemPane.setBackground(Color.gray);
		itemPane.setOpaque(true);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setPreferredSize(new Dimension(1053, 550));
		
		JPanel item1 = new bigContainer(list.get(0), Color.decode("#69A592"));
		item1.addMouseListener(lib.removeMouse(new orderA(list.get(0))));
		item1.setBounds(0, 0, 304, 530);
		
		JPanel item2 = new smallContainer(list.get(1), Color.decode("#97C4AD"), false, true);
		item2.addMouseListener(lib.removeMouse(new orderA(list.get(1))));
		item2.setBounds(313, 0, 423, 265);
		
		JPanel item3 = new smallContainer(list.get(2), Color.decode("#7DBEBD"), false, true);
		item3.addMouseListener(lib.removeMouse(new orderA(list.get(2))));
		item3.setBounds(312, 280, 423, 247);
		
		JPanel item4 = new bigContainer(list.get(3), Color.decode("#60A8B9"));
		item4.addMouseListener(lib.removeMouse(new orderA(list.get(3))));
		item4.setBounds(748, 0, 304, 530);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setPreferredSize(new Dimension(1053, 550));
		
		JPanel item5 = new bigContainer(list.get(4), Color.decode("#69A592"));
		item5.addMouseListener(lib.removeMouse(new orderA(list.get(4))));
		item5.setBounds(0, 0, 304, 530);
		
		JPanel item6 = new smallContainer(list.get(5), Color.decode("#97C4AD"), false, true);
		item6.addMouseListener(lib.removeMouse(new orderA(list.get(5))));
		item6.setBounds(313, 0, 423, 265);
		
		JPanel item7 = new smallContainer(list.get(6), Color.decode("#7DBEBD"), false, true);
		item7.addMouseListener(lib.removeMouse(new orderA(list.get(6))));
		item7.setBounds(312, 280, 423, 247);
		
		JPanel item8 = new bigContainer(list.get(7), Color.decode("#60A8B9"));
		item8.addMouseListener(lib.removeMouse(new orderA(list.get(7))));
		item8.setBounds(748, 0, 304, 530);
		
		panel1.add(item1);
		panel1.add(item2);
		panel1.add(item3);
		panel1.add(item4);
		
		itemPane.add(panel1);
		
		panel2.add(item5);
		panel2.add(item6);
		panel2.add(item7);
		panel2.add(item8);
		
		itemPane.add(panel2);
		
		itemPane.setOpaque(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		
		
		JScrollPane itemContainer = new JScrollPane(itemPane);
		itemContainer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemContainer.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemContainer.getVerticalScrollBar().setUnitIncrement(16);
		itemContainer.setBorder(BorderFactory.createEmptyBorder());
		itemContainer.setOpaque(false);
		itemContainer.getViewport().setOpaque(false);
		
		
		itemContainer.setBounds(15, 210, 1053, 550);
		
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		
		this.add(itemContainer, Integer.valueOf(2));
	}
	
	class bigContainer extends JPanel{
		
		
		bigContainer(lib.item items, Color color){
			
			this.setPreferredSize(new Dimension(304, 530));
			this.setLayout(null);
			
			this.setBackground(color);
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			image.setBounds(50, 22, 204, 154);
			
			JLabel name = new JLabel(items.name);
			name.setBounds(33, 183, 231, 76);
			
			JLabel desc = new JLabel(items.desc);
			desc.setBounds(30, 311, 231, 76);
			
			JLabel price = new JLabel(items.price);
			price.setBounds(97, 473, 87, 57);
			
			this.add(image);
			this.add(name);
			this.add(desc);
			this.add(price);
			
		}
		
	}
	
	class smallContainer extends JPanel{
		
		smallContainer(lib.item items, Color color, boolean rightSide, boolean small){
			
			this.setPreferredSize(new Dimension(423, 265));
			this.setLayout(null);
			
			this.setBackground(color);
			
			JLabel image = new JLabel();
			image.setIcon(items.image);
			
			JLabel name = new JLabel(items.name);
			
			JLabel desc = new JLabel(items.desc);
			
			JLabel price = new JLabel(items.price);
			
			if(small) {
				
				image.setBounds(27, 19, 148, 110);
				name.setBounds(208, 16, 227, 38);
				desc.setBounds(208, 75, 190, 152);
				price.setBounds(51, 190, 87, 57);
				
				this.add(image);
				this.add(desc);
				this.add(name);
				this.add(price);
				
				return;
			}
			
			this.setPreferredSize(new Dimension(506, 247));
			
			if(rightSide) {
				
				image.setBounds(331, 14, 139, 169);
				name.setBounds(38, 9, 227, 38);
				desc.setBounds(34, 86, 231, 76);
				price.setBounds(356, 190, 87, 57);
				
				this.add(image);
				this.add(desc);
				this.add(name);
				this.add(price);
				
				return;
			}
			
			image.setBounds(27, 19, 139, 169);
			name.setBounds(199, 13, 227, 38);
			desc.setBounds(167, 75, 231, 76);
			price.setBounds(51, 190, 87, 57);
			
			this.add(image);
			this.add(name);
			this.add(desc);
			this.add(price);
		}
		
	}
}
