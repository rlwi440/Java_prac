package com.collection.map.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		new PropertiesMain().start();
	}

	private void start() {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/config.properties"));
			
//			prop.list(System.out);
			
			String OS = prop.getProperty("OS");
			String Price = prop.getProperty("Price");
			String Company = prop.getProperty("Company");
			String PrimaryUI = prop.getProperty("PrimaryUI");
			
			System.out.println("OS="+OS);
			System.out.println("Price="+Price);
			System.out.println("Company="+Company);
			System.out.println("PrimaryUI="+PrimaryUI);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
