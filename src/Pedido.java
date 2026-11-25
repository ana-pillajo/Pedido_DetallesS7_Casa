import java.util.ArrayList;

public class Pedido {

    // Composición: el pedido crea y controla sus detalles
    private ArrayList<DetallePedido> detalles;

    public Pedido() {
        detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto == null || cantidad <= 0) {
            return;
        }

        // Desafío: si el producto ya está en el pedido, se acumula la cantidad
        for (DetallePedido detalle : detalles) {
            if (detalle.getProducto().getCodigo().equals(producto.getCodigo())) {
                detalle.aumentarCantidad(cantidad);
                return;
            }
        }

        // Creación interna del detalle (composición)
        detalles.add(new DetallePedido(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (DetallePedido detalle : detalles) {
            total += detalle.calcularSubtotal();
        }
        return total;
    }

    public int cantidadDetalles() {
        return detalles.size();
    }

    public boolean eliminarDetalle(int posicion) {
        if (posicion >= 0 && posicion < detalles.size()) {
            detalles.remove(posicion);
            return true;
        }
        return false;
    }

    public String mostrarResumen() {
        if (detalles.isEmpty()) {
            return "El pedido no tiene detalles.\nTotal: $0.00";
        }
        String resumen = "";
        for (int i = 0; i < detalles.size(); i++) {
            resumen += i + ". " + detalles.get(i).mostrarInformacion() + "\n";
        }
        resumen += "Total: $" + String.format("%.2f", calcularTotal());
        return resumen;
    }
}
