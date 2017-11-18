package com.cube.core;

import com.cube.cell.database.Database;
import com.cube.cell.login.Login;

public class TestMain {

	public static void main(String[] args) {
		
		Database database = new Database(new Class[]{TestMain.class});
		database.create();

		Login login = new Login();
		

	}

}
