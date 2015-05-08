package test;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class ClaveTest {

	public GestorClave ges;
	public String clave,valor;
	
	@Before
	public void preparacion() {
		ges = new GestorClave();
	}
	
	@Test
	public void insertarNuevoParDeElementos() {
		
		clave="nombre";
		valor="Ash";
		
		ges.put(clave,valor);
		
		assertEquals(valor, ges.get(clave));
		
	}
	
	@Test
	public void devolverValorAsociadoAUnaClave() {
		
		clave="apellido";
		valor="Ketchum";
		
		ges.put(clave,valor);
		
		assertEquals(valor, ges.get(clave));
		
	}
	
	@Test
	public void devolverValorAsociadoAUnaClaveOPodDefecto() {
		
		clave="Ciudad";
		valor="Pueblo Paleta";
		String valorDefecto="suicidio";
		
		ges.put(clave,valor);
		
		assertEquals(valor, ges.getOrElse(clave,valorDefecto));
		
	}
	@Test
	public void comprobarSiExisteLaClave() {
		
		clave="ID de entrenador";
		valor="12345678A";
		
		ges.put(clave,valor);
		
		assertEquals(true, ges.containsKey(clave));
		
	}
}