public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("P01", "Mouse", 25.50);
        Producto p2 = new Producto("P02", "Teclado", 40.00);
        Producto p3 = new Producto("P03", "Monitor", 180.00);
        Producto p4 = new Producto("P04", "Audífonos", 35.00);

        Pedido pedido = new Pedido();
        System.out.println("Detalles de un pedido nuevo: " + pedido.cantidadDetalles());
        System.out.println();

        pedido.agregarProducto(p1, 2);
        pedido.agregarProducto(p2, 1);
        pedido.agregarProducto(p3, 1);
        pedido.agregarProducto(p4, 3);

        System.out.println("=== RESUMEN DEL PEDIDO ===");
        System.out.println(pedido.mostrarResumen());
        System.out.println();

        System.out.println("Cantidad de detalles: " + pedido.cantidadDetalles());

        System.out.println("Total: $" + String.format("%.2f", pedido.calcularTotal()));
        System.out.println();

        System.out.println("Eliminar posición 2: " + pedido.eliminarDetalle(2));
        System.out.println("Eliminar posición 8: " + pedido.eliminarDetalle(8));
        System.out.println("Eliminar posición -1: " + pedido.eliminarDetalle(-1));
        System.out.println();
        System.out.println(pedido.mostrarResumen());
        System.out.println("Cantidad de detalles: " + pedido.cantidadDetalles());
        System.out.println();

        System.out.println("=== DESAFÍO: se agrega otra vez el Mouse x 3 ===");
        pedido.agregarProducto(p1, 3);
        System.out.println(pedido.mostrarResumen());
        System.out.println("Cantidad de detalles: " + pedido.cantidadDetalles());
        System.out.println();

        System.out.println("El producto eliminado sigue existiendo: " + p3.mostrarInformacion());
    }
}
