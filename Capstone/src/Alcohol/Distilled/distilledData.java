package Alcohol.Distilled;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;

import javax.swing.*;

import lib.*;

public class distilledData{
	
	public distilledData() {
		
		new whiskey();
		new rum();
		new vodka();
		new brandy();
		new gin();
		new tequila();
		
	}
	
	static class categories{
		
		static class background extends JPanel {
			
			background() {
				this.setBounds(0, 0, 1080, 720);
			}
			

			public void paint(Graphics g) {
				
				g.drawImage(distilledData.categories.background, 0, 0, null);
				g.drawImage(distilledData.categories.menu, 41, 11, null);
				g.drawImage(distilledData.categories.icon, 165, -2, null);
				g.drawImage(distilledData.categories.cart, 814, 16, null);
				
				
				
				
				g.setColor(Color.white);
				g.fillRect(0, 97, 1080, 40);
				g.fillRect(0, 137, 1080, 40);
				
				g.setColor(Color.decode("#80A5E9"));
				g.fillRoundRect(459, 98, 168, 28, 20, 20);
			}
		}
		
		static Image background = new ImageIcon("src/rsc/Alcohol/Categories/background.png").getImage();
		static Image menu = new ImageIcon("src/rsc/Alcohol/Categories/Menu.png").getImage();
		static Image icon = new ImageIcon("src/rsc/Alcohol/Categories/App_Icon.png").getImage();
		static Image cart = new ImageIcon("src/rsc/Alcohol/Categories/cart.png").getImage();
		
	}
	
	static class whiskey{
		
		static class background extends JPanel {
			
			background() {
				this.setBounds(0, 0, 1080, 720);
			}
			

			public void paint(Graphics g) {
				
				g.drawImage(distilledData.categories.background, 0, 0, null);
				g.drawImage(distilledData.categories.menu, 41, 11, null);
				g.drawImage(distilledData.categories.icon, 165, -2, null);
				g.drawImage(distilledData.categories.cart, 814, 16, null);
				
				
				
				
				g.setColor(Color.white);
				g.fillRect(0, 97, 1080, 30);
				g.fillRect(0, 127, 1080, 40);
				
				g.setColor(Color.decode("#80A5E9"));
				g.fillRoundRect(459, 98, 168, 28, 20, 20);
				g.fillRoundRect(20, 131, 222, 30, 20, 20);
			}
			
			

			}
		
		static class itemContainer extends JPanel{
			
			Color color;
			
			itemContainer(Color color){
				
				this.setBounds(0, 0, 986, 214);
				
				this.color = color;
			}
			
