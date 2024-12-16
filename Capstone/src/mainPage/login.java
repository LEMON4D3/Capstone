package mainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Alcohol.Distilled.*;

import lib.*;

public class login extends JLayeredPane{
	
	int tries = 3;
	
	public login() {
		
		//mainData.Login login = new mainData.Login();
		
		JLayeredPane temp = this;
		
		this.setPreferredSize(new Dimension(1080, 720));
		
		JLabel leftBg = new JLabel();
		leftBg.setIcon(mainData.Login.leftBg);
		
		JLabel rightBg = new JLabel();
		rightBg.setIcon(mainData.Login.rightBg);
		
		JLabel icon = new JLabel();
		icon.setIcon(mainData.Login.icon);
		
		JLabel wrong = new JLabel(String.format("%d more attempts before invalidation", tries));
		wrong.setVisible(false);
		
		JTextField usernameT = new JTextField();
		usernameT.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		usernameT.setOpaque(false);
		usernameT.setFont(tools.BoldFont(15));
		
		JTextField passwordT = new JTextField();
		passwordT.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		passwordT.setOpaque(false);
		passwordT.setFont(tools.BoldFont(15));
		
		JLabel loginBtn = new JLabel("Login", SwingConstants.CENTER);
		loginBtn.setBackground(Color.decode("#358071"));
		loginBtn.setOpaque(true);
		loginBtn.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				if(passwordT.getText().equals("1234") && usernameT.getText().equals("1234")) {
					
					lib.change(temp, new alcoholCategories());

					
				}
				else {
					
					tries--;
					wrong.setText(String.format("%d more attempts before invalidation", tries));
					wrong.setVisible(true);
					
					
					if(tries == 0)
						lib.quit();
				
				}
					
				temp.revalidate();
				temp.repaint();
				
			}
			
		});
		
		leftBg.setBounds(0, 0, 540, 720);
		rightBg.setBounds(540, 0, 540, 720);
		icon.setBounds(92, 0, 357, 334);
		usernameT.setBounds(116, 350, 268, 24);
		passwordT.setBounds(116, 450, 268, 24);
		loginBtn.setBounds(156, 565, 228, 40);
		wrong.setBounds(164, 527, 208, 18);
		
		this.add(leftBg, Integer.valueOf(0));
		this.add(rightBg, Integer.valueOf(0));
		
		this.add(icon, Integer.valueOf(1));
		
		this.add(usernameT, Integer.valueOf(1));
		this.add(passwordT, Integer.valueOf(1));
		this.add(loginBtn, Integer.valueOf(1));
		this.add(wrong, Integer.valueOf(1));
		
	}
	
}
