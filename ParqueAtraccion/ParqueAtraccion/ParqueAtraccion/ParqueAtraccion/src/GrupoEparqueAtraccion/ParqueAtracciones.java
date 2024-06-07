package GrupoEparqueAtraccion;

import java.util.ArrayList;
import java.util.Scanner;

public class ParqueAtracciones {
    protected String nombreDelParque;
    protected String direccionParque;
    private static ArrayList<String> boletosVendidos = new ArrayList<>();
    public ParqueAtracciones() {
    	
    }
    public ParqueAtracciones(String nombreDelParque, String direccionParque) {
        this.nombreDelParque = nombreDelParque;
        this.direccionParque = direccionParque;
    }

    public void mostrarDatos() {
        System.out.println("-------------------------------------------------------");
        System.out.println(" ^^^^^^^^^ " + nombreDelParque + " ^^^^^^^^^^^^^^^^^ ");
        System.out.println("         " + direccionParque + "                     ");
        System.out.println("-------------------------------------------------------");
    }

    public void ingresarDatos() {
        nombreDelParque=" PortAventura World  ";
        direccionParque="  Salou --  Tarragona -- España     ";
    }
    public void verBoletosVendidos() {
        System.out.println("Boletos vendidos:");
        for (String boleto : boletosVendidos) {
            System.out.println(boleto);
        }
    }
    public void ComprarBoletos(ParqueAtracciones[] parque) {
        GrupoE_Cliente cliente = (GrupoE_Cliente) parque[0];
        GrupoE_Boleteria boleteria = (GrupoE_Boleteria) parque[1];

        cliente.ingresarDatos();
        if (boleteria.verificarDatos(cliente) && boleteria.validarCondiciones(cliente) && boleteria.validarEnfermedad(cliente)) {
            boleteria.ingresarDatos();
            boleteria.generarTicket(cliente);
            boleteria.imprimirTicket(cliente);
            boletosVendidos.add(cliente.getNombreUsuario() + ", Boleto N°: " + boleteria.getNumBoletoUsuario() + ", Precio: " + boleteria.getPrecio());
        } else {
            System.out.println("El cliente no cumple con las condiciones para subirse a las atracciones.");
        }
    }
}
