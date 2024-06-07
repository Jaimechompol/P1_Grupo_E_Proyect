package GrupoEparqueAtraccion;

import java.util.Scanner;

public class GrupoE_Cliente extends ParqueAtracciones {
    private String nombreUsuario;
    private String apellidoUsuario;
    private int cedulaUsuario;
    private int edadUsuario;
    private double estaturaUsuario;
    private String hipertensionUsuario;

    public GrupoE_Cliente() {
        super("Vulcano Park", "Av. Ejemplo");
    }
    



	public String getNombreUsuario() {
		return nombreUsuario;
	}




	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}




	public String getApellidoUsuario() {
		return apellidoUsuario;
	}




	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}




	public int getCedulaUsuario() {
		return cedulaUsuario;
	}




	public void setCedulaUsuario(int cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}




	public int getEdadUsuario() {
		return edadUsuario;
	}




	public void setEdadUsuario(int edadUsuario) {
		this.edadUsuario = edadUsuario;
	}




	public double getEstaturaUsuario() {
		return estaturaUsuario;
	}




	public void setEstaturaUsuario(double estaturaUsuario) {
		this.estaturaUsuario = estaturaUsuario;
	}




	public String getHipertensionUsuario() {
		return hipertensionUsuario;
	}




	public void setHipertensionUsuario(String hipertensionUsuario) {
		this.hipertensionUsuario = hipertensionUsuario;
	}




	@Override
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese el apellido del usuario: ");
        apellidoUsuario = scanner.nextLine();
        System.out.print("Ingrese la cédula del usuario: ");
        cedulaUsuario = scanner.nextInt();
        System.out.print("Ingrese la edad del usuario: ");
        edadUsuario = scanner.nextInt();
        System.out.print("Ingrese la estatura del usuario: ");
        estaturaUsuario = scanner.nextDouble();
        scanner.nextLine(); // consumir el salto de línea
        System.out.print("¿Tiene hipertensión (Si/No)? ");
        hipertensionUsuario = scanner.nextLine();
    }

    public void elegirTipoJuego() {
        // Implementar lógica para elegir el tipo de juego
    }

    public void pagar() {
        // Implementar lógica para pagar
    }
}
