package com.example.mowitnow.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.example.mowitnow.service.MsgManager;



public class ReaderFile {
	
	
	public String readerFile(String filename) {
		
		try {
			
			FileReader reader = new FileReader(filename);
			int data = reader.read();
			
			while (data != -1) {
				System.out.println((char)data);
				data = reader.read();
			}
				reader.close();
				
		}catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			return MsgManager.FILENOTFOUND;
			//e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			return e.getMessage();
			//e.printStackTrace();
		}
		
		return "found_file";
	}

}
