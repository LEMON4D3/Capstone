package nonAlcohol;

import java.util.LinkedList;

import javax.swing.ImageIcon;

import lib.lib;

public class nData {
	
	public nData() {
		
		new juice();
		new tea();
		new smoothie();
		new milk();
		new milkShake();
		new coffee();
		new mockTail();
		
	}
	
	public static class juice {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/juice/";
		
		public juice() {
			
			ImageIcon orange = new ImageIcon(imageLoc + "orange.png");
			ImageIcon mango = new ImageIcon(imageLoc + "mango.png");
			ImageIcon coconut = new ImageIcon(imageLoc + "coconut.png");
			ImageIcon apple = new ImageIcon(imageLoc + "apple.png");
			ImageIcon grape = new ImageIcon(imageLoc + "grape.png");
			ImageIcon pineapple = new ImageIcon(imageLoc + "pineapple.png");
			ImageIcon watermelon = new ImageIcon(imageLoc + "watermelon.png");
			ImageIcon melon = new ImageIcon(imageLoc + "melon.png");
			
			item.add(new lib.item(
					"Orange Juice 12 oz.",
					"<html>Made from the juiciest, sun-ripened oranges, Orange Juice brings you the pure, fresh taste of the fruit, with no artificial flavors or preservatives. It’s the perfect refreshing beverage to keep you feeling energized and refreshed in any time of the day.<br><b>Sugar Content:</b> 25g<br></html>",
					"P 25.20",
					orange
					));
			
			item.add(new lib.item(
					"Mango Juice 500ml",
					"<html>With its rich, smooth texture and refreshing taste, this juice is the perfect way to indulge in the exotic sweetness of one of the world’s most beloved fruits. Bursting with vitamins and antioxidants, Mango Juice offers a refreshing, nutritious boost that keeps you feeling energized throughout the day.<br><b>Sugar Content:</b> 20g</html>",
					"P 29.20",
					mango
					));
			
			item.add(new lib.item(
					"Coconut Juice 500ml",
					"<html>Made from the pure, natural goodness of young coconuts, this juice offers a subtly sweet, light flavor with a hint of creamy coconut essence. Packed with electrolytes, vitamins, and minerals, Coconut Juice is not only delicious but also hydrating, making it the perfect drink to keep you refreshed and energized throughout the day.<br><b>Sugar Content:</b> 24g</html>",
					"P 25.20",
					coconut
					));
			
			item.add(new lib.item(
					"Apple Juice 500ml",
					"<html>With its light, smooth flavor and subtle tartness, this juice is a perfect balance of sweet and tangy in every sip. Packed with vitamins and antioxidants, Apple Juice is not only delicious but also nourishing, making it an ideal choice for a healthy refreshment any time of day.<br><b>Sugar Content:</b> 24g</html>",
					"P 30.40",
					apple
					));
			
			item.add(new lib.item(
					"Grape Juice 500ml",
					"<html>Made from the finest, juiciest grapes, this juice is free from artificial flavors and preservatives, delivering an authentic, fresh taste every time.  The perfect balance of sweetness and tartness, Grape Juice is a revitalizing drink that’s both nourishing and incredibly satisfying.<br><b>Sugar Content:</b> 24g</html>",
					"P 26.20",
					grape
					));
			
			item.add(new lib.item(
					"Pineapple Juice 500ml",
					"<html>Whether you're sipping it on a warm afternoon, pairing it with breakfast, or using it as a base for tropical cocktails, Pineapple Juice adds a sweet and zesty touch to any moment. With no artificial additives or preservatives, you can enjoy the pure, fresh taste of pineapples in every glass.<br><b>Sugar Content:</b> 23g</html>",
					"P 25.20",
					pineapple
					));
			
			item.add(new lib.item(
					"<html>Watermelon Juice 500ml</html>",
					"<html>Made from the juiciest, most flavorful watermelons, this juice delivers pure, fresh taste with no added preservatives or artificial flavors. Whether you’re enjoying it after a workout, as a mid-day pick-me-up, or just craving something cool and sweet, Watermelon Juice is the perfect thirst-quenching beverage.<br><b>Sugar Content:</b> 20g</html>",
					"P 34.20",
					watermelon
					));
			
			item.add(new lib.item(
					"Melon Juice 500ml",
					"<html>With its light, smooth texture and natural sweetness, this juice is the perfect way to enjoy the vibrant, summery taste of melon all year round. Packed with hydration and nutrients, Melon Juice is both refreshing and nourishing, making it the ultimate choice for staying cool and energized.<br><b>Sugar Content:</b> 20g</html>",
					"P 32.40",
					melon
					));
		
		}
	}
	
