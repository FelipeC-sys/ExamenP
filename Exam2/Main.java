public class Main {

    public static void main(String[] args) {
        GestorReservas gestor = new GestorReservas(4);

        SalaTradicional t1 = new SalaTradicional("T1", "Rapido y Furioso", 13000, 130);
        SalaTradicional t2 = new SalaTradicional("T2", "InterEstelar", 14000, 190);

        Sala3D d1 = new Sala3D("D1", "Dracula", 20000, 6000);
        Sala3D d2 = new Sala3D("D2", "La era de hielo", 20000, 6000);

        gestor.agregarReserva(t1);
        gestor.agregarReserva(t2);
        gestor.agregarReserva(d1);
        gestor.agregarReserva(d2);

        double total = 0;

        for (Reserva r : gestor.getReservas()) {
            if (r != null) {
                System.out.println(r.obtenerDetalles());
                if (r instanceof Sala3D) {
                    Sala3D s3d = (Sala3D) r;
                    total += s3d.getValorTotal();
                } else {
                    total += r.getCostoBase();
                }
            }
        }
        System.out.println(" Costo total acumulado: " + total);
    }
}
