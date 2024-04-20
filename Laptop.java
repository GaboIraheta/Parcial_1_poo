import java.util.Scanner;

public class Laptop extends Articulos implements Precio_Descripcion {

    private int ram;
    private float cpu;

    public void set_ram(int _ram) {
        this.ram = _ram;
    }

    public int get_ram() {
        return ram;
    }

    public void set_cpu() {
        this.cpu = cpu;
    }

    public float get_cpu() {
        return cpu;
    }
    public Laptop(String nombre, String modelo, String descripcion, double precio, String marca, int ram, float cpu) {
        super.nombre = nombre;
        super.modelo = modelo;
        super.descripcion = descripcion;
        super.precio = precio;
        super.tipo_articulo = "Laptop";
        super.marca = marca;
        this.ram = ram;
        this.cpu = cpu;
    }

    public double obtener_precio(double precio, Scanner input) {
        System.out.println("Ingrese el precio de la laptop: ");
        precio = input.nextInt();
        return precio;
    }

    public void mostrar_descripcion() {
        System.out.println("------");
        System.out.println("LAPTOP");
        System.out.println("------");
        System.out.println();

        System.out.println("-------");
        System.out.println(nombre);
        System.out.println("-------");
        System.out.println(" - Marca: " + marca);
        System.out.println(" - Modelo:" + modelo);
        System.out.println(" - Descripcion: " + descripcion);
        System.out.println(" - Precio: $" + precio);
        System.out.println(" - Memoria RAM: " + ram + " GB");
        System.out.println(" - Procesador: " + cpu + " gHz");
        System.out.println();
    }
}