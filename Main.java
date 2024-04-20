import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Articulos> articulos;
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        articulos = new ArrayList<>();
        String nombre;
        String marca;
        String modelo;
        String descripcion;
        double precio = 0;
        float camara;
        int bateria;
        int ram;
        float cpu;

        while(true) {
            try {
                System.out.println("-----------------------------------");
                System.out.println("SISTEMA DE INVENTARIO - ElectroMart");
                System.out.println("-----------------------------------");
                System.out.println();

                System.out.println("Seleccione una opcion de inventario");
                System.out.println("1. Agregar nuevo articulo");
                System.out.println("2. Modificar informacion de articulo");
                System.out.println("3. Consultar articulos");
                System.out.println("4. Salir del sistema");

                System.out.print("Opcion: ");

                switch (input.nextInt()) {
                    case 1:

                        System.out.println("--------------");
                        System.out.println("NUEVO ARTICULO");
                        System.out.println("--------------");
                        System.out.println();

                        System.out.println("Seleccione el tipo de articulo");
                        System.out.println("1. Telefono");
                        System.out.println("2. Laptop");

                        System.out.print("Opcion:");

                        switch (input.nextInt()) {
                            case 1:

                                input.nextLine();
                                System.out.println();
                                System.out.print(" - Nombre del telefono: ");
                                nombre = input.nextLine();
                                System.out.print(" - Marca: ");
                                marca = input.nextLine();
                                System.out.print(" - Modelo: ");
                                modelo = input.nextLine();
                                System.out.print(" - Descripcion: ");
                                descripcion = input.nextLine();
                                input.nextLine();
                                System.out.print(" - Camara: ");
                                camara = input.nextFloat();
                                System.out.print(" - Bateria: ");
                                bateria = input.nextInt();

                                Telefono nuevo_telefono = new Telefono(nombre, modelo, descripcion, 0, marca, camara, bateria);

                                nuevo_telefono.set_precio(nuevo_telefono.obtener_precio(precio, input));

                                articulos.add(nuevo_telefono);

                                System.out.println("Nuevo articulo agregado exitosamente!");

                                break;

                            case 2:

                                input.nextLine();
                                System.out.println();
                                System.out.print(" - Nombre de Laptop: ");
                                nombre = input.nextLine();
                                System.out.print(" - Marca: ");
                                marca = input.nextLine();
                                System.out.print(" - Modelo: ");
                                modelo = input.nextLine();
                                System.out.print(" - Descripcion: ");
                                descripcion = input.nextLine();
                                System.out.print(" - Memoria RAM: ");
                                ram = input.nextInt();
                                System.out.print(" - Procesador: ");
                                cpu = input.nextFloat();

                                Laptop nuevo_laptop = new Laptop(nombre, modelo, descripcion, 0, marca, ram, cpu);

                                nuevo_laptop.set_precio(nuevo_laptop.obtener_precio(precio, input));

                                articulos.add(nuevo_laptop);

                                System.out.println("Nuevo articulo agregado exitosamente!");

                                break;
                        }

                        break;

                    case 2:

                        System.out.println("------------");
                        System.out.println("MODIFICACION");
                        System.out.println("------------");
                        System.out.println();

                        input.nextLine();
                        System.out.print("Ingrese el nombre del articulo que desea modificar el precio: ");
                        nombre = input.nextLine();

                        if (modificar(nombre)) {
                            System.out.println("El precio del articulo " + nombre + " ha sido modificado con exito!");
                        } else {
                            System.out.println("El nombre del articulo no ha sido encontrado, intentelo de nuevo");
                        }

                        break;

                    case 3:

                        System.out.println("-----------------------------------");
                        System.out.println("ARTICULOS DISPONIBLES DE INVENTARIO");
                        System.out.println("-----------------------------------");
                        System.out.println();

                        for (Articulos articulo : articulos) {
                            if (articulo.get_tipo_articulo().equals("Telefono")) {
                                Telefono telefono = (Telefono) articulo;
                                telefono.mostrar_descripcion();
                            } else if (articulo.get_tipo_articulo().equals("Laptop")) {
                                Laptop laptop = (Laptop) articulo;
                                laptop.mostrar_descripcion();
                            }
                        }

                        break;

                    case 4:

                        return;

                }
            } catch(InputMismatchException e){
                System.out.println("Ingrese un numero de opcion valido");
                input.nextLine();
            }
        }
    }

    public static boolean modificar(String nombre) {
        double nuevo_precio;
        for(Articulos articulo : articulos) {
            if(articulo.get_nombre().equals(nombre)) {
                System.out.print("Ingrese el nuevo precio del articulo: ");
                nuevo_precio = input.nextDouble();
                articulo.set_precio(nuevo_precio);
                return true;
            }
        }
        return false;
    }
}
