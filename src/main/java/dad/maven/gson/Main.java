package dad.maven.gson;

import java.util.Scanner;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

	public static void main(String[] args) {
		String nombre,apellidos,edad; //edad es de tipo String pero luego lo parseamos a int
	
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		nombre = in.nextLine();
		
		if(nombre.matches("^[a-zA-Z]+$")==true){
			System.out.println("Introduzca sus apellidos: ");
			apellidos = in.nextLine();
			
			if(apellidos.matches("^[a-zA-Z]+$")==true){
				System.out.println("Por ultimo, introduzca su edad: ");
				edad = in.nextLine();
				if(edad.matches("^[0-9]+$")==true){
					in.close();
					Persona p = new Persona(nombre,apellidos,Integer.parseInt(edad)); //parseamos a Int la edad
					javaToJson(p);
			}
		  }
	   }
	}
	
	public static void javaToJson (Persona p) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
	
	

}
