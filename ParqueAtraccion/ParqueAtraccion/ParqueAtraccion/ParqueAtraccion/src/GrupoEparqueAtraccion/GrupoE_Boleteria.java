package GrupoEparqueAtraccion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GrupoE_Boleteria extends ParqueAtracciones {
    private int numBoletoUsuario;
    private double precio;
    private int tiempoCaducidadMin;
    private String fechaDeCompra;
    private String nombreEmpleado;

    public GrupoE_Boleteria() {
        
    }
	public GrupoE_Boleteria(String nombreDelParque, String direccionParque, int numBoletoUsuario, double precio,int tiempoCaducidadMin, String fechaDeCompra, String nombreEmpleado) {
		super(nombreDelParque, direccionParque);
		this.numBoletoUsuario = numBoletoUsuario;
		this.precio = precio;
		this.tiempoCaducidadMin = tiempoCaducidadMin;
		this.fechaDeCompra = fechaDeCompra;
		this.nombreEmpleado = nombreEmpleado;
	}
 

	public double getPrecio() {
		return precio;
	}



	public int getNumBoletoUsuario() {
		return numBoletoUsuario;
	}


    

	@Override
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de boleto: ");
        numBoletoUsuario = scanner.nextInt();
        System.out.print("Ingrese el precio: ");
        precio = scanner.nextDouble();
        System.out.print("Ingrese el tiempo de caducidad en minutos: ");
        tiempoCaducidadMin = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea
        System.out.print("Ingrese la fecha de compra: ");
        fechaDeCompra = scanner.nextLine();
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
    }

    public void generarTicket(GrupoE_Cliente cliente) {
        try (FileWriter writer = new FileWriter("boletos.csv", true)) {
            writer.append(cliente.getNombreUsuario())
                    .append(",")
                    .append(String.valueOf(numBoletoUsuario))
                    .append(",")
                    .append(String.valueOf(precio))
                    .append(",")
                    .append(fechaDeCompra)
                    .append(",")
                    .append(nombreEmpleado)
                    .append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void imprimirTicket(GrupoE_Cliente cliente) {
        System.out.println("Ticket generado para: " + cliente.getNombreUsuario());
        System.out.println("Número de boleto: " + numBoletoUsuario);
        System.out.println("Precio: " + precio);
        System.out.println("Fecha de compra: " + fechaDeCompra);
        System.out.println("Empleado: " + nombreEmpleado);
    }

    public boolean verificarDatos(GrupoE_Cliente cliente) {
        if (cliente.getEdadUsuario() < 18) {
            System.out.println("El cliente es menor de edad y no puede subirse a los toboganes.");
            return false;
        }
        return true;
    }

    public boolean validarCondiciones(GrupoE_Cliente cliente) {
        if (cliente.getEstaturaUsuario() < 1.2) {
            System.out.println("El cliente es muy bajo de estatura y no puede entrar al martillo.");
            return false;
        }
        return true;
    }


    public boolean validarEnfermedad(GrupoE_Cliente cliente) {
        if (cliente.getHipertensionUsuario().equalsIgnoreCase("si")) {
            System.out.println("El cliente sufre de hipertensión y no puede subirse a la Rueda Escobita Griega.");
            return false;
        }
        return true;
    }


   
}
