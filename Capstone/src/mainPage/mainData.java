package mainPage;

import java.util.LinkedList;

import javax.swing.ImageIcon;

import lib.*;

public class mainData {

	public static class Login{
		
		
		static public ImageIcon leftBg, rightBg, icon;
		
		String imageLoc = "src/rsc/main/login/";
		
		public Login() {
			
			leftBg = new ImageIcon(imageLoc + "leftBg.png");
			rightBg = new ImageIcon(imageLoc + "rightBg.png");
			icon = new ImageIcon(imageLoc + "icon.png");
			
		}
		
	}
	
}
