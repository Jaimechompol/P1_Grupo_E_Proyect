package GrupoEparqueAtraccion;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    
    private static ArrayList<GrupoE_Cliente> reservaciones = new ArrayList<>();

    public static void main(String[] args) {
        ParqueAtracciones[] parque = new ParqueAtracciones[4];
        ParqueAtracciones parques = new ParqueAtracciones();

        parque[0] = new GrupoE_Cliente();
        parque[1] = new GrupoE_Boleteria();
        parque[2] = new GrupoE_AtraccionMecanica();
        parque[3] = new GrupoE_AtraccionAcuatica();

        cargarReservaciones();

        Scanner scanner = new Scanner(System.in);
        parques.ingresarDatos();
        parques.mostrarDatos();
        boolean salir = false;
        while (!salir) {
            System.out.println("Menu:");
            System.out.println("1. Vender un boleto");
            System.out.println("2. Ver boletos vendidos");
            System.out.println("3. Reservar boleto");
            System.out.println("4. Retirar boleto reservado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consumir el salto de línea

            switch (opcion) {
                case 1:
                    parques.ComprarBoletos(parque);
                    break;
                case 2:
                	parques.verBoletosVendidos();
                    break;
                case 3:
                    reservarBoleto(parque);
                    break;
                case 4:
                    retirarBoleto();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }

  

    

    private static void reservarBoleto(ParqueAtracciones[] parque) {
        GrupoE_Cliente cliente = (GrupoE_Cliente) parque[0];
        GrupoE_Boleteria boleteria = (GrupoE_Boleteria) parque[1];

        cliente.ingresarDatos();
        if (boleteria.verificarDatos(cliente) && boleteria.validarCondiciones(cliente) && boleteria.validarEnfermedad(cliente)) {
            boleteria.ingresarDatos();
            reservaciones.add(cliente);
            guardarReservaciones(); 
            System.out.println("Reservación guardada exitosamente.");
        } else {
            System.out.println("El cliente no cumple con las condiciones para subirse a las atracciones.");
        }
    }

    private static void retirarBoleto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (GrupoE_Cliente cliente : reservaciones) {
            if (cliente.getNombreUsuario().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println("Reservación encontrada:");
                System.out.println("Nombre: " + cliente.getNombreUsuario());
                System.out.println("Apellido: " + cliente.getApellidoUsuario());
                reservaciones.remove(cliente);
                guardarReservaciones();
                System.out.println("Reservación retirada exitosamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna reservación a nombre de " + nombre);
        }
    }

    private static void guardarReservaciones() {
        try (FileWriter writer = new FileWriter("reservaciones.csv")) {
            for (GrupoE_Cliente cliente : reservaciones) {
                writer.append(cliente.getNombreUsuario()).append(",")
                      .append(cliente.getApellidoUsuario()).append(",")
                      .append(String.valueOf(cliente.getCedulaUsuario())).append(",")
                      .append(String.valueOf(cliente.getEdadUsuario())).append(",")
                      .append(String.valueOf(cliente.getEstaturaUsuario())).append(",")
                      .append(cliente.getHipertensionUsuario()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void cargarReservaciones() {
        try (BufferedReader reader = new BufferedReader(new FileReader("reservaciones.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos = line.split(",");
                GrupoE_Cliente cliente = new GrupoE_Cliente();
                cliente.setNombreUsuario(datos[0]);
                cliente.setApellidoUsuario(datos[1]);
                cliente.setCedulaUsuario(Integer.parseInt(datos[2]));
                cliente.setEdadUsuario(Integer.parseInt(datos[3]));
                cliente.setEstaturaUsuario(Double.parseDouble(datos[4]));
                cliente.setHipertensionUsuario(datos[5]);
                reservaciones.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
