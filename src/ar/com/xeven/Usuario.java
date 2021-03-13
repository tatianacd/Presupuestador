package ar.com.xeven;

import java.lang.reflect.Field;
import java.util.*;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    private String nombre;
    private Presupuesto presupuesto;

    public Usuario(String nombre) {
        this.nombre = nombre;
        presupuesto = new Presupuesto();
    }

    public Usuario() {
    }

    public void armarPresupuesto() {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("\n Menú: \n");
            System.out.println("1) Crear nuevo presupuesto");
            System.out.println("2) Agregar elementos al presupuesto");
            System.out.println("3) Modificar un elemento");
            System.out.println("4) Eliminar un elemento");
            System.out.println("0) Salir");
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nombreUsuario = sc.next();
                    Usuario usuario = new Usuario(nombreUsuario);
                    crearPresupuesto();
                    break;
                case 2:
                    agregarElementos();
                    break;
                case 3:
                    //modificar un elemento
                    modificar();
                    break;
                case 4:
                    //eliminar un elemento
                    eliminar();

                    break;

            }
        } while (op != 0);
    }

    private void agregarElementos() {
        Scanner sc = new Scanner(System.in);
        Producto unProducto = new Producto("Banana", "bananas", 10.0);

        System.out.print("Ingrese la cantidad deseada: ");
        int cantidad = sc.nextInt();

        unProducto.setCantidad(cantidad);

        presupuesto.agregarItem(unProducto);
        presupuesto.agregarItem(new Servicio("a", "b", 2.0, 4, "c"));
    }

    private void crearPresupuesto() {
        List<Item> items = presupuesto.getItems();
        int indice = 0;
        Item unItem = items.get(indice);

        if (unItem instanceof Producto) {
            Producto coso = (Producto) unItem;
            //hacer cosas de productos
            // coso.calcularTotal()
            presupuesto.reemplazarItem(indice, coso);
        } else {
            Servicio coso = (Servicio) unItem;
            // hacer cosas de servicios...
            presupuesto.reemplazarItem(indice, coso);
        }

        if (unItem.getClass().getSimpleName().equals("Producto")) {
            // tengo un producto
        } else {
            // tengo un servicio
        }

    }

    public void modificar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione lo que desea modificar: \n 1) Productos \n 2) Servicios");
        int opcionModificar = sc.nextInt();

        if (opcionModificar == 1) {
            System.out.println("Ingrese el nombre del producto que desea modificar  ");
            String nombre = sc.next();

            for (int contador = 0; contador <= presupuesto.getItems().size(); contador++) {
                Item item = presupuesto.getItems().get(contador);
                if (item instanceof Producto) {
                    Producto producto = (Producto) item;
                    if (nombre.equalsIgnoreCase(producto.getNombre())) {
                        System.out.println("Que desea modificar: \n 1)Nombre. \n 2)Descripcion \n 3)Cantidad \n 4)Precio unitario \n 5) Salir");
                        int opcionProducto = sc.nextInt();
                        if (opcionProducto == 1) {
                            System.out.println("Digite el nombre que desea modificar");
                            String nombreProducto = sc.next();
                            producto.setNombre(nombreProducto);

                        } else {
                            if (opcionProducto == 2) {
                                System.out.println("Digite la descripcion que quiere modificar");
                                String descripcion = sc.next();
                                producto.setDescripcion(descripcion);
                            } else {
                                if (opcionProducto == 3) {
                                    System.out.println("Digite la cantidad: ");
                                    int cantidad = sc.nextInt();
                                    producto.setCantidad(cantidad);
                                } else {
                                    if (opcionProducto == 4) {
                                        System.out.println("Digite el precio unitario a modificar: ");
                                        Double precio = Double.parseDouble(sc.next());
                                        producto.setPrecioUnitario(precio);
                                    } else {
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Ingrese el nombre del servicio que desea modificar");
            String nombreServicio = sc.nextLine();
            for (int contador = 0; contador <= presupuesto.getItems().size(); contador++) {
                Item item = presupuesto.getItems().get(contador);

                if (item instanceof Servicio) {
                    Servicio servicio = (Servicio) item;
                    if (nombre.equalsIgnoreCase(servicio.getNombre())) {
                        System.out.println("Seleccione lo que desee modificar \n 1) Nombre \n 2)Descripcion \n 3) CostoPorHora \n 4) Cantidad de horas \n 5) Nombre de persona \n 6) Salir");
                        int opcionSeleccionada = sc.nextInt();
                        if (opcionSeleccionada == 1) {
                            System.out.println("Digite el nombre a modificar: ");
                            String nombreServicio1 = sc.next();
                            servicio.setNombre(nombreServicio1);

                        }else{
                            if(opcionSeleccionada == 2){
                                System.out.println("Digite la descripcion que desea modificar: ");
                                String descripcionServicio = sc.next();
                                servicio.setDescripcion(descripcionServicio);
                            }else{
                                if(opcionSeleccionada == 3){
                                    System.out.println("Digite el costo por hora a modificar: ");
                                    Double costoPorHora = Double.parseDouble(sc.next());
                                    servicio.setCostoHora(costoPorHora);
                                }else{
                                    if(opcionSeleccionada == 4){
                                        System.out.println("Digite la cantidad de horas a modificar: ");
                                        int cantidadDeHoras = sc.nextInt();
                                        servicio.setCantidadHoras(cantidadDeHoras);

                                    }else{
                                        if(opcionSeleccionada == 5){
                                            System.out.println("Digite el nombre de la persona a modificar: ");
                                            String nombrePersona = sc.next();
                                            servicio.setNombrePersona(nombrePersona);

                                        }else{
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void eliminar(){
        System.out.println("Elija que quiere eliminar: \n 1) Producto \n 2) Servicio");
        int elegir = sc.nextInt();
        if (elegir == 1){
            System.out.println("Ingrese el nombre del producto que quiere eliminar");
            String productoEliminar = sc.next();


            for(int contador = 0; contador <= presupuesto.getItems().size(); contador++){

                Item item = presupuesto.getItems().get(contador);

                if (item instanceof Producto) {
                    Producto producto = (Producto) item;

                    if(productoEliminar.equalsIgnoreCase(producto.getNombre())){
                        presupuesto.getItems().remove(producto);

                    }
                }

            }
        }else{
            System.out.println("Ingrese el nombre del servicio que quiere eliminar");
            String servicioEliminar = sc.next();
            for(int contador = 0; contador<= presupuesto.getItems().size(); contador++){
                Item item = presupuesto.getItems().get(contador);
                Servicio servicio = (Servicio) item;

                if(servicioEliminar.equalsIgnoreCase(servicio.getNombre())){
                    presupuesto.getItems().remove(servicio);
                }
            }




        }
    }
}
