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

    public Servicio() {
        super();
        costoHora = 0.0;
        cantidadHoras = 0;
        nombrePersona = "";
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
      Double total = getCostoHora() * getCantidadHoras();
      return total;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Servicio");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Cantidad de horas: " + getCantidadHoras());
        System.out.println("Costo por hora: " + getCostoHora());
        System.out.println("Nombre de persona autorizada: " + getNombrePersona());
    }
}
