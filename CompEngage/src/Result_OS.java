import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Result_OS extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Result_OS frame = new Result_OS();
		frame.setVisible(true);
		
		
	}
	
	public Result_OS() {
		// Set the icon image of the frame
        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 730);
		setLocationRelativeTo(null);
		setResizable(false);
		JPanel contentPane;
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnbckmenu = new JButton("");
		btnbckmenu.setBorder(null);
		btnbckmenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Home fhome = new Home();
				setVisible(false);
				fhome.setVisible(true);
				Home.clip.setFramePosition(0);
				Home.clip.start();
			}
		});
		btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
		btnbckmenu.setBounds(94, 483, 256, 60);
		contentPane.add(btnbckmenu);
		
		JButton btnexit = new JButton("");
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
		btnexit.setBorder(null);
		btnexit.setBounds(94, 591, 256, 60);
		contentPane.add(btnexit);
		
		
		JLabel bglabel = new JLabel();
		bglabel.setOpaque(true);
		bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
		bglabel.setBounds(0, 0, 450, 730);
		contentPane.add(bglabel);
	}
	
	 class Result_ch1OS extends JFrame {

		private JPanel contentPane;
		private JTextField txtYouGot;
		private JTextField accuracytxt;
		private JTextField txtScore;
		private JTextField scoretxt;
		private JTextField commenttxt;
		
		/**
		 * Create the frame.
		 */
		public Result_ch1OS() {
			// Set the icon image of the frame
	        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
			setUndecorated(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 730);
			setLocationRelativeTo(null);
			setResizable(false);
			contentPane = new JPanel();
			setContentPane(contentPane);
			contentPane.setLayout(null);
			setVisible(true);
			
			txtYouGot = new JTextField();
			txtYouGot.setBorder(null);
			txtYouGot.setEditable(false);
			txtYouGot.setFont(new Font("Arial", Font.BOLD, 40));
			txtYouGot.setForeground(new Color(255, 51, 0));
			txtYouGot.setHorizontalAlignment(SwingConstants.CENTER);
			txtYouGot.setText("YOU GOT");
			txtYouGot.setBackground(new Color(51, 51, 51));
			txtYouGot.setBounds(62, 111, 312, 69);
			contentPane.add(txtYouGot);
			txtYouGot.setColumns(10);
			
			txtScore = new JTextField();
			txtScore.setText("SCORE:");
			txtScore.setBorder(null);
			txtScore.setEditable(false);
			txtScore.setHorizontalAlignment(SwingConstants.CENTER);
			txtScore.setForeground(new Color(255, 51, 0));
			txtScore.setFont(new Font("Arial", Font.BOLD, 30));
			txtScore.setColumns(10);
			txtScore.setBackground(new Color(51, 51, 51));
			txtScore.setBounds(62, 245, 141, 53);
			contentPane.add(txtScore);
			
			scoretxt = new JTextField();
			scoretxt.setBorder(null);
			scoretxt.setEditable(false);
			scoretxt.setHorizontalAlignment(SwingConstants.CENTER);
			scoretxt.setForeground(new Color(255, 51, 0));
			scoretxt.setFont(new Font("Arial", Font.BOLD, 30));
			scoretxt.setColumns(10);
			scoretxt.setBackground(new Color(51, 51, 51));
			scoretxt.setBounds(198, 245, 176, 53);
			contentPane.add(scoretxt);
			
			commenttxt = new JTextField();
			commenttxt.setBorder(null);
			commenttxt.setHorizontalAlignment(SwingConstants.CENTER);
			commenttxt.setForeground(new Color(255, 51, 0));
			commenttxt.setFont(new Font("Arial", Font.BOLD, 20));
			commenttxt.setEditable(false);
			commenttxt.setColumns(10);
			commenttxt.setBackground(new Color(51, 51, 51));
			commenttxt.setBounds(62, 295, 312, 69);
			contentPane.add(commenttxt);
			
			
			//call the score for java
			double score = OSquiz.ch1_OS.scores;
			int whole_score = (int) score ;
			
			String final_score = Integer.toString(whole_score);
			
			scoretxt.setText(final_score + " out of 10");
			//to get the percentage
			double accuracy = ((score/10)*100);
			DecimalFormat df = new DecimalFormat("#.#");
			//for rating
			if (whole_score>=8) {
				commenttxt.setText("Excellent!");
				
			} else if(whole_score<=7 && whole_score>=6){
				commenttxt.setText("Keep up the good work!");
			}
			else if(whole_score<=5 && whole_score>=3){
				commenttxt.setText("You have to study more..");
			}
			else {
				commenttxt.setFont(new Font("Arial", Font.BOLD, 17));
				commenttxt.setText("It's okay...Study more,\nyou can do it!");
			} 
			accuracytxt = new JTextField();
			accuracytxt.setBorder(null);
			accuracytxt.setEditable(false);
			accuracytxt.setHorizontalAlignment(SwingConstants.CENTER);
			accuracytxt.setForeground(new Color(255, 51, 0));
			accuracytxt.setFont(new Font("Arial", Font.BOLD, 40));
			accuracytxt.setColumns(10);
			accuracytxt.setBackground(new Color(51, 51, 51));
			accuracytxt.setBounds(62, 178, 312, 69);
			String accuracytext = df.format(accuracy);
			accuracytxt.setText(accuracytext + "%");
			contentPane.add(accuracytxt);
			
			JButton btnbckmenu = new JButton("");
			btnbckmenu.setBorder(null);
			btnbckmenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					Home fhome = new Home();
					setVisible(false);
					fhome.setVisible(true);
					Home.clip.setFramePosition(0);
					Home.clip.start();
				}
			});
			btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
			btnbckmenu.setBounds(94, 483, 256, 60);
			contentPane.add(btnbckmenu);
			
			JButton btnexit = new JButton("");
			btnexit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);
				}
			});
			btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
			btnexit.setBorder(null);
			btnexit.setBounds(94, 591, 256, 60);
			contentPane.add(btnexit);
			
			JLabel bglabel = new JLabel();
			bglabel.setOpaque(true);
			bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
	}
	 class Result_ch2OS extends JFrame {

			private JPanel contentPane;
			private JTextField txtYouGot;
			private JTextField accuracytxt;
			private JTextField txtScore;
			private JTextField scoretxt;
			private JTextField commenttxt;
			
			/**
			 * Create the frame.
			 */
			public Result_ch2OS() {
				// Set the icon image of the frame
		        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
				setUndecorated(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 730);
				setLocationRelativeTo(null);
				setResizable(false);
				contentPane = new JPanel();
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setVisible(true);
				
				txtYouGot = new JTextField();
				txtYouGot.setBorder(null);
				txtYouGot.setEditable(false);
				txtYouGot.setFont(new Font("Arial", Font.BOLD, 40));
				txtYouGot.setForeground(new Color(255, 51, 0));
				txtYouGot.setHorizontalAlignment(SwingConstants.CENTER);
				txtYouGot.setText("YOU GOT");
				txtYouGot.setBackground(new Color(51, 51, 51));
				txtYouGot.setBounds(62, 111, 312, 69);
				contentPane.add(txtYouGot);
				txtYouGot.setColumns(10);
				
				txtScore = new JTextField();
				txtScore.setText("SCORE:");
				txtScore.setBorder(null);
				txtScore.setEditable(false);
				txtScore.setHorizontalAlignment(SwingConstants.CENTER);
				txtScore.setForeground(new Color(255, 51, 0));
				txtScore.setFont(new Font("Arial", Font.BOLD, 30));
				txtScore.setColumns(10);
				txtScore.setBackground(new Color(51, 51, 51));
				txtScore.setBounds(62, 245, 141, 53);
				contentPane.add(txtScore);
				
				scoretxt = new JTextField();
				scoretxt.setBorder(null);
				scoretxt.setEditable(false);
				scoretxt.setHorizontalAlignment(SwingConstants.CENTER);
				scoretxt.setForeground(new Color(255, 51, 0));
				scoretxt.setFont(new Font("Arial", Font.BOLD, 30));
				scoretxt.setColumns(10);
				scoretxt.setBackground(new Color(51, 51, 51));
				scoretxt.setBounds(198, 245, 176, 53);
				contentPane.add(scoretxt);
				
				commenttxt = new JTextField();
				commenttxt.setBorder(null);
				commenttxt.setHorizontalAlignment(SwingConstants.CENTER);
				commenttxt.setForeground(new Color(255, 51, 0));
				commenttxt.setFont(new Font("Arial", Font.BOLD, 20));
				commenttxt.setEditable(false);
				commenttxt.setColumns(10);
				commenttxt.setBackground(new Color(51, 51, 51));
				commenttxt.setBounds(62, 295, 312, 69);
				contentPane.add(commenttxt);
				
				
				//call the score for java
				double score = OSquiz.ch2_OS.scores;
				int whole_score = (int) score ;
				
				String final_score = Integer.toString(whole_score);
				
				scoretxt.setText(final_score + " out of 15");
				//to get the percentage
				double accuracy = ((score/15)*100);
				DecimalFormat df = new DecimalFormat("#.#");
				//for rating
				if (whole_score>=13) {
					commenttxt.setText("Excellent!");
					
				} else if(whole_score<=12 && whole_score>=9){
					commenttxt.setText("Keep up the good work!");
				}
				else if(whole_score<=8 && whole_score>=6){
					commenttxt.setText("You have to study more..");
				}
				else {
					commenttxt.setFont(new Font("Arial", Font.BOLD, 17));
					commenttxt.setText("It's okay...Study more,\nyou can do it!");
				}
				accuracytxt = new JTextField();
				accuracytxt.setBorder(null);
				accuracytxt.setEditable(false);
				accuracytxt.setHorizontalAlignment(SwingConstants.CENTER);
				accuracytxt.setForeground(new Color(255, 51, 0));
				accuracytxt.setFont(new Font("Arial", Font.BOLD, 40));
				accuracytxt.setColumns(10);
				accuracytxt.setBackground(new Color(51, 51, 51));
				accuracytxt.setBounds(62, 178, 312, 69);
				String accuracytext = df.format(accuracy);
				accuracytxt.setText(accuracytext + "%");
				contentPane.add(accuracytxt);
				
				JButton btnbckmenu = new JButton("");
				btnbckmenu.setBorder(null);
				btnbckmenu.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						Home fhome = new Home();
						setVisible(false);
						fhome.setVisible(true);
						Home.clip.setFramePosition(0);
						Home.clip.start();
					}
				});
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
				btnbckmenu.setBounds(94, 483, 256, 60);
				contentPane.add(btnbckmenu);
				
				JButton btnexit = new JButton("");
				btnexit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
				btnexit.setBorder(null);
				btnexit.setBounds(94, 591, 256, 60);
				contentPane.add(btnexit);
				
				JLabel bglabel = new JLabel();
				bglabel.setOpaque(true);
				bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
				bglabel.setBounds(0, 0, 450, 730);
				contentPane.add(bglabel);
		}
	}
	 class Result_ch3OS extends JFrame {

			private JPanel contentPane;
			private JTextField txtYouGot;
			private JTextField accuracytxt;
			private JTextField txtScore;
			private JTextField scoretxt;
			private JTextField commenttxt;
			
			/**
			 * Create the frame.
			 */
			public Result_ch3OS() {
				// Set the icon image of the frame
		        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
				setUndecorated(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 730);
				setLocationRelativeTo(null);
				setResizable(false);
				contentPane = new JPanel();
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setVisible(true);
				
				txtYouGot = new JTextField();
				txtYouGot.setBorder(null);
				txtYouGot.setEditable(false);
				txtYouGot.setFont(new Font("Arial", Font.BOLD, 40));
				txtYouGot.setForeground(new Color(255, 51, 0));
				txtYouGot.setHorizontalAlignment(SwingConstants.CENTER);
				txtYouGot.setText("YOU GOT");
				txtYouGot.setBackground(new Color(51, 51, 51));
				txtYouGot.setBounds(62, 111, 312, 69);
				contentPane.add(txtYouGot);
				txtYouGot.setColumns(10);
				
				txtScore = new JTextField();
				txtScore.setText("SCORE:");
				txtScore.setBorder(null);
				txtScore.setEditable(false);
				txtScore.setHorizontalAlignment(SwingConstants.CENTER);
				txtScore.setForeground(new Color(255, 51, 0));
				txtScore.setFont(new Font("Arial", Font.BOLD, 30));
				txtScore.setColumns(10);
				txtScore.setBackground(new Color(51, 51, 51));
				txtScore.setBounds(62, 245, 141, 53);
				contentPane.add(txtScore);
				
				scoretxt = new JTextField();
				scoretxt.setBorder(null);
				scoretxt.setEditable(false);
				scoretxt.setHorizontalAlignment(SwingConstants.CENTER);
				scoretxt.setForeground(new Color(255, 51, 0));
				scoretxt.setFont(new Font("Arial", Font.BOLD, 30));
				scoretxt.setColumns(10);
				scoretxt.setBackground(new Color(51, 51, 51));
				scoretxt.setBounds(198, 245, 176, 53);
				contentPane.add(scoretxt);
				
				commenttxt = new JTextField();
				commenttxt.setBorder(null);
				commenttxt.setHorizontalAlignment(SwingConstants.CENTER);
				commenttxt.setForeground(new Color(255, 51, 0));
				commenttxt.setFont(new Font("Arial", Font.BOLD, 20));
				commenttxt.setEditable(false);
				commenttxt.setColumns(10);
				commenttxt.setBackground(new Color(51, 51, 51));
				commenttxt.setBounds(62, 295, 312, 69);
				contentPane.add(commenttxt);
				
				
				//call the score for java
				double score = OSquiz.ch3_OS.scores;
				int whole_score = (int) score ;
				
				String final_score = Integer.toString(whole_score);
				
				scoretxt.setText(final_score + " out of 10");
				//to get the percentage
				double accuracy = ((score/10)*100);
				DecimalFormat df = new DecimalFormat("#.#");
				//for rating
				if (whole_score>=8) {
					commenttxt.setText("Excellent!");
					
				} else if(whole_score<=7 && whole_score>=6){
					commenttxt.setText("Keep up the good work!");
				}
				else if(whole_score<=5 && whole_score>=3){
					commenttxt.setText("You have to study more..");
				}
				else {
					commenttxt.setFont(new Font("Arial", Font.BOLD, 17));
					commenttxt.setText("It's okay...Study more,\nyou can do it!");
				} 
				accuracytxt = new JTextField();
				accuracytxt.setBorder(null);
				accuracytxt.setEditable(false);
				accuracytxt.setHorizontalAlignment(SwingConstants.CENTER);
				accuracytxt.setForeground(new Color(255, 51, 0));
				accuracytxt.setFont(new Font("Arial", Font.BOLD, 40));
				accuracytxt.setColumns(10);
				accuracytxt.setBackground(new Color(51, 51, 51));
				accuracytxt.setBounds(62, 178, 312, 69);
				String accuracytext = df.format(accuracy);
				accuracytxt.setText(accuracytext + "%");
				contentPane.add(accuracytxt);
				
				JButton btnbckmenu = new JButton("");
				btnbckmenu.setBorder(null);
				btnbckmenu.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						Home fhome = new Home();
						setVisible(false);
						fhome.setVisible(true);
						Home.clip.setFramePosition(0);
						Home.clip.start();
					}
				});
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
				btnbckmenu.setBounds(94, 483, 256, 60);
				contentPane.add(btnbckmenu);
				
				JButton btnexit = new JButton("");
				btnexit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
				btnexit.setBorder(null);
				btnexit.setBounds(94, 591, 256, 60);
				contentPane.add(btnexit);
				
				JLabel bglabel = new JLabel();
				bglabel.setOpaque(true);
				bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
				bglabel.setBounds(0, 0, 450, 730);
				contentPane.add(bglabel);
			}
		}
	 class Result_ch4OS extends JFrame {

			private JPanel contentPane;
			private JTextField txtYouGot;
			private JTextField accuracytxt;
			private JTextField txtScore;
			private JTextField scoretxt;
			private JTextField commenttxt;
			
			/**
			 * Create the frame.
			 */
			public Result_ch4OS() {
				// Set the icon image of the frame
		        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
				setUndecorated(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 730);
				setLocationRelativeTo(null);
				setResizable(false);
				contentPane = new JPanel();
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setVisible(true);
				
				txtYouGot = new JTextField();
				txtYouGot.setBorder(null);
				txtYouGot.setEditable(false);
				txtYouGot.setFont(new Font("Arial", Font.BOLD, 40));
				txtYouGot.setForeground(new Color(255, 51, 0));
				txtYouGot.setHorizontalAlignment(SwingConstants.CENTER);
				txtYouGot.setText("YOU GOT");
				txtYouGot.setBackground(new Color(51, 51, 51));
				txtYouGot.setBounds(62, 111, 312, 69);
				contentPane.add(txtYouGot);
				txtYouGot.setColumns(10);
				
				txtScore = new JTextField();
				txtScore.setText("SCORE:");
				txtScore.setBorder(null);
				txtScore.setEditable(false);
				txtScore.setHorizontalAlignment(SwingConstants.CENTER);
				txtScore.setForeground(new Color(255, 51, 0));
				txtScore.setFont(new Font("Arial", Font.BOLD, 30));
				txtScore.setColumns(10);
				txtScore.setBackground(new Color(51, 51, 51));
				txtScore.setBounds(62, 245, 141, 53);
				contentPane.add(txtScore);
				
				scoretxt = new JTextField();
				scoretxt.setBorder(null);
				scoretxt.setEditable(false);
				scoretxt.setHorizontalAlignment(SwingConstants.CENTER);
				scoretxt.setForeground(new Color(255, 51, 0));
				scoretxt.setFont(new Font("Arial", Font.BOLD, 30));
				scoretxt.setColumns(10);
				scoretxt.setBackground(new Color(51, 51, 51));
				scoretxt.setBounds(198, 245, 176, 53);
				contentPane.add(scoretxt);
				
				commenttxt = new JTextField();
				commenttxt.setBorder(null);
				commenttxt.setHorizontalAlignment(SwingConstants.CENTER);
				commenttxt.setForeground(new Color(255, 51, 0));
				commenttxt.setFont(new Font("Arial", Font.BOLD, 20));
				commenttxt.setEditable(false);
				commenttxt.setColumns(10);
				commenttxt.setBackground(new Color(51, 51, 51));
				commenttxt.setBounds(62, 295, 312, 69);
				contentPane.add(commenttxt);
				
				
				//call the score for java
				double score = OSquiz.ch4_OS.scores;
				int whole_score = (int) score ;
				
				String final_score = Integer.toString(whole_score);
				
				scoretxt.setText(final_score + " out of 10");
				//to get the percentage
				double accuracy = ((score/10)*100);
				DecimalFormat df = new DecimalFormat("#.#");
				//for rating
				if (whole_score>=8) {
					commenttxt.setText("Excellent!");
					
				} else if(whole_score<=7 && whole_score>=6){
					commenttxt.setText("Keep up the good work!");
				}
				else if(whole_score<=5 && whole_score>=3){
					commenttxt.setText("You have to study more..");
				}
				else {
					commenttxt.setFont(new Font("Arial", Font.BOLD, 17));
					commenttxt.setText("It's okay...Study more,\nyou can do it!");
				} 
				accuracytxt = new JTextField();
				accuracytxt.setBorder(null);
				accuracytxt.setEditable(false);
				accuracytxt.setHorizontalAlignment(SwingConstants.CENTER);
				accuracytxt.setForeground(new Color(255, 51, 0));
				accuracytxt.setFont(new Font("Arial", Font.BOLD, 40));
				accuracytxt.setColumns(10);
				accuracytxt.setBackground(new Color(51, 51, 51));
				accuracytxt.setBounds(62, 178, 312, 69);
				String accuracytext = df.format(accuracy);
				accuracytxt.setText(accuracytext + "%");
				contentPane.add(accuracytxt);
				
				JButton btnbckmenu = new JButton("");
				btnbckmenu.setBorder(null);
				btnbckmenu.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						Home fhome = new Home();
						setVisible(false);
						fhome.setVisible(true);
						Home.clip.setFramePosition(0);
						Home.clip.start();
					}
				});
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
				btnbckmenu.setBounds(94, 483, 256, 60);
				contentPane.add(btnbckmenu);
				
				JButton btnexit = new JButton("");
				btnexit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
				btnexit.setBorder(null);
				btnexit.setBounds(94, 591, 256, 60);
				contentPane.add(btnexit);
				
				JLabel bglabel = new JLabel();
				bglabel.setOpaque(true);
				bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
				bglabel.setBounds(0, 0, 450, 730);
				contentPane.add(bglabel);
			}
		}
	 class Result_ch5OS extends JFrame {

			private JPanel contentPane;
			private JTextField txtYouGot;
			private JTextField accuracytxt;
			private JTextField txtScore;
			private JTextField scoretxt;
			private JTextField commenttxt;
			
			/**
			 * Create the frame.
			 */
			public Result_ch5OS() {
				// Set the icon image of the frame
		        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
				setUndecorated(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 730);
				setLocationRelativeTo(null);
				setResizable(false);
				contentPane = new JPanel();
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setVisible(true);
				
				txtYouGot = new JTextField();
				txtYouGot.setBorder(null);
				txtYouGot.setEditable(false);
				txtYouGot.setFont(new Font("Arial", Font.BOLD, 40));
				txtYouGot.setForeground(new Color(255, 51, 0));
				txtYouGot.setHorizontalAlignment(SwingConstants.CENTER);
				txtYouGot.setText("YOU GOT");
				txtYouGot.setBackground(new Color(51, 51, 51));
				txtYouGot.setBounds(62, 111, 312, 69);
				contentPane.add(txtYouGot);
				txtYouGot.setColumns(10);
				
				txtScore = new JTextField();
				txtScore.setText("SCORE:");
				txtScore.setBorder(null);
				txtScore.setEditable(false);
				txtScore.setHorizontalAlignment(SwingConstants.CENTER);
				txtScore.setForeground(new Color(255, 51, 0));
				txtScore.setFont(new Font("Arial", Font.BOLD, 30));
				txtScore.setColumns(10);
				txtScore.setBackground(new Color(51, 51, 51));
				txtScore.setBounds(62, 245, 141, 53);
				contentPane.add(txtScore);
				
				scoretxt = new JTextField();
				scoretxt.setBorder(null);
				scoretxt.setEditable(false);
				scoretxt.setHorizontalAlignment(SwingConstants.CENTER);
				scoretxt.setForeground(new Color(255, 51, 0));
				scoretxt.setFont(new Font("Arial", Font.BOLD, 30));
				scoretxt.setColumns(10);
				scoretxt.setBackground(new Color(51, 51, 51));
				scoretxt.setBounds(198, 245, 176, 53);
				contentPane.add(scoretxt);
				
				commenttxt = new JTextField();
				commenttxt.setBorder(null);
				commenttxt.setHorizontalAlignment(SwingConstants.CENTER);
				commenttxt.setForeground(new Color(255, 51, 0));
				commenttxt.setFont(new Font("Arial", Font.BOLD, 20));
				commenttxt.setEditable(false);
				commenttxt.setColumns(10);
				commenttxt.setBackground(new Color(51, 51, 51));
				commenttxt.setBounds(62, 295, 312, 69);
				contentPane.add(commenttxt);
				
				
				//call the score for java
				double score = OSquiz.ch5_OS.scores;
				int whole_score = (int) score ;
				
				String final_score = Integer.toString(whole_score);
				
				scoretxt.setText(final_score + " out of 10");
				//to get the percentage
				double accuracy = ((score/10)*100);
				DecimalFormat df = new DecimalFormat("#.#");
				//for rating
				if (whole_score>=8) {
					commenttxt.setText("Excellent!");
					
				} else if(whole_score<=7 && whole_score>=6){
					commenttxt.setText("Keep up the good work!");
				}
				else if(whole_score<=5 && whole_score>=3){
					commenttxt.setText("You have to study more..");
				}
				else {
					commenttxt.setFont(new Font("Arial", Font.BOLD, 17));
					commenttxt.setText("It's okay...Study more,\nyou can do it!");
				} 
				accuracytxt = new JTextField();
				accuracytxt.setBorder(null);
				accuracytxt.setEditable(false);
				accuracytxt.setHorizontalAlignment(SwingConstants.CENTER);
				accuracytxt.setForeground(new Color(255, 51, 0));
				accuracytxt.setFont(new Font("Arial", Font.BOLD, 40));
				accuracytxt.setColumns(10);
				accuracytxt.setBackground(new Color(51, 51, 51));
				accuracytxt.setBounds(62, 178, 312, 69);
				String accuracytext = df.format(accuracy);
				accuracytxt.setText(accuracytext + "%");
				contentPane.add(accuracytxt);
				
				JButton btnbckmenu = new JButton("");
				btnbckmenu.setBorder(null);
				btnbckmenu.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						Home fhome = new Home();
						setVisible(false);
						fhome.setVisible(true);
						Home.clip.setFramePosition(0);
						Home.clip.start();
					}
				});
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
				btnbckmenu.setBounds(94, 483, 256, 60);
				contentPane.add(btnbckmenu);
				
				JButton btnexit = new JButton("");
				btnexit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
				btnexit.setBorder(null);
				btnexit.setBounds(94, 591, 256, 60);
				contentPane.add(btnexit);
				
				JLabel bglabel = new JLabel();
				bglabel.setOpaque(true);
				bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
				bglabel.setBounds(0, 0, 450, 730);
				contentPane.add(bglabel);
			}
		}
	 class Result_ch6OS extends JFrame {

			private JPanel contentPane;
			private JTextField txtYouGot;
			private JTextField accuracytxt;
			private JTextField txtScore;
			private JTextField scoretxt;
			private JTextField commenttxt;
			
			/**
			 * Create the frame.
			 */
			public Result_ch6OS() {
				// Set the icon image of the frame
		        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
				setUndecorated(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 730);
				setLocationRelativeTo(null);
				setResizable(false);
				contentPane = new JPanel();
				setContentPane(contentPane);
				contentPane.setLayout(null);
				setVisible(true);
				
				txtYouGot = new JTextField();
				txtYouGot.setBorder(null);
				txtYouGot.setEditable(false);
				txtYouGot.setFont(new Font("Arial", Font.BOLD, 40));
				txtYouGot.setForeground(new Color(255, 51, 0));
				txtYouGot.setHorizontalAlignment(SwingConstants.CENTER);
				txtYouGot.setText("YOU GOT");
				txtYouGot.setBackground(new Color(51, 51, 51));
				txtYouGot.setBounds(62, 111, 312, 69);
				contentPane.add(txtYouGot);
				txtYouGot.setColumns(10);
				
				txtScore = new JTextField();
				txtScore.setText("SCORE:");
				txtScore.setBorder(null);
				txtScore.setEditable(false);
				txtScore.setHorizontalAlignment(SwingConstants.CENTER);
				txtScore.setForeground(new Color(255, 51, 0));
				txtScore.setFont(new Font("Arial", Font.BOLD, 30));
				txtScore.setColumns(10);
				txtScore.setBackground(new Color(51, 51, 51));
				txtScore.setBounds(62, 245, 141, 53);
				contentPane.add(txtScore);
				
				scoretxt = new JTextField();
				scoretxt.setBorder(null);
				scoretxt.setEditable(false);
				scoretxt.setHorizontalAlignment(SwingConstants.CENTER);
				scoretxt.setForeground(new Color(255, 51, 0));
				scoretxt.setFont(new Font("Arial", Font.BOLD, 30));
				scoretxt.setColumns(10);
				scoretxt.setBackground(new Color(51, 51, 51));
				scoretxt.setBounds(198, 245, 176, 53);
				contentPane.add(scoretxt);
				
				commenttxt = new JTextField();
				commenttxt.setBorder(null);
				commenttxt.setHorizontalAlignment(SwingConstants.CENTER);
				commenttxt.setForeground(new Color(255, 51, 0));
				commenttxt.setFont(new Font("Arial", Font.BOLD, 20));
				commenttxt.setEditable(false);
				commenttxt.setColumns(10);
				commenttxt.setBackground(new Color(51, 51, 51));
				commenttxt.setBounds(62, 295, 312, 69);
				contentPane.add(commenttxt);
				
				
				//call the score for java
				double score = OSquiz.ch6_OS.scores;
				int whole_score = (int) score ;
				
				String final_score = Integer.toString(whole_score);
				
				scoretxt.setText(final_score + " out of 10");
				//to get the percentage
				double accuracy = ((score/10)*100);
				DecimalFormat df = new DecimalFormat("#.#");
				//for rating
				if (whole_score>=8) {
					commenttxt.setText("Excellent!");
					
				} else if(whole_score<=7 && whole_score>=6){
					commenttxt.setText("Keep up the good work!");
				}
				else if(whole_score<=5 && whole_score>=3){
					commenttxt.setText("You have to study more..");
				}
				else {
					commenttxt.setFont(new Font("Arial", Font.BOLD, 17));
					commenttxt.setText("It's okay...Study more,\nyou can do it!");
				} 
				accuracytxt = new JTextField();
				accuracytxt.setBorder(null);
				accuracytxt.setEditable(false);
				accuracytxt.setHorizontalAlignment(SwingConstants.CENTER);
				accuracytxt.setForeground(new Color(255, 51, 0));
				accuracytxt.setFont(new Font("Arial", Font.BOLD, 40));
				accuracytxt.setColumns(10);
				accuracytxt.setBackground(new Color(51, 51, 51));
				accuracytxt.setBounds(62, 178, 312, 69);
				String accuracytext = df.format(accuracy);
				accuracytxt.setText(accuracytext + "%");
				contentPane.add(accuracytxt);
				
				JButton btnbckmenu = new JButton("");
				btnbckmenu.setBorder(null);
				btnbckmenu.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenuhover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						Home fhome = new Home();
						setVisible(false);
						fhome.setVisible(true);
						Home.clip.setFramePosition(0);
						Home.clip.start();
					}
				});
				btnbckmenu.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bcktomenu.png")));
				btnbckmenu.setBounds(94, 483, 256, 60);
				contentPane.add(btnbckmenu);
				
				JButton btnexit = new JButton("");
				btnexit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/exthover.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				btnexit.setIcon(new ImageIcon(Result_OS.class.getResource("/images/ext.png")));
				btnexit.setBorder(null);
				btnexit.setBounds(94, 591, 256, 60);
				contentPane.add(btnexit);
				
				JLabel bglabel = new JLabel();
				bglabel.setOpaque(true);
				bglabel.setIcon(new ImageIcon(Result_OS.class.getResource("/images/bg.png")));
				bglabel.setBounds(0, 0, 450, 730);
				contentPane.add(bglabel);
			}
		}
}
