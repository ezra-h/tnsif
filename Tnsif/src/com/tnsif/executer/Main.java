package com.tnsif.executer;
import com.tnsif.service.*;
public class Main {

	public static void main(String[] args) {
		CRUD.addEmployee(1122, "Alpha", "AlphaSector", "AlphaDept");
		CRUD.addEmployee(1232, "Beta", "BetaSector","BetaDept");
		CRUD.addEmployee(3124, "Gamma","GammaSector", "GammaDept");
		
		CRUD.showEmployees();
		

	}

}