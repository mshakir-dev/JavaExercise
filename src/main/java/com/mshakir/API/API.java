package com.mshakir.API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class API {
	public static void callCurrency() {
		try {

			String Key = "51f9b01fac1dcc292d76927a09219714";
			String url = "http://data.fixer.io/api/latest?access_key=" + Key;
			URL obj = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) obj.openConnection();

			// Response Code
			int responseCode = conn.getResponseCode();
			System.out.println("Get Request: " + url);
			System.out.println("Response Code: " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;

			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			// System.out.println(response.toString());

			JSONObject response1 = new JSONObject(response.toString());
			// System.out.println(response1);

			System.out.println("BASE:  " + response1.getString("base"));
			System.out.println("DATE:  " + response1.getString("date"));
			System.out.println("RATES: " + response1.getJSONObject("rates"));
//			System.out.println("ARRAY: " + response1.getJSONArray("rates"));

		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}