package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Presupuesto extends Elemento {

    private List<Item> items;

    public Presupuesto(String nombre, String descripcion) {
        super(nombre, descripcion);
        items = new ArrayList<>();
    }

    public Presupuesto() {
        super();
        items = new ArrayList<>();
    }

    public Presupuesto(List<Item> items, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public double calcularTotal() {
        double total = 0;

        for (Item i : items) {
            total += i.calcularTotal();
        }

        return total;
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void eliminarItem(Item item) {
        items.remove(item);
    }

    public void reemplazarItem(int indice, Item item) {
        items.set(indice, item);
    }
}
