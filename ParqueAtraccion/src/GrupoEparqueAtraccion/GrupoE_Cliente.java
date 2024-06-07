package GrupoEparqueAtraccion;

public class GrupoE_Cliente extends GrupoE_Juego {
	private String nombreUsuario;
	private String apellidoUsuario;
	private int cedulaUsuario;
	private int edadUsuario;
	private double estaturaStringUsuario;
	private String hipertencionUsuario;
	public GrupoE_Cliente(String nombreDelParqueString, String direccionParque, String nombreAtraccion,
			String codigoAtraccion, String nombreUsuario, String apellidoUsuario, int cedulaUsuario, int edadUsuario,
			double estaturaStringUsuario, String hipertencionUsuario) {
		super(nombreDelParqueString, direccionParque, nombreAtraccion, codigoAtraccion);
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.cedulaUsuario = cedulaUsuario;
		this.edadUsuario = edadUsuario;
		this.estaturaStringUsuario = estaturaStringUsuario;
		this.hipertencionUsuario = hipertencionUsuario;
	}
	
	public void elegirTipoJuego() {}
	public void pagar () {}
	
}
//private String ;
//public void () {}