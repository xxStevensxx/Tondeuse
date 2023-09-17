package com.example.mowitnow.util;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.mowitnow.service.MsgManager;



public class ReaderFileTU {
	
	@Test
	public void ReaderFileDsntExist() {
		
		//Given
		ReaderFile reader = new ReaderFile();
		
		//When
		String expected = reader.readerFile("dsnt exist");
		
		//Then
		assertEquals(expected, MsgManager.FILENOTFOUND);
	}

}
