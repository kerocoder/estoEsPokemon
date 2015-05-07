package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClaveTest {

	public GestorClave gestor;
	
	@Before
	public void preparacion() {
		gestor = new GestorClave(10);
	}
	
	
	@Test
	public void insertarNuevoParDeElementos() {
		
		String clave="nombre";
		String valor="luis";
		
		gestor.put(clave,valor);
		assertSame("bien", clave, gestor.gestor[0][1]);
		
	
	}

}
