package Alcohol.Distilled;

import javax.swing.*;

import lib.*;

import java.awt.*;
import java.util.LinkedList;

public class vodka extends JLayeredPane{

	public vodka() {
		
		LinkedList<lib.item> list = distilledData.vodka.items;
		
		JLayeredPane pane = this;
		
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
		panel2.setPreferredSize(new Dimension(1053, 275));
		
		JPanel item5 = new smallContainer(list.get(4), Color.decode("#60A8B9"), true, false);
		item5.addMouseListener(lib.removeMouse(new orderA(list.get(4))));
		item5.setBounds(0, 5, 506, 247);
		
		JPanel item6 = new smallContainer(list.get(5), Color.decode("#407A7E"), false, false);
		item6.addMouseListener(lib.removeMouse(new orderA(list.get(5))));
		item6.setBounds(547, 5, 506, 247);
		
		panel1.add(item1);
		panel1.add(item2);
		panel1.add(item3);
		panel1.add(item4);
		
		itemPane.add(panel1);
		
		panel2.add(item5);
		panel2.add(item6);
		
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
			image.setBounds(92, 7, 121, 165);
			
			JLabel name = new JLabel(items.name);
			name.setBounds(18, 172, 267, 76);
			name.setForeground(Color.white);
			name.setFont(tools.BoldFont(20));
			
			JLabel desc = new JLabel(items.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setBounds(5, 230, 295, 300);
			desc.setForeground(Color.white);
			desc.setFont(tools.RegularFont(15));
			
			JLabel price = new JLabel(items.price);
			price.setBounds(97, 480, 87, 57);
			price.setForeground(Color.white);
			price.setFont(tools.BoldFont(16));
			
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
			name.setFont(tools.BoldFont(16));
			name.setForeground(Color.white);
			
			JLabel desc = new JLabel(items.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setForeground(Color.white);
			desc.setFont(tools.RegularFont(14));
			
			JLabel price = new JLabel(items.price);
			price.setForeground(Color.white);
			price.setFont(tools.BoldFont(16));
			
			if(small) {
				
				image.setBounds(27, 19, 127, 195);
				name.setBounds(168, 16, 227, 38);
				desc.setBounds(168, 50, 190, 152);
				price.setBounds(51, 200, 87, 57);
				
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
				desc.setBounds(34, 50, 306, 184);
				price.setBounds(356, 190, 87, 57);
				
				this.add(image);
				this.add(desc);
				this.add(name);
				this.add(price);
				
				return;
			}
			
			image.setBounds(27, 19, 139, 169);
			name.setBounds(181, 13, 227, 38);
			desc.setBounds(181, 50, 306, 184);
			price.setBounds(51, 190, 87, 57);
			
			this.add(image);
			this.add(name);
			this.add(desc);
			this.add(price);
		}
		
	}
	
}
