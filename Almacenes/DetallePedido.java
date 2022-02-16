
package Almacenes;

import java.time.LocalDate;
import java.util.ArrayList;


public class DetallePedido {

    /**
     * declaración de atributos
     */
    private Producto producto;
    private Proveedor proveedor;
    private int cantidad;
    private float precioCompra;

    /**
     * metodo constructor
     *
     * @param producto alberga el nombre del producto
     * @param proveedor alberga el nombre del proveedor
     * @param cantidad alberga la cantidad de un mismo producto
     * @param precioCompra alberga el precio de compra del producto
     */
    public DetallePedido(Producto producto, Proveedor proveedor,
            int cantidad, float precioCompra) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
    }

    /**
     * getters y setters
     *
     * @return devuelve el nombre del producto
     */
    public Producto getproducto() {
        return producto;
    }

    /**
     *
     * @return devuelve el nombre del proveedor
     */
    public Proveedor getproveedor() {
        return proveedor;
    }

    /**
     *
     * @return devuelve la cantidad de producto
     */
    public int getcantidad() {
        return cantidad;
    }

    /**
     *
     * @return devuelve el precio de compra del producto
     */
    public float getprecioCompra() {
        return precioCompra;
    }

    /**
     * metodo para modificar el nombre del producto
     *
     * @param producto modifica el nombre del producto
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * metodo para modificar el nombre del proveedor
     *
     * @param proveedor modifica el nombre del proveedor
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * metodo para modificar la cantidad comprada de un producto
     *
     * @param cantidad modifica la cantidad de un producto
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * metodo para modificar el precio al que se compra un producto
     *
     * @param precioCompra modifica el precio de compra
     */
    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }
}
