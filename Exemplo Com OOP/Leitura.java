package projetoestante;
public class Leitura {
    private Leitor visualizacao;
    private Livro pagina;

    public Leitura(Leitor visualizacao, Livro pagina) {
        this.visualizacao = visualizacao;
        this.pagina = pagina;
        this.visualizacao.setTotLidos(this.visualizacao.getTotLidos() +1);
        this.pagina.setLeituras(this.pagina.getLeituras() +1);
    }
    
    public void avaliar() {
        this.pagina.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.pagina.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        if(porc <= 20) {
            tot = 3;
        } else if(porc <= 50) {
            tot = 5;
        } else if(porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.pagina.setAvaliacao(tot);
    }

    public Leitor getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(Leitor visualizacao) {
        this.visualizacao = visualizacao;
    }

    public Livro getPagina() {
        return pagina;
    }

    public void setPagina(Livro página) {
        this.pagina = página;
    }

    @Override
    public String toString() {
        return "Leitura{" + "visualizacao=" + visualizacao + ", p\u00e1gina=" + pagina + '}';
    }
    
    

}
