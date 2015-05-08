package test;
import java.io.IOException;
import java.util.Hashtable;

public class GestorClave {

	Hashtable<String, String> gestor;	
	
	
	public GestorClave(){
		gestor = new Hashtable<String, String>();
	}
	
	@Test
	public void insertarNuevoParDeElementos() {
		
		clave="nombre";
		valor="Ash";
		
		ges.put(clave,valor);
		
		assertEquals(valor, ges.get(clave));
		
	}
}