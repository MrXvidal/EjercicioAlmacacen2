
package Almacenes;

import java.util.ArrayList;


public class Almacen { //Almacen hereda de Supermercado

    /**
     * declaracion de atributos
     */
    private int metrosCuadrados;
    private ArrayList<Pedido> pedidos;

    /**
     * Metodo constructor
     *
     * @param metrosCuadrados alberga los metros cuadrados del almacen
     * @param pedidos alberga los pedidos realizados
     */
    public Almacen(int metrosCuadrados, ArrayList<Pedido> pedidos) {
        this.metrosCuadrados = metrosCuadrados;
        this.pedidos = pedidos;
    }

    /**
     * Getters y setters
     *
     * @return retorna los metros cuadrados del almacen
     */
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    /**
     *
     * @return retorna los pedidos
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * metodo para cambiar los pedidos
     *
     * @param pedidos actualiza el dato de los pedidos
     */
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * metodo para listas de pedidos
     */
    public void listaPedidos() {
        // Declaracion del Iterador e impresion de los elementos del ArrayList
        //Recorrer arraylist con iterador    
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("Pedido numero " + i + " es: " + pedidos.get(i));
        }
    }
}
