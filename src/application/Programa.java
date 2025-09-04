package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {

		Department dp = new Department(8, "Ed,Fisica");
		
		Seller sl = new Seller(12, "viado", "namsei@gmai.com", new Date(), 3000.0, dp);
		
		System.out.println(sl);

	}

}
