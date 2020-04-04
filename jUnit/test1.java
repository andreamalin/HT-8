import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {
	public void test() {
		VectorHeap<String> vector = new VectorHeap();
		
		vector.add("Manzana");
		vector.add("Pera");
		vector.add("Durazno");
		vector.add("Limon");
		
		
		String esperado = "Durazno";
		String obtenido = vector.remove();
		
		assertEquals(esperado, obtenido);
	}

}
