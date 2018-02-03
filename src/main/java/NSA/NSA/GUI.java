package NSA.NSA;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	/**
	 * @wbp.parser.entryPoint
	 */
	public GUI(String Answer) {
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel(" - Навального еще не убили?");
		label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		label.setBounds(10, 11, 391, 24);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(" ");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		label_1.setBounds(10, 54, 156, 24);
		frame.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("Узнать!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label_1.setText(" - " + Answer);
			}
		});
		btnNewButton.setBounds(0, 206, 434, 94);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnNewButton);

		frame.setSize(450, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}