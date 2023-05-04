package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
	IArquivosController arqCont = new ArquivosController();
	
	
	String path = "C:\\TEMP\\generic_food.csv" ;

	try {
	
		arqCont.ReadFile(path);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	}

}