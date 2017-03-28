package utiles;

import java.util.ArrayList;


public class Lista {
	private ArrayList<Object> arrayList;

	public Lista(ArrayList<Object> arrayList) {
		this.arrayList = arrayList;
	}

	public Lista() {
		arrayList = new ArrayList<Object>();
	}

	public void annadir(Object object) {
		arrayList.add(object);
	}


	void insertarElemento(int indice, Object object) {
		arrayList.add(indice, object);
	}


	void modificarElemento(Object OViejo, Object ONuevo) {
		while (arrayList.contains(OViejo)) {
			arrayList.add(arrayList.indexOf(OViejo), ONuevo);
		break;
		}
	}


	public int size() {
		return arrayList.size();
	}

	void eliminarElemento(int indice) {
		arrayList.remove(indice);
	}

	public void mostrarLista() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("\t"+"["+i+"] -> "+arrayList.get(i));
		}
	}

	String buscarElemento(Object cadena){
		if (arrayList.contains(cadena)){
			return "El elemento "+ cadena +" esta en la lista";
		}else
			return "El elemento "+cadena+" NO esta en la lista";
	}

	Object copiarLista(ArrayList<Object> arrayList){
		return arrayList.clone();
	}

	public Object get(int i) {
		return arrayList.get(i);
	}
}
