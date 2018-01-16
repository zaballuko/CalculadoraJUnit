package Calculadora;
import static org.junit.Assert.*;
import java.sql.*;

import org.junit.Test;



public class CalculadoraTest {

	@Test
	public void probarSuma(){
		System.out.println("Verificar suma");
		Calculadora calc = new Calculadora();
		assertTrue(calc.sumar(2, 3)==5);
		assertTrue(calc.sumar(1, 0)==1);
		
		
		
	}
	@Test
	public void assertNotNullTest(){
		assertNotNull(Calculadora.sumar(30,7));
	}
	
	@Test
	public void assertNullTest(){
		assertNull(Calculadora.multiplicar(7,0.8));
	}
	


}

		
