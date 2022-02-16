
package Almacenes;


public class NoPerecedero extends Producto {//No perecedero hereda de Producto

    /**
     * metodo constructor
     *
     * @param idProducto alberga el idProducto
     * @param nombre alberga el nombre del producto
     * @param precioCompra alberga el precio de compra
     * @param precioVenta alberga el precio de venta
     */
    NoPerecedero(int idProducto, String nombre, float precioCompra,
            float precioVenta) {
        super(idProducto, nombre, precioCompra, precioVenta);
    }
}
