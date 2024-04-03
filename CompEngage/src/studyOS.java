import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class studyOS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		studyOS frame = new studyOS();
		frame.setVisible(true);	
	}

	/**
	 * Create the frame.
	 */
	public studyOS() {
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
		chapterlabel.setIcon(new ImageIcon(studyOS.class.getResource("/images/ch.png")));
		chapterlabel.setBounds(0, 145, 450, 74);
		contentPane.add(chapterlabel);
		
		JButton ch1btn = new JButton("");
		ch1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch1OSstudy fCh1SDstudy =  new ch1OSstudy();
				setVisible(false);
				fCh1SDstudy.setVisible(true);
				
			}
		});
		ch1btn.setIcon(new ImageIcon(studyOS.class.getResource("/images/OSch1.png")));
		ch1btn.setBounds(0, 295, 450, 61);
		contentPane.add(ch1btn);
		
		JButton ch2btn = new JButton("");
		ch2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch2OSstudy fCh2SDstudy =  new ch2OSstudy();
				setVisible(false);
				fCh2SDstudy.setVisible(true);
			}
		});
		ch2btn.setIcon(new ImageIcon(studyOS.class.getResource("/images/OSch2.png")));
		ch2btn.setBounds(0, 360, 450, 61);
		contentPane.add(ch2btn);
		
		JButton ch3btn = new JButton("");
		ch3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch3OSstudy fCh3SDstudy =  new ch3OSstudy();
				setVisible(false);
				fCh3SDstudy.setVisible(true);
			}
		});
		ch3btn.setIcon(new ImageIcon(studyOS.class.getResource("/images/OSch3.png")));
		ch3btn.setBounds(0, 426, 450, 61);
		contentPane.add(ch3btn);
		
		JButton ch4btn = new JButton("");
		ch4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch4OSstudy fCh4SDstudy =  new ch4OSstudy();
				setVisible(false);
				fCh4SDstudy.setVisible(true);
			}
		});
		ch4btn.setIcon(new ImageIcon(studyOS.class.getResource("/images/OSch4.png")));
		ch4btn.setBounds(0, 491, 450, 61);
		contentPane.add(ch4btn);
		
		JButton ch5btn = new JButton("");
		ch5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch5OSstudy fCh5SDstudy =  new ch5OSstudy();
				setVisible(false);
				fCh5SDstudy.setVisible(true);
			}
		});
		ch5btn.setIcon(new ImageIcon(studyOS.class.getResource("/images/OSch5.png")));
		ch5btn.setBounds(0, 557, 450, 61);
		contentPane.add(ch5btn);
		
		JButton ch6btn = new JButton("");
		ch6btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch6OSstudy fCh6SDstudy =  new ch6OSstudy();
				setVisible(false);
				fCh6SDstudy.setVisible(true);
			}
		});
		ch6btn.setIcon(new ImageIcon(studyOS.class.getResource("/images/OSch6.png")));
		ch6btn.setBounds(0, 622, 450, 61);
		contentPane.add(ch6btn);
		
		JLabel studyOSlabel = new JLabel("");
		studyOSlabel.setIcon(new ImageIcon(studyOS.class.getResource("/images/bg.png")));
		studyOSlabel.setBounds(0, 0, 450, 730);
		contentPane.add(studyOSlabel);
	}

	
	public class ch1OSstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch1OSstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch1OSstudy.class.getResource("/images/OSch1.png")));
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
					studyOS fstudyOS = new studyOS();
					setVisible(false);
					fstudyOS.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch1OS.txt"));
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
	public class ch2OSstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch2OSstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch2OSstudy.class.getResource("/images/OSch2.png")));
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
					studyOS fstudyOS = new studyOS();
					setVisible(false);
					fstudyOS.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch2OS.txt"));
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
	
	public class ch3OSstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch3OSstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch3OSstudy.class.getResource("/images/OSch3.png")));
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
					studyOS fstudyOS = new studyOS();
					setVisible(false);
					fstudyOS.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch3OS.txt"));
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
	
	public class ch4OSstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch4OSstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch4OSstudy.class.getResource("/images/OSch4.png")));
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
					studyOS fstudyOS = new studyOS();
					setVisible(false);
					fstudyOS.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch4OS.txt"));
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
	public class ch5OSstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch5OSstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch5OSstudy.class.getResource("/images/OSch5.png")));
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
					studyOS fstudyOS = new studyOS();
					setVisible(false);
					fstudyOS.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch5OS.txt"));
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
	public class ch6OSstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch6OSstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch6OSstudy.class.getResource("/images/OSch6.png")));
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
					studyOS fstudyOS = new studyOS();
					setVisible(false);
					fstudyOS.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch6OS.txt"));
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
