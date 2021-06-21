import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setForeground(Color.RED);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBounds(167, 11, 88, 24);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("A");
		labela.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labela.setForeground(Color.RED);
		labela.setBounds(102, 62, 46, 14);
		contentPane.add(labela);
		
		tfa = new JTextField();
		tfa.setBounds(181, 62, 86, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(Color.RED);
		labelb.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelb.setBounds(102, 113, 46, 14);
		contentPane.add(labelb);
		
		tfb = new JTextField();
		tfb.setBounds(181, 113, 86, 20);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		JLabel labelres = new JLabel("RES");
		labelres.setForeground(Color.RED);
		labelres.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelres.setBounds(102, 163, 46, 14);
		contentPane.add(labelres);
		
		tfr = new JTextField();
		tfr.setBounds(181, 163, 86, 20);
		contentPane.add(tfr);
		tfr.setColumns(10);
		
		JButton buttonadd = new JButton("ADD");
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				// logic to add
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int val1 = Integer.valueOf(data1);
				int val2 = Integer.valueOf(data2);
				int res = val1 + val2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		buttonadd.setBounds(10, 210, 89, 23);
		contentPane.add(buttonadd);
		
		JButton buttonsub = new JButton("SUB");
		buttonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// logic to sub
				int val1 = Integer.valueOf(tfa.getText());
				int val2 = Integer.valueOf(tfb.getText());
				int res = val1-val2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		buttonsub.setBounds(105, 210, 89, 23);
		contentPane.add(buttonsub);
		
		JButton buttonmul = new JButton("MUL");
		buttonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// logic to mul
				int val1 = Integer.valueOf(tfa.getText());
				int val2 = Integer.valueOf(tfb.getText());
				int res = val1*val2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		buttonmul.setBounds(199, 210, 89, 23);
		contentPane.add(buttonmul);
		
		JButton buttondiv = new JButton("DIV");
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// logic to div
				int val1 = Integer.valueOf(tfa.getText());
				int val2 = Integer.valueOf(tfb.getText());
				int res = val1/val2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		buttondiv.setBounds(301, 210, 89, 23);
		contentPane.add(buttondiv);
	}
}
