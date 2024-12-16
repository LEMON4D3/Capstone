package mainPage;

import javax.swing.*;
import javax.xml.stream.events.Namespace;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import lib.*;
import user.user;

public class createReceipt extends JLayeredPane{

	String imageLoc = "src/rsc/main/cash/";
	
	double totalPrice = 0, vatPrice, discountPrice, userCash, grandPrice = 0;
	
	boolean isPWD = false;
	
	class background extends JLayeredPane {
		
		class container extends JPanel{
			
			container() {
				
				this.setBounds(22, 192, 674, 864);
				
			}
			
			public void paint(Graphics g) {
				
				g.setColor(new Color(38, 165, 174, 155));
				g.fillRoundRect(0, 0, 674, 764, 20, 20);
				
				g.setColor(Color.black);
				g.drawLine(0, 53, 674, 53);
				
				g.drawLine(0, 337, 674, 337);
			}
			
		}
		
		background() {
			
			this.setBounds(0, 0, 720, 980);
			
			JLabel background = new JLabel();
			background.setIcon(new ImageIcon(imageLoc + "background.png"));
			background.setBounds(0, 0, 720, 1080);
			
			JLabel icon = new JLabel();
			icon.setIcon(new ImageIcon(imageLoc + "icon.png"));
			icon.setBounds(607, 5, 100, 100);
			
			this.add(background, Integer.valueOf(0));
			this.add(icon, Integer.valueOf(1));
			
			this.add(new container(), Integer.valueOf(1));
			
		}
		
	}
	
