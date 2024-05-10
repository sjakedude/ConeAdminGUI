package gui;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JTextPane;

public class RequestMaker {
	
	private static final String BASEURL = "http://theconeportal.net";
	private static final String PORT ="5000";
	
	public static void makeRequest(String url, JTextPane logWindow) {
		URL obj;
		String log = "";
		try {
			obj = new URL(BASEURL + ":" + PORT + url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(3000);
            InputStream responseStream = connection.getInputStream();
            byte[] bytes = responseStream.readAllBytes();
            String s2 = new String(bytes, StandardCharsets.UTF_8);
            s2 = s2.substring(2);
            String responseBody = s2.substring(0, s2.length() - 1);
            responseBody = s2.replace("\\n", "\n");
            responseBody = responseBody.replace("\\r", " ");
            responseBody = responseBody.replace("'", "");
            log = responseBody;
            if (log.isEmpty()) {
            	log = "Empty Response";
            }
		} catch (IOException e1) {
			String currentLogText = logWindow.getText();
			logWindow.setText(currentLogText + "\n" + "Error");
		} finally {
			String currentLogText = logWindow.getText();
			logWindow.setText(currentLogText + "\n" + log);
		}
	}

}
