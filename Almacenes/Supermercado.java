/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenes;

/**
 *
 * @author avida
 */
public class Supermercado {

    /**
     * Atributos
     */
    private int idSuperMercado;
    private String nombre;
    private Direccion direccion;
    private int telefono;
    private Almacen almacen;

    /**
     * Metodos Metodo constructor
     *
     * @param nombre alberga el nombre del supermercado
     * @param idSuperMercado alberga el idSupermercado
     * @param direccion alberga la direccion del supermercado
     * @param telefono alberga el telefono
     * @param almacen alberga el almacen del supermercado
     */
    public Supermercado(String nombre, int idSuperMercado,
            Direccion direccion, int telefono, Almacen almacen) {
        this.nombre = nombre;
        this.idSuperMercado = idSuperMercado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.almacen = almacen;

    }

    /**
     * metodo main necesario para que el programa funcione cuando lo tenga que
     * hacer
     *
     * @param args
     */
    public static void main(String[] args) {
        //Aquí las instrucciones del método
    }

    /**
     * Metodo destructor destruye cosas
     */
    public void finalize() {
        // hacer algo para borrar
    }

    /**
     * Metodos para consultar y modificar los atributos
     *
     * @return retorna nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return retorna el idSupermercado
     */
    public int getIdSuperMercado() {
        return idSuperMercado;
    }

    /**
     *
     * @return retorna el telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @return retorna la direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * metodo para modificar el nombre del supermercado
     *
     * @param nombre modifica el nombre del supermercado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo para modificar el telefono
     *
     * @param telefono modifica el telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * metodo para modificar la direccion
     *
     * @param direccion modifica la direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * metodo para mostrar datos
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("IdSupermercado: " + idSuperMercado);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Almacen: " + almacen);
    }

}
