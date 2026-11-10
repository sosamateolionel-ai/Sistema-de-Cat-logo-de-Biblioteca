import java.util.ArrayList;
import java.util.List;

void main() {

    List<MaterialBiblioteca> coleccion = new ArrayList<>();

    coleccion.add(new Libro("Rayuela", 1963, "Sudamericana", "Julio Cortázar", 635));
    coleccion.add(new Revista("National Geographic", 2023, "RBA", 215, "Marzo"));
    coleccion.add(new Libro("El Aleph", 1949, "Losada", "Jorge Luis Borges", 180));
    coleccion.add(new Revista("Muy Interesante", 2024, "Televisa", 88, "Junio"));

    // Recorrido polimórfico
    System.out.println("=== CATÁLOGO COMPLETO ===\n");
    for (MaterialBiblioteca m : coleccion) {
        m.mostrarCatalogo();
        System.out.println();
    }

    // Recorrido específico: se pregunta por el tipo concreto
    System.out.println("=== RECORRIDO ESPECÍFICO ===");
    int libros = 0;
    int revistas = 0;
    for (MaterialBiblioteca m : coleccion) {
        if (m instanceof Libro) {
            Libro l = (Libro) m;
            libros++;
            System.out.println("Libro de " + l.getAutor() + ": " + l.getTitulo());
        } else if (m instanceof Revista) {
            Revista r = (Revista) m;
            revistas++;
            System.out.println("Revista: " + r.getReferenciaCorta());
        }
    }

    System.out.println("\nTotal de libros: " + libros);
    System.out.println("Total de revistas: " + revistas);

}

