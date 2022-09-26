package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MYCalcurator extends JFrame {

	private JPanel contentPane;
	private JTextField btnResultSreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MYCalcurator frame = new MYCalcurator();
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
	public MYCalcurator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnResultSreen = new JTextField();
		btnResultSreen.setText("0");
		btnResultSreen.setFont(new Font("굴림", Font.BOLD, 22));
		btnResultSreen.setHorizontalAlignment(SwingConstants.RIGHT);
		btnResultSreen.setBounds(12, 10, 296, 64);
		contentPane.add(btnResultSreen);
		btnResultSreen.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setBounds(12, 80, 65, 65);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setBounds(89, 80, 65, 65);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setBounds(166, 80, 65, 65);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setBounds(12, 154, 65, 65);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setBounds(89, 154, 65, 65);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setBounds(166, 154, 65, 65);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResultSreen.setText("1");
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setBounds(12, 229, 65, 65);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setBounds(89, 229, 65, 65);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setBounds(166, 229, 65, 65);
		contentPane.add(btn3);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Dialog", Font.BOLD, 18));
		btnC.setBounds(89, 304, 65, 65);
		contentPane.add(btnC);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.BOLD, 18));
		btn0.setBounds(12, 304, 65, 65);
		contentPane.add(btn0);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDivide.setBounds(243, 80, 65, 65);
		contentPane.add(btnDivide);
		
		JButton btnMuliti = new JButton("X");
		btnMuliti.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMuliti.setBounds(243, 154, 65, 65);
		contentPane.add(btnMuliti);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMinus.setBounds(243, 229, 65, 65);
		contentPane.add(btnMinus);
		
		JButton btnPlust = new JButton("+");
		btnPlust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlust.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlust.setBounds(243, 304, 65, 65);
		contentPane.add(btnPlust);
		
		JButton btnResult = new JButton("=");
		btnResult.setFont(new Font("Dialog", Font.BOLD, 18));
		btnResult.setBounds(166, 304, 65, 65);
		contentPane.add(btnResult);

	}

}