	public static class tea {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/tea/";
		
		public tea() {
			
			ImageIcon hibiscus = new ImageIcon(imageLoc + "hibiscus.png");
			ImageIcon peppermint = new ImageIcon(imageLoc + "peppermint.png");
			ImageIcon green = new ImageIcon(imageLoc + "green.png");
			ImageIcon ginger = new ImageIcon(imageLoc + "ginger.png");
			ImageIcon white = new ImageIcon(imageLoc + "white.png");
			
			item.add(new lib.item(
					"Pure Leaf Blackberry Tea 547ml",
					"<html>Dive into the luscious taste of our blackberry tea, expertly crafted to capture the deep, sweet flavor of ripe blackberries in every cup. This delightful blend combines the robust essence of blackberries with the smoothness of premium tea leaves, creating a refreshing beverage perfect for any occasion.</html>",
					"P 65.20",
					hibiscus
					));
			
			item.add(new lib.item(
					"Pure Leaf Sweet Tea 547ml",
					"<html>Perfect for every occasion, it's your go-to choice for a sweet escape from the ordinary. It offers a perfect harmony of rich, full-bodied tea leaves sweetened just right, creating a delightful, invigorating, and comforting beverage. It doesn't matter whether it's enjoyed ice-cold on a sunny day or leisurely sipped for a moment of relaxation, our sweet tea delivers a taste of tradition and warmth in every sip.</html>",
					"P 65.50",
					peppermint
					));
			
			item.add(new lib.item(
					"Pure Leaf Honey Green Tea  547ml",
					"<html>Each sip is a soothing journey of harmony—invigorating yet calming, light yet full of flavor. Unwind and refresh where the smooth, delicate taste of premium green tea meets the natural sweetness of pure honey.</html>",
					"P 65.50",
					green
					));
			
			item.add(new lib.item(
					"Pure Leaf Lemon Tea 547ml",
					"<html>Infused with vibrant lemon zest, this crisp and aromatic brew is the ultimate way to brighten your day. Rich in vitamin C, it's as good for your body as it is for your taste buds—promoting wellness with every sip. Let it be the vibrant spark that energizes your day.</html>",
					"P 69.50",
					ginger
					));
			
			item.add(new lib.item(
					"Pure Leaf Raspberry Tea 547ml",
					"<html>Whether you enjoy it hot to warm your soul, or iced for a crisp, refreshing treat, our raspberry tea promises a delightful and rejuvenating experience. Rich in antioxidants and naturally caffeine-free, it's a healthy and flavorful choice for tea enthusiasts.</html>",
					"P 60.38 ",
					white
					));
		}
	}
	
	public static class smoothie {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/smoothie/";
		
