package com.mshakir.JsonToObject;

import org.codehaus.jackson.map.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		String inputJson = "{\"email\": \"abc@123.com\",  \"age\":10}";
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonDTO mp = mapper.readValue(inputJson, JsonDTO.class);
			System.out.println(mp.toString());
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
