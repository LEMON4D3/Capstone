package nonAlcohol;

import lib.*;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class milk extends JLayeredPane{

	public milk() {
		
		LinkedList<lib.item> item = nData.milk.item;
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setBounds(0, 158, 1080, 1728);
		
		boolean sideF = true;
		
		
		for(int i = 0; i < item.size(); i++) {
			
			container.add(new container(item.get(i), sideF));
			sideF = !sideF;
			
		}
		
		container.setOpaque(false);
		
		JScrollPane pane = new JScrollPane(container);
		pane.setBounds(0, 100, 1080, 720 - 158);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pane.getVerticalScrollBar().setUnitIncrement(16);
		pane.setOpaque(false);
		pane.getViewport().setOpaque(false);
		pane.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(new lib.background(), Integer.valueOf(0));
		
		this.add(pane, Integer.valueOf(2));
		
	}
	
	public class container extends JLayeredPane {
		
		class button extends JPanel{
			
			button() {
				
				this.setBounds(0, 0, 217, 68);
				
			}
			
			public void paint(Graphics g) {
				
				String text = "Add to cart";
				
				g.setColor(Color.decode("#0A305A"));
				g.fillRoundRect(0, 0, 217, 68, 20, 20);
				
				g.setColor(Color.white);
				FontMetrics metrics = g.getFontMetrics(tools.RegularFont(40));
				g.setFont(tools.RegularFont(40));
				g.drawString(text, (this.getWidth() - metrics.stringWidth(text)) / 2, this.getHeight() - 20);
			    
				
			}
			
		}
		
		container(lib.item item, boolean rightSide){
			
			this.setPreferredSize(new Dimension(1080, 578));
			
			JPanel btn = new button();
			btn.addMouseListener(lib.removeMouse(new orderF(item)));
			
			JLabel image = new JLabel();
			image.setIcon(item.image);
			
			JLabel name = new JLabel(item.name);
			name.setFont(tools.BoldFont(36));
			
			JLabel desc = new JLabel(item.desc);
			desc.setVerticalAlignment(JLabel.TOP);
			desc.setFont(tools.RegularFont(24));
			
			JLabel price = new JLabel(item.price);
			price.setFont(tools.BoldFont(36));
			
			if(rightSide) {
				
				image.setBounds(75, 85, 375, 425);
				name.setBounds(500, 75, 501, 61);
				desc.setBounds(500, 150, 488, 257);
				price.setBounds(500, 425, 150, 61);
				btn.setBounds(644, 475, 225, 68);
				
				this.add(btn);
				this.add(image);
				this.add(name);
				this.add(desc);
				this.add(price);
				
				return;
			}
				
			image.setBounds(675, 25, 375, 425);
			name.setBounds(100, 25, 500, 75);
			desc.setBounds(100, 100, 500, 325);
			price.setBounds(100, 375, 300, 50);
			btn.setBounds(218, 447, 217, 65);
			
			this.add(btn);
			this.add(image);
			this.add(name);
			this.add(desc);
			this.add(price);
			
		}
		
	}
	
}
