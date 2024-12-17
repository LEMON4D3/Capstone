package mainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import user.user;
import lib.*;

public class popUp extends JFrame{
	
	public popUp() {
		
		this.add(new container());
		
		this.pack();
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
	
	class container extends JLayeredPane {
		
		container() {
			
			this.setPreferredSize(new Dimension(775, 475));
			this.setBackground(Color.decode("#38638C"));
			this.setOpaque(true);
			
			JLabel textT = new JLabel("<html>Hello, " + user.name + "!!" + "<br>Thank you for your order.<br><br>We hope you enjoy the drinks at<br>BEVERA.</html>", SwingConstants.CENTER);
			textT.setBounds(50, 75, 675, 300);
			textT.setFont(tools.RegularFont(44));
			textT.setForeground(Color.white);
			
			this.add(textT);
			
			this.addMouseListener(new MouseAdapter() {
				
				public void mousePressed(MouseEvent e) {
					
					lib.quit();
					
				}
				
			});
			
		}
		
	}
	
}
