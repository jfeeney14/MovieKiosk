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
		public MovieKiosk() 
		{
			// Frame title
			setTitle("--- Movie Kiosk ---");
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// size of the frame
			setSize(975,800);
			
			// panel title
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
					              "Display Area - Movie Kiosk #1"));;
			setContentPane(contentPane);
			
			
			// list of items that are being bought
			JTextArea textArea = new JTextArea();
			textArea.setBounds(763, 11, 168, 382);
			textArea.setEditable(false);

			contentPane.add(textArea);
			
			// field where total accumulating price is being displayed
			JTextField textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(807, 420, 124, 34);
			contentPane.add(textField);
			textField.setColumns(10);
			textField.setText("0.00");
			
			// field for change input
			JTextField textField2 = new JTextField(); 
			textField2.setEditable(true);
			textField2.setBounds(807, 490, 124, 34);
			contentPane.add(textField2);
			textField2.setColumns(10);
			textField2.setText("0.00");
			
			JTextField textField3 = new JTextField();
			textField3.setEditable(false);
			textField3.setBounds(807, 560, 124, 34);
			contentPane.add(textField3);
			textField3.setColumns(10);
			textField3.setText("0.00");
						
			
			// Popcorn Button
			JButton btnNewButton = new JButton("Popcorn");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Popcorn      $3.50\r\n");
					total = total + 3.50;
					
					textField.setText(formatter.format(total));
					textField.repaint();
				}
			});
			
			btnNewButton.setIcon(new ImageIcon("Popcorn.jpg"));
			btnNewButton.setBounds(10, 41, 200, 200);
			contentPane.add(btnNewButton);
			
			/*
		
			// Banana Button
			JButton btnNewButton_b = new JButton("Bananas");
			btnNewButton_b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Bananas         .59\r\n");
					total = total + .59;
					
					textField.setText(formatter.format(total));
					textField.repaint();
				}
			});
			
			btnNewButton_b.setIcon(new ImageIcon("Kiosk-Bananas.jpg"));
			btnNewButton_b.setBounds(480, 41, 200, 200);
			contentPane.add(btnNewButton_b);
			
			 // popcorn Button
			JButton btnNewButton_1 = new JButton("Apples");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					textArea.append("Apples          .49\r\n");
					total = total + .49;
					
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("Kiosk-Apples.jpg"));
			btnNewButton_1.setBounds(10, 329, 200, 200);
			contentPane.add(btnNewButton_1);
			
			// Pear Button
			JButton btnNewButton_2 = new JButton("Pears");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					textArea.append("Pears           .39\r\n");
					total = total + .39;
					
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnNewButton_2.setIcon(new ImageIcon("Kiosk-Pears.jpg"));
			btnNewButton_2.setBounds(243, 41, 200, 200);
			contentPane.add(btnNewButton_2);
			
			// Grape Button
			JButton btnNewButton_4 = new JButton("Grapes");
			btnNewButton_4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					textArea.append("Grapes           .89\r\n");
					total = total + .89;
										
					textField.setText(formatter.format(total));
					textArea.repaint();
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("Kiosk-Grapes.jpg"));
			btnNewButton_4.setBounds(243, 329, 200, 200);
			contentPane.add(btnNewButton_4);
			
			// Kiwi Button
						JButton btnNewButton_5 = new JButton("Kiwis");
						btnNewButton_5.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e) 
							{
								textArea.append("Kiwis           .89\r\n");
								total = total + .89;
													
								textField.setText(formatter.format(total));
								textArea.repaint();
							}
						});
						btnNewButton_5.setIcon(new ImageIcon("Kiosk-Kiwis.jpg"));
						btnNewButton_5.setBounds(480, 329, 200, 200);
						contentPane.add(btnNewButton_5);
			
			
			JLabel lblNewLabel = new JLabel("    Total Price   $");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(697, 424, 100, 23);
			contentPane.add(lblNewLabel);
			
			
			
			// EXIT Button
			JButton btnNewButton_3 = new JButton("EXIT");
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.exit(0);	
				}
			});
			btnNewButton_3.setBounds(449, 700, 133, 34);
			contentPane.add(btnNewButton_3);
			*/
			// Transaction Complete Button
						JButton btnNewButton_done = new JButton("Transaction Complete");
						btnNewButton_done.setFont(new Font("Tahoma", Font.PLAIN, 16));
						btnNewButton_done.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								
								Double temp = Double.parseDouble(textField2.getText());
								String temp2 = (temp - total)+"";
								String temp3 = temp2.substring(temp2.lastIndexOf(".")+1,4);
								temp2 = temp2.substring(0,temp2.lastIndexOf(".")+1);
								temp2 = temp2 + temp3;
							 
								textField3.setText(temp2);
								
							}
						});
						btnNewButton_done.setBounds(700, 650, 250, 34);
						contentPane.add(btnNewButton_done);
			
			
			// labels for each product button
			JLabel lblNewLabel_1 = new JLabel("Click for Popcorn : $3.50");
			lblNewLabel_1.setBounds(29, 255, 194, 14);
			contentPane.add(lblNewLabel_1);
			/*
			JLabel lblNewLabel_2 = new JLabel("Click for Pears : .39 each");
			lblNewLabel_2.setBounds(270, 255, 177, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Click for Apples : .49 each");
			lblNewLabel_3.setBounds(29, 550, 202, 14);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Click for Grapes : .89 each");
			lblNewLabel_4.setBounds(260, 550, 187, 14);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Click for Bananas : .49 each");
			lblNewLabel_5.setBounds(490, 255, 202, 14);
			contentPane.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Click for Kiwis : .89 each");
			lblNewLabel_6.setBounds(490, 550, 187, 14);
			contentPane.add(lblNewLabel_6);
			
			JLabel lblNewLabel_7 = new JLabel("Cash Tendered: $");
			lblNewLabel_7.setBounds(690, 500, 187, 14);
			contentPane.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel("Change Due: $");
			lblNewLabel_8.setBounds(700, 570, 187, 14);
			contentPane.add(lblNewLabel_8);
		
			*/
			// user will do the layout
			contentPane.setLayout(null);
			
			// position frame in the middle of the screen
			this.setLocationRelativeTo(null);
			
			
		}
}