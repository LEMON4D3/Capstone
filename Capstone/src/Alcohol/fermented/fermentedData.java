package Alcohol.fermented;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import lib.lib;

public class fermentedData {
	
	public fermentedData() {
		
		new wine();
		new beer();
		new cider();
		new perry();
		
	}
	
	public static class wine {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Fermented/wine/";
		
		public wine() {
			
			ImageIcon fortified = new ImageIcon(imageLoc + "fortified.png");
			ImageIcon red = new ImageIcon(imageLoc + "red.png");
			ImageIcon white = new ImageIcon(imageLoc + "white.png");
			ImageIcon sparkling = new ImageIcon(imageLoc + "sparkling.png");
			ImageIcon rose = new ImageIcon(imageLoc + "rose.png");
			ImageIcon dessert = new ImageIcon(imageLoc + "dessert.png");
			
			item.add(new lib.item(
					"Fortified Wines",
					"Item Desc",
					"P 25.20",
					fortified
					));
			
			item.add(new lib.item(
					"Red Wine",
					"Item Desc",
					"P 25.20",
					red
					));
			
			item.add(new lib.item(
					"White Wine",
					"Item Desc",
					"P 25.20",
					white
					));
			
			item.add(new lib.item(
					"Sparkling Wines",
					"Item Desc",
					"P 25.20",
					sparkling
					));
			
			item.add(new lib.item(
					"Rose Wine",
					"Item Desc",
					"P 25.20",
					rose
					));
			
			item.add(new lib.item(
					"Dessert Wines",
					"Item Desc",
					"P 25.20",
					dessert
					));
			
		}
		
	}
	
	public static class beer {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Fermented/beer/";
		
		public beer() {
			
			ImageIcon lagers = new ImageIcon(imageLoc + "lagers.png");
			ImageIcon ales = new ImageIcon(imageLoc + "ales.png");
			
			ImageIcon hybrid = new ImageIcon(imageLoc + "hybrid.png");
			ImageIcon wheat = new ImageIcon(imageLoc + "wheat.png");
			ImageIcon sour = new ImageIcon(imageLoc + "sour.png");
			
			item.add(new lib.item(
					"Lagers",
					"Item Desc",
					"P 25.20",
					lagers
					));
			
			item.add(new lib.item(
					"Ales",
					"Item Desc",
					"P 25.20",
					ales
					));
			
			
			item.add(new lib.item(
					"Hybrid and Specialty Beers",
					"Item Desc",
					"P 25.20",
					hybrid
					));
			
			item.add(new lib.item(
					"Wheat Beers",
					"Item Desc",
					"P 25.20",
					wheat
					));
			
			item.add(new lib.item(
					"Sour Beers",
					"Item Desc",
					"P 25.20",
					sour
					));
			
			
		}
		
	}
	
	public static class cider {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Fermented/cider/";
		
		public cider() {
			
			ImageIcon traditional = new ImageIcon(imageLoc + "traditional.png");
			ImageIcon dry = new ImageIcon(imageLoc + "dry.png");
			ImageIcon flavored = new ImageIcon(imageLoc + "flavored.png");
			ImageIcon semiDry = new ImageIcon(imageLoc + "semiDry.png");
			
			ImageIcon sparkling = new ImageIcon(imageLoc + "sparkling.png");
			ImageIcon still = new ImageIcon(imageLoc + "still.png");
			ImageIcon sweet = new ImageIcon(imageLoc + "sweet.png");
			ImageIcon specialty = new ImageIcon(imageLoc + "specialty.png");
			
			item.add(new lib.item(
					"Traditional or Heritage Ciders",
					"Item Desc",
					"P 25.20",
					traditional
					));
			
			item.add(new lib.item(
					"Dry Cider",
					"Item Desc",
					"P 25.20",
					dry
					));
			
			
			item.add(new lib.item(
					"Flavored Ciders",
					"Item Desc",
					"P 25.20",
					flavored
					));
			
			item.add(new lib.item(
					"Semi-Dry or Semi-Sweet Cider",
					"Item Desc",
					"P 25.20",
					semiDry
					));
			
			item.add(new lib.item(
					"Sparkling Cider",
					"Item Desc",
					"P 25.20",
					sparkling
					));
			
			item.add(new lib.item(
					"Still Cider",
					"Item Desc",
					"P 25.20",
					still
					));
			
			item.add(new lib.item(
					"Sweet Cider",
					"Item Desc",
					"P 25.20",
					sweet
					));
			
			item.add(new lib.item(
					"Specialty Cider",
					"Item Desc",
					"P 25.20",
					specialty
					));
		}
		
	}
	
	public static class perry{
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Fermented/perry/";
		
		public perry() {
			
			ImageIcon traditional = new ImageIcon(imageLoc + "traditional.png");
			ImageIcon flavored = new ImageIcon(imageLoc + "flavored.png");
			ImageIcon sparkling = new ImageIcon(imageLoc + "sparkling.png");
			ImageIcon dry = new ImageIcon(imageLoc + "dry.png");
			ImageIcon specialty = new ImageIcon(imageLoc + "specialty.png");
			ImageIcon still = new ImageIcon(imageLoc + "still.png");
			ImageIcon semiDry = new ImageIcon(imageLoc + "semiDry.png");
			ImageIcon sweet = new ImageIcon(imageLoc + "sweet.png");
			
			items.addLast(new lib.item(
					"Traditional or Heritage Perry",
					"A refreshing burst of fizzy sweetness, with bold caramel notes, a touch of citrus, and an invigorating crispness in every sip. It's the classic taste that lifts your spirits and satisfies like no other.",
					"P 25.20",
					traditional
					));
			
			items.addLast(new lib.item(
					"Flavored Perry",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 26.20",
					flavored
					));
			
			items.addLast(new lib.item(
					"Sparkling Perry",
					"The OG, the flavor that started it all—classic, cool, crisp lemon-lime taste that’s caffeine free with 100% natural flavors.",
					"P 25.20",
					sparkling
					));
			
			items.addLast(new lib.item(
					"Dry Perry",
					"Mountain Dew delivers a bold, citrusy punch with sharp lemon-lime flavors and a smooth hint of tropical sweetness. Its lively fizz adds an extra burst of refreshment, making it an energizing and vibrant drink.",
					"P 32.40",
					dry
					));
			
			items.addLast(new lib.item(
					"Specialty Perry",
					"A refreshing burst of fizzy sweetness, with bold caramel notes, a touch of citrus, and an invigorating crispness in every sip. It's the classic taste that lifts your spirits and satisfies like no other.",
					"P 34.20",
					specialty
					));
			
			items.addLast(new lib.item(
					"Still Perry",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 34.20",
					still
					));
			
			items.addLast(new lib.item(
					"Semi-Dry or Semi-Sweet Perry",
					"A refreshing burst of fizzy sweetness, with bold caramel notes, a touch of citrus, and an invigorating crispness in every sip. It's the classic taste that lifts your spirits and satisfies like no other.",
					"P 34.20",
					semiDry
					));
			
			items.addLast(new lib.item(
					"Sweet Perry",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 34.20",
					sweet
					));
			
		}
		
	}

	
}