			public void paint(Graphics g) {
				
				
				g.setColor(color);
				g.fillRoundRect(0, 0, 986, 214, 20, 20);
			
			}
		}
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		whiskey() {
			
			String imageLoc = "src/rsc/Alcohol/Distilled/whiskey/";
			
			ImageIcon rye = new ImageIcon(imageLoc + "rye.png");
			ImageIcon canadian = new ImageIcon(imageLoc + "canadian.png");
			ImageIcon japanese = new ImageIcon(imageLoc + "japanese.png");
			ImageIcon bourbon = new ImageIcon(imageLoc + "bourbon.png");
			ImageIcon tennessee = new ImageIcon(imageLoc + "tennessee.png");
			ImageIcon irish = new ImageIcon(imageLoc + "irish.png");
			ImageIcon scotch = new ImageIcon(imageLoc + "scotch.png");
			ImageIcon singleMatt = new ImageIcon(imageLoc + "singleMalt.png");
			ImageIcon blended = new ImageIcon(imageLoc + "blended.png");
			
			
			
			
			
			items.addLast(new lib.item( itemList[0][0], itemList[0][1], itemList[0][2], rye));
			items.addLast(new lib.item( itemList[1][0], itemList[1][1], itemList[1][2], canadian));
			items.addLast(new lib.item( itemList[2][0], itemList[2][1], itemList[2][2], japanese));
			items.addLast(new lib.item( itemList[3][0], itemList[3][1], itemList[3][2], bourbon));
			items.addLast(new lib.item( itemList[4][0], itemList[4][1], itemList[4][2], tennessee));
			items.addLast(new lib.item( itemList[5][0], itemList[5][1], itemList[5][2], irish));
			items.addLast(new lib.item( itemList[6][0], itemList[6][1], itemList[6][2], singleMatt));
			items.addLast(new lib.item( itemList[7][0], itemList[7][1], itemList[7][2], blended));
			
		}
		
		
		static String itemList[][] = {
				
				{
					"Jack Daniel's Rye Tennessee Whiskey 700 ml",
					"<html>Jack Daniel’s Tennessee Rye combines the distinct flavor of rye and Jack's time-honored charcoal mellowing process. The result is a bold, spicy Rye Whiskey that's sippin' smooth. At 90 proof, it packs rich flavors from start to finish. On the palate, this well-rounded rye whiskey brings out sweet caramel, followed by a peppery rye character finish. Rye Whiskey. Jack's Way. <br>Color: Deep amber with golden highlights <br>Origin: USA <br>Alcohol Content/ ABV %: 45.0% | Proof: 90 </html>",
					"P 1455.00"
				},
				
				{
					"Crown Royal Canadian Whiskey 750ml",
					"<html>Unwind in luxury with a glass of Crown Royal Fine Deluxe Blended Canadian Whisky. Our 80-proof whisky offers a rich and robust aroma, with subtle hints of vanilla and fruit that entice the senses. On the palate, it delivers a silky texture, complemented by the smooth nuances of oak and a touch of sweet vanilla. This refined blend makes it the perfect choice for any cocktail party or celebration, offering a long and lingering finish that leaves a lasting impression. <br>Color: Amber <br>Origin: Canada <br>Alcohol Content/ ABV %: 40% | Proof: 80<html>",
					"P 1699.00"
				},
				
				{
					"Hibiki Harmony Japanese Whiskey 700 ml",
					"<html>Hibiki Harmony is a smooth, well-balanced whisky crafted from a blend of single malts, aged in casks including the unique Mizunara oak. The nose offers a gentle mix of rose, lychee, and a touch of rosemary, along with a warm, woody character from sandalwood. On the palate, you'll find a honeylike sweetness paired with hints of candied orange peel and white chocolate. The finish is soft and lingering, with a subtle trace of Mizunara oak, adding a light, delicate note to the overall experience. <br>Color: Golden Amber <br>Origin: Japan <br>Alcohol Content/ ABV %: 43% | Proof: 86 <html>",
					"P 8499.00"
				},
				
				{
					"John Lee Kentucky Straight Bourbon Whiskey 700ml",
					"<html>This authentic Kentucky Straight Bourbon, crafted over years by generations of distillers, was originally produced for the French market and matured in oak barrels under U.S. government supervision. On the nose, it offers a mild, sweet profile, with notes of vanilla, toffee, and corn, complemented by hints of honey and fruit. The palate reveals a base of grain sweetness and vanilla, with corn and a subtle touch of cherries, while a building spiciness is layered with light notes of anise and honey. The finish is smooth and gentle, with lingering flavors of mint, honey, oak, and vanilla. <br>Color: Rich Amber <br>Origin: Kentucky, USA <br>Alcohol Content/ ABV %: 40% | Proof: 80 </html>",
					"P 850.00"
				},
				
				{
					"Jack Daniel's Tennessee Whiskey 700 ml",
					"<html>Jack Daniel's Tennessee Whiskey, the world's best-selling whiskey, is produced at the Jack Daniel Whiskey Distillery in Lynchburg, Tennessee, established in 1866. Made from corn, rye, and barley malt, and filtered through iron-free Cave Spring water, it is charcoal mellowed through 10 feet of sugar maple charcoal, giving it its signature smoothness. The whiskey is then aged in handcrafted white oak barrels. <br>Color: Rich Amber <br>Origin: USA <br>Alcohol Content/ ABV %: 40% | Proof: 80 </html>",
					"P 1145.00"
				},
				
				{
					"Jameson Irish Whiskey 700ml",
					"<html>Jameson Irish Whiskey is a blend of traditional pot still and grain whiskey, triple-distilled and aged for at least five years in a mix of American oak barrels and sherry casks, resulting in a distinct, smooth flavor with light floral aromas, spicy wood, and sweet notes, balanced with nutty, vanilla, and sherry flavors, finishing with a smooth touch of vanilla, fruit, and spice. <br>Color: Rich Amber <br>Base Ingredient: Malted and Unmalted barley blend <br>Origin: Dublin, Ireland <br>Alcohol Content/ ABV %: 40% | Proof: 80 </html>",
					"P 949.00"		
				},
				{
					"Monkey Shoulder Blended Malt Scotch Whiskey 700ml",
					"<html>This superb blended malt whisky from William Grant is crafted from single malts sourced from three renowned Speyside distilleries, resulting in a smooth, creamy, and malty Scotch with notes of orange zest, vanilla, marmalade, cinnamon, and floral spices, making it perfect for sipping neat, over ice, or in cocktails. <br>Color: Burnished copper with richly golden light yellow<br>Origin: Scotland, Great Britain<br>Alcohol Content/ ABV %: 40% | Proof: 80</html>",
					"P 2299.00"
				},
				
				{
					"Dalmore 12 Year Old Singlemalt Scotch Whiskey 700ml",
					"<html>Dalmore 12 Year Old Single Malt Scotch Whisky is a classic expression of Highland whisky, renowned for its rich and robust flavors. Matured in American oak and sherry casks, this whiskey offers a splendid aromas of citrus fruits, aromatic spices, and chocolate that touch the tongue and amaze your taste buds with orange, dried fruits, and flavours of vanilla. It leaves an aftertaste of coffee and dark chocolate making it a complete package for every liquor enthusiast out there! <br>Color: Rich Amber <br>Origin: Scotland, Great Britain<br>Alcohol Content/ ABV %: 40% | Proof: 80 </html>",
					"P 4950.00"
				}
		};
		
		static String itemColor[] = { "#648E9A", "#69A592", "#54B492"};
	}

	public static class rum{
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Distilled/rum/";
		
