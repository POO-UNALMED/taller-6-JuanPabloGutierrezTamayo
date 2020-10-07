package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais> paises= new ArrayList<Pais>();
	
	public Pais(String nombre){
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public static List<Pais> getPaises() {
		return paises;
	}
	public static Pais paisMasVendedor() {
		Pais MasVendedor=paises.get(0);
		int frecuenciaMasVendedor=Collections.frequency(paises, MasVendedor);
		for(int i=0; i<paises.size();i++) {
			if ( Collections.frequency(paises, paises.get(i)) > frecuenciaMasVendedor){
				MasVendedor=paises.get(i);
				frecuenciaMasVendedor=Collections.frequency(paises, paises.get(i));
			}	
		}
		return MasVendedor;
			
	}

}
