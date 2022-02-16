
package Almacenes;


public class Proveedor {

    /**
     * declaracion de atributos
     */
    protected int idProveedor;
    protected String nif;
    protected String nombre;
    protected Direccion direccion;
    protected int telefono;
    protected String email;

    /**
     * Metodo constructor
     *
     * @param idProveedor alberga el idProveedor
     * @param nif alberga el nif/cif del proveedor
     * @param nombre alberga el nombre del proveedor
     * @param direccion alberga la direccion del proveedor
     * @param telefono alberga el telefono del proveedor
     * @param email alberga el email del proveedor
     */
    public Proveedor(int idProveedor, String nif, String nombre,
            Direccion direccion, int telefono, String email) {
        this.idProveedor = idProveedor;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Metodo destructor hace algo para destruir
     */
    public void finalize() {//hacer algo para destruir el mundo  
    }

    /**
     * Metodos para consultar y modificar los atributos (getters y setters)
     *
     * @return devuelve el idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     *
     * @return devuelve el nif
     */
    public String getNif() {
        return nif;
    }

    /**
     *
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return devuelve la direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     *
     * @return devuelve el telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @return devuelve el email
     */
    public String getEmail() {
        return email;
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
     * metodo para modificar el telefono
     *
     * @param telefono modifica el telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * metodo para modificar el email
     *
     * @param email modifica el email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * metodo para mostrar datos
     */
    void mostrarDatos() {
        System.out.println(nif);
        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(telefono);
        System.out.println(email);
    }
}