		public rum(){
			
			ImageIcon whiteRum = new ImageIcon(imageLoc + "whiteRum.png");
			ImageIcon goldRum = new ImageIcon(imageLoc + "goldRum.png");
			ImageIcon darkRum = new ImageIcon(imageLoc + "darkRum.png");
			
			ImageIcon blackRum = new ImageIcon(imageLoc + "blackRum.png");
			ImageIcon spicedRum = new ImageIcon(imageLoc + "spicedRum.png");
			ImageIcon navyRum = new ImageIcon(imageLoc + "navyRum.png");
			
			ImageIcon overproofRum = new ImageIcon(imageLoc + "overproofRum.png");
			ImageIcon molassesRum = new ImageIcon(imageLoc + "molassesRum.png");
			ImageIcon vintageRum = new ImageIcon(imageLoc + "vintageRum.png");
			
			ImageIcon rhumAgricole = new ImageIcon(imageLoc + "rhumAgricole.png");
			ImageIcon cachaca = new ImageIcon(imageLoc + "cachaca.png");
			ImageIcon pAgedRum = new ImageIcon(imageLoc + "pAgedRum.png");
			
			ImageIcon aguardiente = new ImageIcon(imageLoc + "aguardiente.png");
			
			
			items.addLast(new lib.item(
					"Tanduay White Rum 750 ml",
					"<html> TANDUAY White is exquisitely blended and flawlessly light. This special Rum is meticulously filtered resulting in a sparkling clear spirit with a subtle sweet and spicy taste, enhancing every drink it is mixed with. <br>COLOR: Clear, colorless.<br>NOSE: Raw coconut, spritz of lime, white pepper, and cumin.<br>TASTE: A light simple taste of sweet cream and pepper.<br>BODY: Fresh mild body.<br>FINISH: Light sweetness with smooth citrus rind and peppery finish.<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 145.00",
					whiteRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Dark Rum 750 ml",
					"<html>Aged up to 7 years in used Bourbon barrels, this silky smooth Gold rum from our own heritage sugarcane, reveals how TANDUAY became the global leader in Dark Rum. TANDUAY Asian Rum is a special blend of aged Rum harvested from first hand bourbon barrel reserves produced from the finest sugarcane varieties grown in the rich volcanic soils of Bacolod, Philippines. <br>COLOR: Bright, golden amber<br>NOSE: Refined and elegant. Presence of mature honey, almond, caramel, toasted oak, orange peels and vanilla.<br>TASTE: Good balance of alcohol level and sweetness. Expressive flavors of vanilla, tropical fruit, coconut and nutmeg.<br>BODY: Mellow, smooth and dry.<br>FINISH: Persistent in harmony. Caramel flavor persist on the finish, with vanilla and wooden notes.<br>AGING: Blend of rums aged up to 7 years in ex-bourbon barrels.<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 1490.00",
					goldRum
					));
			
			items.addLast(new lib.item(
					"Dark Rum",
					"<html>TANDUAY Dark is the hallmark of TANDUAYs rich and exotic rum heritage. Its taste is described by many as a blend of tropical flavours and aged oak, a distinctive character that made it the most popular Golden Rum in the Pacific. <br>COLOR: Dark amber color.<br>NOSE: Amaretti cookies.<br>TASTE: Butterscotch, frozen custard, cola, caramel apple.<br>BODY: Candied & Mild.<br>FINISH: Smooth caramel, tropical fruits finish.<br>AGING: Blend of rums aged for at least three years in ex-bourbon barrels.<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 145.00",
					darkRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Especia Spiced Rum 750 ml",
					"<html>Stare long enough at the trees here, and you might see the glimmer of a green scale. The flicker of a forked tongue and then, lifted by ancient magic, a snake slithering through the humid air. The glider snake keeps a dark eye on the exotic ssspices that bloom throughout our jungle, so every ssssip of this spiced rum is imbued with exotic magic.<br>COLOR: Bright Golden Amber<br>NOSE: Sweet and elegant aroma of fruit cake, cinnamon, caramel, almond, vanilla.<br>TASTE: Honey, cinnamon, ginger, mingled with hints of tropical fruits.<br>BODY: Mellow, smooth and dry<br>FINISH: Warm persistence with flavors oF caramel, cinnamon and nuances of baking spices.<br>Aging: Blend of rums aged up to 7 years in an ex-bourbon barrel.<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 1200.00",
					blackRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Asian Rum Silver - 750ml",
					"<html>Aged up to 5 years in used Bourbon barrels, this silky smooth Silver rum, from our own heritage Asian sugarcane, is only moderately filtered for flavor, giving it a light straw appearance. Perfect for sipping straight yet well balanced for mixing <br>COLOR: Clear, transparent, pale-straw yellow.<br>NOSE: Good intensity of mandarin and grapefruit peel with toasted notes, coconut and vanilla background.<br>TASTE: Cream soda with flavours of citrust fruits all in harmony.<br>BODY: Satiny, crisp, fruity light to medium body.<br>FINISH:  Dry yet sweet with warm persistence.<br>AGING: Blend of rums aged up to 5 years in ex-bourbon barrels.<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 1490.00",
					spicedRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Double Rum 750 ml",
					"<html>This Rum is inspired by TANDUAY's unmatched expertise and legacy in making Filipino Rum for the past 16 decades. It embodies the value of paying tribute to all the men and women behind TANDUAY's success - one that is Distinctly Filipino. COLOR: Dark Amber Color. NOSE: A well married flavors of tropical dried fruits, toasted nuts and cooked pineapple.<br>TASTE: A deluxe aged rum hitched with taste of torched pineapple with a mellow blend of cherry and vanilla.<br>BODY: Round fruity medium body.<br>FINISH: Elegant medium-long woody notes, raisin and tropical zest finish.<br>AGING: Blend of rums aged up to 16 and 5 years in ex-bourbon barrel for two years.<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 2500.00",
					navyRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Light Rum 750 ml",
					"<html>Tanduay’s Master Blender developed this rich blend of rum with just the right sweetness and aroma. This 55 proof special blend boasts a compelling smooth flavor with mild woody notes, light bodied with sweetness on the edge.<br>COLOR: Light red-orange with copper tone<br>NOSE: Fruity, ripe banana, with hints of bubblegum and caramel in the background<br>TASTE: Light and fruity with a mild woody note<br>BODY: Candied, mild and fruity<br>FINISH: Smooth and light cascading with a sweet taste and ripe fruit flavors<br>Aging: Blend of column and pot still rums aged up to two years<br>ABV : 27.5%|Proof: 55                   Origin: Philippines</html>",
					"P 125.00",
					overproofRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Extra Strong Rum 700 ml",
					"<html>This unique rum is specially blended to be strong, robust without being intimidating, and vibrant without being aggrresive. Its 50% alcohol content and rich character are derived from select sugarcane and Tanduay's traditional techniques of ageing and blending.<br>COLOR: Golden Amber<br>NOSE: Vibrant with hint of butter-toast and caramel<br>TASTE: Entry hits hard with a peppery warmth then mid palate it turns to a dried fruit flavor mingling with the ethanol burn<br>BODY: Crisp and dry medium body<br>FINISH: Robust with spicy warmth<br>AGING: Blend of rums aged up to two years in ex-bourbon barrels<br>ABV : 50%|Proof: 100                   Origin: Philippines</html>",
					"P 145.00",
					molassesRum
					));
			
			items.addLast(new lib.item(
					"Tanduay Superior Rum 700 ml",
					"<html>Made from select aged rums and blended with Tanduay's 12-year-old aged rum reserve. Carefully aged in oak wood barrels and meticulously blended to create rum with tastes of caramel, oak wood, and pepper with gentle sweep of nuts and coconut.<br>COLOR: Bright bronze<br>NOSE: Molasses followed by rising fruit notes of orange peel and banana then toasted walnut<br>TASTE: Caramel, oak wood, pepper with gentle sweep of nuts and coconut<br>BODY: Fresh light to medium body<br>FINISH: Medium to long dry finish with flavors of molasses and cocoa<br>AGING: Made with rum aged for two years blended with 12-year-old aged rum<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 145.00",
					vintageRum
					));
			
			items.addLast(new lib.item(
					"Tanduay 1854 Rum 700 ml",
					"<html>Launched to celebrate the sesquicentennial anniversary of Tanduay Distillers. This rum is masterfully blended from Tanduay's special reserve of aged rums to give a compelling taste of caramel, vanilla and oak with fresh pineapple and citrus fruits.<br>COLOR: Golden Amber<br>NOSE: Citrus notes of orange and lemon, with coconut and caramel on the background<br>TASTE: Caramel, vanilla and oak with fresh pineapple and citrus fruits<br>BODY: Mildly sweet light to medium body<br>FINISH: Medium to long dry finish with flavors of caramel and pepper<br>Aging: Made with 2-year-old rum blended with 15-year-old rum<br>ABV : 40%|Proof: 80                   Origin: Philippines</html>",
					"P 455.00",
					rhumAgricole
					));
			
			items.addLast(new lib.item(
					"Tanduay Boracay Rum 750 ml (Coconut)",
					"<html>Smooth Philippine white rum gets some attitude with the exotic taste of coconut. Suit the flavor to your mood whether you take it straight, on the rocks or mixed. Boracay Rum captures the island experience. Choose to party with the sweet and tropical taste of coconut mingling with light a blend of nougat and vanilla that finishes with a good hint of macaroon. COLOR: Clear<br>NOSE: Sweet, tropical aromas of coconut cream mingling with light scents of almond nougat and vanilla<br>TASTE: Pleasant sweetness with Firm Coconut Milk Flavor<br>BODY: Sweet light-to-medium body<br>FINISH:  Smooth, medium-length nougat and coconut macaroon finish<br>ABV : 25%|Proof: 50              Origin: Philippines</html>",
					"P 145.00",
					cachaca
					));
			
			items.addLast(new lib.item(
					"Tanduay Boracay Rum 750 ml (Cappuccino)",
					"<html>Smooth Philippine white rum gets some attitude with the unique kick of cappuccino. Suit the flavor to your mood whether you take it straight, on the rocks or mixed. Choose to party and let yourself loose on the dance floor with the creamy taste of cappuccino with a rich taste of coffee, grated coconut milk and hint of fudge brownies. <br>COLOR: Clear, Colorless<br>NOSE: Sweet, creamy coffee with light scent of tart and grated coconut milk<br>TASTE: A sweet creamy coffee with a rich blend of brown sugar and fudge brownies<br>BODY: Sweet light to medium body<br>FINISH: Medium to long dry finish with flavors of molasses and cocoa<br>AGING: Smooth caramel coffee and light creamy coconut finish<br>ABV : 25%|Proof: 50                   Origin: Philippines</html>",
					"P 145.00",
					pAgedRum
					));
		}
		
		
	}

