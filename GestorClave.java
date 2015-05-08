package test;
import java.io.IOException;
import java.util.Hashtable;

public class GestorClave {

	Hashtable<String, String> gestor;	
	
	
	public GestorClave(){
		gestor = new Hashtable<String, String>();
	}
	
	public void put(String clave, String valor){
		if (gestor.containsKey(clave)) {
			String s = gestor.get(clave);
			gestor.remove(clave,s);
			gestor.put(clave,valor);
		} else {
		    gestor.put(clave,valor);
		}
	}
	
	public String get(String clave){
		String s = null;
		if (gestor.containsKey(clave)){
			s = gestor.get(clave);
		} else {
			//throw DoesntExistsException;
		}
		return s;
	}
	
	public String getOrElse(String clave, String valorPorDefecto){
		String s = null;
		if (gestor.containsKey(clave)){
			s = gestor.get(clave);

		} else {
			s= valorPorDefecto;
		}
		return s;
	}
	
	public boolean containsKey(String clave){
		boolean b = gestor.containsKey(clave);
		return b;
	}
}