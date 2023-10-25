package projetoestante;
public class Livro implements AcoesLivro {
    private String titulo;
    private String autor;
    private int avaliacao;
    private int leituras;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.avaliacao = 1;
        this.leituras = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int mediaAvaliacao;
        mediaAvaliacao = (this.avaliacao + avaliacao)/this.leituras;
        this.avaliacao = mediaAvaliacao;
    }

    public int getLeituras() {
        return leituras;
    }

    public void setLeituras(int leituras) {
        this.leituras = leituras;
    }
    
    @Override
    public void lendo() {
        this.leituras ++;
    }

    @Override
    public void lido() {
       this.leituras ++;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", leituras=" + leituras + '}';
    }
    
    
    
}
