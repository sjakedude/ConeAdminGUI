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
		scrollPane.setBounds(60, 123, 220, 349);
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
				URL obj;
				String log = "";
				try {
					obj = new URL("http://theconeportal.net:5000/plutonium/gungame");
		            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		            connection.setRequestMethod("GET");
		            
		            InputStream responseStream = connection.getInputStream();
		            byte[] bytes = responseStream.readAllBytes();
		            String s2 = new String(bytes, StandardCharsets.UTF_8);
		            String responseBody = s2.substring(2, s2.length() - 1);
		            responseBody = s2.replace("\\n", "\n");
		            responseBody = responseBody.replace("\\r", " ");
		            responseBody = responseBody.replace("'", "");
		            log = responseBody;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String currentLogText = txtpnHi.getText();
				txtpnHi.setText(currentLogText + "\n" + log);
			}
		});
		btnNewButton.setBounds(564, 176, 165, 23);
		main.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Log");
		lblNewLabel_1.setBounds(60, 89, 46, 14);
		main.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Check Status");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				URL obj;
				String log = "";
				try {
					obj = new URL("http://theconeportal.net:5000/plutonium/status");
		            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		            connection.setRequestMethod("GET");
		            
		            InputStream responseStream = connection.getInputStream();
		            byte[] bytes = responseStream.readAllBytes();
		            String s2 = new String(bytes, StandardCharsets.UTF_8);
		            String responseBody = s2.substring(2, s2.length() - 1);
		            responseBody = s2.replace("\\n", "\n");
		            responseBody = responseBody.replace("\\r", " ");
		            responseBody = responseBody.replace("'", "");
		            log = responseBody;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String currentLogText = txtpnHi.getText();
				txtpnHi.setText(currentLogText + "\n" + log);
			}
		});
		btnNewButton_1.setBounds(564, 142, 165, 23);
		main.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtpnHi.setText(null);
			}
		});
		btnNewButton_2.setBounds(191, 89, 89, 23);
		main.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Select domination");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				URL obj;
				String log = "";
				try {
					obj = new URL("http://theconeportal.net:5000/plutonium/domination");
		            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		            connection.setRequestMethod("GET");
		            
		            InputStream responseStream = connection.getInputStream();
		            byte[] bytes = responseStream.readAllBytes();
		            String s2 = new String(bytes, StandardCharsets.UTF_8);
		            String responseBody = s2.substring(2, s2.length() - 1);
		            responseBody = s2.replace("\\n", "\n");
		            responseBody = responseBody.replace("\\r", " ");
		            responseBody = responseBody.replace("'", "");
		            log = responseBody;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String currentLogText = txtpnHi.getText();
				txtpnHi.setText(currentLogText + "\n" + log);
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
				URL obj;
				String log = "";
				try {
					obj = new URL("http://theconeportal.net:5000/git/deploy/conecommons");
		            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		            connection.setRequestMethod("GET");
		            
		            InputStream responseStream = connection.getInputStream();
		            byte[] bytes = responseStream.readAllBytes();
		            String s2 = new String(bytes, StandardCharsets.UTF_8);
		            String responseBody = s2.substring(2, s2.length() - 1);
		            responseBody = s2.replace("\\n", "\n");
		            responseBody = responseBody.replace("\\r", " ");
		            responseBody = responseBody.replace("'", "");
		            log = responseBody;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String currentLogText = txtpnHi.getText();
				txtpnHi.setText(currentLogText + "\n" + log);
			}
		});
		btnNewButton_4.setBounds(564, 342, 165, 23);
		main.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Deploy DashFox");
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				URL obj;
				String log = "";
				try {
					obj = new URL("http://theconeportal.net:5000/git/deploy/dashfox");
		            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		            connection.setRequestMethod("GET");
		            
		            InputStream responseStream = connection.getInputStream();
		            byte[] bytes = responseStream.readAllBytes();
		            String s2 = new String(bytes, StandardCharsets.UTF_8);
		            String responseBody = s2.substring(2, s2.length() - 1);
		            responseBody = s2.replace("\\n", "\n");
		            responseBody = responseBody.replace("\\r", " ");
		            responseBody = responseBody.replace("'", "");
		            log = responseBody;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String currentLogText = txtpnHi.getText();
				txtpnHi.setText(currentLogText + "\n" + log);
			}
		});
		btnNewButton_4_1.setBounds(564, 376, 165, 23);
		main.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Deploy TheConePortal");
		btnNewButton_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				URL obj;
				String log = "";
				try {
					obj = new URL("http://theconeportal.net:5000/git/deploy/theconeportal");
		            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		            connection.setRequestMethod("GET");
		            
		            InputStream responseStream = connection.getInputStream();
		            byte[] bytes = responseStream.readAllBytes();
		            String s2 = new String(bytes, StandardCharsets.UTF_8);
		            String responseBody = s2.substring(2, s2.length() - 1);
		            responseBody = s2.replace("\\n", "\n");
		            responseBody = responseBody.replace("\\r", " ");
		            responseBody = responseBody.replace("'", "");
		            log = responseBody;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String currentLogText = txtpnHi.getText();
				txtpnHi.setText(currentLogText + "\n" + log);
			}
		});
		btnNewButton_4_2.setBounds(564, 412, 165, 23);
		main.add(btnNewButton_4_2);
		
		
		JPanel coneflix = new JPanel();
		frame.getContentPane().add(coneflix, "name_5348751806200");
		coneflix.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Mode Switch");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Component c : main.getComponents()) {
					c.hide();
				}
				for (Component c : coneflix.getComponents()) {
					c.show();
				}
			}
		});
		
		btnNewButton_5.setBounds(10, 11, 106, 23);
		main.add(btnNewButton_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(86, 111, 200, 312);
		coneflix.add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);
		
		JButton btnNewButton_6 = new JButton("Mode Switch");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(main);
			}
		});
		btnNewButton_6.setBounds(464, 111, 107, 23);
		coneflix.add(btnNewButton_6);
		
		
	}
}
