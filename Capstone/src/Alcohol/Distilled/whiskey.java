package Alcohol.Distilled;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

import lib.*;

public class whiskey extends JLayeredPane{
	
	public static JLayeredPane pane = new JLayeredPane();
	
	JScrollPane itemPanel = new JScrollPane();
	
	public whiskey() {
	
		Init();
		
		this.setBounds(0, 0, 1080, 720);
		
		
		
		this.add(itemPanel, Integer.valueOf(1));
		
		this.add(new lib.background(), Integer.valueOf(0));
	
	}
	
	void Init() {
		
		JLayeredPane pane = this;
		
		JPanel itemContainer = new JPanel();
		BoxLayout itemLayout = new BoxLayout(itemContainer, BoxLayout.Y_AXIS);
		itemContainer.setLayout(itemLayout);
		
		itemContainer.setOpaque(false);
		
		int colorI = 0;
		
		for(lib.item i : distilledData.whiskey.items) {
			
			if(colorI > 2)
				colorI = 0;
			
			JLayeredPane temp = new JLayeredPane();
			temp.setPreferredSize(new Dimension(986, 214));
			
			
			JLabel image = new JLabel();
			image.setIcon(i.image);
			image.setBounds(23, 5, 159, 201);
			
			JLabel name = new JLabel(i.name);
			name.setBounds(230, 5, 735, 47);
			name.setFont(tools.RegularFont(28));
			name.setForeground(Color.white);
			
			JLabel desc = new JLabel(i.desc);
			desc.setBounds(230, 33, 735, 72 + 72);
			desc.setFont(tools.RegularFont(12));
			desc.setForeground(Color.white);
			
			JLabel price = new JLabel(i.price);
			price.setBounds(230, 161, 211, 32);
			price.setFont(tools.RegularFont(20));
			price.setForeground(Color.white);
			
			temp.add(image);
			temp.add(name);
			temp.add(desc);
			temp.add(price);
			temp.add(new distilledData.whiskey.itemContainer(Color.decode(distilledData.whiskey.itemColor[colorI])));
			
			temp.addMouseListener(lib.removeMouse(new orderA(i)));
			
			itemContainer.add(temp);
			itemContainer.add(Box.createVerticalStrut(20));
			
			colorI++;
		}
		
		itemPanel = new JScrollPane(itemContainer);
		itemPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPanel.getVerticalScrollBar().setUnitIncrement(16);
		
		itemPanel.setBorder(BorderFactory.createEmptyBorder());
		
		itemPanel.setOpaque(false);
		itemPanel.getViewport().setOpaque(false);
		
		itemPanel.setBounds(47, 210, 986, 720 - 172);
		
	}
	
}