	public static class vodka{
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Distilled/vodka/";
		
		public vodka() {
			
			ImageIcon plainVodka = new ImageIcon(imageLoc + "plainVodka.png");
			ImageIcon flavoredVodka = new ImageIcon(imageLoc + "flavoredVodka.png");
			ImageIcon fruitVodka = new ImageIcon(imageLoc + "fruitVodka.png");
			ImageIcon grainVodka = new ImageIcon(imageLoc + "grainVodka.png");
			ImageIcon ryeVodka = new ImageIcon(imageLoc + "ryeVodka.png");
			ImageIcon molassesVodka = new ImageIcon(imageLoc + "molassesVodka.png");
			
			items.addLast(new lib.item(
					"Crystal Head Vodka 700ml",
					"<html>Launched in 2008, our original Crystal Head Vodka is crafted from locally sourced Canadian corn. It is distilled four times into a neutral grain spirit and blended with pristine water from Newfoundland, Canada. The vodka is filtered seven times, of which three are through layers of semi-precious crystals known as Herkimer diamonds. <br>On the nose–neutral grain aromas with a delicate touch of citrus. Silky smooth with a hint of sweetness and vanilla. Ending with a sweet, creamy finish.                      Origin: Canada                                                ABV: 40% | Proof: 80</html>",
					"P 5790.00",
					plainVodka
					));
			
			items.addLast(new lib.item(
					"Absolut Apeach 750ml",
					"<html>Absolut Apeach is a smooth, peach-flavored vodka made with natural ingredients and without added sugar. It offers a fresh and fruity flavor, perfect for cocktails or sipping over ice.<br>Tasting Notes: Ripe peach aroma with hints of tropical fruits, delivering a juicy, mildly sweet taste with a smooth finish.<br>Origin: Ahus, Sweden   <br>ABV: 40% | Proof: 80</html>",
					"P 1100.00",
					flavoredVodka
					));
			
			items.addLast(new lib.item(
					"Absolut Raspberri 750ml",
					"<html>Absolut Raspberri is a vibrant, raspberry-flavored vodka made with natural ingredients and no added sugar. It delivers a bold, fruity taste that’s perfect for cocktails and mixers.<br>Tasting Notes: Fresh, intense raspberry aroma with subtle hints of sweetness, offering a juicy, tangy flavor and a smooth finish.<br>Origin: Ahus, Sweden   <br>ABV: 40% | Proof: 80</html>",
					"P 1100.00",
					fruitVodka
					));
			
			items.addLast(new lib.item(
					"Ocean Organic Vodka 750ml",
					"<html>It is the only vodka in the world crafted from a blend of distilled organic sugar cane and deep ocean mineral water. As a result OCEAN Organic Vodka is naturally gluten-free. Using 100% organic sugar cane, the spirits are distilled through a continuous column distillation process, which yields an exceptionally smooth base.<br>Origin: Hawaii<br>ABV: 40% | Proof: 80</html>",
					"P 780.00",
					grainVodka
					));
			
			items.addLast(new lib.item(
					"<html>Polugar Classic Rye Vodka 750ml</html>",
					"<html>Polugar Classic Rye is another expression of legendary Russian bread wine brought back to life using the traditional recipes and distillation methods from the 18th and 19th centuries. Classic Rye Polugar is produced using select coarse-milled rye and natural water that is not chemically purified.<br>Nose: Fresh, bright and bready. Comforting aroma of home-baked goods, rye crust, rye bread, dill, caraway and pickling spices. Tones of thick malt, buckwheat honey, freshly baked bread, grains, fresh grasses, and wildflowers. Palate: Warming, soft taste of rye bread, slightly sweet with notes of honey and spice. A slightly grassy bitterness. Finish: Prolonged and warming, with bright notes of rye bread, salt and pepper hints, hazelnuts, almonds and honey with light botanical bitterness.<br>Origin: Russia              <br>ABV: 38.5% | Proof: 77</html>",
					"P 4105.00",
					ryeVodka
					));
			
			items.addLast(new lib.item(
					"<html>Deerness Distillery - Into The Wild Vodka 700ml</html>",
					"<html>It's the signature vodka from Deerness Distillery Inspired by the wild and beautiful Orkney landscape, Into The Wild Vodka is hand-distilled in small batches and blended with pure Orkney water.<br>A smooth and crisp Orcadian vodka<br>Tasting Notes Smooth and fresh, with a clean crisp finish<br>Origin: Scotland<br>ABV: 42% | Proof: 84</html>",
					"P 2500.00",
					molassesVodka
					));
			
		}
		
	}

