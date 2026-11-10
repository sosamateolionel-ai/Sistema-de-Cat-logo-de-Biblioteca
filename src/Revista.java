public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, int anioEdicion, String editorial,
                   int numeroEdicion, String mesPublicacion) {
        super(titulo, anioEdicion, editorial);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public String getMesPublicacion() { return mesPublicacion; }

    // Método particular de Revista
    public String getReferenciaCorta() {
        return titulo + " N°" + numeroEdicion + " (" + mesPublicacion + " " + anioEdicion + ")";
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

    @Override
    public void mostrarCatalogo() {
        System.out.println("--- REVISTA ---");
        super.mostrarCatalogo();
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
    }
}