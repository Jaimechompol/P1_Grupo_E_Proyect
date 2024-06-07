package GrupoEparqueAtraccion;

public class GrupoE_AtraccionMecanica extends GrupoE_Juego{
	private String CarritoChocon;
	private String Martillo;
	public GrupoE_AtraccionMecanica(String nombreDelParqueString, String direccionParque, String nombreAtraccion,
			String codigoAtraccion, String carritoChocon, String martillo) {
		super(nombreDelParqueString, direccionParque, nombreAtraccion, codigoAtraccion);
		CarritoChocon = carritoChocon;
		Martillo = martillo;
	}
	
	public void mostrarDatos() {}
	public void ingresoDatos() {}
}
//private String ;
//public void () {}