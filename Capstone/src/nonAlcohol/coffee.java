package nonAlcohol;

import lib.*;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class coffee extends JLayeredPane{

	public coffee(){
		
		LinkedList<lib.item> item = nData.coffee.item;
		
		this.setBounds(0, 0, 1080, 720);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		Color color[] = {
				Color.decode("#B5D5C6"),
				Color.decode("#F0DDAC"),
				Color.decode("#F6B69A"),
				Color.decode("#FDFBFB"),
				Color.decode("#648E9A"),
				Color.decode("#69A592"),
		};
		
		JPanel container1 = new JPanel();
		container1.setLayout(new BoxLayout(container1, BoxLayout.X_AXIS));
		container1.setPreferredSize(new Dimension(1012, 247));
		
		for(int i = 0; i < 3; i++) {
			
			JPanel temp = new container(color[i], item.get(i));
			temp.addMouseListener(lib.removeMouse(new orderF(item.get(i))));
			container1.add(temp);
			
		}
		
		container.add(container1);
		JPanel container2 = new JPanel();
		container2.setLayout(new BoxLayout(container2, BoxLayout.X_AXIS));
		container2.setPreferredSize(new Dimension(2012, 247));
		
		
		for(int i = 3; i < 6; i++) {
		
			JPanel temp = new container(color[i], item.get(i));
			temp.addMouseListener(lib.removeMouse(new orderF(item.get(i))));
			container2.add(temp);
		}
		container.add(container2);
		
		container.setBounds(34, 197, 1011, 494);
		
		this.add(container, Integer.valueOf(1));
		this.add(new lib.background(), Integer.valueOf(0));
	}
	
	class container extends JPanel{
		
		container(Color color, lib.item item){
			
			this.setPreferredSize(new Dimension(335, 247));
			this.setBackground(color);
			this.setOpaque(true);
			this.setLayout(null);
			
			JLabel name = new JLabel(item.name, SwingConstants.CENTER);
			name.setBounds(0, 16, 300, 47);
			name.setFont(tools.RegularFont(32));
			
			JLabel desc = new JLabel("<html>" + item.desc + "</html>");
			desc.setFont(tools.RegularFont(32));
			desc.setBounds(97, 52, 142, 47);
			
			JLabel price = new JLabel(item.price);
			price.setBounds(38, 173, 150, 47);
			price.setFont(tools.RegularFont(32));
			
			this.add(name);
			this.add(desc);
			this.add(price);
			
			
		}
		
	}
	
}
