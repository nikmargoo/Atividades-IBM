package projetoestante;
public class ProjetoEstanteVirtual {
    public static void main(String[] args) {
        
        Livro a[] = new Livro[3];
        a[0] = new Livro("A Culpa é Das Estrelas", "John Green");
        a[1] = new Livro("O Pequeno Príncipe", "Saint Exupéry");
        a[2] = new Livro("A Menina Que Roubava Livros", "Markus Zusak");
        
        Leitor l[] = new Leitor[2];
        l[0] = new Leitor("Nicole", 18, "F", "nicks");
        l[1] = new Leitor("Nathan", 14,"M",  "drumnat");
        
        Leitura b[] = new Leitura[3];
        b[0] = new Leitura(l[0], a[1]);
        b[0].avaliar(0);
        System.out.println(b[0].toString());
        
        b[1] = new Leitura(l[0], a[2]);
        b[0].avaliar(0);
        System.out.println(b[1].toString());
        
        b[2] = new Leitura(l[0], a[0]);
        b[0].avaliar();
        System.out.println(b[2].toString());
        
        System.out.println("\nLivros\n-----------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        System.out.println(a[2].toString());
        
        System.out.println("\nLeitores\n-----------------------");
        System.out.println(l[0].toString());
        System.out.println(l[1].toString());
    }
    
}
