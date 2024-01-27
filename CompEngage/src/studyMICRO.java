import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class studyMICRO extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		studyMICRO frame = new studyMICRO();
		frame.setVisible(true);	
	}

	/**
	 * Create the frame.
	 */
	public studyMICRO() {
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
		chapterlabel.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/ch.png")));
		chapterlabel.setBounds(0, 145, 450, 74);
		contentPane.add(chapterlabel);
		
		JButton ch1btn = new JButton("");
		ch1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch1MICROstudy fCh1SDstudy =  new ch1MICROstudy();
				setVisible(false);
				fCh1SDstudy.setVisible(true);
				
			}
		});
		ch1btn.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/OSch1.png")));
		ch1btn.setBounds(0, 295, 450, 61);
		contentPane.add(ch1btn);
		
		JButton ch2btn = new JButton("");
		ch2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch2MICROstudy fCh2SDstudy =  new ch2MICROstudy();
				setVisible(false);
				fCh2SDstudy.setVisible(true);
			}
		});
		ch2btn.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/MICROch2.png")));
		ch2btn.setBounds(0, 360, 450, 61);
		contentPane.add(ch2btn);
		
		JButton ch3btn = new JButton("");
		ch3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch3MICROstudy fCh3SDstudy =  new ch3MICROstudy();
				setVisible(false);
				fCh3SDstudy.setVisible(true);
			}
		});
		ch3btn.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/MICROch3.png")));
		ch3btn.setBounds(0, 426, 450, 61);
		contentPane.add(ch3btn);
		
		JButton ch4btn = new JButton("");
		ch4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch4MICROstudy fCh4SDstudy =  new ch4MICROstudy();
				setVisible(false);
				fCh4SDstudy.setVisible(true);
			}
		});
		ch4btn.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/MICROch4.png")));
		ch4btn.setBounds(0, 491, 450, 61);
		contentPane.add(ch4btn);
		
		JButton ch5btn = new JButton("");
		ch5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch5MICROstudy fCh5SDstudy =  new ch5MICROstudy();
				setVisible(false);
				fCh5SDstudy.setVisible(true);
			}
		});
		ch5btn.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/MICROch5.png")));
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
		ch6btn.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/MICROch6.png")));
		ch6btn.setBounds(0, 622, 450, 61);
		contentPane.add(ch6btn);
		
		JLabel studyMICROlabel = new JLabel("");
		studyMICROlabel.setIcon(new ImageIcon(studyMICRO.class.getResource("/images/bg.png")));
		studyMICROlabel.setBounds(0, 0, 450, 730);
		contentPane.add(studyMICROlabel);
	}

	public class ch1MICROstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch1MICROstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch1MICROstudy.class.getResource("/images/OSch1.png")));
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
					studyMICRO fstudyMICRO = new studyMICRO();
					setVisible(false);
					fstudyMICRO.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch1MICRO.txt"));
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
	public class ch2MICROstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch2MICROstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch2MICROstudy.class.getResource("/images/MICROch2.png")));
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
					studyMICRO fstudyMICRO = new studyMICRO();
					setVisible(false);
					fstudyMICRO.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch2MICRO.txt"));
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
	
	public class ch3MICROstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch3MICROstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch3MICROstudy.class.getResource("/images/MICROch3.png")));
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
					studyMICRO fstudyMICRO = new studyMICRO();
					setVisible(false);
					fstudyMICRO.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch3MICRO.txt"));
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
	
	public class ch4MICROstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch4MICROstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch4MICROstudy.class.getResource("/images/MICROch4.png")));
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
					studyMICRO fstudyMICRO = new studyMICRO();
					setVisible(false);
					fstudyMICRO.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch4MICRO.txt"));
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
	public class ch5MICROstudy extends JFrame {

		private JPanel contentPane;

		/**
		 * Create the frame.
		 */
		public ch5MICROstudy() {
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
			chapterlabel.setIcon(new ImageIcon(ch5MICROstudy.class.getResource("/images/MICROch5.png")));
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
					studyMICRO fstudyMICRO = new studyMICRO();
					setVisible(false);
					fstudyMICRO.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch5MICRO.txt"));
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
			chapterlabel.setIcon(new ImageIcon(ch6SDstudy.class.getResource("/images/MICROch6.png")));
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
					studyMICRO fstudyMICRO = new studyMICRO();
					setVisible(false);
					fstudyMICRO.setVisible(true);
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
	            BufferedReader reader = new BufferedReader(new FileReader("studyfiles/ch6MICRO.txt"));
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

