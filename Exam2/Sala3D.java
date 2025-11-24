public class Sala3D extends Reserva {

    private Double valorLentes;

    public Sala3D(String codigo, String nombrePelicula, Double costoBase, Double valorLentes) {
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

    public Double getValorLentes() {
        return valorLentes;
    }

    public void setValorLentes(Double valorLentes) {
        this.valorLentes = valorLentes;
    }

    @Override
    public String obtenerDetalles() {
        String resultado = super.obtenerDetalles();
        if (valorLentes > 0) {
            resultado += " El valor de los lentes es: " + valorLentes + "$";
        } else {
            resultado += " El valor de los lentes es: No especificado";
        }
        return resultado;
    }
}
