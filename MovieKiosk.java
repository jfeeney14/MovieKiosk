//testing
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MovieKiosk extends JFrame
{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**
		 * 
		 */
		double total = 0.0;
		double change = 0.0;
		double seniorTicketTotal = 0.0;
		double adultTicketTotal = 0.0;
		double childTicketTotal = 0.0;
		private JTextField amountSeniorTickets;
		private JTextField amountAdultTickets;
		private JTextField amountChildTickets;
		boolean m1t1 = false;
		boolean m1t2 = false;
		boolean m1t3 = false;
		boolean m1t4 = false;
		boolean m2t1 = false;
		boolean m2t2 = false;
		boolean m3t1 = false;
		boolean m3t2 = false;
		boolean m3t3 = false;
		String selectedMovieName;
		String selectedMovieTime;
		String movieOneName = "";
		String movieTwoName = "";
		String movieThreeName = "";
		String strMovie1Time1 = "";
		String strMovie1Time2 = "";
		String strMovie1Time3 = "";
		String strMovie1Time4 = "";
		String strMovie2Time1 = "";
		String strMovie2Time2 = "";
		String strMovie3Time1 = "";
		String strMovie3Time2 = "";
		String strMovie3Time3 = "";
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args)
		{
			MovieKiosk frame = new MovieKiosk();
			frame.setVisible(true);
		}

		/**
		 * Create the frame.
		 */
		public MovieKiosk(){

			// Frame title
			setTitle("--- Movie Kiosk ---");
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// size of the frame
			setSize(1050,800);
			
			// panel title
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
					              "Display Area - Movie Kiosk #1"));;
			setContentPane(contentPane);
			
			
			//List of items that are being bought
			JTextArea textArea = new JTextArea();
			textArea.setBounds(763, 11, 281, 382);
			textArea.setEditable(false);

			contentPane.add(textArea);
			
			//Field where total accumulating price is being displayed
			JLabel lblTotal = new JLabel("Total");
			lblTotal.setBounds(901, 405, 100, 16);
			contentPane.add(lblTotal);
			JTextField textFieldTotal = new JTextField();
			textFieldTotal.setEditable(false);
			textFieldTotal.setBounds(901, 420, 124, 34);
			contentPane.add(textFieldTotal);
			textFieldTotal.setColumns(10);
			textFieldTotal.setText("0.00");
			
			//Cash Tendered Field
			JLabel lblCashTendered = new JLabel("Cash Tendered");
			lblCashTendered.setBounds(901, 474, 110, 16);
			contentPane.add(lblCashTendered);
			JTextField textFieldCashTendered = new JTextField(); 
			textFieldCashTendered.setEditable(true);
			textFieldCashTendered.setBounds(901, 490, 124, 34);
			contentPane.add(textFieldCashTendered);
			textFieldCashTendered.setColumns(10);
			textFieldCashTendered.setText("0.00");
			
			//Change Due Field
			JLabel lblChangeDue = new JLabel("Change Due");
			lblChangeDue.setBounds(901, 544, 88, 16);
			contentPane.add(lblChangeDue);
			JTextField textFieldChangeDue = new JTextField();
			textFieldChangeDue.setEditable(false);
			textFieldChangeDue.setBounds(901, 560, 124, 34);
			contentPane.add(textFieldChangeDue);
			textFieldChangeDue.setColumns(10);
			textFieldChangeDue.setText("0.00");			
			
			// Transaction Complete Button
			JButton btnNewButton_done = new JButton("Transaction Complete");
			btnNewButton_done.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_done.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String text = textFieldCashTendered.getText();
					double intCT = Integer.parseInt(text);
					double change = intCT - total;
					textFieldChangeDue.setText(Double.toString(change));
				}
			});
			btnNewButton_done.setBounds(794, 650, 250, 34);
			contentPane.add(btnNewButton_done);
			
			// user will do the layout
			contentPane.setLayout(null);
			
