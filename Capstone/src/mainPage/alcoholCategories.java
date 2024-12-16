package mainPage;

import javax.swing.*;

import Alcohol.Distilled.Categories;
import Alcohol.fermented.categories;
import lib.tools;
import nonAlcohol.juice;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.TimerTask;
import java.util.Timer;

public class alcoholCategories extends JLayeredPane{

	
	public alcoholCategories() {
		
		this.setPreferredSize(new Dimension(1080, 720));
		this.setBackground(Color.gray); 
		this.setOpaque(true);
		
		JLayeredPane item1 = new container(new tools.roundRect(0, 0, 508, 468), Color.decode("#FFDDC5"), "Alcohol");
		item1.addMouseListener(lib.lib.distilledChange(this, new Categories(), 0));
		
		JLayeredPane item2 = new container(new tools.roundRect(0, 474, 508, 246), Color.decode("#74BACA"), "");
		
		JLayeredPane item3 = new container(new tools.roundRect(513, 0, 567, 294), Color.decode("#E19595"), "");
		JLabel name3 = new JLabel("Non-Alcohol");
		name3.setFont(tools.BoldFont(44));
		name3.setBounds(648, 122, 297, 58);
		item3.addMouseListener(lib.lib.fruitChange(this, new juice(), 1));
		
		JLayeredPane item4 = new container(new tools.roundRect(519, 301, 561, 419), Color.decode("#E17FA6"), "Fermented");
		item4.addMouseListener(lib.lib.fermentedChange(new categories(), 0));
		
		this.add(item1, Integer.valueOf(1));
		this.add(item2, Integer.valueOf(1));
		this.add(item3, Integer.valueOf(1));
		
		this.add(name3, Integer.valueOf(2));
		
		this.add(item4, Integer.valueOf(1));
	}
	
	class container extends JLayeredPane{
		
		Color color;
		
		tools.roundRect rect;
		
		class background extends JPanel{
			
			background() {
				
				this.setBounds(0, 0, rect.width, rect.height);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(color);
				g.fillRoundRect(0, 0, rect.width, rect.height, 20, 20);
				
			}
			
		}
		
		container(tools.roundRect rect,Color color, String text){
			
			this.color = color;
			this.rect = rect;
			
			this.setBounds(rect.x, rect.y, rect.width, rect.height);
			
			
			
			JLabel textT = new JLabel(text, SwingConstants.CENTER);
			textT.setFont(tools.BoldFont(48));
			
			FontMetrics fontSize = textT.getFontMetrics(tools.BoldFont(48));
			
			textT.setBounds((508 / 2) - textT.getFontMetrics(tools.BoldFont(48)).getWidths().length, 0, 508, 469);
			
			this.add(new background(), Integer.valueOf(0));
			this.add(textT, Integer.valueOf(1));
			
		}
		
	}
	
}
