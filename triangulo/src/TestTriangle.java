
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class TestTriangle{
	
	//@SuppressWarnings("static-access")
	@Test
	public void testCreateTriangle( ) {
		
		Triangle t1 = new Triangle(4, 2, 4);
		
		//Verificando se o construtor estÃ¡ correto
		assertEquals("Primeiro lado", t1.a, 4);
		assertEquals("Segundo lado ", t1.b, 2);
		assertEquals("Terceiro lado", t1.c, 4);
		assertNotNull(t1.a);
		assertNotNull(t1.b);
		assertNotNull(t1.c);
	}
	
	@Test
	public void testTypeTriangle( ) {
		
		Triangle t1 = new Triangle(4, 2, 4);
		Triangle t2 = new Triangle(4, 2, 4);
		//
		Triangle t3 = new Triangle(1, 1, 2);
		Triangle t4 = new Triangle(-1, 2, 4);
		Triangle t5 = new Triangle(3, 5, 5);
		Triangle t6 = new Triangle(3, 3, 3);
		Triangle t7 = new Triangle(5, 5, 5);
		Triangle t8 = new Triangle(3, 5, 5);
		//
		
		//1-EQUILATERO 2-ISOSCELES 3-ESCALENO 4-INEXISTENTE
				
		assertTrue("Não é um triângulo", t1.determineType() != 4);
		assertTrue("É um triângulo isósceles", t1.determineType() == 2);
    	assertNotSame("Não é o mesmo objeto triângulo", t1, t2);
    	assertFalse("Não são iguais", t1.equals(t2));
    	//
    	assertTrue("Inexistente", t3.determineType() == 4);
    	assertTrue("Inexistente", t4.determineType() == 4);
    	assertTrue("Isósceles", t5.determineType() == 2);
    	assertTrue("Equilatero", t6.determineType() == 1);
    	assertTrue("Equilatero2", t7.determineType() == 1);
    	//
    	

	}
}
