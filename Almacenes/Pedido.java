
package Almacenes;

 
import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    /**
     * Declaración de variables
     */
    protected int numPedido;
    protected LocalDate fechaCompra;
    protected LocalDate fechaEntrega;
    ArrayList<DetallePedido> detalle;

    /**
     * Metodo constructor
     *
     * @param numPedido alberga el numero de pedido
     * @param fechaCompra alberga la fecha de compra del pedido
     * @param fechaEntrega alberga la fecha de entrega del pedido
     * @param detalle alberga el detalle del pedido
     */
    public Pedido(int numPedido, LocalDate fechaCompra,
            LocalDate fechaEntrega, ArrayList<DetallePedido> detalle) {
        this.numPedido = numPedido;
        this.fechaCompra = fechaCompra;
        this.fechaEntrega = fechaEntrega;
        this.detalle = detalle;
    }

    /**
     * Metodo Destructor hace algo para borrar
     */
    public void finalize() {//do something for destroy, please  
    }

    /**
     * Metodos de consulta y modificación de atributos
     *
     * @return devuelve el numero de pedido
     */
    public int getNumPedido() {
        return numPedido;
    }

    /**
     *
     * @return devuelve la fecha de compra
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     *
     * @return devuelve la fecha de entrega
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     *
     * @return devuelve el detalle del pedido
     */
    public ArrayList<DetallePedido> getDetalle() {
        return detalle;
    }

    /**
     * metodo para modificar la fecha de compra
     *
     * @param fechaCompra modifica la fecha de compra
     */
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * metodo para modificar la fecha de entrega
     *
     * @param fechaEntrega modifica la fecha de entrega
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * metodo para modificar el detalle del pedido
     *
     * @param detalle modifica el detalle del pedido
     */
    public void setDetalle(ArrayList<DetallePedido> detalle) {
        this.detalle = detalle;
    }

    /**
     * metodos para listas de detalles
     */
    public void listaDetalles() {
        // Declaracion del Iterador e impresion de los elementos del ArrayList
        //Recorrer arraylist con iterador    
        for (int i = 0; i < detalle.size(); i++) {
            System.out.println("detalle numero " + i + " es: " + detalle.get(i));
        }
    }
}
