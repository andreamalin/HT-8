/**********************************************************
*VectorHeap.java        	Fecha de creacion: 26 de marzo
*                           Ultima fecha de modificacion: 26 de marzo
*                           
*Clase encargada de los metodos de un vector heap
*
*@author Andrea Amaya #19357
*Codigo adaptado de: Java Structures: Data Structures pagina 321 y 322
**********************************************************/
import java.lang.*;
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueueInterface<E>{
	protected Vector<E> data; // Datos guardados

	public VectorHeap(){
		data = new Vector<E>();
	}

	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size());
	
		for (i = 0; i < v.size(); i++){ // Se agrega el elemento a los datos
			add(v.get(i));
		}
	}
	
	/*ORDEN*/
	protected static int parent(int i){
		return (i-1)/2;
	}
	
	protected static int left(int i){
		return 2*i+1;
	}

	protected static int right(int i){
		return 2*(i+1);
	}
	//Se guardan en orden
	protected void percolateUp(int hoja){
		int parent = parent(hoja);
		E value = data.get(hoja);
		while (hoja > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(hoja,data.get(parent));
			hoja = parent;
			parent = parent(hoja);
		}
		data.set(hoja,value);
	}

	//Se corren los datos como corresponda
	protected void pushDownRoot(int root){
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; 
			} else { 
				data.set(root,value);
				return;
			}
			} else { 
				data.set(root,value);
				return;
			}
		}
	}


	/*METODOS INTERFACE*/
	public void add(E value){
		data.add(value);
		percolateUp(data.size()-1);
	}

	public E remove(){
		E minVal = data.get(0);

		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);

		if (data.size() > 1){
			pushDownRoot(0);
		}
		return minVal;
	}


	public int size(){
		return data.size();
	}
}