////////////////////////////////////////////
/////////////SNACK BUTTONS//////////////////
////////////////////////////////////////////			
			
			// Snickers Button
			JButton btnSnickers = new JButton("Snickers");
			btnSnickers.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Snickers      $1.50\r\n");
					total = total + 1.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});		
			btnSnickers.setIcon(new ImageIcon("Snickers.jpg"));
			btnSnickers.setBounds(220, 350, 200, 100);
			contentPane.add(btnSnickers);
			
			// Regs M&M Button
			JButton btnMMs = new JButton("M&Ms");
			btnMMs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("M&Ms      $1.50\r\n");
					total = total + 1.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			btnMMs.setIcon(new ImageIcon("RegsMM.jpg"));
			btnMMs.setBounds(220, 460, 200, 100);
			contentPane.add(btnMMs);			
			
			// Peanut M&M Button
			JButton btnPMMs = new JButton("Peanut M&Ms");
			btnPMMs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Peanut M&Ms      $1.50\r\n");
					total = total + 1.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			btnPMMs.setIcon(new ImageIcon("PeanutMM.jpg"));
			btnPMMs.setBounds(220, 570, 200, 100);
			contentPane.add(btnPMMs);			
			
			//Popcorn Buttons
			JLabel lblNewLabel_1 = new JLabel("Popcorn");
			lblNewLabel_1.setIcon(new ImageIcon("Popcorn.jpg"));
			lblNewLabel_1.setBounds(10, 350, 200, 200);
			contentPane.add(lblNewLabel_1);
			JButton smPopcorn = new JButton("S");
			smPopcorn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			smPopcorn.setBounds(20, 552, 50, 50);
			contentPane.add(smPopcorn);
			smPopcorn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Small Popcorn      $5.50\r\n");
					total = total + 5.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton mePopcorn = new JButton("M");
			mePopcorn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			mePopcorn.setBounds(85, 552, 50, 50);
			contentPane.add(mePopcorn);
			mePopcorn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Medium Popcorn      $6.50\r\n");
					total = total + 6.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton lgPopcorn = new JButton("L");
			lgPopcorn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lgPopcorn.setBounds(150, 552, 50, 50);
			contentPane.add(lgPopcorn);
			lgPopcorn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Large Popcorn      $7.50\r\n");
					total = total + 7.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});

////////////////////////////////////////////
/////////////DRINK BUTTONS//////////////////
////////////////////////////////////////////			
			
			//Soda Buttons
			JLabel lblSoda = new JLabel("Soda");
			lblSoda.setBackground(Color.RED);
			lblSoda.setBounds(452, 350, 110, 158);
			contentPane.add(lblSoda);
			lblSoda.setIcon(new ImageIcon("SodaCup.jpeg"));
			JButton smSoda = new JButton("S");
			smSoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
			smSoda.setBounds(452, 520, 30, 30);
			contentPane.add(smSoda);
			smSoda.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Small Soda      $2.50\r\n");
					total = total + 2.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton meSoda = new JButton("M");
			meSoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
			meSoda.setBounds(494, 520, 30, 30);
			contentPane.add(meSoda);
			meSoda.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Medium Soda      $3.00\r\n");
					total = total + 3.00;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton lgSoda = new JButton("L");
			lgSoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lgSoda.setBounds(536, 520, 30, 30);
			contentPane.add(lgSoda);
			lgSoda.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Large Soda      $3.50\r\n");
					total = total + 3.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			//Water Buttons
			JLabel lblWater = new JLabel("Water");
			lblWater.setBackground(Color.RED);
			lblWater.setBounds(453, 560, 110, 158);
			contentPane.add(lblWater);
			lblWater.setIcon(new ImageIcon("WaterBottle.jpeg"));
			JButton smWater = new JButton("S");
			smWater.setFont(new Font("Tahoma", Font.PLAIN, 16));
			smWater.setBounds(452, 728, 30, 30);
			contentPane.add(smWater);
			smWater.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Small Water      $1.25\r\n");
					total = total + 1.25;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton meWater = new JButton("M");
			meWater.setFont(new Font("Tahoma", Font.PLAIN, 16));
			meWater.setBounds(494, 728, 30, 30);
			contentPane.add(meWater);
			meWater.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Medium Water      $1.50\r\n");
					total = total + 1.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton lgWater = new JButton("L");
			lgWater.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lgWater.setBounds(536, 728, 30, 30);
			contentPane.add(lgWater);
			lgWater.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Large Water      $1.75\r\n");
					total = total + 1.75;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			//ICEE Buttons
			JLabel lblIcee = new JLabel("ICEE");
			lblIcee.setBackground(Color.RED);
			lblIcee.setBounds(618, 352, 110, 158);
			contentPane.add(lblIcee);
			lblIcee.setIcon(new ImageIcon("ICEE-cup.png"));
			JButton smICEE = new JButton("S");
			smICEE.setFont(new Font("Tahoma", Font.PLAIN, 16));
			smICEE.setBounds(616, 520, 30, 30);
			contentPane.add(smICEE);
			smICEE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Small ICEE      $3.00\r\n");
					total = total + 3.00;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton meICEE = new JButton("M");
			meICEE.setFont(new Font("Tahoma", Font.PLAIN, 16));
			meICEE.setBounds(658, 520, 30, 30);
			contentPane.add(meICEE);
			meICEE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Medium ICEE      $3.50\r\n");
					total = total + 3.50;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
			JButton lgICEE = new JButton("L");
			lgICEE.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lgICEE.setBounds(700, 520, 30, 30);
			contentPane.add(lgICEE);
			lgICEE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Large ICEE      $4.00\r\n");
					total = total + 4.00;
					
					textFieldTotal.setText(formatter.format(total));
					textFieldTotal.repaint();
				}
			});
			
