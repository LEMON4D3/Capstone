import javax.swing.JFrame;

import Alcohol.Distilled.*;
import Alcohol.fermented.*;
import nonAlcohol.*;
import mainPage.*;


public class Init extends JFrame{

	Init(){
		
		lib.lib.frame = this;
		
		this.setTitle("BevEra Order Application");
		
		new lib.lib();
		
		new mainData.Login();
		
		//this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//this.add(new login());
		
		//this.add(new createReceipt());
		
		//this.add(new lib.lib.distilledF(new whiskey(), 1));
		this.add(new lib.lib.fruitF(new mockTail(), 7 ));
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
