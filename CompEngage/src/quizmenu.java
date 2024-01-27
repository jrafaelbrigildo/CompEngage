import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class quizmenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		quizmenu frame = new quizmenu();
		frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public quizmenu() {
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
		//backbutton
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
		
		JLabel subjectlabel = new JLabel("");
		subjectlabel.setIcon(new ImageIcon(quizmenu.class.getResource("/images/subject.png")));
		subjectlabel.setBounds(63, 144, 318, 80);
		contentPane.add(subjectlabel);
		
		//Software Desing button
		JButton SDbtn = new JButton("");
		SDbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SDbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/SDhover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SDbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/SD.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				SDquiz fSDquiz = new SDquiz();
				setVisible(false);
				fSDquiz.setVisible(true);
				
				
			}
		});
		SDbtn.setBorder(null);
		SDbtn.setOpaque(false);
		SDbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/SD.png")));
		SDbtn.setBounds(73, 333, 293, 62);
		contentPane.add(SDbtn);
		
		//Microprocessor button
		JButton microbtn = new JButton("");
		microbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				microbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/microhover.png")));
			}
			public void mouseExited(MouseEvent e) {
				microbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/micro.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MICROquiz fMICROquiz = new MICROquiz();
				setVisible(false);
				fMICROquiz.setVisible(true);
			}
		});
		microbtn.setBorder(null);
		microbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/micro.png")));
		microbtn.setBounds(73, 543, 293, 62);
		contentPane.add(microbtn);
		
		//Operating System button
		JButton OSbtn = new JButton("");
		OSbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				OSbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/OShover.png")));
			}
			public void mouseExited(MouseEvent e) {
				OSbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/OS.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				OSquiz fOSquiz = new OSquiz();
				setVisible(false);
				fOSquiz.setVisible(true);
			}
		});
		OSbtn.setIcon(new ImageIcon(quizmenu.class.getResource("/images/OS.png")));
		OSbtn.setBorder(null);
		OSbtn.setBounds(73, 439, 293, 62);
		contentPane.add(OSbtn);
		
		JLabel quizmenulabel = new JLabel("");
		quizmenulabel.setIcon(new ImageIcon(quizmenu.class.getResource("/images/bg.png")));
		quizmenulabel.setBounds(0, 0, 450, 730);
		contentPane.add(quizmenulabel);
	}
	
}