////////////////////////////////////////////
/////////////SECTION LABELS/////////////////
////////////////////////////////////////////			
			
			JLabel lblNowPlaying = new JLabel("Now Playing...");
			lblNowPlaying.setForeground(Color.RED);
			lblNowPlaying.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNowPlaying.setBounds(10, 19, 135, 30);
			contentPane.add(lblNowPlaying);
			
			JLabel lblTicketOptions = new JLabel("Ticket Options:");
			lblTicketOptions.setForeground(Color.RED);
			lblTicketOptions.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblTicketOptions.setBounds(438, 19, 155, 30);
			contentPane.add(lblTicketOptions);
			
			JLabel lblSnacks = new JLabel("Snacks:");
			lblSnacks.setForeground(Color.RED);
			lblSnacks.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblSnacks.setBounds(10, 317, 75, 30);
			contentPane.add(lblSnacks);
			
			JLabel lblDrinks = new JLabel("Drinks:");
			lblDrinks.setForeground(Color.RED);
			lblDrinks.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblDrinks.setBounds(438, 317, 75, 30);
			contentPane.add(lblDrinks);
			
////////////////////////////////////////////
/////////////MOVIE POSTERS//////////////////
////////////////////////////////////////////			
			
			JLabel labelMovieOne = new JLabel("Movie One");
			labelMovieOne.setIcon(new ImageIcon("3BillboardsPoster.jpg"));
			labelMovieOne.setBackground(Color.RED);
			labelMovieOne.setBounds(10, 61, 110, 158);
			contentPane.add(labelMovieOne);
			movieOneName = "Three Billboards";
			
			JLabel labelMovieTwo = new JLabel("Movie Two");
			labelMovieTwo.setIcon(new ImageIcon("CallMeByYourNamePoster.jpg"));
			labelMovieTwo.setBackground(Color.RED);
			labelMovieTwo.setBounds(150, 61, 110, 158);
			contentPane.add(labelMovieTwo);
			movieTwoName = "Call Me By Your Name";
			
			JLabel labelMovieThree = new JLabel("Movie Three");
			labelMovieThree.setIcon(new ImageIcon("PhantomThreadPoster.jpeg"));
			labelMovieThree.setBackground(Color.RED);
			labelMovieThree.setBounds(290, 61, 110, 158);
			contentPane.add(labelMovieThree);
			movieThreeName = "Phantom Thread";
			
