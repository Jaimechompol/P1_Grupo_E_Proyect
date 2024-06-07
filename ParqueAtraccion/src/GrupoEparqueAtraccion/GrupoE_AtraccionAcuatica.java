package GrupoEparqueAtraccion;

public class GrupoE_AtraccionAcuatica extends GrupoE_Juego {
	private String tobogan ;

	public GrupoE_AtraccionAcuatica(String nombreDelParqueString, String direccionParque, String nombreAtraccion,
			String codigoAtraccion, String tobogan) {
		super(nombreDelParqueString, direccionParque, nombreAtraccion, codigoAtraccion);
		this.tobogan = tobogan;
	}
	
	public void mostrarDatos() {}
	public void ingresoDatos() {}
	
}
//private String ;
//public void () {}