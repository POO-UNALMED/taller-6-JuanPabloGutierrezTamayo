package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static List<Fabricante> fabricantes=new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais p) {
		this.nombre = nombre;
		this.pais = p;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static Fabricante fabricaMayorVentas() {
		Fabricante MasVentas=fabricantes.get(0);
		int frecuenciaMasVentas=Collections.frequency(fabricantes, MasVentas);
		for(int i=0; i<fabricantes.size();i++) {
			if ( Collections.frequency(fabricantes, fabricantes.get(i)) > frecuenciaMasVentas){
				MasVentas=fabricantes.get(i);
				frecuenciaMasVentas=Collections.frequency(fabricantes, fabricantes.get(i));
			}	
		}
		return MasVentas;
	}
}
