package com.kira.service.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop = new Properties();
	
	protected TestBase(){
		
		try {
			/* File file = new File(""); */
			FileInputStream reder = new FileInputStream("./aplication.properties");
			prop.load(reder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			 e.printStackTrace(); 
		 }
	}

}
