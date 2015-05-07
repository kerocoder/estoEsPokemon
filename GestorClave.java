package test;

public class GestorClave {
	public String[][] gestor;
	public String clave;
	public String valor;
	public int longitud;
	public int numelementos = 0;

public GestorClave(int l){
	longitud = l;
	gestor = new String[longitud][1];
}

public void put(String c, String v) {
	for (int i=0;i<numelementos;i++) {
		if (gestor[i].equals(c)){
			gestor[i][1]= v;
		} else {
			gestor[numelementos][0]= c;
			gestor[numelementos][1]= v;
			numelementos++;
		
		}
	}
	
}

}
