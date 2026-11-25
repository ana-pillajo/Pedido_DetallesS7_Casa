public class DetallePedido {

    // Asociación con Producto: se guarda la referencia
    private Producto producto;
    private int cantidad;

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Usado en el desafío para acumular cantidades
    public void aumentarCantidad(int cantidadExtra) {
        this.cantidad += cantidadExtra;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public String mostrarInformacion() {
        return producto.getNombre() + " x " + cantidad
                + " = $" + String.format("%.2f", calcularSubtotal());
    }
}