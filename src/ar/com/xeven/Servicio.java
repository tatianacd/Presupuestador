package ar.com.xeven;

public class Servicio extends Elemento implements Item{

    private Double costoHora;
    private int cantidadHoras;
    private String nombrePersona;

    public Servicio(String nombre, String descripcion, Double costoHora, int cantidadHoras, String nombrePersona) {
        super(nombre, descripcion);
        this.costoHora = costoHora;
        this.cantidadHoras = cantidadHoras;
        this.nombrePersona = nombrePersona;
    }

    public Double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(Double costoHora) {
        this.costoHora = costoHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public Double calcularTotal() {
        return null;
    }

    @Override
    public void mostrarDetalles() {

    }
}
