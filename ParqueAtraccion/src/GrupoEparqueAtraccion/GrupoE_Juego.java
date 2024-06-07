package GrupoEparqueAtraccion;

public class GrupoE_Juego extends ParqueAtracciones{
	private String  nombreAtraccion;
	private String  codigoAtraccion;
	public GrupoE_Juego(String nombreDelParqueString, String direccionParque, String nombreAtraccion,
			String codigoAtraccion) {
		super(nombreDelParqueString, direccionParque);
		this.nombreAtraccion = nombreAtraccion;
		this.codigoAtraccion = codigoAtraccion;
	}
	
	
}
//private String ;
//public void () {}