	public static class brandy{
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Distilled/brandy/";
		
		public brandy() {
			
			ImageIcon cognac = new ImageIcon(imageLoc + "cognac.png");
			ImageIcon appleJack = new ImageIcon(imageLoc + "appleJack.png");
			ImageIcon armagnak = new ImageIcon(imageLoc + "armagnak.png");
			ImageIcon pisco = new ImageIcon(imageLoc + "pisco.png");
			ImageIcon grappa = new ImageIcon(imageLoc + "grappa.png");
			ImageIcon kirschwasser = new ImageIcon(imageLoc + "kirschwasser.png");
			ImageIcon brandy = new ImageIcon(imageLoc + "brandy.png");
			ImageIcon calvados = new ImageIcon(imageLoc + "calvados.png");
			
			items.addLast(new lib.item(
					"Hennessy VS Cognac 700ml",
					"<html>Hennessy V.S Cognac (V.S stands for “very special”) is a blend of 40 different eaux-de-vie selected for their vivacity, for an intense and fruity character with pleasantly oaky notes. Initial aromas of fresh toast and roasted almonds, followed by brown sugar and vine fruit aromas. The palate displays rich and creamy vanilla with a fresh floral finish.<br>Colour:  Clear and bright, with a beautiful amber hue.<br>Base Ingredient: Trebbiano/Ugni Blanc<br>Origin: Cognac, France<br>ABV: 40% | Proof: 80</html>",
					"P 2240.00",
					cognac
					));
			
			items.addLast(new lib.item(
					"Laird’s Blended Applejack 750ml",
					"<html>Today, best described as an apple whiskey, Laird’s Applejack is a pure spirit beverage made from a blend of apple brandy(35%) and neutral grain spirits(65%). The aged apple brandy base gives Laird’s Applejack a rich, deep flavor and smooth balance, while retaining the delicate aroma and flavor of tree-ripened apples from which it is made.<br>Color: Clear, golden amber<br>Base Ingredient: Apple<br>Origin: USA<br>ABV: 40% | Proof: 80</html>",
					"P 2710.00",
					appleJack
					));
			
			items.addLast(new lib.item(
					"Delord X.O Bas Armagnac French Brandy 700ml",
					"<html>This exceptional Hors d’Age displays a masterful balance of ripe fruit, wood and buttery orange pound cake. Smooth and deep with a wealth of rancio. This Bas Armagnac presents a rich bouquet of dried fruits, toffee, and spice. The palate is smooth and full-bodied with a long, warming finish.<br>Color: Amber<br>Base Ingredient: Ugni Blanc, Baco, Folle Blanche<br>Origin: Bas Armagnac, Gascony, France<br>ABV: 40% | Proof: 80</html>",
					"P 3500.00",
					armagnak
					));
			
			items.addLast(new lib.item(
					"Barsol Pisco Quebranta 700ml",
					"<html>Barsol Quebranta Pisco is a premium artisanal spirit from Peru’s Ica Valley, made exclusively from the robust Quebranta grape. The nose offers pear, red apples, fresh cut grass, dry fruit, pastry, fresh cream, cacao, and delicate citrus, while the taste reveals ripe pear, red apples, red grape, citrus, roasted almond, walnuts, pecan, dark chocolate, cereal, dried apricot, and ripe dark berries, leading to a round, elegant, and long finish.<br>Color: Clear, colorless<br>Base Ingredient: Quebranta grape<br>Origin: Peru<br>ABV: 41.3% | Proof: 82.6</html>",
					"P 1600.00",
					pisco
					));
			
			items.addLast(new lib.item(
					"Rondo Aperitivo Grappa di Moscato 700ml",
					"<html>Grappa di Moscato is a refined and potent expression of the traditional Muscat grape-based grappa, intensifying the sensory experience. The nose is enhanced with pronounced aromas of fresh Muscat grapes, white flowers, orange blossoms, and ripe peaches. On the palate, it offers bold, lush flavors of ripe apricots, lychee, and citrus zest, highlighting the sweet and floral character of Muscat grapes. The finish is extended and memorable, with lingering fruity notes that leave a lasting impression of the grape’s aromatic charm.<br>Color: Clear, colorless<br>Base Ingredient: Muscat grape<br>Origin: Italy<br>ABV: 43% | Proof: 86</html>",
					"P 3490.00",
					grappa
					));
			
			items.addLast(new lib.item(
					"<html>Kammer Kirschwasser Black Forest Cherry Brandy 750 ml</html>",
					"<html>Kammer Kirschwasser is a refined clear brandy made from 20 pounds of hand-selected, fully ripened Black Forest cherries per bottle, known for its distinct, aromatic cherry flavor. The spirit’s complex profile combines tart cherry notes with subtle hints of spice, leading to a slightly dry finish with undertones of sweet cherry pulp and dried cherry skin. Genuine Kirsch, it is exclusively distilled from cherries native to Germany's Black Forest, ensuring an authentic and exceptional flavor experience.<br>Color: Clear, colorless<br>Base Ingredient: Black Forest cherries<br>Origin: Germany<br>ABV: 45% | Proof: 90</html>",
					"P 2580.00",
					kirschwasser
					));
			
			items.addLast(new lib.item(
					"<html>Fundador Solera Reserva Pedro Domecq Brandy de Jerez 700ml</html>",
					"<html>Fundador Solera Reserva Brandy, introduced in 1874 as Brandy de Jerez, is considered the first brandy in the world and remains one of Spain’s most popular traditional spirits. It boasts a soft, warm aroma with fresh, fruity notes of caramel and subtle hints of nutmeg. On the palate, it offers a balanced, smooth profile with flavors of oak, caramel, and vanilla. The brandy finishes long-lasting, leaving a memorable and refined impression.<br>Color: Light Amber<br>Base Ingredient: Airen and Palomino grapes | Sherry Wine<br>Origin: Spain<br>ABV: 36% | Proof: 72</html>",
					"P 580.00",
					brandy
					));
			
			items.addLast(new lib.item(
					"Père Magloire Fine V.S. Calvados 700ml",
					"<html>Handpicked apples from Normandy’s orchards are carefully fermented and double-distilled in copper pot stills. The spirit matures in French oak barrels, developing depth and refinement under expert supervision. This brandy offers a captivating bouquet of fresh apples, floral notes, and subtle oak. On the palate, it blends fruity sweetness with crisp apple, vanilla, and spice. Its distinct fruity flavor is pleasing to all palates, with a smooth, satisfying finish.<br>Color: Delicate, light amber yellow.<br>Base Ingredient: Apples<br>Origin: Normandy, France<br>ABV: 40% | Proof: 80</html>",
					"P 1590.00",
					calvados
					));
			
		}
		
	}

