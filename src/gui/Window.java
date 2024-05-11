package gui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import gui.RequestMaker;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 779, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel main = new JPanel();
		frame.getContentPane().add(main, "name_5306880763500");
		main.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cone Server Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(278, 11, 205, 49);
		main.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 114, 313, 377);
		main.add(scrollPane);
		
		JTextPane txtpnHi = new JTextPane();
		scrollPane.setViewportView(txtpnHi);
		txtpnHi.setEditable(false);
		txtpnHi.setText("");
		txtpnHi.setBackground(new Color(128, 128, 128));
		txtpnHi.setForeground(new Color(0, 0, 0));
		
		JButton btnNewButton = new JButton("Select gungame");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestMaker.makeRequest("/plutonium/gungame", txtpnHi);
			}
		});
		btnNewButton.setBounds(564, 176, 165, 23);
		main.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Log");
		lblNewLabel_1.setBounds(10, 89, 46, 14);
		main.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Check Status");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestMaker.makeRequest("/plutonium/status", txtpnHi);
			}
		});
		btnNewButton_1.setBounds(564, 142, 165, 23);
		main.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtpnHi.setText(null);
			}
		});
		btnNewButton_2.setBounds(237, 85, 89, 23);
		main.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Select domination");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestMaker.makeRequest("/plutonium/domination", txtpnHi);
			}
		});
		btnNewButton_3.setBounds(564, 210, 165, 23);
		main.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Plutonium");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(615, 117, 89, 14);
		main.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Version Control");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(593, 308, 122, 23);
		main.add(lblNewLabel_3);
		
		JButton btnNewButton_4 = new JButton("Deploy ConeCommons");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestMaker.makeRequest("/git/deploy/conecommons", txtpnHi);
			}
		});
		btnNewButton_4.setBounds(564, 342, 165, 23);
		main.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Deploy DashFox");
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestMaker.makeRequest("/git/deploy/dashfox", txtpnHi);
			}
		});
		btnNewButton_4_1.setBounds(564, 376, 165, 23);
		main.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Deploy TheConePortal");
		btnNewButton_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestMaker.makeRequest("/git/deploy/theconeportal", txtpnHi);
			}
		});
		btnNewButton_4_2.setBounds(564, 412, 165, 23);
		main.add(btnNewButton_4_2);
		
		
		JPanel minecraft = new JPanel();
		frame.getContentPane().add(minecraft, "name_5348751806200");
		minecraft.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 114, 313, 377);
		minecraft.add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);		
		textPane.setEditable(false);
		textPane.setText("");
		textPane.setBackground(new Color(128, 128, 128));
		textPane.setForeground(new Color(0, 0, 0));
		
		
		JButton btnNewButton_6 = new JButton("Mode Switch");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.show();
				minecraft.hide();
				for (Component c : main.getComponents()) {
					c.show();
				}
				for (Component c : minecraft.getComponents()) {
					c.hide();
				}
			}
		});
		
		btnNewButton_6.setBounds(10, 11, 153, 23);
		minecraft.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("List Minecraft Servers Running");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/status", textPane);
			}
		});
		btnNewButton_7.setBounds(434, 124, 232, 48);
		minecraft.add(btnNewButton_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("Log");
		lblNewLabel_1_1.setBounds(10, 89, 46, 14);
		minecraft.add(lblNewLabel_1_1);
		
		JButton btnNewButton_8 = new JButton("Start");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/start_ftb", textPane);
			}
		});
		btnNewButton_8.setBounds(577, 330, 89, 23);
		minecraft.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Stop");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/stop_ftb", textPane);
			}
		});
		btnNewButton_9.setBounds(434, 330, 89, 23);
		minecraft.add(btnNewButton_9);
		
		JLabel lblNewLabel_4 = new JLabel("FTB");
		lblNewLabel_4.setBounds(363, 334, 46, 14);
		minecraft.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Latest");
		lblNewLabel_5.setBounds(363, 285, 46, 14);
		minecraft.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Beta");
		lblNewLabel_6.setBounds(363, 239, 46, 14);
		minecraft.add(lblNewLabel_6);
		
		JButton btnNewButton_10 = new JButton("Stop");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/stop_latest", textPane);
			}
		});
		btnNewButton_10.setBounds(434, 281, 89, 23);
		minecraft.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Stop");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/stop_beta", textPane);
			}
		});
		btnNewButton_11.setBounds(434, 235, 89, 23);
		minecraft.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Start");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/start_latest", textPane);
			}
		});
		btnNewButton_12.setBounds(577, 281, 89, 23);
		minecraft.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Start");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestMaker.makeRequest("/minecraft/start_beta", textPane);
			}
		});
		btnNewButton_13.setBounds(577, 235, 89, 23);
		minecraft.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Clear");
		btnNewButton_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPane.setText(null);
			}
		});
		btnNewButton_14.setBounds(237, 85, 89, 23);
		minecraft.add(btnNewButton_14);
		
		JLabel lblNewLabel_7 = new JLabel("Minecraft Servers");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_7.setBounds(278, 11, 205, 49);
		minecraft.add(lblNewLabel_7);
		JButton btnNewButton_5 = new JButton("Mode Switch");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.hide();
				minecraft.show();
				for (Component c : main.getComponents()) {
					c.hide();
				}
				for (Component c : minecraft.getComponents()) {
					c.show();
				}
			}
		});
		
		btnNewButton_5.setBounds(10, 11, 153, 23);
		main.add(btnNewButton_5);
		
		JLabel lblNewLabel_8 = new JLabel("DISABLED");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(474, 171, 80, 29);
		main.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("DISABLED");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8_1.setBounds(474, 204, 80, 29);
		main.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("DISABLED");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8_2.setBounds(474, 136, 80, 29);
		main.add(lblNewLabel_8_2);
	}
}
