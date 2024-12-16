package mainPage;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import lib.*;

public class search extends JLayeredPane{
	
	JLayeredPane frame = this;
	
	JTextField searchBar = new JTextField();
	
	JPanel container = new JPanel();
	JScrollPane pane = new JScrollPane(container);

	LinkedList<lib.item> item = lib.allItem;
	
	public search() {
		
		
		
		this.setPreferredSize(new Dimension(1080, 720));
		
		JPanel header = new header();
		header.setBounds(49, 37, 879, 55);
		
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		searchBar.setFont(tools.BoldFont(28));
		searchBar.setForeground(Color.white);
		
		
		
		pane.setBounds(31, 114, 995, 605);
		pane.setOpaque(false);
		pane.getViewport().setOpaque(false);
		pane.setBorder(BorderFactory.createEmptyBorder());
		
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pane.getVerticalScrollBar().setUnitIncrement(16);
		
		nothing();
		
		this.add(new lib.background(), Integer.valueOf(0));
		this.add(header, Integer.valueOf(1));
		this.add(pane, Integer.valueOf(2));
		
	}
	
	void nothing() {
		
		container.removeAll();
		
		for(int i = 0; i < item.size(); ) {
			
			
			
			JPanel containerT = new JPanel();
			containerT.setLayout(new BoxLayout(containerT, BoxLayout.X_AXIS));
			containerT.setBounds(0, 0, 995, 205);
			
			for(int a = i; a < i + 3 && a < item.size(); a++) {
				
				JLayeredPane panel = new JLayeredPane();
				panel.setPreferredSize(new Dimension(205, 205));
				
				
				JLabel imageT = new JLabel();
				imageT.setIcon(item.get(a).image);
				imageT.setBounds(0, 0, 205, 205);
				
				JLabel name = new JLabel(item.get(a).name);
				name.setBounds(50, 50, 100, 50);
				
				panel.add(imageT, Integer.valueOf(0));
				panel.add(name, Integer.valueOf(1));
				
				int tempA = a;
				
				panel.addMouseListener(new MouseAdapter() {
					
					public void mousePressed(MouseEvent e) {
						
						lib.change(frame, new orderF(item.get(tempA)));
						
					}
					
				});
				
				containerT.add(Box.createHorizontalStrut(50));
				containerT.add(panel);
				containerT.add(Box.createHorizontalStrut(50));
				
			}
			
			
			container.setOpaque(false);
			containerT.setOpaque(false);
			container.setBounds(0, 0, 995, 255 * (i + 1));
			container.add(containerT);
			container.add(Box.createVerticalStrut(50));
			
			if(i + 3 < item.size())
				i += 3;
			else
				i++;
			
			
		}
		
		pane.revalidate();
		pane.repaint();
		
	}
	
	void using(String text) {
		
		
		container.removeAll();
		
		int itemInside = 0;
		
		for(int i = 0; i < item.size(); ) {		
			
			
			JPanel containerT = new JPanel();
			containerT.setLayout(new BoxLayout(containerT, BoxLayout.X_AXIS));
			containerT.setBounds(0, 0, 995, 205);
			
			
			
			for(int a = i; a < item.size(); a++) {
				
				if(itemInside > 2) {
					
					
					itemInside = 0;
					
					i = a;
					break;
				}
				
				if(item.get(a).name.toLowerCase().contains(text.toLowerCase())) {
					
					
					JLayeredPane panel = new JLayeredPane();
					panel.setPreferredSize(new Dimension(205, 205));
					
					
					JLabel imageT = new JLabel();
					imageT.setIcon(item.get(a).image);
					imageT.setBounds(0, 0, 205, 205);
					
					JLabel name = new JLabel(item.get(a).name);
					name.setBounds(50, 50, 100, 50);
					
					panel.add(imageT, Integer.valueOf(0));
					panel.add(name, Integer.valueOf(1));
					
					containerT.add(Box.createHorizontalStrut(50));
					containerT.add(panel);
					containerT.add(Box.createHorizontalStrut(50));
					
					itemInside++;
				}
				
				i = a;
				
			}
			
			container.setOpaque(false);
			containerT.setOpaque(false);
			container.setBounds(0, 0, 995, 255 * (i + 1));
			container.add(containerT);
			container.add(Box.createVerticalStrut(50));
			
			i++;
			
			
		}
		
		
		pane.revalidate();
		pane.repaint();
		
	}
	
	class roundTextField extends JLayeredPane{
		
		roundTextField(){
			
			this.setBounds(131, 0, 748, 55);
			
			this.add(searchBar);
		}
		
		public void paint(Graphics g) {
			
			g.setColor(Color.decode("#1B4C85"));
			g.fillRoundRect(0, 0, 748, 55, 20, 20);
			
		}
		
	}
	
	class header extends JPanel{
		
		String imageLoc = "src/rsc/main/search/";
		
		header() {
			
			this.setPreferredSize(new Dimension(879, 55));
			this.setLayout(null);
			this.setOpaque(false);
			
			JLabel back = new JLabel();
			back.setBounds(0, 0, 80, 55);
			back.setIcon(new ImageIcon(imageLoc + "back.png"));
			back.addMouseListener(new MouseAdapter() { public void mousePressed(MouseEvent e) {lib.remove(new alcoholCategories());}});
			
			searchBar.setBounds(136, 0, 725, 55);
			searchBar.setBackground(Color.decode("#1B4C85"));
			searchBar.setBorder(BorderFactory.createEmptyBorder());
			
			searchBar.addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
				
					if(searchBar.getText().isEmpty())
						nothing();
					else
						using(searchBar.getText());
					
				}
				
				
				
			});
			
			this.add(back);
			this.add(new roundTextField(), Integer.valueOf(0));
			this.add(searchBar, Integer.valueOf(1));
			
			
		}
		
	}
	
	
}
