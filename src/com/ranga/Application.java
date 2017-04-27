package com.ranga;
import java.util.List;
public class Application {
	public static void main(String[] args) throws Exception {
		StudentDAO studentDAO = new StudentDAOImpl();
		Ventana cru = new Ventana();
		cru.setVisible(true);
	}
}