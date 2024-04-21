package prog09;
public class Libro extends Producto{
    private String Autor;
    public Libro(){}
    public Libro(String titulo, int id, String Autor){
        super(titulo, id, "Libro");
        this.Autor = Autor;
    }

    @Override
    String getTitulo() { return this.titulo; }
    @Override
    void setTitulo(String titulo) { this.titulo = titulo; }
    @Override
    int getId() { return this.id; }
    @Override
    String getTipoProducto() { return this.tipoProducto; }
    
    public String getAutor(){ return this.Autor; }
    public void setAutor(String Autor){ this.Autor = Autor; }
}