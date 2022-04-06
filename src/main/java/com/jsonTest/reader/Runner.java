package com.jsonTest.reader;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {

	public static void main(String[] args) {
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			
			UsersTest users = mapper.readValue(new File("dataFiles/sample.json"), UsersTest.class);
			
			System.out.println(users.getFullName());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
