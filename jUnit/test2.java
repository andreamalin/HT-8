import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {
	public void test() {
		VectorHeap<String> vector = new VectorHeap();
		
		vector.add("Manzana");
		vector.add("Pera");
		vector.add("Durazno");
		vector.add("Limon");
		
		
		int esperado = 4;
		int obtenido = vector.size();
		
		assertEquals(esperado, obtenido);
	}

}
