
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;


public class SDquiz extends JFrame {

	private JPanel contentPane;
	public static Clip clip1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SDquiz frame = new SDquiz();
		frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public SDquiz() {
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
		
		
		JButton backbtn = new JButton();
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
		chapterlabel.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch.png")));
		chapterlabel.setBounds(0, 145, 450, 74);
		contentPane.add(chapterlabel);
		
		JButton ch1btn = new JButton("");
		ch1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch1_SD fch1_SD = new ch1_SD();
				setVisible(false);
				fch1_SD.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch1btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch1.png")));

		ch1btn.setBounds(0, 295, 450, 61);
		contentPane.add(ch1btn);
		
		JButton ch2btn = new JButton("");
		ch2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch2_SD fCh2_SD = new ch2_SD();
				setVisible(false);
				fCh2_SD.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch2btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch2.png")));
		ch2btn.setBounds(0, 360, 450, 61);
		contentPane.add(ch2btn);
		
		JButton ch3btn = new JButton("");
		ch3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch3_SD fCh3_SD = new ch3_SD();
				setVisible(false);
				fCh3_SD.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch3btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch3.png")));
		ch3btn.setBounds(0, 426, 450, 61);
		contentPane.add(ch3btn);
		
		JButton ch4btn = new JButton("");
		ch4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch4_SD fCh4_SD = new ch4_SD();
				setVisible(false);
				fCh4_SD.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch4btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch4.png")));
		ch4btn.setBounds(0, 491, 450, 61);
		contentPane.add(ch4btn);
		
		JButton ch5btn = new JButton("");
		ch5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch5_SD fCh5_SD = new ch5_SD();
				setVisible(false);
				fCh5_SD.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
			}
		});
		ch5btn.setIcon(new ImageIcon(SDquiz.class.getResource("/images/ch5.png")));
		ch5btn.setBounds(0, 557, 450, 61);
		contentPane.add(ch5btn);
		
		JButton ch6btn = new JButton("");
		ch6btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ch6_SD fCh6_SD = new ch6_SD();
				setVisible(false);
				fCh6_SD.setVisible(true);
				Home.clip.stop();
				playSound("sounds/quizsound.wav");
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

	public class ch1_SD extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
	
		//question and choices in an array
		String[][] ch1questions = {
				{"Is the process of taking a set of requirements from a \n"
				+ "user, analyzing them, designing a solution to the \n"
				+ "problem, and then implementing that solution on a \ncomputer.", 
				"Sofware Development", "Software Programming", "Software Design", "Software Engineering"},
				{"Is central to software development, but it’s not \nthe whole thing.", "Programming", "Refactoring",
				  "Encoding", "Testing"},
				{"Encapsulates what you’re going to do to implement\n your project.","Project Plan","Project Design", 
					  "Project Research", "Project Study"},
				{"Involves a process and includes software development,\nbut it also includes the entire management side of\ncreating a computer."
				+ "program that people will use", "Sofware Engineering", "Software Programming", "Software Design", "Software Development"},
				{"Keeping a team together across several projects\n is a major job of the ___________", "Team's Manager", "Team's Leader",
					"Programmer", "Client"},
				{"________ have fewer lines of communication than \nlarger ones.", "Small teams", "Large teams", "Company teams", "Programmer teams"},
				{"It is a methodologies that strongly encourage\ncustomers to be part of the development team"
				+ "and,\neven better, to be on site daily.", "Agile Development", "Scrum", "Waterfall","code and fix"},
				{"Managing ____________ during a project is one of \nthe single most important skills a software developer\n"
				+ "can have.", "requirements churn", "requirements chim", "requirements digging", "requirements development"},
				{"It is essential to controlling requirements and \nrequirements churn during"
				+ " a project.", "Communication with customer", "Communication with manager","Communication with other","Communication with worker"},
				{"Every project, no matter how big or small, follows a\n__________","process","steps","level", "stage"},
				};
		
		
		public ch1_SD() {
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
			ch1label.setIcon(new ImageIcon(ch1_SD.class.getResource("/images/ch1SD.png")));
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
			
			JLabel bglabel = new JLabel();
			bglabel.setIcon(new ImageIcon(ch1_SD.class.getResource("/images/bg.png")));
			bglabel.setBounds(0, 0, 450, 730);
			contentPane.add(bglabel);
			
			//initial values
			currentQuestion = 0;
			scores = 0;
			//initial values
			random_ans = new Random();
			//show questions
	        showQuestion();
	        
	    
		}
		
		//method to show questions
		private void showQuestion() {
			
			questionsTextArea.setText(ch1questions[currentQuestion][0]);
			String[] answers = Arrays.copyOfRange(ch1questions[currentQuestion], 1, 5);
	        shuffleAnswers(answers);
	        for (int i = 0; i < 4; i++) {
	            answerButtons[i].setText(answers[i]);
	            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
	        }    
		}
		//method to randomize choices    
		private void shuffleAnswers(String[] answers) {
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
	            	Result_SD.Result_ch1SD fCh1sd =  new Result_SD().new Result_ch1SD();
	            	setVisible(false);
	            	fCh1sd.setVisible(true);
	            	
	        } else {
	        	//continue to show question
	        	showQuestion();
	        }
	    } else {
	    	currentQuestion++;
	    	if(currentQuestion > 9) {
	    		Result_SD.Result_ch1SD fCh1sd =  new Result_SD().new Result_ch1SD();
            	setVisible(false);
            	fCh1sd.setVisible(true);
            	SDquiz.clip1.stop();
    			playSoundNotLoop("sounds/resultbgmusic.wav");
    			
	    	}
	    	else {
	    		showQuestion();
			}
	    	  	
	    }
	}
}

	class ch2_SD extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch2questions = {
				{"It is a model that have more clearly defined phases, \r\n"
						+ "and more requirements for sign-off on completion of \r\n"
						+ "a phase before moving on to the next phase.", 
				"Plan-driven", "Agile development", "Lean Software", "Research-driven"},
				{"The person who generates the requirements for the \r\n"
						+ "product and prioritizes them.", "Product owner", "Scrum master",
				  "Project manager", "Product master"},
				{"Phases in this models tend to blur and to be less\r\n"
						+ "documentation of work products required.","Agile Development","Plan-driven", 
					  "Lean software", "Research-driven"},
				{"It provides improved progress visibility for both the\r\n"
						+ "customer and project management.", "Evolutionary prototyping", "Code and fix", "Waterfall", "iterative"},
				{"It can influence the size of the team or, less often, \r\n"
						+ "the types of tools available to the team.", "Cost", "Time",
					"Quality", "Features"},
				{"Is your delivery schedule and is unfortunately many \r\n"
						+ "times imposed on you from the outside.", "Time", "Cost",
						"Quality", "Features"},
				{"It is a process model take a minimal amount of time\r\n"
						+ "to understand the problem and then start coding.",  "Code and fix", "Evolutionary prototyping", "Waterfall", "iterative"},
				{"Are what the product actually does. This is what\r\n"
						+ "developers should always focus on.", "Features", "Cost",
						"Quality", "Time"},
				{"It was created in 1970 by Winston Royce, and addresses\r\n"
						+ "all of the standard life cycle phases."
				+ " a project.", "Waterfall", "Code and fix", "Evolutionary prototyping", "iterative"},
				{"Is the number and severity of defects you’re willing \r\n"
						+ "to release with.","Quality", "Cost",
						"Features", "Time"},
				};
		
		public ch2_SD() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/ch2.png")));
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
			private void showQuestion() {
				questionsTextArea.setText(ch2questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch2questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
			}
			//method to randomize choices    
			private void shuffleAnswers(String[] answers) {
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
		            	Result_SD.Result_ch2SD fCh2sd =  new Result_SD().new Result_ch2SD();
		            	setVisible(false);
		            	fCh2sd.setVisible(true);
		        } else {
		        	//continue to show question
		        	showQuestion();
		        }
		    } else {
		    	currentQuestion++;
		    	if(currentQuestion > 9) {
		    		Result_SD.Result_ch2SD fCh2sd =  new Result_SD().new Result_ch2SD();
	            	setVisible(false);
	            	fCh2sd.setVisible(true);
	            	SDquiz.clip1.stop();
	    			playSoundNotLoop("sounds/resultbgmusic.wav");
		    	}
		    	else {
		    		showQuestion();
				}
		    	  	
		    }
		}
	}
	public class ch3_SD extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch3questions = {
				{"Which type of requirements represent the features \r\n"
						+ "that the user will see and be able to use?", 
				"user requirements", "domain requirements", "non-functional requirements", "non-requirements"},
				{"What type of requirements are imposed on you by the \r\n"
						+ "application domain of the program?", "Domain requirements", "Hardware requirements",
				  "User requirements", "Software requirements"},
				{"What is the key idea in requirements gathering \r\n"
						+ "for most agile methodologies?","User story","Software testing", 
					  "Graphic design", "Database administration"},
				{"What acronym is used to describe the characteristics \r\n"
						+ "of a good user story?", "INVEST", "KANBAN", "SCRUM", "LEAN"},
				{"What is the key idea in requirements gathering \r\n"
						+ "for most agile methodologies?", "User story", "Software testing",
					"Graphic design", "Database administration"},
				{"Who writes the acceptance criteria in an agile \r\n"
						+ "environment?", "Product owner", "CEO", "Developers", "Scrum Master"},
				{"What is the name of the list that contains the total \r\n"
						+ "number of things needed to create the product?", "Product backlog", "Functional specification", "Plan card stack","Development list"},
				{"Who is responsible for decomposing stories into \ntasks?", "The development team", "The stakeholders", "The project manager", "The product owner"},
				{"What practice is usually implemented in testing the \r\n"
						+ "traceability of a feature in Agile?", "TDD and acceptance criteria", "Feature branching","Manual testing","SRE"},
				{"What is one reason for splitting user stories?","To simplify the development process","To make estimation more difficult","To focus on the size of the story", "To increase the value to the customer"},
				{"When you first write the functional specification,  there\r\n"
						+ "will be one or two things you don’t know.", "Open Issues", "Scenario's of typical usage", "Author's name", "Design and New Feature Ideas"},
				{"This is usually either thedevelopment manager or the \r\n"
						+ "project manager, depending on how your company sets\r\n"
						+ "up development projects.", "Author's name", "Open Issues", "Scenario's of typical usage","Design and New Feature Ideas"},
				{"This is a substantive discussion about what the \r\n"
						+ "product owner really wants from the story.", "Conversation", "Card", "Confirmation", "Customer"},
				{"It must describe a feature or a service that the \r\n"
						+ "customer wants.", "Valuable", "Estimable","Negotiable","Independent"},
				{"The key idea here is that the team needs to know when \r\n"
						+ "all the requirements for the task have been completed.","Measureable","Estimable","Valuable", "Negotiable"}
				};
		
		public ch3_SD() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/ch3.png")));
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
			private void showQuestion() {
				questionsTextArea.setText(ch3questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch3questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }	
			}
			//method to randomize choices    
			private void shuffleAnswers(String[] answers) {
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
		            	Result_SD.Result_ch3SD fCh3sd =  new Result_SD().new Result_ch3SD();
		            	setVisible(false);
		            	fCh3sd.setVisible(true);
		        } else {
		        	//continue to show question
		        	showQuestion();
		        }
		    } else {
		    	currentQuestion++;
		    	if(currentQuestion > 14) {
		    		Result_SD.Result_ch3SD fCh3sd =  new Result_SD().new Result_ch3SD();
	            	setVisible(false);
	            	fCh3sd.setVisible(true);
	            	SDquiz.clip1.stop();
	    			playSoundNotLoop("sounds/resultbgmusic.wav");
		    	}
		    	else {
		    		showQuestion();
				}
		    	  	
		    }
		}
	}
	class ch4_SD extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch4questions = {
				{"What did J. Rittel and Melvin M. Webber define?",
				"Wicked problems", "Complicated domains", "Tame problems", "Sorting problems"},
				{"According to Conklin, Rittel and Webber, what is \r\n"
						+ "the approach of real wicked problem solvers?", "An opportunity-driven", "A circular approach",
				  "A linear approach", "A waterfall approach"},
				{"What is design in software development?","Heuristic","Fixed methodology", 
					  "Algorithmic", "Ruleset"},
				{"Which principle is closely related to modularity \r\n"
						+ "and suggests separating functional pieces of a \r\n"
						+ "design cleanly?", "Separation of concerns", "Adaptability", "Simplicity", "Fitness of purpose"},
				{"What is the term for the degree to which classes \r\n"
						+ "depend on each other in object-oriented design?", "Coupling", "Polymorphism",
					"Inheritance", "Abstraction"},
				{"What is the complement of loose coupling in \r\n"
						+ "modules?", "High cohesion", "Coupling level", "Low cohesion", "Intermodule dependence"},
				{"What is the desirable characteristic of keeping in \r\n"
						+ "mind during software development?", "Portability", "Aesthetics", "Color","Size"},
				{"According to the context, what can be used as a \r\n"
						+ "design language?", "Diagrams", "Text messages", "Sculptures", "Audio recordings"},
				{"Can formal processes be imposed to create software \r\n"
						+ "designs?", "No", "It depends on the software being designed","Yes","Sometimes"},
				{"Which step of Bill Curtis' process for software \r\n"
						+ "design involves implementing plans?","Step 4","Step 1","Step 2", "Step 3"},
				};
		
		public ch4_SD() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/ch4.png")));
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
			private void showQuestion() {
		        questionsTextArea.setText(ch4questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch4questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }	
			}
			//shuffle options
			private void shuffleAnswers(String[] answers) {
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
		            	Result_SD.Result_ch4SD fCh4sd =  new Result_SD().new Result_ch4SD();
		            	setVisible(false);
		            	fCh4sd.setVisible(true);
		        } else {
		        	//continue to show question
		        	showQuestion();
		        }
		    } else {
		    	currentQuestion++;
		    	if(currentQuestion > 9) {
		    		Result_SD.Result_ch4SD fCh4sd =  new Result_SD().new Result_ch4SD();
	            	setVisible(false);
	            	fCh4sd.setVisible(true);
	            	SDquiz.clip1.stop();
	    			playSoundNotLoop("sounds/resultbgmusic.wav");
		    	}
		    	else {
		    		showQuestion();
				}
		    	  	
		    }
		}
	}
	class ch5_SD extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch5questions = {
				{"The process continues until each sub-problem is \r\n"
						+ "small enough to be either trivial"
						+ "or very easy to solve.", 
				"structured programming", "object-oriented programming", "step-wise refinement", "top-down decomposition"},
				{"Who formalized the structured design technique in \r\n"
						+ "his 1971 paper?", "Niklaus Wirth", "Bill Gates",
				  "Alan Turing", "Tim Berners-Lee"},
				{"Which technique did David Parnas propose in his \r\n"
						+ "paper titled \"On the Criteria to Be Used in \r\n"
						+ "Decomposing Systems into Modules\"?","Modularity","Object-oriented analysis and design", 
					  "Encapsulation", "Information hiding"},
				{"Which of the following is NOT one of the \r\n"
						+ "characteristics of modularity?", "Tight coupling", "Information hiding", "Loose coupling", "Encapsulation"},
				{"What is the objective of encapsulating services \r\n"
						+ "and data in a module?", "High Cohesion", "Loose Coupling",
					"Loose Cohesion", "High Coupling"},
				{"Which form of coupling is not considered good?", "Control coupling", "Parameter coupling", "Global-data coupling", "Data coupling"},
				{"According to information hiding, what should be \r\n"
						+ "controlled and visible only to the operations \r\n"
						+ "that act on it?", "Data and behaviors in a module", "Only data in external modules", "All data in the program","Data and behaviors in all modules"},
				{"What is the process to sort the circularly \r\n"
						+ "shifted lines of text?", "Sort by the index words", "Sort alphabetically", "Sort by the last word in each line", "Randomly sort the lines"},
				{"____________ describes a set of classic design \r\n"
						+ "methodologies.", "Structured design", "Structured programming","Modular decomposition","Top-down decomposition"},
				{"It is the immediate precursor to the modern \r\n"
						+ "object-oriented methodologies and\r\n"
						+ "introduced the ideas of encapsulation and \r\n"
						+ "information hiding.","Modular decomposition","Structured design","Structured programming", "Top-down decomposition"},
				};
		
		public ch5_SD() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/ch5.png")));
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
			private void showQuestion() {
				questionsTextArea.setText(ch5questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch5questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//shuffle options
			private void shuffleAnswers(String[] answers) {
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
		            	Result_SD.Result_ch5SD fCh5sd =  new Result_SD().new Result_ch5SD();
		            	setVisible(false);
		            	fCh5sd.setVisible(true);
		        } else {
		        	//continue to show question
		        	showQuestion();
		        }
		    } else {
		    	currentQuestion++;
		    	if(currentQuestion > 9) {
		    		Result_SD.Result_ch5SD fCh5sd =  new Result_SD().new Result_ch5SD();
	            	setVisible(false);
	            	fCh5sd.setVisible(true);
	            	SDquiz.clip1.stop();
	    			playSoundNotLoop("sounds/resultbgmusic.wav");
		    	}
		    	else {
		    		showQuestion();
				}
		    	  	
		    }
		}
	}
	class ch6_SD extends JFrame {

		private JPanel contentPane;
		private JButton[] answerButtons = new JButton[4];
		private JTextArea questionsTextArea;
		private int currentQuestion;
		private Random random_ans;
		public static int scores;
		//question and choices in an array
		String[][] ch6questions = {
				{"Class diagrams have three sections. What are they?", 
				"Name, Attributes, Methods", "Instances, Parameters, Inheritance", "Functions, Data types, Relationships", "Type, Visibility, Cooperation"},
				{"A _______ is a description of what a program does \r\n"
						+ "in a particular situation.", "use case", "class diagram",
				  "user story", "user requirements"},
				{"An outside agent that gets the ball rolling.","actor","user", 
					  "programmer", "manager"},
				{"Which step comes after identifying objects, "
						+ "methods, \nand algorithms in the design process?", "Implementation and Testing", "Release/Maintenance/Evolution", "Requirements Gathering and Analysis", "Feature list creation"},
				{"What is the purpose of scenarios in generating \r\n"
						+ "feature lists?", "To help generate the feature list", "To provide user support",
					"To show the program's functionality", "To test the program"},
				{"What is the name of the document that contains "
						+ "the \ninitial set of requirements?", "Feature list", "User story", "Problem statement", "Program description"},
				{"What does OOD stand for?.", "Object-oriented design", "Object-oriented diagram", "Object-oriented device","Object-oriented development"},
				{"What are classes in object-oriented programming?", "Templates for objects", "Shared data areas", "Instances of objects", "Methods that change state of object"},
				{"It is concerned with developing an object-"
						+ "oriented\nsystem model to satisfy \r\n"
						+ "requirements.", "OOD", "OOA","OOP","OOS"},
				{"It is concerned with developing an object model "
						+ "of the \napplication domain.","OOA","OOP","OOS", "OOD"},
				};
	
		public ch6_SD() {
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
			ch1label.setIcon(new ImageIcon(Home.class.getResource("/images/ch6.png")));
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
			private void showQuestion() {
				questionsTextArea.setText(ch6questions[currentQuestion][0]);
				String[] answers = Arrays.copyOfRange(ch6questions[currentQuestion], 1, 5);
				shuffleAnswers(answers);
		        for (int i = 0; i < 4; i++) {
		            answerButtons[i].setText(answers[i]);
		            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 17));
		        }
				
			}
			//shuffle options
			private void shuffleAnswers(String[] answers) {
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
					            	Result_SD.Result_ch6SD fCh6sd =  new Result_SD().new Result_ch6SD();
					            	setVisible(false);
					            	fCh6sd.setVisible(true);
					        } else {
					        	//continue to show question
					        	showQuestion();
					        }
					    } else {
					    	currentQuestion++;
					    	if(currentQuestion > 9) {
					    		Result_SD.Result_ch6SD fCh6sd =  new Result_SD().new Result_ch6SD();
				            	setVisible(false);
				            	fCh6sd.setVisible(true);
				            	SDquiz.clip1.stop();
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
			            clip1 = AudioSystem.getClip();
			            clip1.open(audioInputStream);
			            clip1.start();
			        } catch (Exception e) {
			            System.err.println(e.getMessage());
			        }
			}	
}
