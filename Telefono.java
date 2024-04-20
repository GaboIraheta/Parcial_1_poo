import java.util.ArrayList;
import java.util.Scanner;

public class Telefono extends Articulos implements Precio_Descripcion {

    private float camara;
    private int bateria;

    public void set_camara(float _camara) {
        this.camara = _camara;
    }

    public float get_camara() {
        return camara;
    }

    public void set_bateria(int _bateria) {
        this.bateria = _bateria;
    }

    public int get_bateria() {
        return bateria;
    }
    public Telefono(String nombre, String modelo, String descripcion, double precio, String marca, float camara, int bateria) {
        super.nombre = nombre;
        super.modelo = modelo;
        super.descripcion = descripcion;
        super.precio = precio;
        super.tipo_articulo = "Telefono";
        super.marca = marca;
        this.camara = camara;
        this.bateria = bateria;
    }

    public double obtener_precio(double precio, Scanner input) {
        System.out.println("Ingrese el precio del telefono: ");
        precio = input.nextInt();
        return precio;
    }

    public void mostrar_descripcion() {
        System.out.println("--------");
        System.out.println("TELEFONO");
        System.out.println("--------");
        System.out.println();

        System.out.println("-------");
        System.out.println(nombre);
        System.out.println("-------");
        System.out.println(" - Marca: " + marca);
        System.out.println(" - Modelo:" + modelo);
        System.out.println(" - Descripcion: " + descripcion);
        System.out.println(" - Precio: $" + precio);
        System.out.println(" - Camara: " + camara + " mP");
        System.out.println(" - Bateria: " + bateria + " mA");
        System.out.println();
    }
}