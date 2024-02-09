package com.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionExample {
	public void getMethodExample() throws IOException {
    URL url=new URL("http://restapi.adequateshop.com/api/Tourist?page=2");
	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	
	connection.setRequestMethod("GET");
	connection.connect();
	
	int statuscode = connection.getResponseCode();
	System.out.println("Status Code is "+ statuscode);
	
	String statusmessage = connection.getResponseMessage();
	System.out.println("Status Message is "+ statusmessage);
	
	InputStream inputStream = connection.getInputStream();
	InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	String line;
	StringBuffer buffer = new StringBuffer();
	while((line=bufferedReader.readLine())!=null) {
		
		buffer.append(line);
		
		System.out.println(buffer);
	
	}
	
	
	
	}

public static void main(String[] args) throws IOException {
	HttpURLConnectionExample connectionExample = new HttpURLConnectionExample();
	connectionExample.getMethodExample();		
}}

