package GrupoEparqueAtraccion;

public class GrupoE_Boleteria extends GrupoE_Cliente {
	private int numBoletoUsuario ;
	private double precio;
	private int tiempocaducidadMin;
	private String fechaDeCompra;
	private String NombreEmpleado;
	public GrupoE_Boleteria(String nombreDelParqueString, String direccionParque, String nombreAtraccion,
			String codigoAtraccion, String nombreUsuario, String apellidoUsuario, int cedulaUsuario, int edadUsuario,
			double estaturaStringUsuario, String hipertencionUsuario, int numBoletoUsuario, double precio,
			int tiempocaducidadMin, String fechaDeCompra, String nombreEmpleado) {
		super(nombreDelParqueString, direccionParque, nombreAtraccion, codigoAtraccion, nombreUsuario, apellidoUsuario,
				cedulaUsuario, edadUsuario, estaturaStringUsuario, hipertencionUsuario);
		this.numBoletoUsuario = numBoletoUsuario;
		this.precio = precio;
		this.tiempocaducidadMin = tiempocaducidadMin;
		this.fechaDeCompra = fechaDeCompra;
		NombreEmpleado = nombreEmpleado;
	}
	
	public void GenerarTiket() {}
	public void imprimirTiket() {}
	public void VerificarDatos() {}
	public void ValidarCondiciones() {}
	public void ValidarEmfermedad() {}
	public void reservaTiket() {}
	
	
}
	
//private String ;
//public void () {}