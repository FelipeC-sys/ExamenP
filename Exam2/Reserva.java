public class Reserva {

    /* ATRIBUTOS */

    private String codigo;
    private String nombrePelicula;
    private Double costoBase;

    public Reserva(String codigo, String nombrePelicula, Double costoBase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase;
    }

    /* GET */

    public String getCodigo() {
        return codigo;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    /* SET */

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    /* POLIMORFISMO */

    public String obtenerDetalles() {
        String resultado = " Codigo: " + codigo + " Pelicula: " + nombrePelicula + " Costo Base: " + costoBase;
        return resultado;
    }
}
