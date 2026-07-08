public class App {
    public static void main(String[] args) {

        //  Los 5 libros 

        Libro libro1 = new Libro(
                "Satanás",
                "Mario Mendoza");

        Libro libro2 = new Libro(
                "La Vorágine",
                "José Eustasio Rivera");

        Libro libro3 = new Libro(
                "Delirio",
                "Laura Restrepo");

        Libro libro4 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez");

        Libro libro5 = new Libro(
                "Rosario Tijeras",
                "Jorge Franco");

        // Los 5 lectores

        Lector lector1 = new Lector(
                "Camilo Roldan",
                "1031817976");

        Lector lector2 = new Lector(
                "Dayana Posso",
                "1031818562");

        Lector lector3 = new Lector(
                "Stiven Guerrero",
                "1031817256");

        Lector lector4 = new Lector(
                "Brayan Sossa",
                "1031812564");

        Lector lector5 = new Lector(
                "Luna Leon",
                "1031814652");

        // Prestar libros

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);
        lector3.tomarPrestado(libro3);
        lector4.tomarPrestado(libro4);
        lector5.tomarPrestado(libro5);

        // Mostrar el estado de los libros

        System.out.println("\nESTADO DE LOS LECTORES");

        lector1.mostrarEstado();
        lector2.mostrarEstado();
        lector3.mostrarEstado();
        lector4.mostrarEstado();
        lector5.mostrarEstado();

        // Intento de prestar un libro que ya esta prestado

        System.out.println("\nIntentando prestar un libro que ya está prestado:");

        lector2.tomarPrestado(libro1);

        // Devolver libro

        System.out.println("\nCamilo Roldan devuelve su libro:");

        lector1.regresarLibro();

        // Tomar otro libro

        System.out.println("\nCamilo Roldan toma otro libro:");

        lector1.tomarPrestado(libro3);

        // Como el libro3 sigue prestado por Stiven Guerrero, no podrá tomarlo.

        System.out.println("\nStiven Guerrero devuelve su libro:");

        lector3.regresarLibro();

        System.out.println("\nAhora Camilo Roldan intenta nuevamente:");

        lector1.tomarPrestado(libro3);

        // Estado final de todos los lectores

        System.out.println("\nESTADO FINAL");

        lector1.mostrarEstado();
        lector2.mostrarEstado();
        lector3.mostrarEstado();
        lector4.mostrarEstado();
        lector5.mostrarEstado();

    }
}