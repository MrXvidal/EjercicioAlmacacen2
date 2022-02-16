
package Almacenes;

import java.time.LocalDate;


class Perecedero extends Producto {// 

    /**
     * Atributo específico de la subclase
     */
    private LocalDate caducidad;

    /**
     * Metodo constructor con llamada a la superclase Producto
     *
     * @param idProducto numero requerido para el idProducto
     * @param nombre alberga el nombre del producto
     * @param precioCompra alberga el precio de compra
     * @param precioVenta alberga el precio de venta
     * @param caducidad alberga la caducidad del prodcuto
     */
    public Perecedero(int idProducto, String nombre, float precioCompra,
            float precioVenta, LocalDate caducidad) {
        super(idProducto, nombre, precioCompra, precioVenta);
        this.setCaducidad(caducidad);
    }

	public LocalDate getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}
}
