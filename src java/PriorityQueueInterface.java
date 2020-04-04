/**********************************************************
*PriorityQueue.java         Fecha de creacion: 26 de marzo
*                           Ultima fecha de modificacion: 26 de marzo
*                           
*Clase encargada de los metodos de un priority queue
*
*@author Andrea Amaya #19357
*Codigo adaptado de: Java Structures: Data Structures
y Java Platform SE 7
**********************************************************/
import java.lang.*;

public interface PriorityQueueInterface<E extends Comparable<E>>{
	//Pre: El queue no esta vacio
	//Post: Se remueve y retorna el valor mas pequeno dentro del queue
	public E remove();

	/**
	@param E 	Valor a agregar
	Post: Se agrega un valor al queue
	*/
	public void add(E value);


	//Post: Se retorna la cantidad de elementos dentro del queue
	public int size();
}