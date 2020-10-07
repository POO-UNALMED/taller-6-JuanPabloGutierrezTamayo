package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAutomoviles;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int numpuestos) {
		super(placa, 4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=numpuestos;
		cantidadAutomoviles++;
		
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}
		
}
