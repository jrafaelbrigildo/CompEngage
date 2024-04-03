import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class MICROquiz extends JFrame {

	private JPanel contentPane;
	public static Clip clip1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MICROquiz frame = new MICROquiz();
		frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public MICROquiz() {
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
				backbtn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/back buttonhover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backbtn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/back button.png")));
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
		backbtn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/back button.png")));
		backbtn.setBounds(10, 11, 78, 74);
		contentPane.add(backbtn);
		
		JLabel chapterlabel = new JLabel("");
		chapterlabel.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/ch.png")));
		chapterlabel.setBounds(0, 145, 450, 74);
		contentPane.add(chapterlabel);
		
		JButton ch1btn = new JButton("");
		ch1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch1_MICRO fCh1_MICRO = new ch1_MICRO();
				setVisible(false);
				fCh1_MICRO.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch1btn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/OSch1.png")));
		ch1btn.setBounds(0, 295, 450, 61);
		contentPane.add(ch1btn);
		
		JButton ch2btn = new JButton("");
		ch2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch2_MICRO fCh2_MICRO = new ch2_MICRO();
				setVisible(false);
				fCh2_MICRO.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch2btn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/MICROch2.png")));
		ch2btn.setBounds(0, 360, 450, 61);
		contentPane.add(ch2btn);
		
		JButton ch3btn = new JButton("");
		ch3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch3_MICRO fCh3_MICRO = new ch3_MICRO();
				setVisible(false);
				fCh3_MICRO.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch3btn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/MICROch3.png")));
		ch3btn.setBounds(0, 426, 450, 61);
		contentPane.add(ch3btn);
		
		JButton ch4btn = new JButton("");
		ch4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch4_MICRO fCh4_MICRO = new ch4_MICRO();
				setVisible(false);
				fCh4_MICRO.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch4btn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/MICROch4.png")));
		ch4btn.setBounds(0, 491, 450, 61);
		contentPane.add(ch4btn);
		
		JButton ch5btn = new JButton("");
		ch5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch5_MICRO fCh5_MICRO = new ch5_MICRO();
				setVisible(false);
				fCh5_MICRO.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch5btn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/MICROch5.png")));
		ch5btn.setBounds(0, 557, 450, 61);
		contentPane.add(ch5btn);
		
		JButton ch6btn = new JButton("");
		ch6btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch6_MICRO fCh6_MICRO = new ch6_MICRO();
				setVisible(false);
				fCh6_MICRO.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch6btn.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/MICROch6.png")));
		ch6btn.setBounds(0, 622, 450, 61);
		contentPane.add(ch6btn);
		
		JLabel MICROquizlabel = new JLabel("");
		MICROquizlabel.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/bg.png")));
		MICROquizlabel.setBounds(0, 0, 450, 730);
		contentPane.add(MICROquizlabel);
	}
	
	class ch1_MICRO extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch1questions = {
				{"What was the first mechanical calculator?", 
				"Abacus", "Slide rule", "Analytical engine", "Odometer"},
				{"Which programming language is named after Blaise \r\n"
						+ "Pascal?", "Pascal", "Analytical Engine",
				  "Jacquard", "Ada"},
				{"What was the first modern electromechanical \r\n"
						+ "computer system, constructed by Konrad Zuse?","The Z3","The Z4", 
					  "The Z5", "The Z6"},
				{"When was the first electronic computer, Colossus, \r\n"
						+ "placed into operation?", "1943", "1944", "1945", "1946"},
				{"Which of the following companies developed a line \r\n"
						+ "of machines that used punched cards for tabulation?", "IBM", "Monroe",
					"Bomar Corporation", "Bell Labs"},
				{"The first handheld electronic calculator was \r\n"
						+ "developed by:", "Bomar Corporation", "IBM", "Bell Labs", "Intel Corporation"},
				{"Who developed the punched card for storing data?", "Herman Hollerith", "Michael Faraday", "Blaise Pascal","Jacquard"},
				{"What was the name of the first general-purpose, \r\n"
						+ "programmable electronic computer system?", "ENIAC", "Colossus", "Z3", "The Bomar Brain"},
				{"Which microprocessor was an updated version of \r\n"
						+ "the Intel 4004?", "Intel 4040", "Intel 8008","Intel 8080","Motorola MC6800"},
				{"When was the first 8-bit microprocessor released?","1973","1983","1971", "1978"},
				{"What device did Intel release in 1983 as an updated \r\n"
						+ "version of the 8086 microprocessor?","80286","80285","80386", "80486"},
				{"What is the speed of execution of instructions in \r\n"
						+ "the 8086 and 8088 microprocessors?","400 ns","400 ms","2.5 MIPS", "1M byte"},
				{"What was the first programming language constructed \r\n"
						+ "of?","Binary codes"," Mnemonic codes","High-level codes", "Low-level codes"},
				{"Who was the first modern person to develop a system \r\n"
						+ "that accepted instructions and stored them in memory?","John von Neumann","Charles Babbage","Grace Hopper", "Augusta Ada Byron"},
				{"What was the first high-level programming language \r\n"
						+ "called?","FLOWMATIC","COBOL","FORTRAN", "ALGOL"},
				};
		
		public ch1_MICRO() {
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
			bglabel.setIcon(new ImageIcon(MICROquiz.class.getResource("/images/bg.png")));
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
			            	Result_MICRO.Result_ch1MICRO fCh1MICRO =  new Result_MICRO().new Result_ch1MICRO();
			            	setVisible(false);
			            	fCh1MICRO.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 14) {
			    		Result_MICRO.Result_ch1MICRO fCh1MICRO =  new Result_MICRO().new Result_ch1MICRO();
		            	setVisible(false);
		            	fCh1MICRO.setVisible(true);
		            	MICROquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch2_MICRO extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch2questions = {
				{"In a multiple core microprocessor, each core "
						+ "contains\nwhat?", 
				"The same programming model", "No programming model", "A single programming language", "Different programming models"},
				{"Which microprocessors contain full 32-bit internal \r\n"
						+ "architectures?", "80386 through Core2", "8086 through the 80286",
				  "6502 and 6800", "8080 and 8085"},
				{"What is the maximum addressable memory space with a \r\n"
						+ "36-bit address bus?","64GBytes","16GBytes", 
					  "1MBytes", "4GBytes"},
				{"Which register holds a part of the result from a \r\n"
						+ "multiplication or part of dividend before a division?", "RDX", "RDI", "RBP", "RSI"},
				{"Which flag indicates carry after addition or borrow \r\n"
						+ "after subtraction?", "C (carry)", "P (parity)",
					"Overflow", "Zero flag"},
				{"Which flag bit activates if a word or doubleword is \r\n"
						+ "addressed on a nonword or non-doubleword boundary?", "AC", "RF", "VM", "ID"},
				{"Which registers define the area of memory used for \r\n"
						+ "the stack in 80386-Core2 microprocessors?", "SS and BP", "CS and SP", "ES and BP","FS and GS"},
				{"What is the maximum memory space that can be \r\n"
						+ "addressed in real mode operation?", "the first 1M byte", "the first 10M byte", "the first 5M byte", "the first 100M byte"},
				{"Which register defines the start of the code segment \r\n"
						+ "in a system?", "Code segment register", "Stack pointer register","Pointer register","Instruction pointer register"},
				{"In protected mode, what does the segment register \r\n"
						+ "contain instead of a segment address?","Selector","Memory location","Access rights", "Descriptor"},
				};
		
		public ch2_MICRO() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/MICROch2.png")));
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
			            	Result_MICRO.Result_ch2MICRO fCh2MICRO =  new Result_MICRO().new Result_ch2MICRO();
			            	setVisible(false);
			            	fCh2MICRO.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_MICRO.Result_ch2MICRO fCh2MICRO =  new Result_MICRO().new Result_ch2MICRO();
		            	setVisible(false);
		            	fCh2MICRO.setVisible(true);
		            	MICROquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch3_MICRO extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch3questions = {
				{"What is the leftmost field in an assembly language \r\n"
						+ "program called?", 
				"Label", "Operand", "Opcode", "Memory Location"},
				{"What does MOV instruction do?", "Copies the source into the destination", "Moves the source to the destination",
				  "Does nothing", "Removes the source from the destination"},
				{"Which of these is not a register used in register \r\n"
						+ "addressing for Intel microprocessors?","Scaled-index","BX", 
					  "DX", "AH"},
				{"Which type of addressing operates upon a byte or word \r\n"
						+ "of data?", "Immediate addressing", "Indirect addressing", "Memory addressing", "Register addressing"},
				{"How is hexadecimal data represented in assembly \r\n"
						+ "language with the letter H?", "It is appended", "It is prefixed",
					"It is substituted with the # symbol", "It is ignored"},
				{"Which form of direct data addressing applies to a MOV \r\n"
						+ "between a memory location and AL, AX, or EAX?", "Direct addressing", "Displacement addressing", "Immediate addressing", "Indirect addressing"},
				{"Which register holds a selector that accesses a \r\n"
						+ "descriptor for the base address of the stack segment \r\n"
						+ "in protected mode operation?", "SS register", "ES register", "SP register","BP register"},
				{"Which register(s) address memory in the data segment \r\n"
						+ "by default on 80386 and above?", "EAX, EBX, ECX, EDX, EDI, and ESI", "BP", "BX, DI, and SI", "AL and CL"},
				{"In the real mode, what is the maximum contents of a \r\n"
						+ "32-bit register used for addressing memory?", "0000FFFFH", "11111111H","00000000H","FFFFFFFFH"},
				{"Which register holds the relative position of an \r\n"
						+ "element in a memory array?","Index register","Stack segment register","Base register", "BP register"},
				};
		
		public ch3_MICRO() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/MICROch3.png")));
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
			            	Result_MICRO.Result_ch3MICRO fCh3MICRO =  new Result_MICRO().new Result_ch3MICRO();
			            	setVisible(false);
			            	fCh3MICRO.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_MICRO.Result_ch3MICRO fCh3MICRO =  new Result_MICRO().new Result_ch3MICRO();
		            	setVisible(false);
		            	fCh3MICRO.setVisible(true);
		            	MICROquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch4_MICRO extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch4questions = {
				{"Which type of instruction does NOT fall under data \r\n"
						+ "movement instructions?", 
				"JMP", "LODS", "LEA", "MOV"},
				{"What program can be used to create machine language \r\n"
						+ "patches in DOS and Visual for Windows?", "DEBUG", "Python",
				  "HTML", "Java"},
				{"What does the first 6 bits of the first opcode byte of\r\n"
						+ "an instruction indicate?","Binary Opcode","Data Flow Direction", 
					  "Addressing Mode", "Displacement Mode"},
				{"In register addressing, what does the R/M field \r\n"
						+ "select when the MOD field is 00, 01 or 10?", "One of the data memory addressing modes", "The instruction type", "A fixed memory location", "A register"},
				{"What is the meaning of the R/M field when the MOD \r\n"
						+ "field contains a 00, 01, or 10?", "Memory Addressing", "Register Immidiate Data",
					"Hardware I/O Operations", "Logic and Bitwise Operation"},
				{"What is the opcode for the given instruction?", "100010", "101110", "110001", "011010"},
				{"What is the MOD field in the displacement mode of \r\n"
						+ "addressing for 16-bit instructions?", "00", "10", "11","01"},
				{"Do MOV instructions referring to memory through a \r\n"
						+ "pointer need a PTR directive?", "No", "Only if it's a DWORD", "Yes", "Depends on the type of memory"},
				{"Which instructions are used to store and retrieve \r\n"
						+ "data from the LIFO stack memory?", "PUSH/POP", "INC/DEC","ADD/SUB","JMP/JC"},
				{"Which addressing mode allows immediate data to be \r\n"
						+ "pushed onto the stack but not popped off the stack?","Immediate addressing","Segment register addressing","Memory-addressing PUSH", "PUSH instruction with flags"},
				};
		
		public ch4_MICRO() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/MICROch4.png")));
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
			            	Result_MICRO.Result_ch4MICRO fCh4MICRO =  new Result_MICRO().new Result_ch4MICRO();
			            	setVisible(false);
			            	fCh4MICRO.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_MICRO.Result_ch4MICRO fCh4MICRO =  new Result_MICRO().new Result_ch4MICRO();
		            	setVisible(false);
		            	fCh4MICRO.setVisible(true);
		            	MICROquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch5_MICRO extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch5questions = {
				{"Which of the following is not allowed in the arith-\r\n"
						+ "metic instructions of a microprocessor?", 
				"Memory-to-memory addition", "Subtraction", "Addition with carry", "Multiplication"},
				{"Which type of addition is used when constant or \r\n"
						+ "known data are added?", "Immediate Addition", "Memory-to-Register Addition",
				  "Increment Instruction", "Array Addition"},
				{"EWhat instruction adds 1 to any register or memory \r\n"
						+ "location except a segment register in x86 assembly \r\n"
						+ "language?","INC","MOV", 
					  "SUB", "ADD"},
				{"Which processor introduced the XADD instruction?", "80486", "80386", "8086", "Core2"},
				{"Which instruction subtracts 1 from any register \r\n"
						+ "or memory location?", "Decrement (DEC)", "Subtract-with-Borrow (SBB)",
					"Subtraction (SUB)", "Addition (ADD)"},
				{"Which instruction function as a regular subtract-\r\n"
						+ "ion, except that the carry flag also subtracts from\r\n"
						+ "the difference?", "Subtraction-with-Borrow (SBB)", "Decrement Subtraction", "Increment Subtraction", "Comparison instruction (CMP)"},
				{"Which instruction compares the destination operand \r\n"
						+ "with the accumulator in the 80486–Core2 processors?", "CMPXCHGH", "SUB", "MOV","ADD"},
				{"What circuitry was introduced in newer micropro-\r\n"
						+ "cessors for faster multiplication?", "Special circuitry in Pentium-Core2", "Multiplication through separate circuits", "Immediate multiplication operations", "Increased clocking periods"},
				{"What is the result of multiplying two 8-bit numbers?", "16-bit product", "64-bit product","128-bit product","32-bit product"},
				{"What type of multiplication is allowed in 80386 pro-\r\n"
						+ "cessor?","32-bit product", "64-bit product","8-bit product","16-bit product"},
				{"In which register pair does the result of 64-bit \r\n"
						+ "multiplication appear in Pentium 4?", "RDX: RAX", "FS: GS", "EBX: ECX", "EAX: ESP"},
				{"In 64-bit mode Pentium 4 & Core2, what type of \r\n"
						+ "errors can result from dividing a 128-bit number by\r\n"
						+ "a 64-bit number?", "Attempt to divide by zero and divide overflow", "Overflow error and syntax error", "Attempt to divide by one and divide overflow","Syntax error and divide overflow"},
				{"In 16-bit division, what is the size of the divi-\r\n"
						+ "dend?", "32-bit", "16-bit","8-bit","64-bit"},
				{"Which instruction is used to zero-extend a 16-bit \r\n"
						+ "unsigned number in 80386 and above?", "MOVZX", "PENTIUM 4","AX","DX"},
				{"Which registers are used to hold the dividend in a \r\n"
						+ "64-bit division?","RDX:RAX","RCX:RAX","RBX:RAX", "RDX:RBX"}
				};
		
		public ch5_MICRO() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/MICROch5.png")));
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
			            	Result_MICRO.Result_ch5MICRO fCh5MICRO =  new Result_MICRO().new Result_ch5MICRO();
			            	setVisible(false);
			            	fCh5MICRO.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 14) {
			    		Result_MICRO.Result_ch5MICRO fCh5MICRO =  new Result_MICRO().new Result_ch5MICRO();
		            	setVisible(false);
		            	fCh5MICRO.setVisible(true);
		            	MICROquiz.clip1.stop();
		    			playSoundNotLoop("sounds/resultbgmusic.wav");
			    	}
			    	else {
			    		showQuestion();
					}
			    	  	
			    }
			}
	}
	class ch6_MICRO extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch6questions = {
				{"Which group of program control instructions includes\r\n"
						+ "jumps, calls, returns, interrupts, and machine \r\n"
						+ "control instructions?", 
				"The Jump Group", "The Call Group", "The Return Group", "The Loop Group"},
				{"What is the maximum distance a short jump instruct-\r\n"
						+ "ion can allow a jump to in bytes?", "127", "256",
				  "512", "1024"},
				{"What follows the opcode in a short jump instruction?","1-byte signed number representing distance","instruction code", 
					  "label identifying the address", "hexadecimal address"},
				{"Which type of jump is relocatable because it is a \r\n"
						+ "relative jump in Intel microprocessors?", "Near Jump", "Conditional Jump", "Call Jump", "Far Jump"},
				{"What do bytes 2 and 3 of the 5-byte far jump \r\n"
						+ "instruction contain?", "The new offset address", "The base address",
					"The new segment address", "The current offset address"},
				{"When accessing a descriptor in protected mode, what \r\n"
						+ "information is obtained from the segment address of\r\n"
						+ "a far jump instruction?", "base address of the far jump segment", "current offset address", "new segment base address", "new offset address"},
				{"What is the jump table used for in assembly language?", "Indirect jumps", "Conditional jumps", "Direct jumps","Function calls"},
				{"What is the range of short jumps in 8086-80286?", "+127 and -128 bytes", "+1M", "+2G", "+32K"},
				{"When comparing signed numbers, which are the \r\n"
						+ "instructions used for terms greater than and less \r\n"
						+ "than?", "JG, JL, JGE, JLE", "JA, JB, JAB, JBE","Conditional set instructions","JE, JNE"},
				{"What is the alternate name for LOOPNE instruction?","ENDIF","MOV","ADD", "LOOPNZ"},
				};
		
		public ch6_MICRO() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/MICROch6.png")));
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
			            	Result_MICRO.Result_ch6MICRO fCh6MICRO =  new Result_MICRO().new Result_ch6MICRO();
			            	setVisible(false);
			            	fCh6MICRO.setVisible(true);
			        } else {
			        	//continue to show question
			        	showQuestion();
			        }
			    } else {
			    	currentQuestion++;
			    	if(currentQuestion > 9) {
			    		Result_MICRO.Result_ch6MICRO fCh6MICRO =  new Result_MICRO().new Result_ch6MICRO();
		            	setVisible(false);
		            	fCh6MICRO.setVisible(true);
		            	MICROquiz.clip1.stop();
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
	//to play sound 
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
