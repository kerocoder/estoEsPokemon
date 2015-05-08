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
	
