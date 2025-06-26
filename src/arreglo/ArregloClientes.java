package arreglo;

import java.util.ArrayList;

import clases.ClaseRegistro;

public class ArregloClientes {
	private ArrayList<ClaseRegistro> clr;
	
	public ArregloClientes() {
		clr = new ArrayList<ClaseRegistro>();
		
	}
	
	
	public void adicionar(ClaseRegistro r) {
		clr.add(r);
	}
	
	public int tamanio() {
		return clr.size();
	}
	
	public ClaseRegistro obtener(int i) {
		return clr.get(i);
	}
	
	public ClaseRegistro buscar(int dniBus) {
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getDni()==dniBus) {
				return obtener(i);
			}
		}
		return null;
	}
	
	public void eliminar(ClaseRegistro x) {
		clr.remove(x);
	}


}