	public static class gin{
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Distilled/gin/";
		
		public gin() {
			
			ImageIcon londonDry = new ImageIcon(imageLoc + "londonDry.png");
			ImageIcon plyMouth = new ImageIcon(imageLoc + "plyMouth.png");
			ImageIcon oldTom = new ImageIcon(imageLoc + "oldTom.png");

			ImageIcon navyStrength = new ImageIcon(imageLoc + "navyStrength.png");
			ImageIcon genever = new ImageIcon(imageLoc + "genever.png");
			ImageIcon pink = new ImageIcon(imageLoc + "pink.png");
			
			items.addLast(new lib.item(
					"Beefeater London Dry Gin 700ml",
					"<html>The aroma of Beefeater Gin is traditional and London Dry, with a pine-forward juniper scent and a subtle hint of citrus zest. In terms of flavor, there are lemon citrus notes initially, followed by a build-up of juniper, which dominates the middle of the palate. As the gin develops, richer and earthier nuances emerge, with coriander, licorice, and a touch of bitter citrus rind. The finish is medium-length, with lingering notes of lemon zest, juniper, a hint of pine, and freshly ground coriander. A little warmth remains on the palate as it dissipates.<br>Origin: England<br>ABV: 40% | Proof: 80</html>",
					"P 699.00",
					londonDry
					));
			
			items.addLast(new lib.item(
					"Plymouth English Gin 700ml",
					"<html>Experience wonderfully fresh juniper and lemony bite with deeper earthy notes. It has a slight sweetness with extraordinary concentration and complexity, where no single botanical dominates the overall flavor.  It is crystal clear in color, with a rich, fresh aroma of juniper complemented by notes of coriander and cardamom, delivering an extremely smooth, creamy, and full-bodied taste with a slight sweetness.<br>Origin: USA<br>ABV: 41.2% | Proof: 82.4</html>",
					"P 1690.00",
					plyMouth
					));
			
			items.addLast(new lib.item(
					"Langley's Old Tom Gin 700ml",
					"<html>Langley’s Old Tom Gin, based on an 1891 recipe, brings the refined, mildly sweeter style of Victorian London into a modern setting. With a nose of juniper and creamy orange essence, complemented by juicy tangerine notes, the palate delivers a slow kick of juniper, fennel, nutmeg, lemon peel, and coriander, which develops into a smooth, soft, sweetened finish that lingers. More botanically intense and sweeter than a London Dry, it offers a taste that holds the secrets of a bygone era.<br>Origin: England<br>ABV: 40% | Proof: 80</html>",
					"P 1250.00",
					oldTom
					));
			
			
			items.addLast(new lib.item(
					"ARC Navy Strength Gin 700ml",
					"<html>Full Circle’s ARC Botanical Gin, with its higher seaworthy strength, delivers a strong botanical punch, making it a favorite among bartenders for complex craft cocktails. The nose features fresh highlights of pomelo, calamansi, coriander, juniper, pine, and a touch of mango. On the palate, it unveils fresh pomelo, dalandan, calamansi, pine, juniper spice, and notes of lemongrass and black pepper. The finish is clean and balanced, with cooling notes of lemon balm and cardamom.<br>Origin: Philippines<br>ABV: 58% | Proof: 116</html>",
					"P 3040.00",
					navyStrength
					));
			
			items.addLast(new lib.item(
					"<html>Ginebra San Miguel Dry Gin 700ml</html>",
					"<html>Ginebra San Miguel Dry Gin showcases the art of distillation with a harmonious blend of juniper berries, citrus peels, and a secret mix of herbs and spices. Its invigorating aroma of juniper and zesty citrus sets the stage for a crisp, complex taste. On the palate, juniper takes center stage, supported by hints of coriander and aromatic spices, delivering a smooth, balanced gin that's both classic and contemporary.<br>Origin: Philippines ABV: 40% | Proof: 80</html>",
					"P 121.00",
					genever
					));
			
			items.addLast(new lib.item(
					"Beefeater Pink Gin 700ml",
					"<html>Beefeater Pink Strawberry is our vibrant strawberry gin. It’s made using the same recipe as the original Beefeater London Dry (The World’s Most Awarded Gin), with an infusion of natural strawberry flavouring to give it a fruity, strawberry twist. The soft fruit flavours of strawberry tune perfectly with the classic notes of juniper and citrus to produce a finely balanced contemporary London gin with a hit of sweet strawberry.<br>Origin: England<br>ABV: 37.5% | Proof: 75</html>",
					"P 775.00",
					pink
					));
			
		}
		
	}
	