		public smoothie() {
			
			ImageIcon banana = new ImageIcon(imageLoc + "banana.png");
			ImageIcon peanut = new ImageIcon(imageLoc + "peanut.png");
			ImageIcon cherry = new ImageIcon(imageLoc + "cherry.png");
			
			ImageIcon avocado = new ImageIcon(imageLoc + "avocado.png");
			ImageIcon bananaOat = new ImageIcon(imageLoc + "bananaOat.png");
			ImageIcon orange = new ImageIcon(imageLoc + "orange.png");
			
			item.add(new lib.item(
					"Banana Blue Smoothie 250ml",
					"<html>Full of antioxidants, vitamins, and fiber, this smoothie not only tastes amazing but also supports a healthy, active lifestyle. The combination of the tropical banana and antioxidant-rich blueberries provides a burst of energy, making it an ideal choice for fueling your day or satisfying your cravings.<br>Fat Content: 1-3g | Sugar Content: 25g</html>",
					"P 32.00",
					banana
					));
			
			item.add(new lib.item(
					"Peanut Butter Berry 250ml ",
					"<html>Packed with protein, fiber, and essential nutrients, the Peanut Butter Berry Smoothie is the perfect balance of indulgence and nourishment. Whether you're fueling up after a workout, enjoying it as a mid-day snack, or treating yourself to something sweet, this smoothie will keep you satisfied and energized.<br>Fat Content: 10-16g| Sugar Content: 20g</html>",
					"P 32.00",
					peanut
					));
			
			item.add(new lib.item(
					"Cherry Almond 350ml",
					"<html>This smooth and creamy beverage offers the perfect balance of fruity brightness and warm, nutty depth, creating a truly satisfying drink that’s as delicious as it is nutritious. With every sip, you'll experience the natural sweetness of cherries paired with the wholesome goodness of almonds, delivering a smooth, velvety texture that's hard to resist.<br>Fat Content: 5-12g| Sugar Content: 27g</html>",
					"P 58.00",
					cherry
					));
			
			item.add(new lib.item(
					"Avocado Banana 500ml",
					"<html>This smoothie delivers a perfectly balanced, smooth experience with a light, refreshing taste that’s as nourishing as it is delicious. The creamy avocado adds a rich, indulgent feel, while the banana brings a natural sweetness that perfectly complements the avocado’s mild flavor.<br>Fat Content: 10-15g | Sugar Content: 18g</html>",
					"P 50.00",
					avocado
					));
			
			item.add(new lib.item(
					"Banana Oat 250ml",
					"<html>Banana Oat Smoothie is the perfect blend of creamy, naturally sweet bananas and wholesome, hearty oats, creating a deliciously satisfying drink that’s both nutritious and filling. This smoothie offers a smooth, velvety texture with a subtle sweetness from ripe bananas, complemented by the rich, earthy flavor of oats. It’s the ideal choice for anyone looking for a wholesome, energizing boost to kickstart their day or fuel an active lifestyle.<br>Fat Content: 2-5g| Sugar Content: 25g</html>",
					"P 32.00",
					bananaOat
					));
			
			item.add(new lib.item(
					"Orange Vanilla 500ml",
					"<html>Orange Vanilla Smoothie is a refreshing and indulgent blend that combines the bright, zesty flavor of fresh oranges with the creamy sweetness of vanilla. Whether you’re looking for a revitalizing snack, a breakfast boost, or a sweet treat, this smoothie offers a delightful combination of flavor and nourishment.<br>Fat Content: 1-4g| Sugar Content: 30g</html>",
					"P 40.00",
					orange
					));
		}
	}
	
	public static class milk {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/milk/";
		
		public milk() {
			
			ImageIcon almond = new ImageIcon(imageLoc + "almond.png");
			ImageIcon hazelnut = new ImageIcon(imageLoc + "hazelnut.png");
			ImageIcon soy = new ImageIcon(imageLoc + "soy.png");
			
			item.add(new lib.item(
					"Innocent Almond Milk 750ml",
					"<html>Perfect for every pour, our almond milk is a nutritious and delicious alternative to dairy, providing a natural source of essential vitamins and minerals. Whether you're blending it into your morning smoothie, pouring it over cereal, or enjoying a glass on its own, our almond milk promises a delightful, creamy experience without the guilt.<br><b>Fat Content:</b> 3.4g</html>",
					"P 222.18",
					almond
					));
			
			item.add(new lib.item(
					"Innocent Hazelnut Milk 750ml",
					"<html>This luxurious beverage offers a deliciously creamy texture and a uniquely nutty flavor that will elevate your taste experience. Perfect for adding a touch of decadence to your morning coffee, blending into smoothies, or enjoying on its own, our hazelnut drink is a delightful treat for your palate.<br><b>Fat Content:</b> 3.9g</html>",
					"P 239.16",
					hazelnut
					));
			
			item.add(new lib.item(
					"Innocent Coconut Milk 750ml",
					"<html>Packed with natural electrolytes and essential nutrients, our coconut drink is the perfect hydrating companion for your active lifestyle. This luscious beverage delivers a creamy, tropical flavor that transports you to a serene island paradise with every sip.<br><b>Sugar Content:</b> 4.0g</html>",
					"P 267.95",
					soy
					));
			
		}
	}
	
	public static class milkShake {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/milkShake/";
		
