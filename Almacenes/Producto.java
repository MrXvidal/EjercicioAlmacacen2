
package Almacenes;

public class Producto {

    /**
     * declaracion de variables
     *
     */
    private int idProducto;
    private String nombre;
    private float precioCompra;
    private float precioVenta;

    /**
     * metodo constructor
     *
     * @param idProducto alberga el idProducto
     * @param nombre alberga el nombre del producto
     * @param precioCompra alberga el precio de compra del producto
     * @param precioVenta alberga el precio de venta del producto
     */
    Producto(int idProducto, String nombre, float precioCompra,
            float precioVenta) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    /**
     * Not supported yet
     */
    Producto() {
        throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodos para establecer y modificar los atributos (getters y setters)
     *
     * @return devuelve el idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     *
     * @return devuelve el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return devuelve el precio de compra
     */
    public float getPrecioCompra() {
        return precioCompra;
    }

    /**
     *
     * @return devuelve el precio de venta
     */
    public float getPrecioVenta() {
        return precioVenta;
    }

    /**
     * este metodo sirve para modificar el precio de compra
     *
     * @param precioCompra modifica el precio de compra
     */
    void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * este metodo sirve para modificar el precio de venta
     *
     * @param precioVenta modifica el precio de venta
     */
    void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Metodo para mostrar los datos
     */
    void mostrarDatos() {
        System.out.println(idProducto);
        System.out.println(nombre);
        System.out.println(precioCompra);
        System.out.println(precioVenta);
    }
}
