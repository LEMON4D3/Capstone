package mainPage;

import javax.swing.*;

import lib.tools;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import user.user;

public class receipt extends JLayeredPane {

	public receipt() {
		
		this.setPreferredSize(new Dimension(1080, 720));
		
		
		JLabel receiptT = new JLabel("Receipt");
		receiptT.setBounds(450, 25, 179, 58);
		receiptT.setFont(tools.BoldFont(44));
		
		JLabel nameT = new JLabel("Name of customer: " + user.name);
		nameT.setBounds(45, 83, 1080, 29);
		nameT.setFont(tools.BoldFont(20));
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		//container.setMaximumSize(new Dimension(1080 - (42 * 2), 30));
		
		int index = 0;
		
		for(lib.lib.item i : user.item) {
			
			JPanel tempContainer = new JPanel();
			tempContainer.setLayout(new BoxLayout(tempContainer, BoxLayout.X_AXIS));
			tempContainer.setMaximumSize(new Dimension(1080 - (42 * 2), 30));
			
			JLabel itemName = new JLabel(i.name);
			itemName.setMaximumSize(new Dimension((1080 - (42 * 2) / 2), 30));
			
			JLabel itemPrice = new JLabel(i.price);
			itemPrice.setMaximumSize(new Dimension((1080 - (42 * 2) / 2), 30));
			
			index++;
			
			tempContainer.add(itemName);
			tempContainer.add(itemPrice);
			
			container.setOpaque(false);
			tempContainer.setOpaque(false);
			
			container.add(tempContainer);
			container.setMaximumSize(new Dimension(1080 - (42 * 2), 30 * index));
			
		}
		
		
		JScrollPane pane = new JScrollPane(container);
		pane.setBounds(42, 133, 1080 - (42 * 2), (container.getMaximumSize().height < 430) ? container.getMaximumSize().height : 430);
		pane.setOpaque(false);
		pane.getViewport().setOpaque(false);
		pane.setBorder(BorderFactory.createEmptyBorder());
		
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JLabel totalT = new JLabel(String.format("Total Cost: %.2f", user.totalCost));
		totalT.setBounds(42, 569, 500, 29);
		totalT.setFont(tools.BoldFont(20));
		
		JLabel userT = new JLabel(String.format("User Cash: %.2f", user.userCash));
		userT.setBounds(44, 603, 500, 29);
		userT.setFont(tools.BoldFont(20));
		
		JLabel confirm = new JLabel("Confirm", SwingConstants.CENTER);
		confirm.setBounds(450, 632, 215, 43);
		confirm.setFont(tools.BoldFont(20));
		confirm.setOpaque(true);
		
		confirm.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				lib.lib.quit();
				
			}
			
		});
		
		this.add(receiptT, Integer.valueOf(1));
		this.add(nameT, Integer.valueOf(1));
		
		this.add(pane, Integer.valueOf(1));
		
		this.add(totalT, Integer.valueOf(1));
		this.add(userT, Integer.valueOf(1));
		
		this.add(confirm, Integer.valueOf(1));
		
		this.add(new background(), Integer.valueOf(0));
		
	}
	
	class background extends JLayeredPane {
		
		String imageLoc = "src/rsc/main/receipt/";
		
		Image background = new ImageIcon(imageLoc + "background.png").getImage();
		
		background() {
			
			this.setBounds(0, 0, 1080, 720);
			
		}
		
		public void paint(Graphics g) {
			
			g.drawLine(11, 564, 1080 - 11, 564);
			
			g.drawImage(background, 0, 0, null);
		}
		
	}
	
}
