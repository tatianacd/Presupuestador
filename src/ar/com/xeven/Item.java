package ar.com.xeven;
/*
Crear un sistema que tenga una interfaz que permita al usuario indicar desde un menú lo siguiente:

1) Si quiere agregar elementos al presupuesto.
2) Si quiere modificar un elemento.
3) Si quiere eliminar un elemento.

Los elementos/ítems pueden ser productos o servicios.
Cada producto tiene una cantidad, un precio unitario, un nombre y una descripción.
Cada servicio tiene un costo por hora y una cantidad de horas. Además del nombre del servicio, el nombre de la persona que lo ejecuta y una descripción.

Una vez que el presupuesto está listo (el usuario decide finalizar), mostrar el presupuesto total y el detalle de todos los ítems agregados.

Los usuarios hacen fila para pedir presupuestos y esos presupuestos al final del día se muestran en el orden de llegada.

 */
public interface Item {
    // todos los msjs comunes entre los productos y servicios

    Double calcularTotal();
    void mostrarDetalles();

}
