/***
* MainFramme - GUI for Conversor application
* @author: Laxmana Thapa
* @version: 1.0
**/
package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import OtherClasses.Conversor;

import java.awt.Font;
import java.awt.SystemColor;

public class MainFramme {

	private JFrame frmConversor;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnConvertToDegrees = new JButton();
	private JButton btnConvertToRadians = new JButton();
	private NumberFormat df = new DecimalFormat("#.#########");
	private Conversor conversor = new Conversor();
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFramme window = new MainFramme();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFramme() {
		initialize();
	}

	/**
	 * Calls Conversor class to convert degrees to radians. Displays result in radian's text field.
	 * @param degrees Value to convert
	 */
	private void onClickToRadiansButton(String degrees){
		double res = conversor.toRadians(Double.parseDouble(degrees));
		String resStr = df.format(res);
		textField_1.setText(resStr.replace(',', '.'));
	}
	
	/**
	 * Calls Conversor class to convert radians to degrees. Displays result in degrees's text field.
	 * @param radians Value to convert
	 */
	private void onClickToDegreesButton(String radians){
		double res = conversor.toDegrees(Double.parseDouble(radians));
		String resStr = df.format(res);
		textField.setText(resStr.replace(',', '.'));
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmConversor.getContentPane().setLayout(null);
		
		JLabel lblEnterTheValues = new JLabel("Value in degrees:");
		lblEnterTheValues.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterTheValues.setForeground(Color.WHITE);
		lblEnterTheValues.setBounds(60, 53, 167, 31);
		frmConversor.getContentPane().add(lblEnterTheValues);
		
		JLabel lblEnterTheValues_1 = new JLabel("Value in radians:");
		lblEnterTheValues_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterTheValues_1.setForeground(Color.WHITE);
		lblEnterTheValues_1.setBounds(60, 100, 160, 31);
		frmConversor.getContentPane().add(lblEnterTheValues_1);
		
		textField = new JTextField();
		textField.setBounds(216, 53, 114, 31);
		frmConversor.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 100, 114, 31);
		frmConversor.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnConvertToRadians.setForeground(new Color(0, 0, 0));
		
		btnConvertToRadians.setText("Convert to radians");
		btnConvertToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickToRadiansButton(textField.getText());
			}
		});
		btnConvertToRadians.setToolTipText("Enter value in degrees and press here to convert to radians");
		btnConvertToRadians.setBounds(347, 56, 168, 25);
		frmConversor.getContentPane().add(btnConvertToRadians);
		
		btnConvertToDegrees.setText("Convert to degrees");
		btnConvertToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickToDegreesButton(textField_1.getText());
			}
		});
		btnConvertToDegrees.setToolTipText("Enter value in radians and press here to convert to degrees");
		btnConvertToDegrees.setBounds(348, 103, 167, 25);
		frmConversor.getContentPane().add(btnConvertToDegrees);
		
		btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnNewButton.setBounds(226, 159, 88, 29);
		frmConversor.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("Enter the value to convert to degrees or to radians:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(15, 16, 529, 20);
		frmConversor.getContentPane().add(lblNewLabel);
		frmConversor.setBackground(Color.WHITE);
		frmConversor.setTitle("Simple Convertor");
		frmConversor.setBounds(100, 100, 581, 296);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
