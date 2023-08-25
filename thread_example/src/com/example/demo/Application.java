package com.example.demo;

import com.example.service.CountNumberService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CountNumberService(10, "TenCount");
		new CountNumberService(1000, "ThousandCount");
		new CountNumberService(5000, "FiveThousandCount");
	}

}