	public createReceipt() {
		
		this.setPreferredSize(new Dimension(720, 980));
		
		JLayeredPane pane = this;
		
		Color color = Color.decode("#244E6C");
		
		JLabel orderFT = new JLabel("Order Form");
		orderFT.setBounds(22, 5, 365, 83);
		orderFT.setFont(tools.BoldFont(60));
		orderFT.setForeground(color);
		
		JLabel nameC = new JLabel("Customer Name: ");
		nameC.setBounds(28, 88, 200, 33);
		nameC.setFont(tools.BoldFont(16));
		nameC.setForeground(color);
		
		JTextField nameF = new JTextField();
		nameF.setBounds(160, 98, 241, 18);
		nameF.setOpaque(false);
		nameF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		nameF.setFont(tools.BoldFont(16));
		nameF.setForeground(color);
		
		JLabel date = new JLabel("Date: ");
		date.setBounds(28, 119, 164, 33);
		date.setFont(tools.BoldFont(16));
		date.setForeground(color);
		
		JTextField dateF = new JTextField();
		dateF.setBounds(80, 129, 150, 18);
		dateF.setOpaque(false);
		dateF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		dateF.setFont(tools.BoldFont(16));
		dateF.setForeground(color);
		
		
		JLabel orderN = new JLabel("Order No.:");
		orderN.setBounds(487, 88, 188, 33);
		orderN.setFont(tools.BoldFont(16));
		orderN.setForeground(color);
		
		JTextField orderF = new JTextField();
		orderF.setBounds(575, 98, 25, 18);
		orderF.setOpaque(false);
		orderF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		orderF.setFont(tools.BoldFont(16));
		orderF.setForeground(color);
		
		JLabel bevEra = new JLabel("BEVERA");
		bevEra.setBounds(283, 138, 155, 44);
		bevEra.setFont(tools.BoldFont(32));
		bevEra.setForeground(color);
		
		JLabel name = new JLabel("Item Name");
		name.setFont(tools.BoldFont(16));
		name.setBounds(46, 213, 128, 33);
		name.setForeground(Color.white);
		
		JLabel quantity = new JLabel ("Quantity");
		quantity.setFont(tools.BoldFont(16));
		quantity.setBounds(269, 213, 85, 33);
		quantity.setForeground(Color.white);
		
		JLabel price = new JLabel("Price");
		price.setFont(tools.BoldFont(16));
		price.setBounds(453, 213, 54, 33);
		price.setForeground(Color.white);
		
		JLabel amount = new JLabel("Amount");
		amount.setFont(tools.BoldFont(16));
		amount.setBounds(588, 213, 103, 33);
		amount.setForeground(Color.white);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setBounds(323, 540, 334, 203);
		container.setMaximumSize(new Dimension(334, 203));
		// -------------------------- For Item Container side ---------------------------------------
		
		JPanel itemContainer = new JPanel();
		itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
		//itemContainer.setBounds(46, 275, 635, 0);
		
		int index = 0;
		
		for(lib.item i: user.item) {

			JPanel itemL = new JPanel();
			itemL.setLayout(new BoxLayout(itemL, BoxLayout.X_AXIS));
			itemL.setMaximumSize(new Dimension(635, 50));
			
			
			JLabel nameTemp = new JLabel(i.name);
			nameTemp.setMaximumSize(new Dimension(245, 50));
			
			JLabel quantityTemp = new JLabel("" + i.quantity);
			quantityTemp.setMaximumSize(new Dimension(175, 50));
			
			JLabel priceTemp = new JLabel("" + (Double.parseDouble(i.price) / i.quantity));
			priceTemp.setMaximumSize(new Dimension(140, 50));
			
			JLabel totalPriceTemp = new JLabel("" + i.price);
			
			itemL.add(nameTemp);
			itemL.add(quantityTemp);
			itemL.add(priceTemp);
			itemL.add(totalPriceTemp);
			
			itemL.setOpaque(false);
			
			index++;
			itemContainer.add(itemL);
			
			itemContainer.setMaximumSize(new Dimension(635, 50 * index));
			itemContainer.setOpaque(false);
			
			totalPrice += Double.parseDouble(i.price);
			
			//itemContainer.setBounds(46, 275, 635, 50 * index);
			
		}
		
		JScrollPane itemPane = new JScrollPane(itemContainer);
		itemPane.setBounds(46, 275, 635, (itemContainer.getMaximumSize().height > 225) ? 225 : itemContainer.getMaximumSize().height);
		itemPane.setOpaque(false);
		itemPane.getViewport().setOpaque(false);
		itemPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		itemPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		itemPane.getVerticalScrollBar().setUnitIncrement(16);
		itemPane.setBorder(BorderFactory.createEmptyBorder());
		
		// -------------------------- For Item Container side ---------------------------------------
		
		// -------------------------- For lower side ---------------------------------------
		
		JPanel level[] = new JPanel[6];
		for(int i = 0; i < level.length; i++) {
			
			level[i] = new JPanel();
			level[i].setLayout(new BoxLayout(level[i], BoxLayout.X_AXIS));
			level[i].setSize(new Dimension(334, 32));
			
		}

		JLabel totalAmount = new JLabel("TOTAL AMOUNT");
		totalAmount.setForeground(Color.white);
		totalAmount.setMaximumSize(new Dimension(248, 33));
		//totalAmount.setBounds(323, 540, 169, 33);
		totalAmount.setFont(tools.BoldFont(16));
		
		JLabel totalAmountT = new JLabel("" + String.format("%.2f", totalPrice));
		totalAmountT.setFont(tools.BoldFont(16));
		totalAmountT.setForeground(Color.white);
		
		container.setOpaque(false);
		
		level[0].setOpaque(false);
		
		level[0].add(totalAmount);
		level[0].add(Box.createHorizontalStrut(150));
		level[0].add(totalAmountT);
		
		container.add(level[0]);
		
		
		JLabel vat = new JLabel("VAT");
		vat.setMaximumSize(new Dimension(144, 33));
		//vat.setBounds(323, 574, 144, 33);
		vat.setForeground(Color.white);
		vat.setFont(tools.BoldFont(16));
		
		vatPrice = totalPrice * .12;
		
		JLabel vatT = new JLabel("" + String.format("%.2f", vatPrice));
		vatT.setFont(tools.BoldFont(16));
		vatT.setForeground(Color.white);
		
		level[1].setOpaque(false);
		
		level[1].add(vat);
		level[1].add(Box.createHorizontalStrut(245));
		level[1].add(vatT);
		
		container.add(level[1]);
		
		
		JLabel discount = new JLabel("DISCOUNT");
		discount.setMaximumSize(new Dimension(144, 33));
		//discount.setBounds(323, 608, 144, 33);
		discount.setFont(tools.BoldFont(16));
		discount.setForeground(Color.white);
		
		discountPrice = (isPWD) ? (totalPrice + vatPrice) * .20 : 0;
		
		JLabel discountT = new JLabel("" + String.format("%.2f", discountPrice));
		discountT.setFont(tools.BoldFont(16));
		discountT.setForeground(Color.white);
		
		level[2].setOpaque(false);
		
		level[2].add(discount);
		level[2].add(Box.createHorizontalStrut(190));
		level[2].add(discountT);
		
		container.add(level[2]);
		
		
		
		JLabel gTotal = new JLabel("GRAND TOTAL AMOUNT");
		gTotal.setMaximumSize(new Dimension(248, 33));
		
		//gTotal.setBounds(323, 642, 248, 33);
		gTotal.setFont(tools.BoldFont(16));
		gTotal.setForeground(Color.white);
		
		grandPrice = totalPrice + vatPrice - discountPrice;
		
		JLabel gTotalT = new JLabel("" + String.format("%.2f", grandPrice));
		gTotalT.setFont(tools.BoldFont(16));
		gTotalT.setForeground(Color.white);

		
		level[3].setOpaque(false);
		
		level[3].add(gTotal);
		level[3].add(Box.createHorizontalStrut(80));
		level[3].add(gTotalT);
		
		container.add(level[3]);
		
		JLabel amountT = new JLabel("AMOUNT TENDERED");
		amountT.setForeground(Color.white);
		amountT.setMaximumSize(new Dimension(258, 33));
		amountT.setFont(tools.BoldFont(16));
		
		JTextField amountTotal = new JTextField("0");
		amountTotal.setPreferredSize(new Dimension(50, 20));
		amountTotal.setMaximumSize(amountTotal.getPreferredSize());
		amountTotal.setOpaque(false);
		amountTotal.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		amountTotal.setFont(tools.BoldFont(16));
		amountTotal.setForeground(Color.white);
		amountTotal.setHorizontalAlignment(JTextField.RIGHT);
		
		level[4].setOpaque(false);
		
		level[4].add(amountT);
		level[4].add(Box.createHorizontalStrut(110));
		level[4].add(amountTotal);
		
		container.add(level[4]);
		
		JLabel changeT = new JLabel("CHANGE");
		changeT.setFont(tools.BoldFont(16));
		changeT.setMaximumSize(new Dimension(275, 33));
		changeT.setForeground(Color.white);
		
		JLabel changeTotal = new JLabel("" + grandPrice);
		changeTotal.setFont(tools.BoldFont(16));
		changeTotal.setForeground(Color.white);
		
		amountTotal.addKeyListener(new KeyListener() {

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
				
				if(amountTotal.getText().matches(".*[a-z].*") || amountTotal.getText().isEmpty())
					changeTotal.setText("INVALID");
				else
					changeTotal.setText("" + String.format("%.2f", (Double.parseDouble(amountTotal.getText()) - grandPrice)));
				
				pane.revalidate();
				pane.repaint();
				
			}
			
			
			
		});
		
