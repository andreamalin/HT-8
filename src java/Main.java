/**********************************************************
*Main.java   		      	Fecha de creacion: 26 de marzo
*                           Ultima fecha de modificacion: 30 de marzo
*                           
*Clase encargada de interactuar con el usuario
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.*;
import java.io.*; 

public class Main{
	public static void main(String[] args) {
		Factory factory = new Factory();
		PriorityQueueInterface priority;

		Scanner scan = new Scanner(System.in);
		boolean seguir = true;
		int priority_escogido = 0;

		System.out.println("__________________________________________");
		System.out.println("\n1. Priority Queue Java\n2. Priority Queue con Vector Heap"); //Opciones de priority
		System.out.println("__________________________________________");		

		//Defensiva a priority escogido
		while(seguir){
			String priority_string = scan.next();
			try {
				priority_escogido = Integer.parseInt(priority_string);
				if (priority_escogido==1 || priority_escogido == 2) {
					seguir = false;
				} else {
					System.out.println("Ingrese un numero dentro del rango");
				}
			} catch (Exception e){
				System.out.println("Ingrese un numero entero");
			}
		}

		priority = factory.getPriority(priority_escogido); //Instanciando

		//Defensiva archivo de texto
		try {
			Scanner r = new Scanner(new File("pacientes.txt")); 
			while (r.hasNextLine()) {
				String txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				String[] word = txt.split(", ");

				priority.add(new Paciente(word[0], word[1], word[2])); //Se agrega al vector
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		}		

		while(priority.size()!=0){
			System.out.println("\nPara mostrar el siguiente paciente presione enter\n");
			String ingresado = scan.nextLine();
			seguir = true;

			if (seguir) {
				System.out.println("__________________________________________");
				System.out.println("Siguiente paciente: \n"+((Paciente)(priority.remove())).nextPacient()); //Se muestra el siguiente paciente y se remueve
				System.out.println("__________________________________________");		
				seguir = false;			
			}
		}

		System.out.println("__________________________________________");
		System.out.println("	Todos fueron atendidos"); //Se acabaron los pacientes
		System.out.println("__________________________________________");	

	}



	
}