////////////////////////////////////////////
/////////////MOVIE TIMES BUTTONS////////////
////////////////////////////////////////////			
			
			//First Movie Times
			//First Movie First Time
			strMovie1Time1 = "10:00am";
			JButton btnMovie1Time1 = new JButton(strMovie1Time1);
			btnMovie1Time1.setBounds(6, 220, 117, 30);
			contentPane.add(btnMovie1Time1);
			btnMovie1Time1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = true;
						m1t2 = false;
						m1t3 = false;
						m1t4 = false;
						m2t1 = false;
						m2t2 = false;
						m3t1 = false;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//First Movie Second Time
			strMovie1Time2 = "12:20pm";
			JButton btnMovie1Time2 = new JButton(strMovie1Time2);
			btnMovie1Time2.setBounds(6, 245, 117, 30);
			contentPane.add(btnMovie1Time2);
			btnMovie1Time2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = true;
						m1t3 = false;
						m1t4 = false;
						m2t1 = false;
						m2t2 = false;
						m3t1 = false;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//First Movie Third Time
			strMovie1Time3 = "5:45pm";
			JButton btnMovie1Time3 = new JButton(strMovie1Time3);
			btnMovie1Time3.setBounds(6, 270, 117, 30);
			contentPane.add(btnMovie1Time3);
			btnMovie1Time3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = true;
						m1t4 = false;
						m2t1 = false;
						m2t2 = false;
						m3t1 = false;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//First Movie Fourth Time
			strMovie1Time4 = "8:10pm";
			JButton btnMovie1Time4 = new JButton(strMovie1Time4);
			btnMovie1Time4.setBounds(6, 295, 117, 30);
			contentPane.add(btnMovie1Time4);
			btnMovie1Time4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = false;
						m1t4 = true;
						m2t1 = false;
						m2t2 = false;
						m3t1 = false;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//Second Movie Times
			//Second Movie First Time
			strMovie2Time1 = "1:20pm";
			JButton btnMovie2Time1 = new JButton(strMovie2Time1);
			btnMovie2Time1.setBounds(147, 220, 117, 30);
			contentPane.add(btnMovie2Time1);
			btnMovie2Time1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = false;
						m1t4 = false;
						m2t1 = true;
						m2t2 = false;
						m3t1 = false;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//Second Movie Second Time
			strMovie2Time2 = "3:00pm";
			JButton btnMovie2Time2 = new JButton(strMovie2Time2);
			btnMovie2Time2.setBounds(147, 245, 117, 30);
			contentPane.add(btnMovie2Time2);
			btnMovie2Time2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = false;
						m1t4 = false;
						m2t1 = false;
						m2t2 = true;
						m3t1 = false;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//Third Movie Times
			//Third Movie First Time
			strMovie3Time1 = "11:50am";
			JButton btnMovie3Time1 = new JButton(strMovie3Time1);
			btnMovie3Time1.setBounds(287, 220, 117, 30);
			contentPane.add(btnMovie3Time1);
			btnMovie3Time1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = false;
						m1t4 = false;
						m2t1 = false;
						m2t2 = false;
						m3t1 = true;
						m3t2 = false;
						m3t3 = false;
				}
			});
			
			//Third Movie Second Time
			strMovie3Time2 = "4:00pm";
			JButton btnMovie3Time2 = new JButton(strMovie3Time2);
			btnMovie3Time2.setBounds(287, 245, 117, 30);
			contentPane.add(btnMovie3Time2);
			btnMovie3Time2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = false;
						m1t4 = false;
						m2t1 = false;
						m2t2 = false;
						m3t1 = false;
						m3t2 = true;
						m3t3 = false;
				}
			});
			
			//Third Movie Third Time
			strMovie3Time3 = "7:30pm";
			JButton btnMovie3Time3 = new JButton(strMovie3Time3);
			btnMovie3Time3.setBounds(287, 270, 117, 30);
			contentPane.add(btnMovie3Time3);
			btnMovie3Time3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						m1t1 = false;
						m1t2 = false;
						m1t3 = false;
						m1t4 = false;
						m2t1 = false;
						m2t2 = false;
						m3t1 = false;
						m3t2 = false;
						m3t3 = true;
				}
			});
			
