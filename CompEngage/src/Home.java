import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Home extends JFrame {

	private JPanel contentPane;
	public static Clip clip;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Home frame = new Home();
		frame.setVisible(true);
		//to play background music
		playSound("sounds/mainsound.wav");
	}

	/**
	 * Create the frame.
	 */
	public Home() {
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
		//help button
		JButton helpbtn = new JButton("");
		helpbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				helpbtn.setIcon(new ImageIcon(Home.class.getResource("/images/helphover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				helpbtn.setIcon(new ImageIcon(Home.class.getResource("/images/help.png")));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				help fHelp = new help();
				setVisible(false);
				fHelp.setVisible(true);
			}
		});
		helpbtn.setIcon(new ImageIcon(Home.class.getResource("/images/help.png")));
		helpbtn.setBackground(new Color(0,0,0,0));
		helpbtn.setOpaque(false);
		helpbtn.setBorder(null);
		helpbtn.setBounds(84, 590, 263, 58);
		contentPane.add(helpbtn);
		
		//study button
		JButton studybtn = new JButton("");
		studybtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				studybtn.setIcon(new ImageIcon(Home.class.getResource("/images/studyhover.png")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				studybtn.setIcon(new ImageIcon(Home.class.getResource("/images/study.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				study fStudy = new study();
				setVisible(false);
				fStudy.setVisible(true);
			}
			
		});
		studybtn.setIcon(new ImageIcon(Home.class.getResource("/images/study.png")));
		studybtn.setBackground(new Color(0,0,0,0));
		studybtn.setOpaque(false);
		studybtn.setBorder(null);
		studybtn.setBounds(84, 496, 263, 58);
		contentPane.add(studybtn);
		
		//start quiz button
		JButton startbtn = new JButton("");
		startbtn.setBackground(new Color(0,0,0,0));
		startbtn.setOpaque(false);
		startbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startbtn.setIcon(new ImageIcon(Home.class.getResource("/images/starthover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startbtn.setIcon(new ImageIcon(Home.class.getResource("/images/start.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				quizmenu newQuizmenu = new quizmenu();
				setVisible(false);
				newQuizmenu.setVisible(true);
			}
		});
		startbtn.setBorder(null);
		startbtn.setIcon(new ImageIcon(Home.class.getResource("/images/start.png")));
		startbtn.setBounds(84, 403, 263, 58);
		contentPane.add(startbtn);
		
		//logo label
		JLabel logolabel = new JLabel();
		logolabel.setOpaque(true);
		logolabel.setBackground(new Color(0,0,0,0));
		logolabel.setIcon(new ImageIcon(Home.class.getResource("/images/logo.png")));
		logolabel.setBounds(0, 0, 263, 210);
		
		//logo panel
		JPanel logopanel = new RoundedPanel(30);
		logopanel.setBounds(84, 129, 263, 210);
		contentPane.add(logopanel);
		logopanel.setOpaque(false);
		logopanel.setLayout(null);
		logopanel.add(logolabel);
		
		//exit button
		JButton exitbtn = new JButton("");
		exitbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitbtn.setIcon(new ImageIcon(Home.class.getResource("/images/exithover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitbtn.setIcon(new ImageIcon(Home.class.getResource("/images/exit button.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exitbtn.setBorder(null);
		exitbtn.setIcon(new ImageIcon(Home.class.getResource("/images/exit button.png")));
		exitbtn.setOpaque(false);
		exitbtn.setBounds(362, 11, 78, 74);
		contentPane.add(exitbtn);
		
		//background label
		JLabel bglabel = new JLabel();
		bglabel.setOpaque(true);
		bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
		bglabel.setBounds(0, 0, 450, 730);
		contentPane.add(bglabel);
	}
	//method to play sound
		public static void playSound(String fileName) {
	        try {
	            File soundFile = new File(fileName);
	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
	            clip = AudioSystem.getClip();
	            clip.open(audioInputStream);
	            clip.start();
	            clip.loop(Clip.LOOP_CONTINUOUSLY);    
	        } 
	        catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	}
}
