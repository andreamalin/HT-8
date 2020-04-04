/**********************************************************
*QueueJava.java     Fecha de creacion: 04 de abril
*                   Ultima fecha de modificacion: 04 de abril
*                           
*Clase encargada de los metodos de un queue java frameworks
*
*@author Andrea Amaya #19357
*Codigo adaptado de: Java Platform SE 7
https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
**********************************************************/
import java.util.PriorityQueue;


public class QueueJava<E extends Comparable<E>> implements PriorityQueueInterface<E>{
	protected PriorityQueue<E> data  = new PriorityQueue<E>(); // datos agregados

	public E remove(){
		return data.remove();
	}


	public void add(E value){
		data.add(value);
	}


	public int size(){
		return data.size();
	}
}
