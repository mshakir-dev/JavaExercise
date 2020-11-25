package com.mshakir.API;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		API.callCurrency();
		// inline will store the JSON data streamed in string format
		String inline = "";

		try {
			URL url = new URL("http://jsonplaceholder.typicode.com/users");
			// Parse URL into HttpURLConnection in order to open the connection in order to
			// get the JSON data
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// Set the request to GET or POST as per the requirements
			conn.setRequestMethod("GET");
			// Use the connect method to create the connection bridge
			conn.connect();
			// Get the response status of the Rest API
			int responsecode = conn.getResponseCode();
			System.out.println("Response code is: " + responsecode);

			if (responsecode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responsecode);
			} else {
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				System.out.println("JSON Response in String format");
				System.out.println(inline);
				sc.close();
			}
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}