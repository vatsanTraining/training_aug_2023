package com.training;

import com.training.ifaces.Automobile;
import com.training.utils.ShowRoom;

public class Application {

	public static void main(String[] args) {

		ShowRoom showRoom = new ShowRoom();
		
		Automobile auto =showRoom.getQuote(3);
		
		showRoom.printQuote(auto);
		
	}

}
