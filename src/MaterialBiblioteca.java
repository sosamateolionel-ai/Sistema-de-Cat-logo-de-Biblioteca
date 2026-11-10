public class MaterialBiblioteca {
    protected String titulo;
    protected int anioEdicion;
    protected String editorial;

    public MaterialBiblioteca(String titulo, int anioEdicion, String editorial) {
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.editorial = editorial;
    }

    public String getTitulo() { return titulo; }
    public int getAnioEdicion() { return anioEdicion; }
    public String getEditorial() { return editorial; }

    public String getTipo() {
        return "Material";
    }

    public void mostrarCatalogo() {
        System.out.println("Título: " + titulo);
        System.out.println("Año de edición: " + anioEdicion);
        System.out.println("Editorial: " + editorial);
    }
}