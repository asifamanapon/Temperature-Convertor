package develompent_II;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial") // tells Java not to remind you that you've omitted something
public class TC extends JFrame {

	private Container c;
	private ImageIcon icon;
	private Cursor sor;

	private JPanel contentPane;
	private JLabel label1;

	private String[] temp = { "Selet", "Celsius", "Fahrenheit", "Kelvin", "Rankine" };
	private JLabel Label2;
	private JLabel Label3, Label4;
	private JPanel panel;
	@SuppressWarnings("rawtypes")
	private JComboBox Box_1;
	private JTextField Field1;
	private JLabel Label5;
	private JPanel panel_1;
	@SuppressWarnings("rawtypes")
	private JComboBox Box_2;
	private JButton Button;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel Label_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					TC frame = new TC();
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
	public TC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		this.setTitle("Welcome User");
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		component();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" }) // supports programmer control over warnings otherwise issued by the
													// Java compiler
	public void component() {
		icon = new ImageIcon(getClass().getResource("temp_icon.png"));
		this.setIconImage(icon.getImage());

		c = this.getContentPane();
		c.setLayout(null);
		icon = new ImageIcon(getClass().getResource("tem_re.png"));

		JLabel Label1 = new JLabel(icon);
		Label1.setBounds(0, 0, 200, 300);
		c.add(Label1);

		label1 = new JLabel();
		label1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		c.setBackground(Color.CYAN);
		label1.setBounds(200, 0, 200, 300);
		c.add(label1);

		Label2 = new JLabel("Temparature Converter");
		Label2.setForeground(Color.RED);
		Label2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(200, 11, 174, 14);
		c.add(Label2);

		Label3 = new JLabel("Item Choice");
		Label3.setForeground(Color.BLUE);
		Label3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label3.setHorizontalAlignment(SwingConstants.CENTER);
		Label3.setBounds(200, 49, 70, 14);
		c.add(Label3);

		panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(290, 36, 84, 27);
		c.add(panel);

		Box_1 = new JComboBox(temp);
		Box_1.setForeground(new Color(25, 25, 112));
		Box_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Box_1.setBounds(306, 43, 68, 14);
		panel.add(Box_1);

		Label4 = new JLabel("Enter temparature");
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		Label4.setForeground(Color.BLUE);
		Label4.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label4.setBounds(200, 76, 98, 14);
		c.add(Label4);

		Field1 = new JTextField();
		Field1.setToolTipText("Give temparature");
		Field1.setForeground(new Color(148, 0, 211));
		Field1.setBackground(new Color(176, 224, 230));
		Field1.setHorizontalAlignment(SwingConstants.CENTER);
		Field1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Field1.setBounds(300, 74, 74, 20);
		c.add(Field1);
		Field1.setColumns(10);

		Label5 = new JLabel("Item Choice");
		Label5.setForeground(new Color(0, 0, 205));
		Label5.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		Label5.setBounds(200, 114, 68, 14);
		c.add(Label5);

		panel_1 = new JPanel();
		panel_1.setBounds(290, 101, 84, 27);
		panel_1.setBackground(Color.CYAN);
		c.add(panel_1);

		Box_2 = new JComboBox(temp);
		panel_1.add(Box_2);
		Box_2.setForeground(new Color(0, 0, 128));
		Box_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));

		sor = new Cursor(Cursor.HAND_CURSOR);
		Button = new JButton();
		Button.setBackground(new Color(100, 149, 237));
		Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Button.setText("Convert");
		Button.setBounds(247, 152, 89, 23);
		c.setCursor(sor);
		c.add(Button);

		lblNewLabel = new JLabel("Result");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(193, 200, 59, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setToolTipText("Show result");
		textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(288, 197, 86, 20);
		c.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);

		Label_6 = new JLabel("");
		Label_6.setForeground(new Color(255, 0, 0));
		Label_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Label_6.setHorizontalAlignment(SwingConstants.CENTER);
		Label_6.setBounds(224, 230, 136, 20);
		c.add(Label_6);

		Button.addActionListener(new ActionListener() {
			@Override // @Override means that the method is overriding the parent class
			public void actionPerformed(ActionEvent e) {
				String temp = (String) Box_1.getSelectedItem();
				String tempConvert = (String) Box_2.getSelectedItem();

				if (temp.equals("Celsius") && tempConvert.equals("Fahrenheit")) {
					double c = Double.parseDouble(Field1.getText());
					double f = c * 1.8 + 32;
					textField.setText(String.valueOf(f + "°F"));
					Label_6.setText("F=C*1.8+32");
				} else if (temp.equals("Celsius") && tempConvert.equals("Kelvin")) {
					double c = Double.parseDouble(Field1.getText());
					double k = c + 273;
					textField.setText(String.valueOf(k + "K"));
					Label_6.setText("K=C+273");
				} else if (temp.equals("Celsius") && tempConvert.equals("Rankine")) {
					double c = Double.parseDouble(Field1.getText());
					double r = c * 1.8 + 491.67;
					textField.setText(String.valueOf(r + "°R"));
					Label_6.setText("R=C * 1.8 +491.67");
				} else if (temp.equals("Celsius") && tempConvert.equals("Celsius")) {
					double c = Double.parseDouble(Field1.getText());
					textField.setText(String.valueOf(c + "°C"));
					Label_6.setText("");
				}

				if (temp.equals("Fahrenheit") && tempConvert.equals("Celsius")) {
					double f = Double.parseDouble(Field1.getText());
					double c = (f - 32) * 5 / 9;
					textField.setText(String.valueOf(c + "°C"));
					Label_6.setText("C=F-32*5/9");
				} else if (temp.equals("Fahrenheit") && tempConvert.equals("Kelvin")) {
					double f = Double.parseDouble(Field1.getText());
					double k = (f - 32) * 5 / 9 + 273.15;
					textField.setText(String.valueOf(k + "K"));
					Label_6.setText("K=F-32*5/9+273.15");
				} else if (temp.equals("Fahrenheit") && tempConvert.equals("Rankine")) {
					double f = Double.parseDouble(Field1.getText());
					double r = f + 459.67;
					textField.setText(String.valueOf(r + "°R"));
					Label_6.setText("R = F + 459.67");
				} else if (temp.equals("Fahrenheit") && tempConvert.equals("Fahrenheit")) {
					double f = Double.parseDouble(Field1.getText());
					textField.setText(String.valueOf(f + "°F"));
					Label_6.setText("");
				}

				if (temp.equals("Kelvin") && tempConvert.equals("Fahrenheit")) {
					double k = Double.parseDouble(Field1.getText());
					double f = (k - 273.15) * 9 / 5 + 32;
					textField.setText(String.valueOf(f + "°F"));
					Label_6.setText("F=(k -273.15)* (9 / 5) +32");
				} else if (temp.equals("Kelvin") && tempConvert.equals("Kelvin")) {
					double k = Double.parseDouble(Field1.getText());
					textField.setText(String.valueOf(k + "K"));
					Label_6.setText("");
				} else if (temp.equals("Kelvin") && tempConvert.equals("Rankine")) {
					double k = Double.parseDouble(Field1.getText());
					double r = k * 9 / 5;
					textField.setText(String.valueOf(r + "°R"));
					Label_6.setText("R =K*9/5");
				} else if (temp.equals("Kelvin") && tempConvert.equals("Celcius")) {
					double k = Double.parseDouble(Field1.getText());
					double c = k - 273.15;
					textField.setText(String.valueOf(c + "°C"));
					Label_6.setText("C=K-273.15");
				}

				if (temp.equals("Rankine") && tempConvert.equals("Celsius")) {
					double r = Double.parseDouble(Field1.getText());
					double c = (r - 491.67) * 1.8;
					textField.setText(String.valueOf(c + "°C"));
					Label_6.setText("C = (R - 491.67) x 1.8");
				} else if (temp.equals("Rankine") && tempConvert.equals("Fahrenheit")) {
					double r = Double.parseDouble(Field1.getText());
					double f = r - 459.67;
					textField.setText(String.valueOf(f + "°F"));
					Label_6.setText("F =  R - 459.67");
				} else if (temp.equals("Rankine") && tempConvert.equals("Kelvin")) {
					double r = Double.parseDouble(Field1.getText());
					double k = r / 1.8;
					textField.setText(String.valueOf(k + "K"));
					Label_6.setText("F =  R / 1.8");
				} else if (temp.equals("Rankine") && tempConvert.equals("Rankine")) {
					double r = Double.parseDouble(Field1.getText());
					textField.setText(String.valueOf(r + "°R"));
					Label_6.setText("");
				}

			}

		});

	}
}