	public static class tequila{
		
		public static LinkedList<lib.item> items = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/Alcohol/Distilled/tequila/";
		
		public tequila() {
			
			ImageIcon blanco = new ImageIcon(imageLoc + "blanco.png");
			ImageIcon reposado = new ImageIcon(imageLoc + "reposado.png");
			ImageIcon anejo = new ImageIcon(imageLoc + "anejo.png");
			
			ImageIcon extraAnejo = new ImageIcon(imageLoc + "extraAnejo.png");
			ImageIcon joven = new ImageIcon(imageLoc + "joven.png");
			ImageIcon cristalino = new ImageIcon(imageLoc + "cristalino.png");
		
			items.addLast(new lib.item(
					"Don Julio Blanco 750ml",
					"<html>Using the finest blue agave plant and a time honored distillation process, Don Julio® Blanco Tequila is tequila in its truest form. Its crisp agave flavor and hints of citrus make it an essential component to a variety of innovative drinks including margaritas. It can also be enjoyed neat or on the rocks.<br>TASTING NOTES<br>NOSE: Crisp agave aromas blended with hints of citrus notes - lemon, lime and grapefruit.<br>TASTE: Light, sweet, agave flavor.<br>FINISH: Light, sweet, agave flavor.<br>ABV: 40% | Proof: 80 / Origin: Mexico</html>",
					"P 4500.00",
					blanco
					));
			
			items.addLast(new lib.item(
					"Don Julio Reposado 700ml",
					"<html>Aged for eight months in American white-oak barrels, Don Julio® Reposado Tequila is golden amber in color, and offers a rich, smooth finish—the very essence of the perfect barrel-aged tequila. With a mellow, elegant flavor and inviting aroma.<br>TASTING NOTES<br>NOSE: An inviting aroma of mellow lemon citrus notes and spice layers with touches of ripe stone fruit.﻿<br>TASTE: Incredibly soft and elegant hints of dark chocolate, vanilla and light cinnamon.<br>FINISH: Silky, warm finish with an essence of dried fruit, nuts and a touch of caramel apple.<br>ABV: 40%  | Proof: 80 / Origin: Mexico</html>",
					"P 5000.00",
					reposado
					));
			
			items.addLast(new lib.item(
					"Don Julio Anejo 750ml",
					"<html>Barrel aged in smaller batches for eighteen months in American white-oak barrels. Rich, distinctive and wonderfully complex, its flavor strikes the perfect balance between agave, wood and hints of vanilla. <br>TASTING NOTES<br>NOSE: A fresh blend of lime, grapefruit and mandarin citrus aromas with a rich touch of caramel.<br>TASTE: Full-bodied and complex with expressions of cooked agave, wild honey and oak-infused butterscotch.﻿<br>FINISH: Bright and lightly spiced finish with the essence of wild honey.<br>ABV: 40%  | Proof: 80 / Origin: Mexico</html>",
					"P 5700.00",
					anejo
					));
			
			
			items.addLast(new lib.item(
					"Casa Noble - Single Barrel Extra Añejo 700ml",
					"<html>Reserved for the aficionado who appreciates the finest tequila making in the world. An extremely rare Extra Añejo Tequila that results from unprecedented extra barrel aging inside a lightly charred French white oak barrel. Delivering a smooth, complex flavor unlike any crafted before, or after. Have a copper gold color.<br>NOSE: Chocolate, spice, cinnamon.<br>TASTE: Full body with notes of oak, caramel, and agave<br>FINISH: Long, smooth with hints of smoke.<br>ABV: 40% | Proof: 80 / Origin: Jalisco, Mexico</html>",
					"P 5800.00",
					extraAnejo
					));
			
			items.addLast(new lib.item(
					"Casa Noble Joven 750ml",
					"<html>This single-barrel tequila is a unique spirit that spends 6 months in French oak casks before being bottled at 102 proof. The higher proof packs a punch, yet the agave takes the center stage, balanced with citrus, honey sweetness, and chili pepper heat.<br>TASTING NOTES<br>NOSE: Earthy, sweet floral, tropical fruit notes<br>TASTE: honey sweetness, and chili pepper heat.<br>FINISH: Vanilla and smooth finish.<br>ABV: 51%  | Proof: 102/ Origin: Mexico</html>",
					"P 4280.00",
					joven
					));
			
			items.addLast(new lib.item(
					"<html>Casa Noble Ultra Premium Tequila Crystal 700ml</html>",
					"<html>Casa Noble Ultra Premium Tequila Crystal is a high-end tequila made from 100% blue Weber agave grown in the Jalisco region of Mexico. This 75cl bottle is a limited release, made using a unique and time-consuming process that results in a smooth and refined tequila with a complex flavor profile. Aroma: Cooked agave, vanilla, caramel, and a hint of oak.<br>Taste: Smooth and refined with prominent notes of cooked agave and vanilla, complemented by hints of caramel and oak.<br>Finish: Long and warming, with a subtle sweetness.<br>ABV: 40%  | Proof: 80/ Origin: Jalisco, Mexico</html>",
					"P 3049.00",
					cristalino
					));
		}
		
		
		
	}
	
}





