package GrupoEparqueAtraccion;

import java.util.Scanner;

public class GrupoE_AtraccionAcuatica extends ParqueAtracciones {
    private String tobogan;

    public GrupoE_AtraccionAcuatica() {
        super("Vulcano Park", "Av. Ejemplo");
    }

    @Override
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("---------------------------------------------");
        System.out.print(" elija el tipo de atraccion Acuatica disponible");
        System.out.print("---------------------------------------------");
        System.out.print("1) Tobogan  ");
        System.out.print("2)   ");
        System.out.print("---------------------------------------------");
        int desicion =scanner.nextInt();
         if(desicion ==1) {
        	 tobogan =" Tobogan";
         }else if(desicion ==2) {
        	 
         }else {
          System.out.print(" no puede elegir una opcion fuera del rango");
          ingresarDatos();        
          }
        
        System.out.print("Hecho");

    }

    @Override
    public void mostrarDatos() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Tobogán: " + tobogan);
        System.out.println("-------------------------------------------------------");
    }
}
