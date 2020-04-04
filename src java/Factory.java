/**********************************************************
*Factory.java				Fecha de creacion: 24/02/2020 
*							Ultima fecha de modificacion: 24/02/2020 
*							
*Factory para instanciar los priority queue
*
*@author Andrea Amaya #19357
**********************************************************/
public class Factory{
	/**
	//Pre: Haber elegido un stack 
	//Post: Intancia de tipo del stack seleccionado
	 * @param tipoQueue   Tipo de priority queue a instanciar
	*/
	public PriorityQueueInterface getPriority(int tipoQueue){
		if (tipoQueue == 1) { //Es un priority queue java
			return new QueueJava<String>();
		} else { //Es un priority queue implementando vector heap
			return new VectorHeap<String>();
		}
	}
}