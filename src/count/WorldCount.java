package count;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class WorldCount extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldText;
	private JTextField txtFieldCount;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorldCount frame = new WorldCount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WorldCount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1044, 677);
		setTitle("Sarandi's Word Count");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), null, null, null));
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(0, 0, 1026, 630);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtFieldText = new JTextField();
		txtFieldText.setBounds(355, 49, 614, 190);
		panel.add(txtFieldText);
		txtFieldText.setColumns(10);
		
		JLabel labelText = new JLabel("Copy or Paste your text here: ");
		labelText.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelText.setBounds(75, 138, 223, 16);
		panel.add(labelText);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String sentence=txtFieldText.getText();
			int words=1;
			
			for (int i=0; i<sentence.length(); i++) {
			
				if(sentence.charAt(i)==' ') {
					words++;}
			}
			txtFieldCount.setText(" "+words);
			
			}
		});
		btnCount.setForeground(new Color(255, 255, 204));
		btnCount.setBackground(new Color(0, 0, 0));
		btnCount.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCount.setBounds(188, 499, 146, 62);
		panel.add(btnCount);
		
		JLabel labelCount = new JLabel("The Total amount of words are: ");
		labelCount.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelCount.setBounds(75, 336, 253, 16);
		panel.add(labelCount);
		
		txtFieldCount = new JTextField();
		txtFieldCount.setColumns(10);
		txtFieldCount.setBounds(355, 317, 128, 56);
		panel.add(txtFieldCount);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFieldText.setText("");	
				txtFieldCount.setText("");
			}
		});
		btnClear.setForeground(new Color(255, 255, 204));
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setBounds(443, 499, 146, 62);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 204));
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(692, 499, 146, 62);
		panel.add(btnExit);
	}
}