		public milkShake() {
			
			ImageIcon cool = new ImageIcon(imageLoc + "cool.png");
			ImageIcon coconut = new ImageIcon(imageLoc + "coconut.png");
			ImageIcon blueBerry = new ImageIcon(imageLoc + "blueBerry.png");
			ImageIcon vanilla = new ImageIcon(imageLoc + "vanilla.png");
			ImageIcon tripleNut = new ImageIcon(imageLoc + "tripleNut.png");
			
			
			item.add(new lib.item(
					"Cool Mint Milkshake 500ml",
					"<html>Cool Mint Milkshake is the perfect blend of creamy indulgence and refreshing minty freshness. Made with premium ice cream and a hint of cool mint, this milkshake delivers a smooth, velvety texture with an invigorating burst of mint that will leave your taste buds feeling refreshed and satisfied. It’s the ultimate treat for anyone who loves a crisp, cool twist on a classic milkshake.<br>Ice Cream Base: Vanilla Ice Cream | Topping: Chocolate<br></html>",
					"P 67.50",
					cool
					));
			
			item.add(new lib.item(
					"Coconut Milkshake 500ml",
					"<html>Coconut Milkshake is a tropical escape in every sip! This creamy, indulgent treat blends the rich, smooth flavor of coconut with velvety ice cream, creating a sweet, refreshing drink that transports you straight to paradise. With each sip, you’ll experience the perfect balance of coconut’s natural sweetness and the creamy texture that makes this milkshake utterly irresistible.<br>Ice Cream Base: Vanilla Ice Cream | Topping: Coconut Meat</html>",
					"P 50.50",
					coconut
					));
			
			item.add(new lib.item(
					"Blueberry Cheesecake Milkshake 500ml",
					"<html>Blueberry Cheesecake Milkshake is a decadent dessert in a glass, combining the rich, creamy texture of cheesecake with the sweet, tangy burst of fresh blueberries. This indulgent milkshake brings together the best of both worlds—smooth, velvety vanilla ice cream and the deliciously fruity flavor of ripe blueberries, all blended with a hint of graham cracker crust for that authentic cheesecake experience.<br>Ice Cream Base: Vanilla Ice Cream | Topping: Blueberry</html>",
					"P 67.50",
					blueBerry
					));
			
			item.add(new lib.item(
					"Vanilla Special Milkshake 500ml",
					"<html>Vanilla Special Milkshake is the ultimate classic indulgence, made with rich, velvety vanilla ice cream and a touch of extra sweetness to elevate the timeless flavor. This milkshake brings the comforting taste of pure vanilla to life, offering a creamy, smooth texture with every sip. Perfectly balanced, it’s a simple yet luxurious treat that’s guaranteed to satisfy your sweet tooth.<br>Ice Cream Base: Vanilla Ice Cream | Topping: Cherry, Sprinkles </html>",
					"P 60.50",
					vanilla
					));
			
			item.add(new lib.item(
					"Triple Nut Caramel Milkshake 500ml",
					"<html>Triple Nut Caramel Milkshake is an irresistible indulgence that brings together the perfect combination of rich caramel, creamy vanilla ice cream, and three premium nuts—crunchy almonds, roasted hazelnuts, and smooth pecans. Every sip delivers a delightful mix of sweet, nutty, and buttery flavors, creating a decadent treat that’s both creamy and satisfying.<br>Ice Cream Base: Vanilla Ice Cream | Topping: Almond Nut, Soy Nut, Hazelnut, Caramel Glaze<br></html>",
					"P 60.50",
					tripleNut
					));
			
		}
	}
	
	public static class coffee {
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/coffee/";
		
		public coffee() {
			
			ImageIcon espresso = new ImageIcon(imageLoc + "espresso.png");
			ImageIcon caffe = new ImageIcon(imageLoc + "caffe.png");
			ImageIcon latte = new ImageIcon(imageLoc + "latte.png");
			ImageIcon frappucino = new ImageIcon(imageLoc + "frappucino.png");
			ImageIcon americano = new ImageIcon(imageLoc + "americano.png");
			ImageIcon cappucino = new ImageIcon(imageLoc + "cappucino.png");
			
			
			item.add(new lib.item(
					"Espresso Coffee 7oz.",
					"<html>Whether you enjoy it on its own or use it as the base for your favorite lattes, cappuccinos, or mochas, Espresso offers a deep, robust taste that coffee lovers crave.<br>| Caffeine: 15mg/oz <br>| Bean: Espresso <br>| Temp:  ~160°F (71°C)</html>",
					"P 65.50",
					espresso
					));
			
			item.add(new lib.item(
					"Caffé Mocha 9 oz.",
					"<html>Caffè Mocha combines rich coffee, a creamy texture, and a sweet chocolate finish, making a perfect indulgence for unwinding, meeting friends, or just treating yourself.<br>| Caffeine: 14mg/oz <br>| Bean: Espresso<br>| Temp:  ~160°F (71°C)</html>",
					"P 67.89",
					caffe
					));
			
			item.add(new lib.item(
					"Latte Coffee 9 oz.",
					"<html>Latte offers a creamy texture and mild coffee taste, making it the perfect soothing yet energizing choice for any time of day.<br>| Caffeine: 63mg/oz <br>| Bean: Espresso<br>| Temp:  ~160°F (71°C)</html>",
					"P 68.90",
					latte
					));
			
			item.add(new lib.item(
					"Frappuccino Coffee 13 oz.",
					"<html>Frappuccino is a creamy, iced coffee blend of espresso, milk, and ice, topped with whipped cream and sometimes caramel or chocolate for a sweet, refreshing treat.<br>| Caffeine: 12mg/oz <br>| Bean: Espresso <br>| Temp:  ~160°F (71°C)</html>",
					"P 78.87",
					frappucino
					));
			
			item.add(new lib.item(
					"Americano Coffee 8 oz.",
					"<html>An Americano is made by diluting espresso with hot water, offering a smooth, full-bodied flavor that's less intense than straight espresso, perfect for coffee purists who enjoy a robust, subtle drink.<br>| Caffeine: 12mg/oz <br>| Bean: Espresso <br>| Temp:  ~160°F (71°C)</html>",
					"P 62.76",
					americano
					));
			
			item.add(new lib.item(
					"Cappuccino Coffee 8 oz.",
					"<html>A cappuccino features a bold espresso base, creamy texture, and a light airy foam on the top, offering a perfectly balanced taste for those who enjoy strong coffee with a smooth finish.<br>| Caffeine: 8mg/oz <br>| Bean: Espresso <br>| Temp:  ~160°F (71°C)</html>",
					"P 65.90",
					cappucino
					));
			
		}
	}
	
