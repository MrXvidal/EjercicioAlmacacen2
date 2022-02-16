
package Almacenes;


public class Direccion {

    /**
     * declaración de atributos
     */
    private String tipoVia;
    private String via;
    private String num;
    private String observaciones;

    /**
     * Metodo constructor
     *
     * @param tipoVia alberga el tipo de via
     * @param via alberga el nombre de la via
     * @param num alberga el numero de la via
     * @param observaciones alberga observaciones a la direccion
     */
    public void direccion(String tipoVia, String via, String num,
            String observaciones) {
        this.tipoVia = tipoVia;
        this.via = via;
        this.num = num;
        this.observaciones = observaciones;
    }

    /**
     * Metodo destructor hace algo para borrar
     */
    public void finalize() {
        // hacer algo para borrar
    }

    /**
     * Metodos para establecer y modificar los atributos (getters y setters)
     *
     * @return devuelve el tipo de via
     */
    public String getTipoVia() {
        return tipoVia;
    }

    /**
     *
     * @return devuelve la via
     */
    public String getVia() {
        return via;
    }

    /**
     *
     * @return devuelve el numero de la via
     */
    public String getNum() {
        return num;
    }

    /**
     *
     * @return devuelve las observaciones a la direccion
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * metodo para modificar el tipo de via
     *
     * @param tipoVia modifica el tipo de via
     */
    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    /**
     * metodo para modificar la via
     *
     * @param via modifica la via
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * metodo para modificar el numero de la via
     *
     * @param num modifica el numero de la via
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * metodo para modificar las observaciones a la direccion
     *
     * @param observaciones modifica las observaciones a la direccion
     */
    public void setObserevaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