////////////////////////////////////////////
/////////////TICKET OPTIONS/////////////////
////////////////////////////////////////////			
			
			//Senior Ticket Options
			JLabel lblSeniorTicket = new JLabel("Senior Ticket (60+)");
			lblSeniorTicket.setForeground(Color.BLACK);
			lblSeniorTicket.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
			lblSeniorTicket.setBounds(438, 61, 168, 30);
			contentPane.add(lblSeniorTicket);
			
			JButton seniorTicketMinus = new JButton("-");
			seniorTicketMinus.setBounds(616, 61, 30, 30);
			contentPane.add(seniorTicketMinus);
			seniorTicketMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(seniorTicketTotal > 0){
						seniorTicketTotal = seniorTicketTotal - 1;
						amountSeniorTickets.setText(formatter.format(seniorTicketTotal));
						amountSeniorTickets.repaint();
					}
				}
			});
			
			JButton seniorTicketPlus = new JButton("+");
			seniorTicketPlus.setBounds(700, 61, 30, 30);
			contentPane.add(seniorTicketPlus);
			seniorTicketPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					seniorTicketTotal = seniorTicketTotal + 1;
					amountSeniorTickets.setText(formatter.format(seniorTicketTotal));
					amountSeniorTickets.repaint();
				}
			});
			
			amountSeniorTickets = new JTextField();
			amountSeniorTickets.setHorizontalAlignment(SwingConstants.CENTER);
			amountSeniorTickets.setText(formatter.format(seniorTicketTotal));
			amountSeniorTickets.setEditable(false);
			amountSeniorTickets.setColumns(10);
			amountSeniorTickets.setBounds(653, 61, 40, 30);
			contentPane.add(amountSeniorTickets);
			
			
			//Adult Ticket Options
			JLabel lblAdultTicket = new JLabel("Adult Ticket (15 - 60)");
			lblAdultTicket.setForeground(Color.BLACK);
			lblAdultTicket.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
			lblAdultTicket.setBounds(438, 103, 188, 30);
			contentPane.add(lblAdultTicket);
			
			JButton adultTicketMinus = new JButton("-");
			adultTicketMinus.setBounds(637, 103, 30, 30);
			contentPane.add(adultTicketMinus);
			adultTicketMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(adultTicketTotal > 0){
						adultTicketTotal = adultTicketTotal - 1;
						amountAdultTickets.setText(formatter.format(adultTicketTotal));
						amountAdultTickets.repaint();
					}
				}
			});
			
			JButton adultTicketPlus = new JButton("+");
			adultTicketPlus.setBounds(721, 103, 30, 30);
			contentPane.add(adultTicketPlus);
			adultTicketPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					adultTicketTotal = adultTicketTotal + 1;
					amountAdultTickets.setText(formatter.format(adultTicketTotal));
					amountAdultTickets.repaint();
				}
			});
			
			amountAdultTickets = new JTextField();
			amountAdultTickets.setText(formatter.format(adultTicketTotal));
			amountAdultTickets.setHorizontalAlignment(SwingConstants.CENTER);
			amountAdultTickets.setEditable(false);
			amountAdultTickets.setColumns(10);
			amountAdultTickets.setBounds(674, 103, 40, 30);
			contentPane.add(amountAdultTickets);
			
			//Child Ticket Options
			JLabel lblChildTicketunder = new JLabel("Child Ticket (Under 15)");
			lblChildTicketunder.setForeground(Color.BLACK);
			lblChildTicketunder.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
			lblChildTicketunder.setBounds(438, 145, 208, 30);
			contentPane.add(lblChildTicketunder);
			
			JButton childTicketMinus = new JButton("-");
			childTicketMinus.setBounds(647, 145, 30, 30);
			contentPane.add(childTicketMinus);
			childTicketMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(childTicketTotal > 0){
						childTicketTotal = childTicketTotal - 1;
						amountChildTickets.setText(formatter.format(childTicketTotal));
						amountChildTickets.repaint();
					}
				}
			});
			
			JButton childTicketPlus = new JButton("+");
			childTicketPlus.setBounds(731, 145, 30, 30);
			contentPane.add(childTicketPlus);
			childTicketPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					childTicketTotal = childTicketTotal + 1;
					amountChildTickets.setText(formatter.format(childTicketTotal));
					amountChildTickets.repaint();
				}
			});
			
			amountChildTickets = new JTextField();
			amountChildTickets.setText(formatter.format(childTicketTotal));
			amountChildTickets.setHorizontalAlignment(SwingConstants.CENTER);
			amountChildTickets.setEditable(false);
			amountChildTickets.setColumns(10);
			amountChildTickets.setBounds(684, 147, 40, 30);
			contentPane.add(amountChildTickets);
			
			//Submit Ticket Amount Button
			JButton btnSubmitTicketAmount = new JButton("Submit Ticket Amount");
			btnSubmitTicketAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			btnSubmitTicketAmount.setBounds(438, 200, 188, 50);
			contentPane.add(btnSubmitTicketAmount);
			btnSubmitTicketAmount.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					
					if(m1t1) {
						selectedMovieName = movieOneName;
						selectedMovieTime = strMovie1Time1;
					}
					if(m1t2) {
						selectedMovieName = movieOneName;
						selectedMovieTime = strMovie1Time2;
					}
					if(m1t3) {
						selectedMovieName = movieOneName;
						selectedMovieTime = strMovie1Time3;
					}
					if(m1t4) {
						selectedMovieName = movieOneName;
						selectedMovieTime = strMovie1Time4;
					}
					if(m2t1) {
						selectedMovieName = movieTwoName;
						selectedMovieTime = strMovie2Time1;
					}
					if(m2t2) {
						selectedMovieName = movieTwoName;
						selectedMovieTime = strMovie2Time2;
					}
					if(m3t1) {
						selectedMovieName = movieThreeName;
						selectedMovieTime = strMovie3Time1;
					}
					if(m3t2) {
						selectedMovieName = movieThreeName;
						selectedMovieTime = strMovie3Time2;
					}
					if(m3t3) {
						selectedMovieName = movieThreeName;
						selectedMovieTime = strMovie3Time3;
					}
					
					if(seniorTicketTotal > 0) {
						double seniorTotalPrice = (seniorTicketTotal * 9.00);
						int seniorIntTicketTotal = (int)(seniorTicketTotal);
						textArea.append(seniorIntTicketTotal + "x Senior Tickets to " + selectedMovieName + " " + selectedMovieTime + "     $" + seniorTotalPrice + "\r\n");
						total = total + seniorTotalPrice;
						textFieldTotal.setText(formatter.format(total));
						textFieldTotal.repaint();
					}
					
					if(adultTicketTotal > 0) {
						double adultTotalPrice = (adultTicketTotal * 11.00);
						int adultIntTicketTotal = (int)(adultTicketTotal);
						textArea.append(adultIntTicketTotal + "x Adult Tickets to " + selectedMovieName + " " + selectedMovieTime + "     $" + adultTotalPrice + "\r\n");
						total = total + adultTotalPrice;
						textFieldTotal.setText(formatter.format(total));
						textFieldTotal.repaint();
					}
					
					if(childTicketTotal > 0) {
						double childTotalPrice = (childTicketTotal * 7.00);
						int childIntTicketTotal = (int)(childTicketTotal);
						textArea.append(childIntTicketTotal + "x Child Tickets to " + selectedMovieName + " " + selectedMovieTime + "     $" + childTotalPrice + "\r\n");
						total = total + childTotalPrice;
						textFieldTotal.setText(formatter.format(total));
						textFieldTotal.repaint();
					}
				}	
			});
			
			// position frame in the middle of the screen
			this.setLocationRelativeTo(null);
			
			
		}
}
