package lib;

import java.awt.Font;

public class tools {
	
	public static Font RegularFont(int fontSize) {
		return new Font("Jaldi", Font.PLAIN, fontSize);
	}
	
	public static Font BoldFont(int fontSize) {
		return new Font("Jaldi", Font.BOLD, fontSize);
	}
	

	public static class roundRect{
		
		public int x, y, width, height;
		
		public roundRect(int x, int y, int width, int height){
			
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			
		}
		
	}
	
	
}

