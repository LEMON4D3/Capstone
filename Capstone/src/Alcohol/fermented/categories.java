package Alcohol.fermented;

import Alcohol.Distilled.distilledData;
import Alcohol.fermented.wine.fermentedHeader.bottomHeader;
import Alcohol.fermented.wine.fermentedHeader.container;
import Alcohol.fermented.wine.fermentedHeader.searchBar;

import javax.swing.*;
import java.awt.*;

import lib.*;

public class categories extends JLayeredPane{
	
	public categories() {
		
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setBounds(33, 210, 1014, 493);
		
		JPanel container1 = new JPanel();
		container1.setLayout(new BoxLayout(container1, BoxLayout.X_AXIS));
		container1.setPreferredSize(new Dimension(1014, 217));
		
		JLayeredPane item1 = new container("Wine", Color.decode("#B5D5C6"));
		item1.addMouseListener(lib.change2(this, new wine()));
		item1.addMouseListener(lib.fermentedChange(new wine(), 1));
		
		JLayeredPane item2 = new container("Beer", Color.decode("#FCCCB7"));
		item2.addMouseListener(lib.change2(this, new beer()));
		item2.addMouseListener(lib.fermentedChange(new beer(), 2));
		
		container1.add(Box.createHorizontalStrut(100));
		container1.add(item1);
		container1.add(item2);
		container1.add(Box.createHorizontalStrut(100));
		
		JPanel container2 = new JPanel();
		container2.setLayout(new BoxLayout(container2, BoxLayout.X_AXIS));
		container2.setPreferredSize(new Dimension(671, 217));
		
		JLayeredPane item3 = new container("Cider", Color.decode("#69A592"));
		item3.addMouseListener(lib.change2(this, new cider()));
		item3.addMouseListener(lib.fermentedChange(new cider(), 3));
		
		JLayeredPane item4 = new container("Perry", Color.decode("#F0DDAC"));
		item4.addMouseListener(lib.change2(this, new perry()));
		item4.addMouseListener(lib.fermentedChange(new perry(), 4));
		
		
		container2.add(Box.createHorizontalStrut(100));
		container2.add(item3);
		container2.add(item4);
		container2.add(Box.createHorizontalStrut(100));
		
		container.setOpaque(false);
		container1.setOpaque(false);
		container2.setOpaque(false);
		
		container.add(container1);
		container.add(container2);
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(container, Integer.valueOf(2));
	}
	
	
	class container extends JLayeredPane{
		
		Color color;
		String text;
		
		container(String text, Color color){
			
			this.setPreferredSize(new Dimension(316, 217));
			
			this.color = color;
			this.text = text;
			
		}
		
		public void paint(Graphics g) {
			
			
			g.setColor(color);
			g.fillRoundRect(0, 0, 316, 217, 20, 20);
			
			g.setColor(Color.black);
			FontMetrics metrics = g.getFontMetrics(tools.BoldFont(36));
			g.setFont(tools.BoldFont(36));
			g.drawString(text, (316 - metrics.stringWidth(text)) / 2, 217 / 2);
			
		}
		
	}	
	
}
