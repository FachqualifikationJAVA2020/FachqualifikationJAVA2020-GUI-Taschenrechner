package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nicole_Calculator implements ActionListener {
	public Nicole_Calculator(){
		JFrame frame = new JFrame();
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("CalcuTron_3000");
	        frame.setLocation(100, 200);
	        frame.setMinimumSize(new Dimension(640, 150));

		JTextField firstInput = new JTextField(10);
		JTextField secondInput = new JTextField(10);
		JPanel inputCol = new JPanel();
			inputCol.setLayout(new BoxLayout(inputCol, BoxLayout.Y_AXIS));
			inputCol.add(firstInput);
			inputCol.add(secondInput);
		frame.add(inputCol, BorderLayout.WEST);

		JTextField result = new JTextField(40);
			result.setEditable(false);
			frame.add(result, BorderLayout.EAST);
		
		JButton addiBtn = new JButton();
			addiBtn.setText("+");
			addiBtn.setBackground(Color.white);
		JButton subtBtn = new JButton();
			subtBtn.setText("-");
			subtBtn.setBackground(Color.white);
		JButton multBtn = new JButton();
			multBtn.setText("*");
			multBtn.setBackground(Color.white);
		JButton diviBtn = new JButton();
			diviBtn.setText("/");
			diviBtn.setBackground(Color.white);
		JPanel btnCol = new JPanel();
			btnCol.setLayout(new BoxLayout(btnCol, BoxLayout.Y_AXIS));
			btnCol.add(addiBtn);
			btnCol.add(subtBtn);
			btnCol.add(multBtn);
			btnCol.add(diviBtn);
		frame.add(btnCol, BorderLayout.CENTER);
			
		addiBtn.addActionListener(
			a -> {
				String s1 = firstInput.getText();
				double i1 = Double.parseDouble(s1);
				String s2 = secondInput.getText();
				double i2 = Double.parseDouble(s2);
				double output = i1 + i2;
				result.setText(String.valueOf(output));
			});
		subtBtn.addActionListener(
			a -> {
				String s1 = firstInput.getText();
				double i1 = Double.parseDouble(s1);
				String s2 = secondInput.getText();
				double i2 = Double.parseDouble(s2);
				double output = i1 - i2;
				result.setText(String.valueOf(output));
			});
		multBtn.addActionListener(
			a -> {
				String s1 = firstInput.getText();
				double i1 = Double.parseDouble(s1);
				String s2 = secondInput.getText();
				double i2 = Double.parseDouble(s2);
				double output = i1 * i2;
				result.setText(String.valueOf(output));
			});
		diviBtn.addActionListener(
			a -> {
				String s1 = firstInput.getText();
				double i1 = Double.parseDouble(s1);
				String s2 = secondInput.getText();
				double i2 = Double.parseDouble(s2);
				double output = i1 / i2;
				result.setText(String.valueOf(output));
			});

        
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Nicole_Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
