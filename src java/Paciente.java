/**********************************************************
*Paciente.java   		    Fecha de creacion: 26 de marzo
*                           Ultima fecha de modificacion: 26 de marzo
*                           
*Clase encargada de las fichas del paciente
*
*@author Andrea Amaya #19357
**********************************************************/
import java.lang.*;

public class Paciente implements Comparable<Paciente>{
	private String name;
	private String condition;
	private String priority;

	public Paciente(String name, String condition, String priority){
		this.name = name;
		this.condition = condition;
		this.priority = priority;
	}

	public String getPriority(){
		return this.priority;
	}

	public String nextPacient(){
		return ">Nombre: " + name + "\n>Condicion: " + condition + "\n>Prioridad: " + priority;
	}

	public int compareTo(Paciente that){
		return priority.compareTo(that.priority);
	}

}