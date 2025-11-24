public class GestorReservas {

    private Reserva[] reservas;
    private int contador;

    public GestorReservas(int capacidad) {
        reservas = new Reserva[capacidad];
        contador = 0;
    }

    public void agregarReserva(Reserva r) {
        if (contador < reservas.length) {
            reservas[contador] = r;
            contador++;
        } else {
            System.out.println(" No hay espacio para más reservas ");
        }
    }

    public Reserva[] getReservas() {
        return reservas;
    }
}