	public static class mockTail{
		
		public static LinkedList<lib.item> item = new LinkedList<lib.item>();
		
		String imageLoc = "src/rsc/nonAlcohol/mockTail/";
		
		public mockTail() {
			
			ImageIcon tamarind = new ImageIcon(imageLoc + "tamarind.png");
			ImageIcon sparklingTropical = new ImageIcon(imageLoc + "sparklingTropical.png");
			ImageIcon strawberryDaiquiri = new ImageIcon(imageLoc + "strawberryDaiquiri.png");
			ImageIcon pinaColada = new ImageIcon(imageLoc + "pinaColada.png");
			ImageIcon tcShirley = new ImageIcon(imageLoc + "tcShirley.png");
			ImageIcon chocolateMartini = new ImageIcon(imageLoc + "chocolateMartini.png");
			ImageIcon mojito = new ImageIcon(imageLoc + "mojito.png");
			ImageIcon tartCherry = new ImageIcon(imageLoc + "tartCherry.png");
			ImageIcon virginMary = new ImageIcon(imageLoc + "virginMary.png");
			
			item.addLast(new lib.item(
					"Tamarind Pineapple Quencher Mocktails",
					"A refreshing burst of fizzy sweetness, with bold caramel notes, a touch of citrus, and an invigorating crispness in every sip. It's the classic taste that lifts your spirits and satisfies like no other.",
					"P 25.20",
					tamarind
					));
			
			item.addLast(new lib.item(
					"Sparkling Tropical Mocktails",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 26.20",
					sparklingTropical
					));
			
			item.addLast(new lib.item(
					"Strawberry Daiquiri Mocktails",
					"The OG, the flavor that started it all—classic, cool, crisp lemon-lime taste that’s caffeine free with 100% natural flavors.",
					"P 25.20",
					strawberryDaiquiri
					));
			
			item.addLast(new lib.item(
					"Chocolate Martini Mocktails",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 34.20",
					chocolateMartini
					));
			
			item.addLast(new lib.item(
					"Pina Colada Mocktails",
					"Mountain Dew delivers a bold, citrusy punch with sharp lemon-lime flavors and a smooth hint of tropical sweetness. Its lively fizz adds an extra burst of refreshment, making it an energizing and vibrant drink.",
					"P 32.40",
					pinaColada
					));
			
			item.addLast(new lib.item(
					"Tart Cherry Shirley Temple Mocktails",
					"A refreshing burst of fizzy sweetness, with bold caramel notes, a touch of citrus, and an invigorating crispness in every sip. It's the classic taste that lifts your spirits and satisfies like no other.",
					"P 34.20",
					tcShirley
					));
	
			item.addLast(new lib.item(
					"Mojito Mocktail",
					"A refreshing burst of fizzy sweetness, with bold caramel notes, a touch of citrus, and an invigorating crispness in every sip. It's the classic taste that lifts your spirits and satisfies like no other.",
					"P 34.20",
					mojito
					));
			
			item.addLast(new lib.item(
					"Tart Cherry-Hibiscus Mocktails",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 34.20",
					tartCherry
					));
			
			item.addLast(new lib.item(
					"Virgin Mary's Mocktails",
					"Royal is your playful fruity indulgence in a bottle with its true taste of fun that leaves you feeling lively.",
					"P 34.20",
					virginMary
					));
		}
		
	}

	
}
