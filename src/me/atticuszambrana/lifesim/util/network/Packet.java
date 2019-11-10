package me.atticuszambrana.lifesim.util.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Packet {
	
	String url;
	
	String response;
	int responseCode;
	
	public Packet(String url) {
		this.url = url;
	}
	
	public void Send() throws Exception {
		StringBuffer theresponse = new StringBuffer();
        final URL obj = new URL(url);
        final HttpURLConnection con = (HttpURLConnection)obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            theresponse.append(inputLine);
        }
        in.close();
        responseCode = con.getResponseCode();
        response = theresponse.toString();
	}
	
	public String getResponse() {
		return response;
	}
	
	public int getResponseCode() {
		return responseCode;
	}
}
