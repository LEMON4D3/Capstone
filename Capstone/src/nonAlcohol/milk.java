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
		pane.setBounds(0, 160, 1080, 720 - 158);
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
			
			JLabel desc = new JLabel("<html>" + item.desc + "</html>");
			
			JLabel price = new JLabel(item.price);
			
			if(rightSide) {
				
				image.setBounds(75, 85, 380, 430);
				name.setBounds(509, 85, 501, 61);
				desc.setBounds(509, 149, 488, 257);
				price.setBounds(508, 406, 116, 61);
				btn.setBounds(644, 469, 217, 68);
				
				this.add(btn);
				this.add(image);
				this.add(name);
				this.add(desc);
				this.add(price);
				
				return;
			}
				
			image.setBounds(629, 73, 368, 429);
			name.setBounds(96, 103, 486, 61);
			desc.setBounds(96, 170, 470, 203);
			price.setBounds(96, 380, 116, 61);
			btn.setBounds(218, 447, 217, 65);
			
			this.add(btn);
			this.add(image);
			this.add(name);
			this.add(desc);
			this.add(price);
			
		}
		
	}
	
}