		level[5].setOpaque(false);
		
		level[5].add(changeT);
		level[5].add(Box.createHorizontalStrut(205));
		level[5].add(changeTotal);
		
		container.add(level[5]);
		
		// -------------------------- For lower side ---------------------------------------
		
		JLabel pwd = new JLabel("PWD/Senior");
		pwd.setBounds(265, 810, 190, 39);
		pwd.setFont(tools.BoldFont(28));
		pwd.setForeground(Color.red);
		pwd.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				pwd.setForeground((pwd.getForeground() == Color.red) ? Color.green : Color.red);
				
				isPWD = !isPWD;
				
				discountPrice = (isPWD) ? (totalPrice + vatPrice) * .20 : 0;
				
				grandPrice = totalPrice + vatPrice - discountPrice;
				
				discountT.setText("" + String.format("%.2f", discountPrice));
				
				changeTotal.setText("" + String.format("%.2f", (Double.parseDouble(amountTotal.getText()) - grandPrice)));
				gTotalT.setText("" + String.format("%.2f", grandPrice));
				
				pane.revalidate();
				pane.repaint();
			
			}
			
		});
		
		JLabel continueT = new JLabel("Continue", SwingConstants.CENTER);
		continueT.setFont(tools.BoldFont(28));
		continueT.setBounds(222, 850, 230, 65);
		continueT.setBackground(new Color(186, 237, 255, 135));
		continueT.setOpaque(true);
		continueT.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				user.userCash = Double.parseDouble(amountTotal.getText());
				user.totalCost = grandPrice;
				
				user.name = nameF.getText();
				
				lib.remove(new receipt());
				
				lib.frame.pack();
				lib.frame.setLocationRelativeTo(null);
				
				
			}
			
		});
		
		this.add(orderFT, Integer.valueOf(1));
		
		this.add(nameC, Integer.valueOf(1));
		this.add(nameF, Integer.valueOf(1));
		
		this.add(date, Integer.valueOf(1));
		this.add(dateF, Integer.valueOf(1));
		
		this.add(orderN, Integer.valueOf(1));
		this.add(orderF, Integer.valueOf(1));
		
		this.add(bevEra, Integer.valueOf(1));
		this.add(name, Integer.valueOf(1));
		this.add(quantity, Integer.valueOf(1));
		this.add(price, Integer.valueOf(1));
		this.add(amount, Integer.valueOf(1));
		
		//this.add(itemContainer, Integer.valueOf(1));
		
		this.add(itemPane, Integer.valueOf(1));
		
		this.add(container, Integer.valueOf(1));
		
		this.add(pwd, Integer.valueOf(1));
		this.add(continueT, Integer.valueOf(1));
		
		/*
		this.add(totalAmount, Integer.valueOf(1));
		this.add(vat, Integer.valueOf(1));
		this.add(discount, Integer.valueOf(1));
		this.add(gTotal, Integer.valueOf(1));
		this.add(amountT, Integer.valueOf(1));
		this.add(changeT, Integer.valueOf(1));
		*/
		this.add(new background(), Integer.valueOf(0));
	}
	
}
