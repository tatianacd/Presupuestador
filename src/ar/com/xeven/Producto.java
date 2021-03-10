package ar.com.xeven;

public class Producto extends Elemento implements Item {

    private int cantidad;
    private double precioUnitario;

    public Producto(String nombre, String descripcion, int cantidad, double precioUnitario) {
        super(nombre, descripcion);
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Producto(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Producto(String nombre, String descripcion, double precioUnitario) {
        super(nombre, descripcion);
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public Double calcularTotal() {
        return null;
    }

    @Override
    public void mostrarDetalles() {

    }
}
