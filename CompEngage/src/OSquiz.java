import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class OSquiz extends JFrame {

	private JPanel contentPane;
	public static Clip clip1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		OSquiz frame = new OSquiz();
		frame.setVisible(true);	
	}

	/**
	 * Create the frame.
	 */
	public OSquiz() {
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
				quizmenu fquizmenu = new quizmenu();
				setVisible(false);
				fquizmenu.setVisible(true);
			}
		});
		backbtn.setBackground(Color.WHITE);
		backbtn.setBorder(null);
		backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
		backbtn.setBounds(10, 11, 78, 74);
		contentPane.add(backbtn);
		
		JLabel chapterlabel = new JLabel("");
		chapterlabel.setIcon(new ImageIcon(OSquiz.class.getResource("/images/ch.png")));
		chapterlabel.setBounds(0, 145, 450, 74);
		contentPane.add(chapterlabel);
		
		JButton ch1btn = new JButton("");
		ch1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch1_OS fCh1_OS = new ch1_OS();
				setVisible(false);
				fCh1_OS.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch1btn.setIcon(new ImageIcon(OSquiz.class.getResource("/images/OSch1.png")));
		ch1btn.setBounds(0, 295, 450, 61);
		contentPane.add(ch1btn);
		
		JButton ch2btn = new JButton("");
		ch2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch2_OS fCh2_OS = new ch2_OS();
				setVisible(false);
				fCh2_OS.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch2btn.setIcon(new ImageIcon(OSquiz.class.getResource("/images/OSch2.png")));
		ch2btn.setBounds(0, 360, 450, 61);
		contentPane.add(ch2btn);
		
		JButton ch3btn = new JButton("");
		ch3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch3_OS fCh3_OS = new ch3_OS();
				setVisible(false);
				fCh3_OS.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch3btn.setIcon(new ImageIcon(OSquiz.class.getResource("/images/OSch3.png")));
		ch3btn.setBounds(0, 426, 450, 61);
		contentPane.add(ch3btn);
		
		JButton ch4btn = new JButton("");
		ch4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch4_OS fCh4_OS = new ch4_OS();
				setVisible(false);
				fCh4_OS.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch4btn.setIcon(new ImageIcon(OSquiz.class.getResource("/images/OSch4.png")));
		ch4btn.setBounds(0, 491, 450, 61);
		contentPane.add(ch4btn);
		
		JButton ch5btn = new JButton("");
		ch5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch5_OS fCh5_OS = new ch5_OS();
				setVisible(false);
				fCh5_OS.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch5btn.setIcon(new ImageIcon(OSquiz.class.getResource("/images/OSch5.png")));
		ch5btn.setBounds(0, 557, 450, 61);
		contentPane.add(ch5btn);
		
		JButton ch6btn = new JButton("");
		ch6btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch6_OS fCh6_OS = new ch6_OS();
				setVisible(false);
				fCh6_OS.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch6btn.setIcon(new ImageIcon(OSquiz.class.getResource("/images/OSch6.png")));
		ch6btn.setBounds(0, 622, 450, 61);
		contentPane.add(ch6btn);
		
		JLabel OSquizlabel = new JLabel("");
		OSquizlabel.setIcon(new ImageIcon(OSquiz.class.getResource("/images/bg.png")));
		OSquizlabel.setBounds(0, 0, 450, 730);
		contentPane.add(OSquizlabel);
	}
	
	class ch1_OS extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch1questions = {
				{"It request to the OS to allow user to wait for I/O \r\n"
						+ "completion.", 
				"system call", "system application", "system software", "system hardware"},
				{"One or more CPUs, device controllers connect \r\n"
						+ "through common bus providing access to shared \r\n"
						+ "memory.", "Computer-system operation", "Computer-system application",
				  "Computer-system hardware", "Computer-system structure"},
				{"It is available via Internet to anyone willing to \r\n"
						+ "pay.","Public cloud","Local cloud", 
					  "Hybrid cloud", "Private cloud"},
				{"It is used when source CPU type different from target\r\n"
						+ "type (i.e. PowerPC to Intel x86).", "Emulation", "Virtualization", "Cloud Computing", "Embedded system"},
				{"Any mechanism for controlling access of processes \r\n"
						+ "or users to resources defined by the OS.", "Protection", "Security",
					"Firewall", "Privilege escalation"},
				{"It allows user to change to effective ID with more \r\n"
						+ "rights.", "Privilege escalation", "Security", "Firewall", "Protection"},
				{"Is a software generated interrupt caused either by\r\n"
						+ "an error or a user request.", "trap", "error", "polling","vectored"},
				{"It contains entry for each I/O device indicating \r\n"
						+ "its type, address, and state.", "device-status table", "device-state table", "device-type table", "device-address table"},
				{"It has one program counter specifying location of \r\n"
						+ "next instruction to execute.", "Single-threaded process", "Multi-threaded process","Dual-threaded process","Multiplexing"},
				{"Is logical extension in which CPU switches jobs so \r\n"
						+ "frequently that users can interact with each job \r\n"
						+ "while it is running, creating interactive computing.","Timesharing","Multiprogramming","Multiprocessing", "Scheduling"},
				};
		
		public ch1_OS() {
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
			
			JLabel ch1label = new JLabel("");
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/OSch1.png")));
			ch1label.setBounds(0, 116, 450, 64);
			contentPane.add(ch1label);
			
			JLabel quiznolabel = new JLabel("Quiz: 10 items");
			quiznolabel.setForeground(Color.WHITE);
			quiznolabel.setFont(new Font("Arial", Font.BOLD, 18));
			quiznolabel.setBounds(10, 191, 132, 29);
			contentPane.add(quiznolabel);
			
			JLabel lblNewLabel = new JLabel("_____________________________________________");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));
			lblNewLabel.setBounds(10, 202, 440, 29);
			contentPane.add(lblNewLabel);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.setBackground(new Color(0, 0, 0, 0));
			buttonPanel.setBounds(36, 387, 367, 290);
			buttonPanel.setLayout(new GridLayout(4, 1, 6, 15));
			//add buttons
			answerButtons = new RoundButton[4];
			for (int i = 0; i < 4; i++) {
	            answerButtons[i] = new RoundButton();
	            answerButtons[i].setBackground(new Color(51,71,86));
	            answerButtons[i].setBorder(null);
	            answerButtons[i].setForeground(Color.white);
	            buttonPanel.add(answerButtons[i]);
	            answerButtons[i].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    checkAnswer((JButton) e.getSource());
	                }
	            });
	            
	        }
			contentPane.add(buttonPanel);
			questionsTextArea = new JTextArea();
			questionsTextArea.setEditable(false);
			questionsTextArea.setForeground(Color.WHITE);
			questionsTextArea.setFont(new Font("Arial", Font.BOLD, 17));
			questionsTextArea.setOpaque(false);
			questionsTextArea.setBounds(10, 242, 430, 143);
			contentPane.add(questionsTextArea);
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
					currentQuestion = 0;
					scores = 0;
					//assign random
					random_ans = new Random();
					//show questions
			        showQuestion();
		}
		//method to show questions
			void showQuestion() {
				questionsTextArea.setText(ch1questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch1questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//method to randomize choices    
			  void shuffleAnswers(String[] answers) {
		        for (int i = 0; i < answers.length; i++) {
		            int j = random_ans.nextInt(answers.length);
		            String temp = answers[i];
		            answers[i] = answers[j];
		            answers[j] = temp;
		        }
		    }
			// method to check answer
				private void checkAnswer(JButton button) {
			        if (button.getText().equals(ch1questions[currentQuestion][1])) {
			        	currentQuestion++;
			            scores++;
			          //show the result if the user is done on answering
			            if (currentQuestion >= ch1questions.length) {
			            	Result_OS.Result_ch1OS fCh1OS =  new Result_OS().new Result_ch1OS();
			            	setVisible(false);
			            	fCh1OS.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_OS.Result_ch1OS fCh1OS =  new Result_OS().new Result_ch1OS();
		            	setVisible(false);
		            	fCh1OS.setVisible(true);
		            	OSquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch2_OS extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch2questions = {
				{"What type of user interface is most commonly used?", 
				"Graphical user interface", "Command-line interface ", "Batch interface", "Menu-driven interface"},
				{"What is one function that the operating system must \r\n"
						+ "provide for I/O devices?", "A means to do I/O", "Full control of I/O devices",
				  "Open access to I/O devices", "Restrictions on I/O device usage"},
				{"What is one of the functions of an operating system \r\n"
						+ "for systems with multiple users?","Resource allocation","Debugging error codes", 
					  "Running error-causing processes", "Assisting the user with system operation"},
				{"Which of the following is a shell available on UNIX \r\n"
						+ "and Linux?", "C shell", "Golang shell", "Python shell", "JavaScript shell"},
				{"Which type of interface is typically used on \r\n"
						+ "smartphones and handheld tablet computers?", "Touchscreen", "Command-line",
					"Keyboard", "Mouse"},
				{"Which of the following is NOT a category of system \r\n"
						+ "programs?", "Spreadsheets", "Programming language support", "File manipulation", "Background services"},
				{"What system is used to store and retrieve \r\n"
						+ "configuration information?", "Registry", "Database", "Cache","File system"},
				{"What are services or subsystems known as?", "Daemons", "Processes", "Kernels", "Applications"},
				{"Which modern operating system combines multiple \r\n"
						+ "approaches to address performance, security, and \r\n"
						+ "usability needs?", "Hybrid", "Monolithic","Layered","Microkernel"},
				{"What is the highest layer in the UNIX operating \r\n"
						+ "system?","The user","The file system","The kernel", "The system call interface"},
				{"Developed by Open Handset Alliance (mostly Google)", "Android", "iOS", "MAC OS", "Linux"},
				{"Limited by hardware functionality, the original ________\r\n"
						+ "operating system had limited structuring. ", "UNIX", "Android", "iOS","MAC OS"},
				{"Written to provide the most functionality in the least\r\n"
						+ "space.", "MS-DOS", "UNIX", "MACH", "iOS"},
				{"It allow an OS to run on non native hardware.", "Emulation", "Virtualization","Cloud Computing","Traditional"},
				{"Specifying and designing an OS is highly creative task of\r\n"
						+ "___________________. ","software engineer","software manager","project manager", "programmer"}
				};
		
		public ch2_OS() {
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
			
			JLabel ch1label = new JLabel("");
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/OSch2.png")));
			ch1label.setBounds(0, 116, 450, 64);
			contentPane.add(ch1label);
			
			JLabel quiznolabel = new JLabel("Quiz: 15 items");
			quiznolabel.setForeground(Color.WHITE);
			quiznolabel.setFont(new Font("Arial", Font.BOLD, 18));
			quiznolabel.setBounds(10, 191, 132, 29);
			contentPane.add(quiznolabel);
			
			JLabel lblNewLabel = new JLabel("_____________________________________________");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));
			lblNewLabel.setBounds(10, 202, 440, 29);
			contentPane.add(lblNewLabel);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.setBackground(new Color(0, 0, 0, 0));
			buttonPanel.setBounds(36, 387, 367, 290);
			buttonPanel.setLayout(new GridLayout(4, 1, 6, 15));
			//add buttons
			answerButtons = new RoundButton[4];
			for (int i = 0; i < 4; i++) {
	            answerButtons[i] = new RoundButton();
	            answerButtons[i].setBackground(new Color(51,71,86));
	            answerButtons[i].setBorder(null);
	            answerButtons[i].setForeground(Color.white);
	            buttonPanel.add(answerButtons[i]);
	            answerButtons[i].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    checkAnswer((JButton) e.getSource());
	                }
	            });
	            
	        }
			contentPane.add(buttonPanel);
			questionsTextArea = new JTextArea();
			questionsTextArea.setEditable(false);
			questionsTextArea.setForeground(Color.WHITE);
			questionsTextArea.setFont(new Font("Arial", Font.BOLD, 17));
			questionsTextArea.setOpaque(false);
			questionsTextArea.setBounds(10, 242, 430, 143);
			contentPane.add(questionsTextArea);
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
					currentQuestion = 0;
					scores = 0;
					//assign random
					random_ans = new Random();
					//show questions
			        showQuestion();
		}
		//method to show questions
			void showQuestion() {
				questionsTextArea.setText(ch2questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch2questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//method to randomize choices    
			  void shuffleAnswers(String[] answers) {
		        for (int i = 0; i < answers.length; i++) {
		            int j = random_ans.nextInt(answers.length);
		            String temp = answers[i];
		            answers[i] = answers[j];
		            answers[j] = temp;
		        }
		    }
			// method to check answer
				private void checkAnswer(JButton button) {
			        if (button.getText().equals(ch2questions[currentQuestion][1])) {
			        	currentQuestion++;
			            scores++;
			          //show the result if the user is done on answering
			            if (currentQuestion >= ch2questions.length) {
			            	Result_OS.Result_ch2OS fCh2OS =  new Result_OS().new Result_ch2OS();
			            	setVisible(false);
			            	fCh2OS.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 14) {
			    		Result_OS.Result_ch2OS fCh2OS =  new Result_OS().new Result_ch2OS();
		            	setVisible(false);
		            	fCh2OS.setVisible(true);
		            	OSquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch3_OS extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch3questions = {
				{"In which state is a process waiting for some event \r\n"
						+ "to occur?", 
				"Waiting", "Terminated", "Ready", "Running"},
				{"Which scheduler selects which process should be \r\n"
						+ "executed next and allocates CPU?", "Medium-term scheduler", "Long-term scheduler",
				  "Short-term scheduler", "No scheduler is responsible"},
				{"Which mobile operating system allows apps to run in \r\n"
						+ "the background with fewer limits?","Android","Blackberry", 
					  "Windows Phone", "iOS"},
				{"What is a mechanism that the system must provide for \r\n"
						+ "processes?", "Process creation and termination", "Multiprocessing", "Hardware support", "Context-switch time"},
				{"Which system call is used to create a new process in \r\n"
						+ "UNIX?", "fork()", "del()",
					"execute()", "terminate()"},
				{"In indirect communication, how can processes \r\n"
						+ "communicate?", "If they share a common mailbox/port", "Through physical mail", "Through social media", "Through phone calls"},
				{"What are the two operations provided by IPC facility \r\n"
						+ "for communication between processes?", "send(message) and receive(message)", "read(message) and write(message)", "create(message) and delete(message)","respond(message) and request(message)"},
				{"Which class in Java allows data to be sent to multiple \r\n"
						+ "recipients?", "MulticastSocket", "ServerSocket", "Socket", "DatagramSocket"},
				{"What system provides named pipes?", "Both UNIX and Windows", "Only Windowsr","Only UNIX","Linux"},
				{"Is communication with ordinary pipes unidirectional \r\n"
						+ "or bidirectional?","Unidirectional","Bidirectional","Neither", "Both"},
				};
		
		public ch3_OS() {
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
			
			JLabel ch1label = new JLabel("");
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/OSch3.png")));
			ch1label.setBounds(0, 116, 450, 64);
			contentPane.add(ch1label);
			
			JLabel quiznolabel = new JLabel("Quiz: 10 items");
			quiznolabel.setForeground(Color.WHITE);
			quiznolabel.setFont(new Font("Arial", Font.BOLD, 18));
			quiznolabel.setBounds(10, 191, 132, 29);
			contentPane.add(quiznolabel);
			
			JLabel lblNewLabel = new JLabel("_____________________________________________");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));
			lblNewLabel.setBounds(10, 202, 440, 29);
			contentPane.add(lblNewLabel);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.setBackground(new Color(0, 0, 0, 0));
			buttonPanel.setBounds(36, 387, 367, 290);
			buttonPanel.setLayout(new GridLayout(4, 1, 6, 15));
			//add buttons
			answerButtons = new RoundButton[4];
			for (int i = 0; i < 4; i++) {
	            answerButtons[i] = new RoundButton();
	            answerButtons[i].setBackground(new Color(51,71,86));
	            answerButtons[i].setBorder(null);
	            answerButtons[i].setForeground(Color.white);
	            buttonPanel.add(answerButtons[i]);
	            answerButtons[i].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    checkAnswer((JButton) e.getSource());
	                }
	            });
	            
	        }
			contentPane.add(buttonPanel);
			questionsTextArea = new JTextArea();
			questionsTextArea.setEditable(false);
			questionsTextArea.setForeground(Color.WHITE);
			questionsTextArea.setFont(new Font("Arial", Font.BOLD, 17));
			questionsTextArea.setOpaque(false);
			questionsTextArea.setBounds(10, 242, 430, 143);
			contentPane.add(questionsTextArea);
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
					currentQuestion = 0;
					scores = 0;
					//assign random
					random_ans = new Random();
					//show questions
			        showQuestion();
		}
		//method to show questions
			void showQuestion() {
				questionsTextArea.setText(ch3questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch3questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//method to randomize choices    
			  void shuffleAnswers(String[] answers) {
		        for (int i = 0; i < answers.length; i++) {
		            int j = random_ans.nextInt(answers.length);
		            String temp = answers[i];
		            answers[i] = answers[j];
		            answers[j] = temp;
		        }
		    }
			// method to check answer
				private void checkAnswer(JButton button) {
			        if (button.getText().equals(ch3questions[currentQuestion][1])) {
			        	currentQuestion++;
			            scores++;
			          //show the result if the user is done on answering
			            if (currentQuestion >= ch3questions.length) {
			            	Result_OS.Result_ch3OS fCh3OS =  new Result_OS().new Result_ch3OS();
			            	setVisible(false);
			            	fCh3OS.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_OS.Result_ch3OS fCh3OS =  new Result_OS().new Result_ch3OS();
		            	setVisible(false);
		            	fCh3OS.setVisible(true);
		            	OSquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch4_OS extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch4questions = {
				{"Which of the following is NOT an advantage of using \r\n"
						+ "threads in an application?", 
				"Process creation is light-weight", "Resource sharing is easier", "Thread switching has lower overhead", "Efficiency can be increased"},
				{"Which type of thread library is supported by the \r\n"
						+ "Kernel?", "Kernel threads", "POSIX threads",
				  "Windows threads", "Java threads"},
				{"Which system allows many user level threads to be \r\n"
						+ "mapped to many kernel threads?","Solaris 9 and later","Windows with the ThreadFiber package", 
					  "GNU Portable Threads", "Solaris prior to version 9"},
				{"What is a POSIX standard API for thread creation \r\n"
						+ "and synchronization?", "IEEE 1003.1c", "HTML", "IRC", "FTP"},
				{"What is the mechanism used to manage most of the \r\n"
						+ "details of threading in thread pools?", "Dispatch queue", "Block-based concurrent programming",
					"Thread identification", "Windows API"},
				{"What are the two types of dispatch queues?", "serial and concurrent", "signal handling and scheduler activations", "system wide and process", "asynchronous and synchronous"},
				{"On Linux systems, how is thread cancellation \r\n"
						+ "handled?", "Through signals", "Through interrupts", "Using a special cancel function","Through exceptions"},
				{"Which primary API does Windows implement?", "Windows API", "Android API", "Linux API", "Mac API"},
				{"In Linux, what system call is used for creating \r\n"
						+ "a new thread?", "clone()", "exec()","wait()","fork()"},
				{"It distributes subsets of the same data across \r\n"
						+ "multiple cores, same operation on each.","Data parallelism","Task parallelism","Memory parallelism", "hardware parallelism"},
				};
		
		public ch4_OS() {
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
			
			JLabel ch1label = new JLabel("");
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/OSch4.png")));
			ch1label.setBounds(0, 116, 450, 64);
			contentPane.add(ch1label);
			
			JLabel quiznolabel = new JLabel("Quiz: 10 items");
			quiznolabel.setForeground(Color.WHITE);
			quiznolabel.setFont(new Font("Arial", Font.BOLD, 18));
			quiznolabel.setBounds(10, 191, 132, 29);
			contentPane.add(quiznolabel);
			
			JLabel lblNewLabel = new JLabel("_____________________________________________");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));
			lblNewLabel.setBounds(10, 202, 440, 29);
			contentPane.add(lblNewLabel);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.setBackground(new Color(0, 0, 0, 0));
			buttonPanel.setBounds(36, 387, 367, 290);
			buttonPanel.setLayout(new GridLayout(4, 1, 6, 15));
			//add buttons
			answerButtons = new RoundButton[4];
			for (int i = 0; i < 4; i++) {
	            answerButtons[i] = new RoundButton();
	            answerButtons[i].setBackground(new Color(51,71,86));
	            answerButtons[i].setBorder(null);
	            answerButtons[i].setForeground(Color.white);
	            buttonPanel.add(answerButtons[i]);
	            answerButtons[i].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    checkAnswer((JButton) e.getSource());
	                }
	            });
	            
	        }
			contentPane.add(buttonPanel);
			questionsTextArea = new JTextArea();
			questionsTextArea.setEditable(false);
			questionsTextArea.setForeground(Color.WHITE);
			questionsTextArea.setFont(new Font("Arial", Font.BOLD, 17));
			questionsTextArea.setOpaque(false);
			questionsTextArea.setBounds(10, 242, 430, 143);
			contentPane.add(questionsTextArea);
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
					currentQuestion = 0;
					scores = 0;
					//assign random
					random_ans = new Random();
					//show questions
			        showQuestion();
		}
		//method to show questions
			void showQuestion() {
				questionsTextArea.setText(ch4questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch4questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//method to randomize choices    
			  void shuffleAnswers(String[] answers) {
		        for (int i = 0; i < answers.length; i++) {
		            int j = random_ans.nextInt(answers.length);
		            String temp = answers[i];
		            answers[i] = answers[j];
		            answers[j] = temp;
		        }
		    }
			// method to check answer
				private void checkAnswer(JButton button) {
			        if (button.getText().equals(ch4questions[currentQuestion][1])) {
			        	currentQuestion++;
			            scores++;
			          //show the result if the user is done on answering
			            if (currentQuestion >= ch4questions.length) {
			            	Result_OS.Result_ch4OS fCh4OS =  new Result_OS().new Result_ch4OS();
			            	setVisible(false);
			            	fCh4OS.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_OS.Result_ch4OS fCh4OS =  new Result_OS().new Result_ch4OS();
		            	setVisible(false);
		            	fCh4OS.setVisible(true);
		            	OSquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch5_OS extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch5questions = {
				{"Which mechanism is required to maintain data \r\n"
						+ "consistency in cooperating processes?", 
				"Mechanisms for orderly execution", "Mutex", "Mutual exclusion", "Semaphore"},
				{"What is a synchronization tool that does not require \r\n"
						+ "busy waiting?", "not provided", "turn variable",
				  "atomic hardware instructions", "flag array"},
				{"What is the other name for a binary semaphore?","mutex lock","counting semaphore", 
					  "atomic operation", "critical section"},
				{"What is the problem faced when multiple readers need \r\n"
						+ "to access a shared data set concurrently?", "Allowing them to read at the same time", "Deadlock between the readers", "Priority Inversion between the processes", "Starvation of the writers"},
				{"What is the purpose of Semaphore mutex?", "Controls access to readcount", "Controls writer access",
					"Controls access to multiple writers", "Controls access to shared data"},
				{"What type of synchronization mechanism is used by \r\n"
						+ "Windows XP on uniprocessor systems?", "Interrupt masks", "Semaphores", "Pthreads", "Spinlocks"},
				{"What do concurrency-control algorithms provide?", "Serializability", "Flexibility", "Concurrency","Efficiency"},
				{"What is the main purpose of using locks in the \r\n"
						+ "database transaction?", "Access control", "Data validation", "Data compression", "Encryption"},
				{"It could disable interrupts.", "Uniprocessors", "Single processor","Multiprocessors","Dual processors"},
				{"The integer value can range over an unrestricted \r\n"
						+ "domain.","Counting semaphore","Binary semaphore","Mutex locks", "Semaphore mutex"},
				};
		
		public ch5_OS() {
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
			
			JLabel ch1label = new JLabel("");
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/OSch5.png")));
			ch1label.setBounds(0, 116, 450, 64);
			contentPane.add(ch1label);
			
			JLabel quiznolabel = new JLabel("Quiz: 10 items");
			quiznolabel.setForeground(Color.WHITE);
			quiznolabel.setFont(new Font("Arial", Font.BOLD, 18));
			quiznolabel.setBounds(10, 191, 132, 29);
			contentPane.add(quiznolabel);
			
			JLabel lblNewLabel = new JLabel("_____________________________________________");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));
			lblNewLabel.setBounds(10, 202, 440, 29);
			contentPane.add(lblNewLabel);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.setBackground(new Color(0, 0, 0, 0));
			buttonPanel.setBounds(36, 387, 367, 290);
			buttonPanel.setLayout(new GridLayout(4, 1, 6, 15));
			//add buttons
			answerButtons = new RoundButton[4];
			for (int i = 0; i < 4; i++) {
	            answerButtons[i] = new RoundButton();
	            answerButtons[i].setBackground(new Color(51,71,86));
	            answerButtons[i].setBorder(null);
	            answerButtons[i].setForeground(Color.white);
	            buttonPanel.add(answerButtons[i]);
	            answerButtons[i].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    checkAnswer((JButton) e.getSource());
	                }
	            });
	            
	        }
			contentPane.add(buttonPanel);
			questionsTextArea = new JTextArea();
			questionsTextArea.setEditable(false);
			questionsTextArea.setForeground(Color.WHITE);
			questionsTextArea.setFont(new Font("Arial", Font.BOLD, 17));
			questionsTextArea.setOpaque(false);
			questionsTextArea.setBounds(10, 242, 430, 143);
			contentPane.add(questionsTextArea);
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
					currentQuestion = 0;
					scores = 0;
					//assign random
					random_ans = new Random();
					//show questions
			        showQuestion();
		}
		//method to show questions
			void showQuestion() {
				questionsTextArea.setText(ch5questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch5questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//method to randomize choices    
			  void shuffleAnswers(String[] answers) {
		        for (int i = 0; i < answers.length; i++) {
		            int j = random_ans.nextInt(answers.length);
		            String temp = answers[i];
		            answers[i] = answers[j];
		            answers[j] = temp;
		        }
		    }
			// method to check answer
				private void checkAnswer(JButton button) {
			        if (button.getText().equals(ch5questions[currentQuestion][1])) {
			        	currentQuestion++;
			            scores++;
			          //show the result if the user is done on answering
			            if (currentQuestion >= ch5questions.length) {
			            	Result_OS.Result_ch5OS fCh5OS =  new Result_OS().new Result_ch5OS();
			            	setVisible(false);
			            	fCh5OS.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_OS.Result_ch5OS fCh5OS =  new Result_OS().new Result_ch5OS();
		            	setVisible(false);
		            	fCh5OS.setVisible(true);
		            	OSquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch6_OS extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch6questions = {
				{"Which cycle constitutes a process execution?", 
				"CPU execution and I/O wait", "CPU execution and memory write", "CPU execution and disk read", "CPU execution and network wait"},
				{"What is the name of the scheduling algorithm \r\n"
						+ "for foreground processes in the partitioned \r\n"
						+ "ready queue?", "RR", "FCFS",
				  "SJF", "Priority"},
				{"What is the name of the scheduling method used \r\n"
						+ "between foreground and background queues?","Fixed priority scheduling","SJF scheduling", 
					  "FIFO scheduling", "Round-robin scheduling"},
				{"What percentage of CPU time is allocated to the \r\n"
						+ "foreground queue in RR scheduling?", "80%", "50%", "60%", "20%"},
				{"In which queue is a new job initially served and \r\n"
						+ "how much time quantum does it receive?", "Q0 and 8 milliseconds", "Q1 and 16 milliseconds",
					"Q1 and 8 milliseconds", "Q2 and 16 milliseconds"},
				{"What does SCS stand for in multi-threading?", "System Contention Scope", "Software Contention Scope", "Software Check Scope", "System Creation System"},
				{"What type of multiprocessing allows only one \r\n"
						+ "processor to access system data structures?", "Asymmetric multiprocessing", "Processor affinity", "Homogenous multiprocessing","Symmetric multiprocessing"},
				{"What is the range of real-time priority in the \r\n"
						+ "context of multiple threads per core?", "0 to 99", "100 to 200", "0 to 100", "100 to 140"},
				{"Time it takes for the dispatcher to stop one \r\n"
						+ "process and start another running.", "Dispatch latency", "Turnaround time","Waiting time","Response time"},
				{"Amount of time a process has been waiting in the\r\n"
						+ "ready queue.", "Waiting time", "Turnaround time","Dispatch latency","Response time"},
				};
		
		public ch6_OS() {
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
			
			JLabel ch1label = new JLabel("");
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/OSch6.png")));
			ch1label.setBounds(0, 116, 450, 64);
			contentPane.add(ch1label);
			
			JLabel quiznolabel = new JLabel("Quiz: 10 items");
			quiznolabel.setForeground(Color.WHITE);
			quiznolabel.setFont(new Font("Arial", Font.BOLD, 18));
			quiznolabel.setBounds(10, 191, 132, 29);
			contentPane.add(quiznolabel);
			
			JLabel lblNewLabel = new JLabel("_____________________________________________");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));
			lblNewLabel.setBounds(10, 202, 440, 29);
			contentPane.add(lblNewLabel);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.setBackground(new Color(0, 0, 0, 0));
			buttonPanel.setBounds(36, 387, 367, 290);
			buttonPanel.setLayout(new GridLayout(4, 1, 6, 15));
			//add buttons
			answerButtons = new RoundButton[4];
			for (int i = 0; i < 4; i++) {
	            answerButtons[i] = new RoundButton();
	            answerButtons[i].setBackground(new Color(51,71,86));
	            answerButtons[i].setBorder(null);
	            answerButtons[i].setForeground(Color.white);
	            buttonPanel.add(answerButtons[i]);
	            answerButtons[i].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    checkAnswer((JButton) e.getSource());
	                }
	            });
	            
	        }
			contentPane.add(buttonPanel);
			questionsTextArea = new JTextArea();
			questionsTextArea.setEditable(false);
			questionsTextArea.setForeground(Color.WHITE);
			questionsTextArea.setFont(new Font("Arial", Font.BOLD, 17));
			questionsTextArea.setOpaque(false);
			questionsTextArea.setBounds(10, 242, 430, 143);
			contentPane.add(questionsTextArea);
			
			JLabel bglabel = new JLabel("");
			bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
					currentQuestion = 0;
					scores = 0;
					//assign random
					random_ans = new Random();
					//show questions
			        showQuestion();
		}
		//method to show questions
			void showQuestion() {
				questionsTextArea.setText(ch6questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch6questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//method to randomize choices    
			  void shuffleAnswers(String[] answers) {
		        for (int i = 0; i < answers.length; i++) {
		            int j = random_ans.nextInt(answers.length);
		            String temp = answers[i];
		            answers[i] = answers[j];
		            answers[j] = temp;
		        }
		    }
			// method to check answer
				private void checkAnswer(JButton button) {
			        if (button.getText().equals(ch6questions[currentQuestion][1])) {
			        	currentQuestion++;
			            scores++;
			          //show the result if the user is done on answering
			            if (currentQuestion >= ch6questions.length) {
			            	Result_OS.Result_ch6OS fCh6OS =  new Result_OS().new Result_ch6OS();
			            	setVisible(false);
			            	fCh6OS.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_OS.Result_ch6OS fCh6OS =  new Result_OS().new Result_ch6OS();
		            	setVisible(false);
		            	fCh6OS.setVisible(true);
		            	OSquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	//to play loop sound
			public static void playSound(String fileName) {
		        try {
		            File soundFile = new File(fileName);
		            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		            clip1 = AudioSystem.getClip();
		            clip1.open(audioInputStream);
		            clip1.start();
		            clip1.loop(Clip.LOOP_CONTINUOUSLY);
		        } catch (Exception e) {
		            System.err.println(e.getMessage());
		        }
		}

			//method to play sound
	        public static void playSoundNotLoop(String fileName) {
	            try {
	                File soundFile = new File(fileName);
	                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
	                Clip clip = AudioSystem.getClip();
	                clip.open(audioInputStream);
	                clip.start();
	            } catch (Exception e) {
	                System.err.println(e.getMessage());
	            }
	  }
}
