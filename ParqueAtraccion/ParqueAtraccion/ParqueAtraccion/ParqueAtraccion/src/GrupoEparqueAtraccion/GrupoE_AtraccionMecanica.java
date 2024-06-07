package GrupoEparqueAtraccion;

import java.util.Scanner;

public class GrupoE_AtraccionMecanica extends ParqueAtracciones {
    private String carritoChocon;
    private String martillo;

    public GrupoE_AtraccionMecanica() {
        super();
        this.carritoChocon=carritoChocon;
        this.martillo=martillo;
    }

    @Override
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("---------------------------------------------");
        System.out.print("---------------------------------------------");
        System.out.print("1) carritoChocon  ");
        System.out.print("2) martillo ");
        System.out.print("---------------------------------------------");
        int desicion =scanner.nextInt();
         if(desicion ==1) {
        	 carritoChocon ="carrito Chocon";
         }else if(desicion ==2) {
        	 martillo="martillo";
         }else {
          System.out.print(" no puede elegir una opcion fuera del rango");
          ingresarDatos();        
          }
        
        System.out.print("Hecho");

    }

    @Override
    public void mostrarDatos() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Carrito Chocón: " + carritoChocon);
        System.out.println("Martillo: " + martillo);
        System.out.println("-------------------------------------------------------");
    }
}
