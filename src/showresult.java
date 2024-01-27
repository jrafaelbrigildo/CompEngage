import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class showresult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
	showresult frame = new showresult();
	frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public showresult() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton shwrsltbtn = new JButton("");
		shwrsltbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				shwrsltbtn.setIcon(new ImageIcon(showresult.class.getResource("/images/shwresulthover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				shwrsltbtn.setIcon(new ImageIcon(showresult.class.getResource("/images/shwresult.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		shwrsltbtn.setIcon(new ImageIcon(showresult.class.getResource("/images/shwresult.png")));
		shwrsltbtn.setBorder(null);
		shwrsltbtn.setBounds(97, 72, 256, 60);
		contentPane.add(shwrsltbtn);
		
		JButton exitbtn = new JButton("");
		exitbtn.setBorder(null);
		exitbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitbtn.setIcon(new ImageIcon(showresult.class.getResource("/images/exthover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitbtn.setIcon(new ImageIcon(showresult.class.getResource("/images/ext.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exitbtn.setIcon(new ImageIcon(showresult.class.getResource("/images/ext.png")));
		exitbtn.setBounds(97, 177, 256, 60);
		contentPane.add(exitbtn);
		
		JLabel bglabel = new JLabel("");
		bglabel.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
		bglabel.setBounds(0, 0, 450, 730);
		contentPane.add(bglabel);
		
		
		
	}
}
