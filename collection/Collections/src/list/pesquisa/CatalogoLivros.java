package list.pesquisa;


    

    import java.util.ArrayList;
    import java.util.List;
    
    public class CatalogoLivros{
        //atributo
        private List<Livro> livrolist;
    
        public CatalogoLivros() {
            this.livrolist = new ArrayList<>();
        }
    
        public void adicionarLivro(String titulo, String autor, int anoPublicacao){
            livrolist.add(new Livro(titulo, autor, anoPublicacao));
        }
    
        public List<Livro> pesquisarPorAutor (String autor){
            List<Livro> livrosPorAutor = new ArrayList<>();
            if(!livrolist.isEmpty()){
                for (Livro l : livrolist){
                    if (l.getAutor().equalsIgnoreCase(autor)) {
                        livrosPorAutor.add(l);
                    }
                }
    
            }
            return livrosPorAutor;
    
        } 
        public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
            List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
            if(!livrolist.isEmpty()){
                for(Livro l : livrolist){
                    if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ) {
                        livrosPorIntervaloAnos.add(l);
                    }
                }
    
            }
            return livrosPorIntervaloAnos;
        }
    
        public Livro pesquisarPorTitulo(String titulo){
            Livro livroPorTitulo = null;
            if (!livrolist.isEmpty()) {
                for(Livro l : livrolist){
                    if (l.getTitulo().equalsIgnoreCase(titulo)) {
                        livroPorTitulo = l;
                        break;
                    }
                }
            }
            return livroPorTitulo;
        }
    
        public static void main(String[] args) {
            CatalogoLivros catalagoLivro = new CatalogoLivros();
    
            catalagoLivro.adicionarLivro("Livro 1", "Autor 1", 2013);
            catalagoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
            catalagoLivro.adicionarLivro("Livro 2", "Autor 2", 2010);
            catalagoLivro.adicionarLivro("Livro 3", "Autor 3", 2014);
    
    
            System.out.println(catalagoLivro.pesquisarPorAutor("Autor 3"));
    
            System.out.println(catalagoLivro.pesquisarPorIntervaloAnos(2010, 2014));
            System.out.println(catalagoLivro.pesquisarPorTitulo("Livro 2"));
        }
        
    
    }

