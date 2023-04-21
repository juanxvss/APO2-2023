package Punto3;

public class Ejecutable {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1234567890", "Don Quijote De La Mancha", "Miguel De Cervantes", 462);
        Libro libro2 = new Libro("0987654321", "La Odisea", "Homero", 162);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro 1 tiene más páginas que el libro 2");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro 2 tiene más páginas que el libro 1");
        } else {
            System.out.println("Los dos libros tienen el mismo número de páginas");
        }
    }
}
