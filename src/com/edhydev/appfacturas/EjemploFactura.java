package com.edhydev.appfacturas;

import com.edhydev.appfacturas.model.*;
import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNif("1111-1");
        cliente.setNombre("Edgar");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(scanner.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura( scanner.nextInt(), producto));

            System.out.println();
            scanner.nextLine(); // movemos el cursor del scanner a la siguiente línea
        }

        System.out.println(factura.toString());
    }

}
