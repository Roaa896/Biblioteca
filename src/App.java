public class App {
    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro(
            "Cien años de soledad", 
            "Gabriel Garcia Marquez");
        Lector lector1 = new Lector(
            "Nicoll Dayana Posso Tapiero",
            "1031179532");

        lector1.tomarPrestado(libro1);

        lector1.mostrarEstado();

    }
}
