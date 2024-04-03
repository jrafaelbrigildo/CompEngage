import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		help frame = new help();
		frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public help() {
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
				Home fhome = new Home();
				setVisible(false);
				fhome.setVisible(true);
			}
		});
		backbtn.setBackground(Color.WHITE);
		backbtn.setBorder(null);
		backbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/back button.png")));
		backbtn.setBounds(10, 11, 78, 74);
		contentPane.add(backbtn);
		
		JLabel instructionlabel = new JLabel("");
		instructionlabel.setIcon(new ImageIcon(help.class.getResource("/images/inst.png")));
		instructionlabel.setBounds(0, 120, 450, 59);
		contentPane.add(instructionlabel);
		
		TextArea helptext = new TextArea("\t\tWelcome to CompEngage Quiz App!\r\n"
				+ "\r\n"
				+ "To start the quiz, follow these instructions:\r\n"
				+ "\r\n"
				+ "   1. Select a subject you want to answer from the list of\n       available subjects.\r\n"
				+ "   2. Select a chapter you want to answer from the list of\n       available chapters.\r\n"
				+ "   3. Each quiz consists of 10 or 15 multiple-choice \n       questions, with 4 options each."
				+ " Choose the\n       best answer for each question by clicking on the\n       corresponding button.\r\n"
				+ "   4. You must answer all questions to complete the quiz.\r\n"
				+ "       After the quiz, your score will be displayed.\r\n"
				+ "\r\n"
				+ "Good luck and have fun!\r\n"
				+ "\r\n"
				+ "To study a lesson, follow these instructions:\r\n"
				+ "\r\n"
				+ "   1. Select a subject you want to study from the list of\n       available subjects.\r\n"
				+ "   2. Select a chapter you want to study from the list of\n       available chapters.\r\n"
				+ "   3. The lesson material will be displayed on the screen.\n       Read through the material carefully and take notes as\n       needed.\r\n"
				+ "   4. When you're finished studying the material, you can\n       close the lesson window and return to the main menu.\r\n"
				+ "\r\n"
				+ "Happy learning!\r\n"
				+ "");
		helptext.setForeground(new Color(255, 255, 255));
		helptext.setEditable(false);
		helptext.setBackground(new Color(0,0,0,0));
		helptext.setFont(new Font("Arial", Font.PLAIN, 16));
		helptext.setBounds(10, 221, 430, 499);
		contentPane.add(helptext);
		
		JLabel helplabel = new JLabel("");
		helplabel.setIcon(new ImageIcon(help.class.getResource("/images/bg.png")));
		helplabel.setBounds(0, 0, 450, 730);
		contentPane.add(helplabel);
	}
}
