package com.training.utils;

import com.example.ifaces.FileHandler;
import com.example.impl.FileHandlerImpl;
import com.example.impl.ObjectStreamHandlerImpl;

public class FileHandlerFactory {

	
	public static FileHandler getHandler(int key) {
		
		switch (key) {
		case 1:
			
			return new FileHandlerImpl();

		default:
			return new ObjectStreamHandlerImpl();
		}
	}
}
