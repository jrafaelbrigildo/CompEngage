import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class studySD extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		studySD frame = new studySD();
		frame.setVisible(true);	
	}

	/**
	 * Create the frame.
	 */
	public studySD() {
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
		
		JButton backbtn = new JButton("");
		backbtn.setOpaque(false);
		backbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				study fStudy = new study();
				setVisible(false);
				fStudy.setVisible(true);
			}
		});
		backbtn.setBackground(Color.WHITE);
		backbtn.setBorder(null);
		backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
		backbtn.setBounds(10, 11, 78, 74);
		contentPane.add(backbtn);
		
		JLabel chapterlabel = new JLabel("");
		chapterlabel.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch.png")));
		chapterlabel.setBounds(0, 145, 450, 74);
		contentPane.add(chapterlabel);
		
		JButton ch1btn = new JButton("");
		ch1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch1SDstudy fCh1SDstudy =  new ch1SDstudy();
				setVisible(false);
				fCh1SDstudy.setVisible(true);
				
			}
		});
		ch1btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch1.png")));
		ch1btn.setBounds(0, 295, 450, 61);
		contentPane.add(ch1btn);
		
		JButton ch2btn = new JButton("");
		ch2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch2SDstudy fCh2SDstudy =  new ch2SDstudy();
				setVisible(false);
				fCh2SDstudy.setVisible(true);
			}
		});
		ch2btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch2.png")));
		ch2btn.setBounds(0, 360, 450, 61);
		contentPane.add(ch2btn);
		
		JButton ch3btn = new JButton("");
		ch3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch3SDstudy fCh3SDstudy =  new ch3SDstudy();
				setVisible(false);
				fCh3SDstudy.setVisible(true);
			}
		});
		ch3btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch3.png")));
		ch3btn.setBounds(0, 426, 450, 61);
		contentPane.add(ch3btn);
		
		JButton ch4btn = new JButton("");
		ch4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch4SDstudy fCh4SDstudy =  new ch4SDstudy();
				setVisible(false);
				fCh4SDstudy.setVisible(true);
			}
		});
		ch4btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch4.png")));
		ch4btn.setBounds(0, 491, 450, 61);
		contentPane.add(ch4btn);
		
		JButton ch5btn = new JButton("");
		ch5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch5SDstudy fCh5SDstudy =  new ch5SDstudy();
				setVisible(false);
				fCh5SDstudy.setVisible(true);
			}
		});
		ch5btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch5.png")));
		ch5btn.setBounds(0, 557, 450, 61);
		contentPane.add(ch5btn);
		
		JButton ch6btn = new JButton("");
		ch6btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch6SDstudy fCh6SDstudy =  new ch6SDstudy();
				setVisible(false);
				fCh6SDstudy.setVisible(true);
			}
		});
		ch6btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch6.png")));
		ch6btn.setBounds(0, 622, 450, 61);
		contentPane.add(ch6btn);
		
		JLabel SDquizlabel = new JLabel("");
		SDquizlabel.setIcon(new ImageIcon(SDquiz.class.getResource("/images/bg.png")));
		SDquizlabel.setBounds(0, 0, 450, 730);
		contentPane.add(SDquizlabel);
	}

	public class ch1SDstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch1SDstudy() {
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
			
			JLabel chapterlabel = new JLabel("");
			chapterlabel.setIcon(new ImageIcon(ch1SDstudy.class.getResource("/images/ch1.png")));
			chapterlabel.setBounds(0, 145, 450, 74);
			contentPane.add(chapterlabel);
			
			JButton backbtn = new JButton("");
			backbtn.setOpaque(false);
			backbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					studySD fstudySD = new studySD();
					setVisible(false);
					fstudySD.setVisible(true);
				}
			});
			backbtn.setBackground(Color.WHITE);
			backbtn.setBorder(null);
			backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			backbtn.setBounds(10, 11, 78, 74);
			contentPane.add(backbtn);
			
			TextArea textArea = new TextArea();
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setFont(new Font("Arial", Font.PLAIN, 13));
			textArea.setBackground(new Color(255, 255, 255));
			textArea.setBounds(10, 227, 430, 492);
			textArea.setEditable(false);
			
			contentPane.add(textArea);
			
			//to display the text from the text file to the text area
			try {
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch1SD.txt"));
	            String line;
	            StringBuilder sb = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                int lineLength = 0;

	                for (String word : words) {
	                    if (lineLength + word.length() > 80) {
	                        sb.append("\n");
	                        lineLength = 0;
	                    }

	                    sb.append(word).append(" ");
	                    lineLength += word.length() + 1;
	                }

	                sb.append("\n");
	            }

	            reader.close();
	            textArea.setText(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
		
	}
	public class ch2SDstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch2SDstudy() {
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
			
			JLabel chapterlabel = new JLabel("");
			chapterlabel.setIcon(new ImageIcon(ch2SDstudy.class.getResource("/images/ch2.png")));
			chapterlabel.setBounds(0, 145, 450, 74);
			contentPane.add(chapterlabel);
			
			JButton backbtn = new JButton("");
			backbtn.setOpaque(false);
			backbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					studySD fstudySD = new studySD();
					setVisible(false);
					fstudySD.setVisible(true);
				}
			});
			backbtn.setBackground(Color.WHITE);
			backbtn.setBorder(null);
			backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			backbtn.setBounds(10, 11, 78, 74);
			contentPane.add(backbtn);
			
			TextArea textArea = new TextArea();
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setFont(new Font("Arial", Font.PLAIN, 13));
			textArea.setBackground(new Color(255, 255, 255));
			textArea.setBounds(10, 227, 430, 492);
			textArea.setEditable(false);
			
			contentPane.add(textArea);
			//to display the text from the text file to the text area
			try {
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch2SD.txt"));
	            String line;
	            StringBuilder sb = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                int lineLength = 0;

	                for (String word : words) {
	                    if (lineLength + word.length() > 80) {
	                        sb.append("\n");
	                        lineLength = 0;
	                    }

	                    sb.append(word).append(" ");
	                    lineLength += word.length() + 1;
	                }

	                sb.append("\n");
	            }

	            reader.close();
	            textArea.setText(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	     }

			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
	}
	
	public class ch3SDstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch3SDstudy() {
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
			
			JLabel chapterlabel = new JLabel("");
			chapterlabel.setIcon(new ImageIcon(ch3SDstudy.class.getResource("/images/ch3.png")));
			chapterlabel.setBounds(0, 145, 450, 74);
			contentPane.add(chapterlabel);
			
			JButton backbtn = new JButton("");
			backbtn.setOpaque(false);
			backbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					studySD fstudySD = new studySD();
					setVisible(false);
					fstudySD.setVisible(true);
				}
			});
			backbtn.setBackground(Color.WHITE);
			backbtn.setBorder(null);
			backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			backbtn.setBounds(10, 11, 78, 74);
			contentPane.add(backbtn);
			
			TextArea textArea = new TextArea();
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setFont(new Font("Arial", Font.PLAIN, 13));
			textArea.setBackground(new Color(255, 255, 255));
			textArea.setBounds(10, 227, 430, 492);
			textArea.setEditable(false);
			
			contentPane.add(textArea);
			//to display the text from the text file to the text area
			try {
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch3SD.txt"));
	            String line;
	            StringBuilder sb = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                int lineLength = 0;

	                for (String word : words) {
	                    if (lineLength + word.length() > 80) {
	                        sb.append("\n");
	                        lineLength = 0;
	                    }

	                    sb.append(word).append(" ");
	                    lineLength += word.length() + 1;
	                }

	                sb.append("\n");
	            }

	            reader.close();
	            textArea.setText(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
	}
	
	public class ch4SDstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch4SDstudy() {
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
			
			JLabel chapterlabel = new JLabel("");
			chapterlabel.setIcon(new ImageIcon(ch4SDstudy.class.getResource("/images/ch4.png")));
			chapterlabel.setBounds(0, 145, 450, 74);
			contentPane.add(chapterlabel);
			
			JButton backbtn = new JButton("");
			backbtn.setOpaque(false);
			backbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					studySD fstudySD = new studySD();
					setVisible(false);
					fstudySD.setVisible(true);
				}
			});
			backbtn.setBackground(Color.WHITE);
			backbtn.setBorder(null);
			backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			backbtn.setBounds(10, 11, 78, 74);
			contentPane.add(backbtn);
			
			TextArea textArea = new TextArea();
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setFont(new Font("Arial", Font.PLAIN, 13));
			textArea.setBackground(new Color(255, 255, 255));
			textArea.setBounds(10, 227, 430, 492);
			textArea.setEditable(false);
			
			contentPane.add(textArea);
			//to display the text from the text file to the text area
			try {
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch4SD.txt"));
	            String line;
	            StringBuilder sb = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                int lineLength = 0;

	                for (String word : words) {
	                    if (lineLength + word.length() > 80) {
	                        sb.append("\n");
	                        lineLength = 0;
	                    }

	                    sb.append(word).append(" ");
	                    lineLength += word.length() + 1;
	                }

	                sb.append("\n");
	            }

	            reader.close();
	            textArea.setText(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
	}
	public class ch5SDstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch5SDstudy() {
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
			
			JLabel chapterlabel = new JLabel("");
			chapterlabel.setIcon(new ImageIcon(ch5SDstudy.class.getResource("/images/ch5.png")));
			chapterlabel.setBounds(0, 145, 450, 74);
			contentPane.add(chapterlabel);
			
			JButton backbtn = new JButton("");
			backbtn.setOpaque(false);
			backbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					studySD fstudySD = new studySD();
					setVisible(false);
					fstudySD.setVisible(true);
				}
			});
			backbtn.setBackground(Color.WHITE);
			backbtn.setBorder(null);
			backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			backbtn.setBounds(10, 11, 78, 74);
			contentPane.add(backbtn);
			
			TextArea textArea = new TextArea();
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setFont(new Font("Arial", Font.PLAIN, 13));
			textArea.setBackground(new Color(255, 255, 255));
			textArea.setBounds(10, 227, 430, 492);
			textArea.setEditable(false);
			
			contentPane.add(textArea);
			//to display the text from the text file to the text area
			try {
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch5SD.txt"));
	            String line;
	            StringBuilder sb = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                int lineLength = 0;

	                for (String word : words) {
	                    if (lineLength + word.length() > 80) {
	                        sb.append("\n");
	                        lineLength = 0;
	                    }

	                    sb.append(word).append(" ");
	                    lineLength += word.length() + 1;
	                }

	                sb.append("\n");
	            }

	            reader.close();
	            textArea.setText(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
	}
	public class ch6SDstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch6SDstudy() {
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
			
			JLabel chapterlabel = new JLabel("");
			chapterlabel.setIcon(new ImageIcon(ch6SDstudy.class.getResource("/images/ch6.png")));
			chapterlabel.setBounds(0, 145, 450, 74);
			contentPane.add(chapterlabel);
			
			JButton backbtn = new JButton("");
			backbtn.setOpaque(false);
			backbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back buttonhover.png")));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					studySD fstudySD = new studySD();
					setVisible(false);
					fstudySD.setVisible(true);
				}
			});
			backbtn.setBackground(Color.WHITE);
			backbtn.setBorder(null);
			backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
			backbtn.setBounds(10, 11, 78, 74);
			contentPane.add(backbtn);
			
			TextArea textArea = new TextArea();
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setFont(new Font("Arial", Font.PLAIN, 13));
			textArea.setBackground(new Color(255, 255, 255));
			textArea.setBounds(10, 227, 430, 492);
			textArea.setEditable(false);
			
			contentPane.add(textArea);
			//to display the text from the text file to the text area
			try {
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch6SD.txt"));
	            String line;
	            StringBuilder sb = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                int lineLength = 0;

	                for (String word : words) {
	                    if (lineLength + word.length() > 80) {
	                        sb.append("\n");
	                        lineLength = 0;
	                    }

	                    sb.append(word).append(" ");
	                    lineLength += word.length() + 1;
	                }

	                sb.append("\n");
	            }

	            reader.close();
	            textArea.setText(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
		}
	}
}
