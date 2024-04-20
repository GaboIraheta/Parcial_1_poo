public abstract class Articulos {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected double precio;
    protected String marca;
    protected String tipo_articulo;

    public void set_tipo_articulo(String _tipo_articulo) {
        this.tipo_articulo = _tipo_articulo;
    }

    public String get_tipo_articulo() {
        return tipo_articulo;
    }

    public void set_nombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_modelo(String _modelo) {
        this.modelo = _modelo;
    }

    public String get_modelo() {
        return modelo;
    }

    public void set_descripcion(String _descripcion) {
        this.descripcion = _descripcion;
    }

    public String get_desripcion() {
        return descripcion;
    }

    public void set_precio(double _precio) {
        this.precio = _precio;
    }

    public double get_precio() {
        return precio;
    }

    public void set_marca(String _marca) {
        this.marca = _marca;
    }

    public String get_marca() {
        return marca;
    }
}
