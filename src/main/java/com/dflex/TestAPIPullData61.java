package com.dflex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestAPIPullData61 {
	
	public static String ApiOwner = "Shrijit";
	public static String ApiKey = "754b261806fe43339313c224ab7603a87b9a5f0d518548de9d3de29";
	public static String OrgId = "DFPL";
	public static String json_data =   "  {\r\n"
			+ "   \"order_no\":[],\r\n"
			+ "   \"date_from\":\"19/10/2021 00:01:00\",\r\n"
			+ "   \"date_to\":\"20/10/2021 23:59:59\",\r\n"
			+ "   \"order_location\":\"\",\r\n"
			+ "   \"pageNumber\":\"1\",\r\n"
			+ " }";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
			String op = getProductList();
			System.out.println(op);
	}
	
	public static String getProductList() throws UnsupportedEncodingException, IOException {
		URL url = new URL ("https://duroflex.vineretail.com/RestWS/api/eretail/v2/order/status");
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		
		con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("ApiKey", ApiKey);
		con.setRequestProperty("ApiOwner", ApiOwner);
		con.setRequestProperty("OrgId", OrgId);
		
		
		con.setDoOutput(true);
		con.setDoInput(true);
		
			
		try(OutputStream os = con.getOutputStream()){
			byte[] input = json_data.getBytes("utf-8");
			os.write(input, 0, input.length);
			System.out.println("Length" + input.length);
		}
		
		int code = con.getResponseCode();
		System.out.println("Status " + code);
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))){
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			return response.toString();
		}
	}
	
	}


