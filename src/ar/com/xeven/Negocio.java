package ar.com.xeven;

import java.util.*;

public class Negocio {

    private Queue<Usuario> filaUsuarios;
    private List<Presupuesto> presupuestos;
    Scanner scanner;

    public Negocio() {
        filaUsuarios = new LinkedList<>();
        presupuestos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void atenderUsuarios(Queue<Usuario> filaUsuarios) {
        while (filaUsuarios.size() > 0) {
            atenderUsuario(filaUsuarios.poll());
        }
    }

    public void atenderUsuario(Usuario usuario) {
        Presupuesto presupuesto = new Presupuesto();
        Servicio servicio = new Servicio();
        Producto producto = new Producto();

        System.out.println("Hola " + usuario.getNombre() + "!!, digita los datos del presupuesto:");

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        presupuesto.setNombre(nombre);

        System.out.println("Digita la descripcion del presupuesto:");
        String descripcion = scanner.nextLine();
        presupuesto.setDescripcion(descripcion);
        String opcion;
        do {
            System.out.println("Digita los datos de un servicio: ");
            System.out.println("Digite el nombre del servicio");
            String nombreServicio = scanner.nextLine();
            servicio.setNombre(nombreServicio);

            System.out.println("Digite la descripcion del servicio");
            String descServicio = scanner.nextLine();
            servicio.setDescripcion(descServicio);

            System.out.println("Digite el costo por hora: ");
            String costoHora = scanner.next();
            servicio.setCostoHora(Double.parseDouble(costoHora));

            System.out.println("Digite la cantidad de horas ");
            int cantHoras = scanner.nextInt();
            servicio.setCantidadHoras(cantHoras);

            System.out.println("Digite el nombre de la persona");
            String nombrePersona = scanner.nextLine();
            servicio.setNombrePersona(nombrePersona);

            presupuesto.agregarItem(servicio);

            System.out.println("Desea agregar mas servicios?");
            System.out.println("Digite S para si y N para no");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("S"));


        String opcionProducto;
        do {
            System.out.println("Digite el nombre del producto");
            String nombreProducto = scanner.nextLine();
            producto.setNombre(nombreProducto);

            System.out.println("Digite la descripcion del producto");
            String descProducto = scanner.nextLine();
            producto.setDescripcion(descProducto);

            System.out.println("Digite el precio unitario del producto");
            String precioUnitario = scanner.nextLine();
            producto.setPrecioUnitario(Double.parseDouble(precioUnitario));

            System.out.println("Digite la cantidad del producto");
            String cantidad = scanner.nextLine();
            producto.setPrecioUnitario(Integer.parseInt(cantidad));

            presupuesto.agregarItem(producto);

            System.out.println("Desea agregar mas productos?");
            System.out.println("Digite S para si y N para no");
            opcionProducto = scanner.nextLine();
        } while (opcionProducto.equalsIgnoreCase("s"));

        presupuestos.add(presupuesto);

        //nombre
        System.out.println("Nombre de presupuesto: " + presupuesto.getNombre());
        for (int contador = 0; contador < presupuesto.getItems().size(); contador++) {
            presupuesto.getItems().get(contador).mostrarDetalles();
        }
        System.out.println("Monto total: " + presupuesto.calcularTotal());

    }
}
