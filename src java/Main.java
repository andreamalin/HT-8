/**********************************************************
*Main.java   		      	Fecha de creacion: 26 de marzo
*                           Ultima fecha de modificacion: 26 de marzo
*                           
*Clase encargada de interactuar con el usuario
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.*;
import java.io.*; 

public class Main{
	public static void main(String[] args) {
		String txt = "";
		VectorHeap vector = new VectorHeap();
		
		try {
			Scanner r = new Scanner(new File("pacientes.txt")); 
			while (r.hasNextLine()) {
				txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				String[] word = txt.split(", ");  
				vector.add(new Paciente(word[0], word[1], word[2])); //Se agrega al vector
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		}		
	}


	
}